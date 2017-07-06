<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传成功页面</title>
</head>
<body>
	<center>
		恭喜，文件【
		<s:property value="fileFileName" />
		】上传成功！<br /> 
		<h4>web服务器${pageContext.servletContext.contextPath}<s:property value='saveRealPath'/>/<s:property value="fileFileName"/></h4>
<%-- <img alt="测试"
			src="${pageContext.servletContext.contextPath}<s:property value='saveRealPath'/>/<s:property value="fileFileName"/>"> --%>
	</center>
</body>
</html>