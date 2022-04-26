<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>
<%
	// 값 받아오기
	//String userID = (String)request.getAttribute("userID");
	request.setCharacterEncoding("UTF-8");
	String userID = request.getParameter("userID");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	
	Connection dbConn = null;
	//PreparedStatement psmt = null;
	CallableStatement csmt = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/Boards");
		dbConn = ds.getConnection();
		
		//psmt = dbConn.prepareStatement("INSERT INTO BOARDS VALUES((SELECT NVL(MAX(IDX),0)+1 FROM BOARDS),?,?,?,1,SYSDATE)");
		csmt = dbConn.prepareCall("{call PKG_BOARDS.PROC_INS_BOARDS(?,?,?)}");
		//psmt.setString(1,title);
		//psmt.setString(2,content);
		//psmt.setString(3,userID);
		//psmt.executeUpdate();
		csmt.setString(1,title);
		csmt.setString(2,content);
		csmt.setString(3,userID);
		csmt.executeUpdate();
		
		//out.println("<script>");
		//out.println("location.href='write.jsp'");
		//out.println("</script>");
		response.sendRedirect("./list.jsp");
		
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
	
	
%>
