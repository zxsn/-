<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>

<style type="text/css">

#fd_div{
margin: 0 auto;
width: 380px;
height: 350px;
}
.lb_div{
float: right;
margin-right: 30px;
}
span{
	margin: 0px 0px 0px 10px;
	font-size: smaller;
	font-weight:bold;
	color:#cc0000;
}
table{
margin: 0 auto;

}
</style>


</head>
<body>

<br>
<br>
<br>
<br>
<div id="fd_div" align="center">
<%
    try {
        Cookie[] cookies = request.getCookies() ;
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie newCookie = cookies[i];
                
                if ("user".equals(newCookie.getName() )) {
                    String name = newCookie.getValue().split("-")[0];
                    String passward = newCookie.getValue() .split("-")[1];
                    request.setAttribute("name ", name);
                    request.setAttribute("pass ", passward);
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
	<form action="loginDealWith.action" target="_top" method="post">
	  <fieldset style="border-style:groove"  >
		<legend>登录</legend>
		<div class="tb_div">
			<table>
				<tr>
				<td><label>学号：</label></td>
				<td><input type="text"  id ="id" name ="student.stid" onblur="checkId(this.value);"></td>
				<td><span id="msg"></span></td>
				</tr>
				
				<tr>
				<td><br/></td>
				</tr>
				
				<tr>
				<td><label>密码：</label></td>
				<td><input id="pwd" type="password" name ="student.password"></td>
				</tr>
				
				<tr>
				<td><br/></td>
				</tr>
				
				<tr>
				<td colspan="2"><input type="checkbox" name="isMemPassword">&nbsp;记住密码</td>
				</tr>
				
				<tr>
				<td colspan="2" align="center"><input  type="submit"  value="登录"></td>
				</tr>
				
			</table>
		</div>
		</fieldset>
	</form>
	</div>
		<div class="lb_div">
		<label>第一次使用？请去</label><a href="register.jsp">注册</a>
		</div>
</body>
</html>