<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../jquery/jquery-1.8.3.js"></script>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}
table{empty-cells:show;border-collapse:collapse;border-spacing:0;}

/*整个最外层div样式*/
#main{margin:0 auto;height:500px;width:550px;}
/*随机循环学生名字时的颜色*/
.back{background-image:url("image/loop.bmp");}
/*选中学生名字时的颜色*/
.back2{background-image:url("image/background.bmp");}
/*头部信息*/
.head{height:50px;width:550px;overflow:hidden;}
/*存放学生名字的最外侧div*/
#content{width:548px;height:400px;border:1px #575757 solid;}
/*学生名字部分*/
.div1{margin-top:30px;text-align:left;font-size:18px;float:left;padding-left:1px;}
/*中间名字和开始按钮的样式*/
#div3{float:left;margin:0 0 0 20px;display:inline;width:152px;}
/*单个学生名字的样式*/
.nametable td{line-height:25px;word-spacing :11px;font-size:14px;padding-left:14px;padding-right:14px;padding-top:6px;padding-bottom:6px;cursor:pointer;font-size:14px;}
/*开始按钮时的凹凸效果*/
.action{background-image:url("image/begin.jpg");width:120px;height:31px;overflow:hidden;color:#ececec;font-size:1px;margin-left:24px;cursor:pointer;margin-top:110px;border:0;}
/*结束按钮时的凹凸效果*/
.action1{background-image:url("image/end.jpg");width:120px;height:31px;overflow:hidden;color:#ececec;font-size:1px;margin-left:24px;cursor:pointer;margin-top:110px;border:0;}
/*学生照片存放的位置*/
#img{margin-top:55px;border:1px gray solid;}
/*选中学生名字后出现的选中信息*/
.info{text-align:center;margin-top:30px;display:block;font-size:26px;color:#3366cc;line-height:35px;height:70px;}
/*隐藏选中学员信息的样式，配合 .info 样式使用*/
.info_none{display:none;}
/*选中后出现的信息*/
.info_none1{width:130px;height:70px;margin-top:30px;font-size:40px;color:#eaa100;letter-spacing:9px;}
</style>
</head>
<div id="main">
		<!--顶部div logo存放位置-->
		<div class="head"><img width="950" height="100" src="image/head.jpg" /></div>
		<!--中间区域 存放 班级左,右的座位div,开始按钮和班级名称-->
		<div id="content">
			<!--班级右半边 id是座位号 对应的学生 -->
			<div class="div1">
				<table class="nametable">
					<tr>
						<td>第一排</td>
					<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="0" end="3">
						<c:if test="${tag1.index==0}">
						<td id=0 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==1 }">
						<td id=1 bgcolor="#d9d9d9">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==2}">
						<td id=2 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==3}">
						<td id=3 bgcolor="#d9d9d9">${tag}</td></c:if>
					</c:forEach>
					</tr>
					<tr>
						<td>第二排</td>
					<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="4" end="7">
						<c:if test="${tag1.index==4}">
						<td id=4 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==5 }">
						<td id=5>${tag}</td>
						</c:if>
						<c:if test="${tag1.index==6}">
						<td id=6 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==7}">
						<td id=7>${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第三排</td>
					<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="8" end="11">
						<c:if test="${tag1.index==8}">
						<td id=8 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==9 }">
						<td id=9 bgcolor="#d9d9d9">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==10}">
						<td id=10 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==11}">
						<td id=11 bgcolor="#d9d9d9">${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第四排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="12" end="15">
						<c:if test="${tag1.index==12}">
						<td id=12 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==13 }">
						<td id=13>${tag}</td>
						</c:if>
						<c:if test="${tag1.index==14}">
						<td id=14 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==15}">
						<td id=15>${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第五排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="16" end="19">
						<c:if test="${tag1.index==16}">
						<td id=16 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==17 }">
						<td id=17 bgcolor="#d9d9d9">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==18}">
						<td id=18 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==19}">
						<td id=19 bgcolor="#d9d9d9">${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第六排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="20" end="23">
						<c:if test="${tag1.index==20}">
						<td id=20 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==21 }">
						<td id=21>${tag}</td>
						</c:if>
						<c:if test="${tag1.index==22}">
						<td id=22 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==23}">
						<td id=23>${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第七排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="24" end="27">
						<c:if test="${tag1.index==24}">
						<td id=24 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==25 }">
						<td id=25 bgcolor="#d9d9d9">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==26}">
						<td id=26 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==27}">
						<td id=27 bgcolor="#d9d9d9">${tag}</td></c:if>
						</c:forEach>
					</tr>	
					<tr>	
						<td>第八排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="28" end="31">
						<c:if test="${tag1.index==28}">
						<td id=28 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==29 }">
						<td id=29>${tag}</td>
						</c:if>
						<c:if test="${tag1.index==30}">
						<td id=30 bgcolor="#ededed">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==31}">
						<td id=31>${tag}</td></c:if>
						</c:forEach>
					</tr>
					<tr>
						<td>第九排</td>
						<c:forEach items="${tags}" var="tag" varStatus="tag1" begin="32" end="35">
						<c:if test="${tag1.index==32}">
						<td id=32 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==33 }">
						<td id=33 bgcolor="#d9d9d9">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==34}">
						<td id=34 bgcolor="#cacaca">${tag}</td>
						</c:if>
						<c:if test="${tag1.index==35}">
						<td id=35 bgcolor="#d9d9d9">${tag}</td></c:if>
						</c:forEach>
					</tr>
					
				</table>
			</div>
			<!--中间存放班级信息和开始按钮 -->
			<div id='div3'>
				<div id="info" class="info_none"></div>
				<div id="info1" class="info_none1"></div>
				<div id="img"><img  class="img" src="image/lamp.png" width="150px" height="120px"/></div>
				<button id="action" class="action" onClick="action()">开始</button>
			</div>
		
			
		</div>		
	</div>

