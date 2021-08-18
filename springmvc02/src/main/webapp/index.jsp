<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2021/8/12
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>springMVC02</title>
    <script src="js/jquery.min.js"></script>
    <script>
        // $(function () {
        //     $("#btn").click(function () {
        //        // alert("hello");
        //         $.ajax({
        //             //设置属性和值，编写json格式
        //             url:"/user/testAjax",
        //             contentType:"application/json;charset=utf-8",
        //             data:'{"username":"zhangsan","password":"12344",age:18}',
        //             dataType:"json",
        //             type:"post",
        //             success:function (data) {
        //                 //data服务器响应的json数据，进行解析
        //
        //             }
        //
        //         });
        //     });
        // });
    </script>
</head>
<body>
<%--<a href="/user/testString">testString</a>--%>
<%--<a href="/user/testModelAndView">testModelAndView</a>--%>
<%--<input id="btn" type="button" value="按钮">--%>
<h3>文件上传</h3>
<form method="post" action="/file/fileUpload1" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>
<h3>springMVC版文件上传</h3>
<form method="post" action="/file/fileUpload2" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
