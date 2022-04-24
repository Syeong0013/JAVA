<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 관리 시스템 로그인 페이지</title>
 <link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form name = "loginform" action="loginProcess.jsp" method="post" class="loginForm">
        <h2 class="b-text">로 그 인</h2>
          <div class="login-box">
               <input type="text" id="id" name="id" placeholder="아이디">
               <input type="password" id="pw" name="pw" placeholder="비밀번호">
               <button class="btn" type="button" onClick="javascript:loginform.submit()"> 로그인</button>
                                
          </div>
          <div class="login-box-bottom">회원이 아니시라면?<a href="joinForm.jsp">회원가입하기</a></div>
   
    </form>
</body>
</html>
