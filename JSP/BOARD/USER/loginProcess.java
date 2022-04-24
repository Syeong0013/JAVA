<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	Connection dbConn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/Board");
		dbConn = ds.getConnection();
		
		psmt = dbConn.prepareStatement("SELECT * FROM USER_TBL WHERE USER_ID = ?");
		psmt.setString(1,id);
		rs = psmt.executeQuery();
		
		if(rs.next()){
			if(pw.equals(rs.getString("USER_PW"))){
				session.setAttribute("id",id);
				out.println("<script>");
				out.println("location.href='main.jsp'");
				out.println("</script>");
			}
		}
		
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			rs.close();
			psmt.close();
			dbConn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>
