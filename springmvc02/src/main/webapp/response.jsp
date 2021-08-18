<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2021/8/12
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                $.ajax({
                    //设置属性和值，编写json格式
                    url: "/user/testAjax",
                    contentType: "application/json;charset=utf-8",
                    data: '{"username":"zhangsan","password":"12344","age":18}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        //data服务器响应的json数据，进行解析

                        alert(data.username);
                    }

                });
            });
        });
    </script>
</head>
<body>
<a href="/user/testString">testString</a>
<input id="btn" type="button" value="按钮">
</body>
</html>
