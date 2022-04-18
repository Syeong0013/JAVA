package Pkg.Board;

import java.util.*;

import Pkg.DB.*;

public class Post {
	private DBHandle db = new DBHandle();
	private ArrayList<String> strParams = new ArrayList<String>();
	
	//private Board board;
	//private String postIDX;
	private String postTitle;
	private String postContent;
	//private String postRegdate;
	
	
	void write(User user, String boardNum) {
		Scanner sc = new Scanner(System.in);
		
		String strSql = "INSERT INTO POST_TBL(POST_IDX, POST_TITLE, POST_CONTENT, POST_REGNUM, USER_ID, BOARD_NUM)"
			          + "VALUES( (SELECT 'P' || TO_CHAR(TO_NUMBER(NVL(SUBSTR(MAX(POST_IDX),2,4),0))+1 ,'FM000') FROM POST_TBL), ?,?, SYSDATE, ?,?)"; 
    
		 System.out.println("제목을 입력하시오.");
		 strParams.add(sc.nextLine());
		 
		 System.out.println("내용을 입력하시오.");
		 strParams.add(sc.nextLine());
		 strParams.add(user.getUserID());
		 strParams.add(boardNum);
			 
		 int Cnt = db.DBHandle(strSql, strParams, QueryType.Inline);
		 strParams.clear();
		 
		 if(Cnt != 0) {
			 System.out.println("게시글이 정상적으로 등록되었습니다.");
		 }
	}
	
	public void delete() {
		String strSql = "DELETE FROM POST_TBL WHERE POST_IDX = ?";
		
	}
}
