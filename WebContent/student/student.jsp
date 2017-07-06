<%@page import="java.net.URLEncoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生页面</title>
</head>
<frameset rows="20%,*">
        <c:set value="${student.name}" var="name" scope="page"/>
        <%
         String name =  (String)pageContext.getAttribute("name");
        name = URLEncoder.encode(name, "UTF-8");
        pageContext.setAttribute("name", name);
        %>
		<frame src="student1.action?student.name=${name}" name="top" frameborder="1" scrolling="no" noresize="noresize" />
		<frameset cols="20%,*">
            <frame src="student.action?student.stid=${student.stid}"  name="leftFrame"
                scrolling="no" noresize="noresize" />
            <frame src="/InteractiveSystem/student/right.jsp" name="rightFrame" />
		</frameset>
	</frameset>

</html>