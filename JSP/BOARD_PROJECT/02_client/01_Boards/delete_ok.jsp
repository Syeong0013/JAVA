<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>
<%
	Connection dbConn = null;
	CallableStatement csmt = null;
	String[] idx = request.getParameterValues("idx");
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/Boards");
		dbConn = ds.getConnection();
		
		csmt = dbConn.prepareCall("{call PKG_BOARDS.PROC_DEL_BOARDS(?)}");
		for(int i=0; i<idx.length; i++){
			csmt.setString(1,idx[i]);
			csmt.executeUpdate();
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			csmt.close();
			dbConn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	response.sendRedirect("./list.jsp");
	%>