<script type="text/javascript">
/*一些全局属性*/
var dm = null;
var i = 0;
var j= 40;
var dan;
var user;
var time=60;
var uss=null;
/*点击开始时 执行的方法，快速循环*/			
function start(){
	if(uss!=null){
		//alert(uss);
		$(uss).addClass('back2');
	}
	/*移除class为back的css样式*/
	$("td").removeClass('back'); 
	/*开始快速循环时，循环的学生座位号(学号)*/
	user=new Array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
			18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35);	
	/*循环周期*/
	dm = setInterval(function(){
		clearInterval(dan);
		$("td").removeClass('back');		 
		$("#info").removeClass('info');
		$("#info1").removeClass('info_none');
		$("#info").addClass('info_none');
		$("#info1").addClass('info_none1');
		//后面的35是学生的总人数。
		var xx=parseInt(Math.random()*35);
		
		$('#'+xx).addClass('back');
		
		$('#'+(xx-1)).removeClass('back');
		$(".img").attr('src','image/'+xx+'.gif');				
	},time);	
}

/*点击结束时，速度降慢，到最后选中 一些全局属性*/

/*被关注 学生座位号(学号)*/
var name=[0,17,20,23,26,27,28,29,34];
var oo=name.length-1;
/*不被关注 学生座位号(学号)*/
var name2=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,21,22,24,25,30,31,32,33,35];
var ooo=name2.length-1;

/*点击结束时，选中不被关注学生方法*/
function stop1(){				
	time2=300;
	clearInterval(dm);//清除开始时的循环周期
	$("td").removeClass('back'); //移除class为back的css样式	
	if(time2==300){	
	/*降慢速度循环*/
		mmm = setInterval(function(){
			if(time2<500){
				clearInterval(dan);
				$("td").removeClass('back');
				$("#info").removeClass('info');
				$("#info").addClass('info_none');
				//停止的时候，循环学员的个数
				var xx=parseInt(Math.random()*35);			
				$('#'+(xx-1)).removeClass('back');	
				$('#'+xx).addClass('back');
				$('.img').attr('src','image/'+xx+'.gif');
				time2+=100;
			}else{
				/*最后停止选中的一下，调用选中不被关注学生的方法*/
				bbb();
			 }	
		},time2);
	}	
}

/*点击结束时，选中被关注学生方法*/
function stop(){	
	time1=300;
	clearInterval(dm);//清除开始时的循环周期
	$("td").removeClass('back'); //移除class为back的css样式		
	if(time1==300){	
	/*降慢速度循环*/
		mm = setInterval(function(){
			if(time1<500){
				clearInterval(dan);
				$("td").removeClass('back');
				$("#info").removeClass('info');
				$("#info").addClass('info_none');
				var xx=parseInt(Math.random()*35);			
				$('#'+(xx-1)).removeClass('back');		
				$('#'+xx).addClass('back');
				$('.img').attr('src','image/'+xx+'.gif');
				time1+=100;
			}else{
				/*最后停止选中的一下，调用选中不被关注学生的方法*/
				aaa();	
			}
	
		},time1);
	}	
}

