<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../jquery/jquery-1.8.3.js"></script>

<title>Insert title here</title>
<script type="text/javascript">
	var timer;
	var name;
	var keyBlank = 0;

	//var arrays[] = request.getParameter("tags");
	//var arrays = ["刘德华","张学友","黎明","郭富城","张曼玉","林青霞","巩俐","章子怡","李连杰","周仁发","成龙"];
	//var arrays = new Array();
	//var arrays = request.getAttribute("name");
	//var arrays = document.getElementsByName("stuname")
	//alert(arrays);
	

	/* for (var i = 0; i < arrays.length; i++) {
		var array_element = arrays[i];
		alert("---" + array_element);
	} */
	//获取随机范围内数值的函数
	function getRandom(n) {
		return Math.floor(Math.random() * n + 1);
	}
	//每005秒滚动数组中的名字
	function changeNum() {
		
		clearInterval(timer);
		timer = setInterval(showNum, 50);
		document.getElementById("start").disabled = true;
		document.getElementById("stop").disabled = false;
	}
	//取出值填充XXX占位符
	function showNum() {
		var show_num = document.getElementById("show_num");
		show_num.innerHTML = arrays[getRandom(10)];
		//    return arrays[getRandom(10)] ; 
	}
	//停止滚动
	function stop() {
		clearInterval(timer);
		document.getElementById("start").disabled = false;
		document.getElementById("stop").disabled = true;
	}
	//键盘空格键控制  keyBlank 为0时开始滚动 为1时停止滚动
	function showKeyName(e) {
		if (e.keyCode == 32 && keyBlank == 0) {
			blankStart();
			return;
		}

		if (e.keyCode == 32 && keyBlank == 1) {
			blankStop();
			return;
		}

	}
	//设置键盘标示位属性
	function setKeyBlank(value) {
		keyBlank = value;
	}

	//键盘空格开始
	function blankStart() {
		changeNum();
		setKeyBlank(1);
	}

	//键盘空格停止
	function blankStop() {
		stop();
		// setValues();
		setKeyBlank(0);
	}
</script>
</head>
<body onkeyup="showKeyName(event)">
<%-- <c:forEach items="${tags}" varStatus="tag1" var="tag">
 --%>
 <%-- <c:forEach items="${tags }" var="tag">
<input type="text" value="${tag}" name="stuname">
</c:forEach> --%>

	<div class="div1">
		<table class="nametable">
			<tr>
				<c:forEach items="${tags}" varStatus="tag1" var="tag">
					<td bgcolor="#cacaca"></td>
					<c:if test="${tag1.index%2==0 }">
						<td id=tag1.index bgcolor="#cacaca">${tag }${tag1.index }</td>
					</c:if>
					<c:if test="${tag1.index%2==1 }">
						<td id=tag1.index bgcolor="#d9d9d9">${tag }</td>
					</c:if>
				</c:forEach>
			</tr>





		</table>
	</div>


	<table width="80%" border="1px" cellspacing="0" cellpadding="0">
	
		<tr>
			<th width="100px;">随机点名：</th>
			<td width="200px;"><label id="show_num"
				style="width: 70px; height: 20px; color: #000; font-weight: bold; border: solid 1px red;">XXX</label></td>
			<td><input type=button id="start" name="start" value="开始"
				onclick="changeNum();setKeyBlank(1);" />&nbsp;&nbsp; <input
				type=button id="stop" name="stop" value="停止"
				onclick="stop();setKeyBlank(0);" /></td>
		</tr>
	</table>
</body>
</html>