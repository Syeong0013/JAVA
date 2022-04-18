package Pkg.Board;

import java.sql.*;
import java.util.*;

import Pkg.DB.*;

public class User {
	private DBHandle db = new DBHandle();
	private String userID;
	private String userName;
	private Boolean isLogin;
	private ArrayList<String> strParams= new ArrayList<String>();
	
	public String getUserID() {
		return userID;
	}
	
	public Boolean getisLogin() {
		return isLogin;
	}
	public User() {
		this.isLogin = false;
	}
	
	// 회원가입
	public void join() {
		if(!isLogin) {
			//String[] strParams = new String[2];
			
			String strSql = "INSERT INTO USER_TBL(USER_ID, USER_PW, USER_NAME) VALUES("
						  + "(SELECT 'U' || TO_CHAR(TO_NUMBER(NVL(SUBSTR(MAX(USER_ID),2,3),0)) +1, 'FM000') FROM USER_TBL),?,?)";
			
			System.out.println("--- 회원가입 ---");
			/*
			strParams[1] = userSearch(3);
			strParams[0] = userSearch(4);
			*/
			strParams.add(userSearch(4));
			strParams.add(userSearch(3));
			
			int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
			strParams.clear();
			
			if(Cnt != 0) {
				System.out.println("회원가입에 성공하였습니다.");
			}
		}
		else {
			System.out.println("로그아웃 후 이용하실 수 있는 서비스입니다.");
		}
	}
	
	
	// 회원 목록 - userID, userName으로만 검색가능
	public void getUserList() {
		
		String strSql = "SELECT USER_ID, USER_NAME FROM USER_TBL WHERE USER_ID LIKE '%' || ? AND USER_NAME LIKE '%' || ?";
		
		
		strParams.add(userSearch(1));
		strParams.add(userSearch(2));
		
		ResultSet rs = db.getDBSelect(strSql, strParams, QueryType.Inline, false);
		strParams.clear();
		
		System.out.println("--- 회원 리스트 ---");
		try {
			while(rs.next()) {
				String strUSERID = rs.getString("USER_ID");
				String strUSERNAME = rs.getString("USER_NAME");
				System.out.println(strUSERID + "\t" + strUSERNAME);
			}
			((DBHandle)db).dbConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------");
	}
	
	
	// 로그인
	public void login() {
		if(!isLogin) {
		String strSql = "SELECT DECODE(MAX(USER_ID),NULL,'F','T') AS CHK_USER, MAX(USER_ID) AS USER_ID, MAX(USER_NAME) AS USER_NAME "
					  + "FROM USER_TBL WHERE USER_ID = ? AND USER_PW = ? ";
	
			System.out.println("--- 로그인 ---");

			strParams.add(userSearch(5));
			strParams.add(userSearch(4));
			
			ResultSet rs = db.getDBSelect(strSql, strParams, QueryType.Inline, false);
			strParams.clear();
			
			try {
				while(rs.next()) {
					String chkUser = rs.getString("CHK_USER");
					if(chkUser.equals("F")) {
						System.out.println("사용자 아이디 또는 비밀번호가 일치하지 않습니다.");
						login();
					}
					else {
						userID = rs.getString("USER_ID");
						userName = rs.getString("USER_NAME");
						isLogin = true;
						System.out.println(userName + "님 반갑습니다!");
					}
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("로그아웃 후 이용하실 수 있는 서비스입니다.");
		}
	}
	
	
	// 정보 수정 
	public void updateUser(){
		if(isLogin) {
			String strSql = "UPDATE USER_TBL SET USER_NAME = ?, USER_PW = ? WHERE USER_ID = ?";


			strParams.add(userSearch(3));
			strParams.add(userSearch(4));
			strParams.add(userID);

			int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
			strParams.clear();
			
			if(Cnt != 0) {
				System.out.println("정보 수정이 완료되었습니다.");
			}
		}
		else {
			System.out.println("로그인 후 사용하실 수 있는 서비스입니다.");
		}
	}
	
	public void deleteUser() {
		if(isLogin) {
			String strSql1 = "SELECT DECODE(MAX(USER_ID), NULL, 'F', 'T') AS CHK_PW FROM USER_TBL WHERE USER_ID = ? AND USER_PW = ?";
			
			System.out.println("회원 탈퇴 시 작성한 글 모두 삭제됩니다.");
			System.out.print("탈퇴하시려면 ");

			strParams.add(userID);
			strParams.add(userSearch(4));
			
			ResultSet rs = db.getDBSelect(strSql1, strParams, QueryType.Inline, false);
			strParams.clear();
			
			try {
				while(rs.next()) {
				
					String chkPW = rs.getString("CHK_PW");
					if(chkPW.equals("T")) {
						String strSql = "DELETE FROM USER_TBL WHERE USER_ID = ?";
						String strSql11 = "DELETE FROM POST_TBL WHERE USER_ID = ?"; // + "'" + userID + "'";
						
						strParams.add(userID);
						
						int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
						Cnt += db.DBHandle(strSql11, strParams, QueryType.Inline);
						
						if(Cnt != 0) {
							System.out.println("회원이 성공적으로 삭제되었습니다.");
							logout();
						}
					}
					else {
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("로그인 후 사용하실 수 있는 서비스입니다.");
		}
	}
	
	public void logout() {
		if(isLogin) {
			userID = null;
			userName = null;
			isLogin = false;
			System.out.println("로그아웃되었습니다.");
		}
		else {
			System.out.println("로그인 후 이용하실 수 있는 서비스입니다.");
		}
	}
	
	public String userSearch(int selnum) {
		String reStr = "";
		Scanner sc = new Scanner(System.in);
		
		switch(selnum){
			case 1: 
				System.out.println("회원 아이디를 입력하세요. (ENTER 입력시, 전부 검색합니다.)");
				reStr = sc.nextLine();
				break;
			case 2:
				System.out.println("회원 이름을 입력하세요. (ENTER 입력시, 전부 검색합니다.)");
				reStr = sc.nextLine();
				break;
			case 3:
				System.out.println("회원 이름을 입력하세요.");
				reStr = sc.next();
				sc.nextLine();
				break;
			case 4:
				System.out.println("비밀번호를 입력하세요.");
				reStr = sc.next();
				sc.nextLine();
				break;
			case 5:
				System.out.println("회원 아이디를 입력하세요.");
				reStr = sc.next();
				sc.nextLine();
				break;
		}
		System.out.println(reStr);
		return reStr;
	}
	
	
	public void write(){
		if(isLogin) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("글을 작성하려는 게시판 아이디를 입력하세요.");
			Board board = new Board();
			board.boardList();
			String selBoard = sc.nextLine();
			
			Post post = new Post();
			post.write(this, selBoard);
		}
		else {
			System.out.println("로그인 후 이용가능한 서비스입니다.");
		}
	}
	
}