/*最后停止选中的一下，调用选中被关注学生的方法*/
function bbb(){
	var nnn=300;
	clearInterval(mmm);
	var st=setInterval(function(){
		var j=parseInt(Math.random()*ooo+1);							
		$("#info").addClass('info_none');		
		$("td").removeClass('back');
		var a=$("#"+name2[j]).addClass('back');
		$('.img').attr('src','image/'+name2[j]+'.gif');
			if(nnn==300){
				$("#info").removeClass('info_none');	
				$("#info").addClass('info');
				clearInterval(st);
				var c = $("#"+name2[j]).html();
				var str="<span>"+c+" <br/>您被选中了";
				$("#info").html(str); 
				$("#info1").addClass('info_none');
				use("#"+name2[j]);
				/*选中后从数组中清除，再选时不会被选上*/
					name2=$.grep(name2,function(nnnn,ii){
						return nnnn == name2[j];			
					},true);
					ooo--;
			}		
	},nnn);	
}

/*最后停止选中的一下，调用选中被关注学生的方法*/
function aaa () {
	var result=new Array();
	var n=300;
	users=this;
	clearInterval(mm);
	var st=setInterval(function(){
		var j=parseInt(Math.random()*oo+1);							
		$("#info").addClass('info_none');		
		$("td").removeClass('back');
		var a=$("#"+name[j]).addClass('back');
		$('.img').attr('src','image/'+name[j]+'.gif');
			if(n==300){
				$("#info").removeClass('info_none');	
				$("#info").addClass('info');
				clearInterval(st);
				var c = $("#"+name[j]).html();
				use("#"+name[j]);
				var str="<span>"+c+"</br>您被选中了";
				$("#info").html(str);
				$("#info1").addClass('info_none');
				/*选中后从数组中清除，再选时不会被选上*/
				name=$.grep(name,function(nn,ii){
					return nn == name[j];			
				},true);
				oo--;
			}
	},n);
}

/*选中闪动效果*/
function use(user){
	uss=user;
	var jj=1;
	dan=setInterval(function(){
		if(jj%2==0){
			$(user).addClass('back');
			}
		else{	
			$(user).removeClass("back");
		}
		jj++;
		
	},300);	
}

/*单个点击人名方法*/
$(function(){

	$("td").click(function(){
		var jj=1;
		var userr=$(this);
		var cc = $(userr).html();
		clearInterval(dan);
		$(uss).addClass('back2');
		use(userr);
		var strc="<span>"+cc+" <br/>您被选中了";
		$("#info").html(strc);
		var idd=$(this).attr("id");
		$('.img').attr('src','image/'+idd+'.gif');
		id(idd);
		id1(idd);
		/*单个点击去除被关注学生方法*/
		function id(str){
			for(var i=0;i<name.length;i++){
				if(name[i]==idd){
					name=$.grep(name,function(nnss,ii){
					return nnss == idd;
				},true);
				oo--;
				}	
			}
		}
	
		/*单个点击去除不被关注学生方法*/
		function id1(str){
			for(var i=0;i<name2.length;i++){
				if(name2[i]==idd){
					name2=$.grep(name2,function(nns,ii){
					return nns == idd;			
				},true);
				ooo--;
				}
			}
		}	
				
	});
	
});

/*点击开始或结束时调用的方法*/
function action(){
	var s = document.getElementById("action").innerHTML;
	if(s=="开始"){
		start();
		document.getElementById("action").innerHTML="结束";
		$("#action").addClass('action1');
		$("#action").removeClass('action');
	}else{
		if(oo==0){
		/*判断如果关注已经完毕，就从不被关注学生中选*/
			stop1();
			document.getElementById("action").innerHTML="开始";
			$("#action").addClass('action');
			$("#action").removeClass('action1');
		}else{
			stop();
			document.getElementById("action").innerHTML="开始";
			$("#action").addClass('action');
			$("#action").removeClass('action1');
		}	
	}
}
</script>
		
</body>
</html>