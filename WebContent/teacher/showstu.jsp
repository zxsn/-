<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看学生信息</title>
<style type="text/css">
.tt{
width: 200px;
}
</style>
</head>
<body>
<table align="center">
		<tr>
			
			<th class="tt">学号</th>
			<th class="tt">姓名</th>
			<th class="tt">性别</th>
			<th class="tt">电话</th>
			<th class="tt">省份</th>
			<th class="tt">城市</th>
			<th class="tt">县区</th>
			<th class="tt">出生日期</th>
			<th class="tt">描述</th>
			
		</tr>
		<tr><td colspan="9" class="tt"><hr/></td></tr>
		<c:forEach items="${pageInfo.students}" var="student">
		<tr>
			<td align="center" class="tt">${student.stid}</td>
			<td align="center" class="tt">${student.name}</td>
			<td align="center" class="tt">${student.gender}</td>
			<td align="center" class="tt">${student.phone}</td>
			<td align="center" class="tt">${student.province}</td>
			<td align="center" class="tt">${student.city}</td>
			<td align="center" class="tt">${student.area}</td>
			<td align="center" class="tt"><fmt:formatDate value="${student.birthday}" pattern="yyyy-MM-dd"/></td>
			<td align="center" class="tt">${student.description}</td>
		</tr>
		
		<tr><td colspan="9" class="tt"><hr/></td></tr>
		</c:forEach>
		<tr>
			<td colspan="9" align="center" class="tt">
				<div>
					<label>当前页面：[${pageInfo.currentPage }/${pageInfo.totalPages }]</label>
					<a href="${pageInfo.uri}nowPage.currentPage=1">首页</a>&nbsp;&nbsp;
					<c:if test="${pageInfo.totalPages gt 0}">
						<c:if test="${pageInfo.currentPage gt 1}">
					
							<a href="${pageInfo.uri}nowPage.currentPage=${pageInfo.currentPage-1}">上一页</a>&nbsp;&nbsp;
					</c:if>
						<c:forEach items="${pageInfo.pageNums }" var="pageNum">
							<a href="${pageInfo.uri}nowPage.currentPage=${pageNum}">${pageNum}</a>
						</c:forEach>&nbsp;&nbsp;
						<c:if test="${pageInfo.currentPage lt pageInfo.totalPages}">
							<a href="${pageInfo.uri}nowPage.currentPage=${pageInfo.currentPage+1}">下一页</a>&nbsp;&nbsp;
						</c:if>
					</c:if>
					<a href="${pageInfo.uri}nowPage.currentPage=${pageInfo.totalPages}">尾页</a>
				</div>
			</td>
		</tr>
		
	</table>
</body>
</html>