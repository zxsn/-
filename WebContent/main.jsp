<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面</title>
</head>
	<frameset rows="20%,*">
		<frame src="<c:url value='/teacher/top.jsp'/>" name="top2" frameborder="1" scrolling="no" noresize="noresize" />
		<frame src="<c:url value='/teacher/teacher.jsp'/>" name="teacher" frameborder="1" scrolling="no" noresize="noresize"/>
	</frameset>
</html>