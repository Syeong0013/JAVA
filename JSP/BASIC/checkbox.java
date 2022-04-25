<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CHECK BOX</title>
<script src = "./jquery/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		$('input[type = "checkbox"][name="animal"]').click(function(){
			if($(this).prop('checked')){
				$('input[type="checkbox"][name="animal"]').prop('checked',false);
				$(this).prop('checked',true);
			}
		});
	});
	
	var submit = function(){
		var select_obj = '당신이 좋아하는 동물은 ';
		$('input[type="checkbox"]:checked').each(function(index){
			if(index!=0){
				select_obj += ',';
			}
			select_obj += $(this).val() + '입니다';
		});
		$("#msg").html(select_obj);
	}
</script>
</head>
<body>

<div>
	
	<!-- 하나만 선택할 수 있음 -->
	<label><input type="checkbox" name="animal" value="고양이" />고양이</label>
	<label><input type="checkbox" name="animal" value="강아지" />강아지</label>
	<label><input type="checkbox" name="animal" value="오리" />오리</label>
	<input type="button" name="btn" value="확인" onclick="submit()"/>
	<div id = "msg"></div>
</div>

</body>
</html>
