<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 작성</title>

<link rel="stylesheet" type="text/css" href="../css/board.css"/>
<script src="../js/jquery-3.6.0.min.js"></script>
	<script>
		var checkValue = function(){
			var strUserID = $("#userID").val();
			var strTitle = $("#title").val();
			var strContent = $("#content").val();
			if(strUserID.length <2){
				alert("사용자 이름은 두 글자 이상 입력해주세요");
				$("#userID").focus();
				return false;
			}
			if(strTitle.length <2){
				alert("제목은 두 글자 이상 입력해주세요");
				$("#title").focus();
				return false;
			}
			if(strContent.length <2){
				alert("내용은 두 글자 이상 입력해주세요");
				$("#content").focus();
				return false;
			}
		}
	</script>
</head>
<body>
	<table cellpadding="0" cellspacing="0" width="600px" align="center" border="1">
	<form id="boardForm" name="boardForm" method="post" action="./write_ok.jsp" onsubmit="return checkValue()">
	<tr>
		<td width="120px" height="30px" align="center">작성자</td>
		<td width="480px" heigth="30px">
			<input type="text" name="userID" id="userID"/>
		</td>
	</tr>
	
	<tr>
		<td width="120px" height="30px" align="center">글제목</td>
		<td width="480px" heigth="30px">
			<input type="text" name="title" id="title" class="text1" style="width:470px; height:30px;"/>
		</td>
	</tr>
	
	<tr>
		<td width="600px" heigth="120px" align="center" colspan="2">
			<textarea name="content" id="content" class="text1" style="width:590px; height:230px;"/></textarea>
		</td>
	</tr>
	
	<tr>
		<td width="600px" heigth="120px" align="center" colspan="2">
			<button>저장</button>
		</td>
	</tr>
	</form>
	</table>
</body>
</html>
