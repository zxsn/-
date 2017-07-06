<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="../jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../jquery/checkbox.js"></script>
<script type="text/javascript">


</script>
<title>新增学生</title>
<style type="text/css">
.cart_td_1 {
	width: 200px;
}

.tt {
	width: 200px;
}
</style>
</head>
<body>
<form action="rollcall.action" method="post">
	<table align="center">
		<tr>
			<th class="cart_td_1"><input id="allCheckBox" type="checkbox">全选</th>
			<th class="tt">学号</th>
			<th class="tt">姓名</th>
			<th class="tt">性别</th>
		</tr>
		<tr>
			<td colspan="4" class="tt"><hr /></td>
		</tr>
		<c:forEach items="${pageInfo.students}" var="student">
			<tr>
				<td align="center" class="cart_td_1"><input name="tags"
					type="checkbox" value="${student.name}"></td>
				<td align="center" class="tt">${student.stid}</td>
				<td align="center" class="tt">${student.name}</td>
				<td align="center" class="tt">${student.gender}</td>
			</tr>

			<tr>
				<td colspan="4" class="tt"><hr /></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4" align="center" class="tt">
				<div>
					<label>当前页面：[${pageInfo.currentPage }/${pageInfo.totalPages }]</label>
					<a href="${pageInfo.uri}nowPage.currentPage=1">首页</a>&nbsp;&nbsp;
					<c:if test="${pageInfo.totalPages gt 0}">
						<c:if test="${pageInfo.currentPage gt 1}">

							<a
								href="${pageInfo.uri}nowPage.currentPage=${pageInfo.currentPage-1}">上一页</a>&nbsp;&nbsp;
					</c:if>
						<c:forEach items="${pageInfo.pageNums }" var="pageNum">
							<a href="${pageInfo.uri}nowPage.currentPage=${pageNum}">${pageNum}</a>
						</c:forEach>&nbsp;&nbsp;
						<c:if test="${pageInfo.currentPage lt pageInfo.totalPages}">
							<a
								href="${pageInfo.uri}nowPage.currentPage=${pageInfo.currentPage+1}">下一页</a>&nbsp;&nbsp;
						</c:if>
					</c:if>
					<a href="${pageInfo.uri}nowPage.currentPage=${pageInfo.totalPages}">尾页</a>
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right"><input type="submit" value="提交" /></td>
		</tr>
	</table>
	</form>
</body>
</html>