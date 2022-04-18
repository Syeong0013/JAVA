package Pkg.DB;

import java.awt.datatransfer.*;
import java.sql.*;
import java.util.*;

import Pkg.Board.*;
import oracle.jdbc.*;

public class DBHandle {

	// dbConn, psmt, csmt, rs 를 필드로 생성해서 사용해야 나중에 dbConn을 닫을 수 있다.
	public Connection dbConn;
	private PreparedStatement psmt;
	private CallableStatement csmt;
	private ResultSet rs;
	
	// 생성자
	public DBHandle() {}
	
	// Connection
	private void setConnection() {
		try {
			//
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			dbConn = DriverManager.getConnection(DBInfo.DBUrl, DBInfo.DBID, DBInfo.DBPW);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Inline Query
	private void setPreparedStatement(String strSql, ArrayList<String> strParams) {
		try {
			setConnection();
			psmt = dbConn.prepareStatement(strSql);
			
			for(int i=0; i<strParams.size(); i++) {
				psmt.setString(i+1, strParams.get(i));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void setCallableStatement(String strProc, ArrayList<String> strParams) {
		try {
			setConnection();
			csmt = dbConn.prepareCall(strProc);
			
			for(int i=0; i<strParams.size(); i++) {
				csmt.setString(i+1, strParams.get(i));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ResultSet getDBSelect(String str, ArrayList<String> strParams, QueryType type, Boolean isCursor) {
		//HashMap<Board, Post> boards = new HashMap<Board, Post>();
		ResultSet rs = null;
		try {
			if(type == QueryType.Inline) {
				setPreparedStatement(str, strParams);
				rs = psmt.executeQuery();
				//rs.add(psmt.executeQuery());
				/*
				while(rs.next()) {
					String selNum = ((ResultSet) rs).getString("BOARD_NUM");
					String selName = ((ResultSet) rs).getString("BOARD_NAME");
					
					System.out.println(selNum + " \t " + selName);
				
				}*/
			}
			else {
				setCallableStatement(str, strParams);
				if(isCursor) {
					csmt.registerOutParameter(strParams.size()+1, OracleTypes.CURSOR);
					csmt.executeQuery();
					rs = (ResultSet)csmt.getObject(strParams.size()+1);
					//rs.add((ResultSet)csmt.getObject(strParams.size()+1));
				}
				else {
					rs = csmt.executeQuery();
					//rs.add(csmt.executeQuery());
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	public int DBHandle(String str, ArrayList<String> strParams, QueryType type) {
		int Cnt = 0;
		try {
			if(type == QueryType.Inline) {
				setPreparedStatement(str, strParams);
				Cnt = psmt.executeUpdate();
			}
			else {
				setCallableStatement(str, strParams);
				csmt.executeUpdate();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return Cnt;
	}
	
}
