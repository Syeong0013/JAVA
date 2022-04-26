<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>
<%@ page import = "oracle.jdbc.OracleTypes" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/board.css"/>
<script src="../js/jquery-3.6.0.min.js"></script>
<meta charset="UTF-8">
<title>글 리스트</title>
<script>
	$(document).on('click','#topchkbox',function(){
		$('input[name="chkbox"]').prop('checked',this.checked);
	});
	
	$(document).on('click','input[name="chkbox"]',function(){
		if($('input[name="chkbox"]').length == $('input[name="chkbox"]:checked').length){
			$('#topchkbox').prop("checked",true);
		}
		else{
			$('#topchkbox').prop("checked",false);
		}
	});
	
</script>

</head>
<body>

<%
	Connection dbConn = null;
	CallableStatement csmt = null;
	ResultSet rs = null;
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/Boards");
		dbConn = ds.getConnection();
		
		String strProc= "{call PKG_BOARDS.PROC_SEL_BOARDS(?,?)}";
		csmt = dbConn.prepareCall(strProc);
		csmt.setString(1,"");
		
		csmt.registerOutParameter(2, OracleTypes.CURSOR);
		csmt.executeQuery();
		
		rs = (ResultSet)csmt.getObject(2);
%>
		<table cellpadding="0" cellspacing="0" width="650px" align="center" border="1">
		
		<tr>
			<td width="50" height="30" align="center">
				<input type="checkbox" name="" id="topchkbox"/>
			</td>
			<td width="80px" height="30px" align="center">
				글번호
			</td>
			<td width="280px" height="30px" align="center">
				글제목
			</td>
			<td width="80px" height="30px" align="center">
				작성자
			</td>
			<td width="180px" height="30px" align="center">
				작성일
			</td>
		</tr>
		
<%
		String strIDX = "";
		String strUSERID = "";
		String strTITLE = "";
		String strREGDATE = "";
		int i = 1;
		while(rs.next()){
			strIDX = rs.getString("IDX");
			strUSERID = rs.getString("USERID");
			strTITLE = rs.getString("TITLE");
			strREGDATE = rs.getString("REGDATE");
%>
	<form action="./delete.jsp" action="./delete_ok.jsp" method="post">
		<tr>
			<td width="50" height="30" align="center">
				<input type="checkbox" name="chkbox" value="<%= strIDX %>"/>
			</td>
			<td width="80px" height="30px" align="center">
				<%= strIDX %>
			</td>
			<td width="280px" height="30px" align="center">
				<a href="content.jsp?idx=<%=strIDX %>" ><%= strTITLE %></a>
			</td>
			<td width="80px" height="30px" align="center">
				<%= strUSERID %>
			</td>
			<td width="180px" height="30px" align="center">
				<%= strREGDATE %>
			</td>
		</tr>
<% 
} }catch(Exception e){
	e.printStackTrace();
}
%>
		<tr>
			<td width="650px" colspan="5" height="30" align="right">
				<button>삭제</button>
				<a href="./write.jsp">글쓰기</a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>
