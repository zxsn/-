<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<script type="text/javascript" src="../jquery/jquery-1.8.3.js"></script>
<script type="text/javascript">
            
        $(function()
        {
            $("#button").click(function()
            {
            	//alert(1111);
                var html = $("<br><br><br><input type='file' name='file'>");
                var button = $("<label>&nbsp;</label><input type='button' name='button' value='删除'><br>");
                
                $("body div").append(html).append(button);
                
                button.click(function()
                {
                    html.remove();
                    button.remove();
                })
            })
        })
    
    </script>
</head>
<body>
<center>
<form action="fileAction.action" method="post" enctype="multipart/form-data">
<h3>请选择要上传的文件</h3>
        <p><input type='file' name='file'>
        <input type="button" value="添加" id="button"></p>
        <div></div>
        <p><input type="submit" value="上传"></p>
        
    </form>
	</center>
</body>
</html>