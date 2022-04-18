package Pkg.Board;

import java.sql.*;
import java.util.*;

import Pkg.DB.*;

public class Board {

	private DBHandle db = new DBHandle();
	private ArrayList<String> strParams = new ArrayList<String>();
	
	private String boardID;
	private String boardName;
	
	public String getBoardID() {
		return boardID;
	}
	
	public Board() {
		 
	}
	
	public void createBoard() {
			String strSql = "INSERT INTO BOARDS_TBL(BOARD_NUM, BOARD_NAME)"
			 		+ "VALUES((SELECT 'B' || TO_CHAR(TO_NUMBER(NVL(SUBSTR(MAX(BOARD_NUM),2,3), 0)) +1,'FM000') FROM BOARDS_TBL)"
			 		+ ", ?)"; 
	
			Scanner sc = new Scanner(System.in);
			System.out.println("생성할 게시판 이름을 입력하세요.");
			strParams.add(sc.nextLine());
			
			int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
			strParams.clear();
			
			if(Cnt != 0) {
				System.out.println("게시판 생성이 성공적으로 완료되었습니다.");
			}
	}
	
	public void boardList() {
		Scanner sc = new Scanner(System.in);
		String strSql = "SELECT BOARD_NUM, BOARD_NAME FROM BOARDS_TBL";

		ResultSet rs = db.getDBSelect(strSql, strParams, QueryType.Inline, false);
		try {
			while(rs.next()) {
			String selNum = rs.getString("BOARD_NUM");
			String selName = rs.getString("BOARD_NAME");
			
			System.out.println(selNum + " \t " + selName);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void deleteBoard() {
		String strSql = "DELETE FROM BOARDS_TBL WHERE BOARD_NUM = ?";
		String strSql1 = "DELETE FROM POST_TBL WHERE BOARD_NUM = ?";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하려는 게시판 아이디를 입력하시오.");
		strParams.add(sc.nextLine());
		
		db.DBHandle(strSql, strParams, QueryType.Inline);
		db.DBHandle(strSql1, strParams, QueryType.Inline);
		strParams.clear();
		System.out.println("게시판이 정상적으로 삭제되었습니다.");
		
	
	}
}
