<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>



<script type="text/javascript" src="<c:url value='../jquery/verification.js'/>"></script>
	
	<script src="../jquery/bootstrap.min.js"></script>
	<script src="../jquery/jquery-1.8.3.js"></script>
	<script src="../jquery/distpicker.data.js"></script>
	<script src="../jquery/distpicker.js"></script>
	<script src="../jquery/main.js"></script>
	
	<script src="../jquery/calendar.js"></script>
	
	
<script type="text/javascript">

/* 籍贯 */
$("#distpicker1").distpicker();


</script>
	
<style type="text/css">
.left{
	text-align:right;
	width:120px;
	height:25px;
	padding-right:5px;
	}
	
.center{
	width:385px;
	}
.red{
	color:#cc0000;
	font-weight:bold;
	}

div{
	color:#F00;
	}		
span{
	margin: 0px 0px 0px 10px;
	font-size: smaller;
	font-weight:bold;
}
.layinput{height: 22px;line-height: 22px;width: 150px;margin: 0;}
</style>

</head>
<body>
	
	<form action="editAction.action" method="post" onsubmit="return checkForm()">
	<table align="center">
		<tr>
			<td class="left"><label>学号：</label></td>
			<td class="center"><input type="text" name="student.stid" id="stid" onblur="checkId()" value="${student.stid}"> <span id="numid"></span></td>
		</tr>
		<tr>
			<td class="left"><label>输入密码：</label></td>
			<td class="center"><input type="password" name="student.password" id="pwd" onblur="checkPwd()"  value="${student.password}"><span id="pwdid"></span></td>
		</tr>
		<tr>
			<td class="left"><label>再次输入密码：</label></td>
			<td class="center"><input type="password" id="repwd" onblur="checkRepwd()" value="${student.password}"> <span id="repwdid" style="color: red;"></span></td>
		</tr>
		<tr>
			<td class="left"><label>姓名：</label></td>
			<td class="center"><input type="text" name="student.name" id="name" onblur="checkName()" value="${student.name}"> <span id="nameid"></span></td>
			
		</tr>	
		<tr>
			<td class="left"><label>性别：</label></td>
			<td class="center"><input name="student.gender" type="radio" id="gender" value="男" <c:if test="${student.gender eq '男'}">checked="checked"</c:if>>男&nbsp;&nbsp;<input name="student.gender" type="radio" id="gender" value="女" <c:if test="${student.gender eq '女'}">checked="checked"</c:if>>女</td>
		</tr>
		<tr>
			<td class="left"><label>手机号：</label></td>
			<td class="center"><input type="text" name="student.phone" id="phone" onblur="checkPhone()" value="${student.phone}"><span id="phoneId"></span></td>
		</tr>
		<tr>
			<td class="left"><label>籍贯：</label>
			</td>
			<td class="center">
			<div id="distpicker1">
			<select name="student.province"  id="province" onblur="checkNativePlace()" ><option>${student.province}</option></select>
			<select name="student.city" id="city"><option>${student.city}</option></select>
			<select name="student.area" id="area"><option>${student.area}</option></select>
			</div>
			</td>
		</tr>
		<tr>
			<td class="left"><label>出生日期：</label></td>
			
			<td class="center" background="#fff">
				<input type="text" name="student.birthday" style="padding-left:5px;" size="10" id="date" readonly="readonly" onclick="SelectDate(this)" value="${student.birthday}"><span id="dateId"></span>
			</td>
			
		</tr>
		<tr>
			<td valign="top" class="left">个人描述：</td>
			<td class="center">
				<textarea name="student.description" rows="5" cols="20" >${student.description}</textarea>
			</td>
		</tr>
		<tr align="center">
			<td colspan="2"><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置"></td>
		</tr>
	</table>
	</form>
</body>

</html>