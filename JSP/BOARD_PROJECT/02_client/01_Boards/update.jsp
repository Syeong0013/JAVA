<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "PKG_BOARDS.Board" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 수정</title>
</head>
<body>
<%
	String strIDX = request.getParameter("idx");
	
	Board b = new Board();
	
	Hashtable<String, String> arrSelete = b.boardSelect(strIDX);
	
	String strUSERID = arrSelete.get("userid");
	String strTITLE = arrSelete.get("title");
	String strCONTENT = arrSelete.get("content");
	
%>
	<table cellpadding="0" cellspacing="0" width="600px" align="center" border="1">
	<form id="boardForm" name="boardForm" method="post" action="./update_ok.jsp" onsubmit="return checkValue()">
	<input type="hidden" name ="idx" value="<%=strIDX%>"/>
	<tr>
		<td width="120px" height="30px" align="center">작성자</td>
		<td width="480px" height="30px">
			<input type="text" name="userID" id="userID" value="<%=strUSERID %>" readonly/>
		</td>
	</tr>
	
	<tr>
		<td width="120px" height="30px" align="center">글제목</td>
		<td width="480px" heigth="30px">
			<input type="text" name="title" id="title" class="text1" style="width:470px; height:30px;" value="<%=strTITLE %>"/>
		</td>
	</tr>
	
	<tr>
		<td width="600px" heigth="120px" align="center" colspan="2">
			<textarea name="content" id="content" class="text1" style="width:590px; height:230px;"/><%=strCONTENT %></textarea>
		</td>
	</tr>
	
	<tr>
		<td width="600px" heigth="120px" align="center" colspan="2">
			<button>수정</button>
		</td>
	</tr>
	</form>
	</table>
</body>
</html>
