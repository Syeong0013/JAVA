<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제</title>
<link rel="stylesheet" type="text/css" href="../css/board.css"/>
<script src="../js/jquery-3.6.0.min.js"></script>

</head>
<body>
	<form id="delForm" name="delForm" method="post" action="./delete_ok.jsp" onsubmit="return checkValue()">
	<% 
	request.setCharacterEncoding("UTF-8");
	String[] idx = request.getParameterValues("chkbox");
	%>
	<% int j = idx.length; %>
	<div id ="msg">
	<div> <%= j %>개의 글을 삭제하시겠습니까?</div>
	<table>
		<tr>
		<td>
			삭제 목록
		</td>
		<% for(int i=0; i<idx.length; i++) {%>
		<td>
			<input name="idx" value="<%= idx[i] %> 번글" readonly />
		</td>
		<% } %>
		</tr>
		
	</table>
	<input type="text" name="delbox" placeholder ="삭제하시려면 '삭제'를 입력하시오." style="width:300px; height:50px;"/>
	<button>삭제</button>
	</div>	
	</form>
	<script>
	var checkValue = function(){
		if($("input[name='delbox']").val()=="삭제"){
			return true;
		}
		else{
			alert("잘못입력하였습니다.");	
			return false;
		}
	}

	
	</script>
</body>
</html>
