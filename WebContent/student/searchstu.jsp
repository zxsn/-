<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../jquery/bootstrap.min.js"></script>
<script src="../jquery/jquery-1.8.3.js"></script>
<script src="../jquery/distpicker.data.js"></script>
<script src="../jquery/distpicker.js"></script>
<script src="../jquery/main.js"></script>
<title>高级搜索</title>
<style type="text/css"></style>
<script type="text/javascript">
/* 籍贯 */
$("#distpicker1").distpicker();
</script>
</head>
<body>
	<form action="findStudentsByConditionAction.action" method="post">
		<table border="0" align="center" width="40%"
			style="margin-left: 100px;margin-top: 50px;">
			<tr>
				<th>学号：</th>
				<td><input type="text" name="student.stid" /></td>
			</tr>
			<tr>
				<th>姓名：</th>
				<td><input type="text" name="student.name" /></td>
			</tr>
			<tr>
				<th>性别：</th>
				<td><select name="student.gender">
						<option value="">==请选择性别==</option>
						<option value="男">男</option>
						<option value="女">女</option>
				</select></td>
			</tr>
			<tr>
				<th>电话：</th>
				<td><input type="text" name="student.phone" /></td>
			</tr>
			<!-- <tr>
				<th>籍贯：</th>
				<td><div id="distpicker1">
						<select name="student.province" id="province"
							onblur="checkNativePlace()"></select> <select name="student.city"
							id="city"></select> <select name="student.area" id="area"></select>
					</div></td>
			</tr> -->
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="搜索" /> <input type="reset"
					value="重置" /></td>
				<td>&nbsp;</td>
			</tr>

		</table>
	</form>
</body>
</html>