<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
    <title>File Download</title>
     
    <meta http-equiv="description" content="error">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
     
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
     
    <script type="text/javascript" src="../jquery/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        function checkFile() {
            if($("#all").attr("checked")){
                $("input[name='attachmentPath']").attr("checked",true);
            }else {
                $("input[name='attachmentPath']").attr("checked",false);
            }
        }
         
    </script>
    </head>
 
    <body>
     
        <form  action="download.action" method="post">
            <table>
                 <tr>
                     <th>
                            <input type="checkbox" name="all" id="all" onchange="checkFile()">全选
                     </th>
                      <th>
                            文件名
                     </th>
                      <th>
                            文件路径
                     </th>
                      <th>
                            下载
                     </th>
                 </tr>
                <c:forEach items="${attachmentList}" var="attachment">
                    <tr>
                        <td>
                            <input type="checkbox" name="attachmentPath" value="${attachment.filePath}">
                        </td>
                        <td>${attachment.fileName}</td>
                        <td>${attachment.filePath}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/file/download?fileName=${attachment.filePath}">下载</a>
                        </td>
                    </tr>
                </c:forEach>
            <tr>
                <td>
                    <input type="submit" value="下载所选文件" id="submit">
                </td>
            </tr>
            </table>
        </form>
         
    </body>
</html>