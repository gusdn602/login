<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cls Project Main Page</title>
<link rel="stylesheet" href="/ClsProj/css/w3.css">
<link rel="stylesheet" href="/ClsProj/css/user.css">
<script type="text/javascript" src="/ClsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
	$(function(){
		$('#login').click(function(){
			$(location).attr('href', '/ClsProj/member/login.cls');
		});
		$('#logout').click(function(){
			$(location).attr('href', '/ClsProj/member/logoutProc.cls');
		});
	});

/* 	$(document).ready(function(){
		$('#logout').click(function(){
			$('#frm').attr('method', 'POST');
			$('#frm').attr('action', '.login.cls')
			$('#frm').submit();
		});
	});*/
</script>
</head>
<body>
	<div class="w3-content mxw2">
		<form class="w3-col" id="frm">
			<c:if test="${empty SID}">
				<div class="w-150 inblock w3-button w3-green w-margin" id="login">Login</div>
			</c:if>
			<c:if test="${not empty SID}"> 
				<div class="w-150 inblock w3-button w3-red w-margin" id="logout">Logout</div>
			</c:if>
		</form>
	</div>
</body>
</html>