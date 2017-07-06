<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生左</title>
<style type="text/css">
a{
	text-decoration: none;
}
</style>
</head>
<body>
	<div align="center">
	<p><a href="showAction.action" target="rightFrame">查看学生信息</a></p>
<%-- <h2>${student.name}</h2> --%>
	<p><a href="preEditAction.action?student.stid=${student.stid}" target="rightFrame">编辑个人信息</a></p>
	<p><a href="student/searchstu.jsp" target="rightFrame">搜索学生信息</a></p>
	<p><a href="student/studentupload.jsp" target="rightFrame">上传作业</a></p>
	</div>
</body>
</html>