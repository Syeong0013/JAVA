import java.sql.*;
import java.util.Scanner;

import Pkg.DB.*;

public class User {
	private DBHandle db = new DBHandle();
	private String userID;
	private String userPW;
	private String userName;
	private Boolean isLogin;
	
	
	public User() {
		this.isLogin = false;
	}
	
	// 회원가입
	public void join() {
		if(!isLogin) {
			String[] strParams = new String[2];
			
			String strSql = "INSERT INTO USER_TBL(USER_ID, USER_PW, USER_NAME) VALUES("
						  + "(SELECT 'U' || TO_CHAR(TO_NUMBER(NVL(SUBSTR(MAX(USER_ID),2,3),0)) +1, 'FM000') FROM USER_TBL),?,?)";
			
			System.out.println("--- 회원가입 ---");
			strParams[0] = userSearch(4);
			strParams[1] = userSearch(3);
				
			int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
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
		
		String[] strParams = new String[2];
		
		strParams[0] = userSearch(1);
		strParams[1] = userSearch(2);
		
		ResultSet rs = db.getDBSelect(strSql, strParams, QueryType.Inline, false);
		
		System.out.println("--- 회원 리스트 ---");
		try {
			while(rs.next()) {
				String strUSERID = rs.getString("USER_ID");
				String strUSERNAME = rs.getString("USER_NAME");
				System.out.println(strUSERID + "\t" + strUSERNAME);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------");
	}
	
	// 로그인
	public void login() {
		
		String strSql = "SELECT DECODE(MAX(USER_ID),NULL,'F','T') AS CHK_USER, MAX(USER_ID) AS USER_ID, MAX(USER_NAME) AS USER_NAME "
					  + "FROM USER_TBL WHERE USER_ID = ? AND USER_PW = ? ";
		if(!isLogin) {
			System.out.println("--- 로그인 ---");
			String[] strParams = new String[2];
			strParams[0] = userSearch(5);
			strParams[1] = userSearch(4);
			
			ResultSet rs = db.getDBSelect(strSql, strParams, QueryType.Inline, false);
			
			try {
				while(rs.next()) {
					String chkUser = rs.getString("CHK_USER");
					if(chkUser.equals("F")) {
						System.out.println("사용자 아이디 또는 비밀번호가 일치하지 않습니다.");
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
		
	}
	
	private String userSearch(int selnum) {
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
				break;
			case 4:
				System.out.println("비밀번호를 입력하세요.");
				reStr = sc.next();
				break;
			case 5:
				System.out.println("회원 아이디를 입력하세요.");
				reStr = sc.next();
				break;
		}
		return reStr;
	}
	
	
}
