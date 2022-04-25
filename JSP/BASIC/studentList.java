<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 리스트</title>
<script src = "./jquery/jquery-3.6.0.min.js"></script>
<script>
	var student = function(id, name, age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	var students = [];
	students[0] = new student("S001","홍길동",23);
	students[1] = new student("S002","전우치",30);
	students[2] = new student("S003","누룽지",22);
	students[3] = new student("S004","정성균",29);
	
	var strHTML = "";
	
	var showList = function(){
		for(var i=0; i<students.length; i++){
			strHTML += "<div style = 'clear:both;'>";
			strHTML += "<span class='box1'><input type='checkbox' name='lineChk'/></span>";
			strHTML += "<span class='box1'>"+ students[i].id +"</span>";
			strHTML += "<span class='box1'>"+ students[i].name +"</span>";
			strHTML += "<span class='box1'>"+ students[i].age +"</span>";
			strHTML += "</div>"
		}
		document.getElementById("msg").innerHTML = strHTML;
		strHTML="";
	}
	
	var chkAll = function(){
		var isChk = $("#topChk").prop("checked");
		$('input[name="lineChk"]').prop("checked",isChk);
	}
</script>
</head>
<body>
	<div>
		<input type="button" value="리스트" onclick="showList()"/>
	</div>
	
	<div>
	<span class = "box1"><input type="checkbox" onclick="chkAll()" id="topChk"/></span>
	<span class = "box1">아이디</span>
	<span class = "box1">이름</span>
	<span class = "box1">나이</span>
	</div>
	
	<div id="msg">
	
	</div>
</body>
</html>
