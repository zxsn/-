//学号验证
function checkId() {
	//获取到了 学号的值
	var userId = document.getElementById("stid").value;
	var userSpan = document.getElementById("numid");
	var reg=/^[0-9]{6,13}$/i;
	if(reg.test(userId)){
	       //符合规则 
	       userSpan.innerHTML="正确".fontcolor("green");
	       return true;
	   }else{
	       //不符合规则
	       userSpan.innerHTML="学号为6~13位数字".fontcolor("red");
	       return false;
	   }  
}
//密码验证
function checkPwd() {
	//获取到了 密码的值
	var userPwd = document.getElementById("pwd").value;
	var userSpan = document.getElementById("pwdid");
	var reg=/^[a-zA-Z0-9]{4,10}$/;
	if(reg.test(userPwd)){
		
		//符合规则 
		userSpan.innerHTML="正确".fontcolor("green");
		return true;
	}else{
		//不符合规则
		userSpan.innerHTML="不能含有非法字符，长度在4-10之间".fontcolor("red");
		return false;
	}  
}
//重复密码验证
function checkRepwd(){
	
	var $pwd = $("#pwd"); //输入密码
    var $repwd = $("#repwd");  //再次输入密码
    var $userSpan = $("#repwdid");
    $userSpan.html("");
    if ($pwd.val() != $repwd.val()) {
        $userSpan.html("两次密码不一致");
        return false;
    }
    return true;
	
}
//姓名验证
//姓名的规则：这能是汉字，可以有“·”，1~10位
function checkName(){
   //获取到了用户名的值
   var userName = document.getElementById("name").value;
   var userSpan = document.getElementById("nameid");
   var reg = /^([\u4e00-\u9fa5\·]{1,10})$/i;
   if(reg.test(userName)){
       //符合规则 
       userSpan.innerHTML="正确".fontcolor("green");
       return true;
   }else{
       //不符合规则
       userSpan.innerHTML="必须是中文".fontcolor("red");
       return false;
   }  
}

//手机号验证
function checkPhone() {
	//获取到了手机号的值
	var userphone = document.getElementById("phone").value;
	var userSpan = document.getElementById("phoneId");
	var reg=/^(13\d|14[57]|15[^4,\D]|17[678]|18\d)\d{8}|170[059]\d{7}$/i;
	if(reg.test(userphone)){
	       //符合规则 
	       userSpan.innerHTML="正确".fontcolor("green");
	       return true;
	   }else{
	       //不符合规则
	       userSpan.innerHTML="格式错误".fontcolor("red");
	       return false;
	   } 
}

//出生日期验证
/*function checkDate() {
	var userSpan = document.getElementById("dateId");
	var userDate = document.getElementById("date").value
	var myDate = new Date(); 
	//var day = myDate.getYear()+"-"+myDate.getMonth()+"-"+myDate.getDate();
	//alert(myDate);
	if (!(userDate.value)) { 
		//alert("不能为空!");
		userSpan.innerHTML="格式不对".fontcolor("red");
		return false;
		}
		return true;
}*/
//总体校验表单是否可以提交了 如果返回的true表单才可以提交。上面的表单项必须要每个都填写正确。
function checkForm(){
	
   var userName = checkName();
   var userPwd = checkPwd();
   var userId =  checkId();
   var userPhone = checkPhone();
   var userDate = checkDate();
   var userRepwd = checkRepwd();
   if(userId&&userPwd&&userRepwd&&userName&&userPhone&&userDate){
       return true;
   }else{
       return false;
   }
  
}