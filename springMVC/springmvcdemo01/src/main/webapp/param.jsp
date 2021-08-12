<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2021/8/10
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
<%--name必须和bean一致，通过set方法找到--%>
<%--<a href="/param/testParam?username=zhangsan">param</a>--%>
<%--<form action="/param/saveAccount" method="post">--%>
<%--    姓名：<input type="text" name="username"><br>--%>
<%--    密码：<input type="password" name="password"><br>--%>
<%--    金额：<input type="password" name="money"><br>--%>
<%--    用户姓名：<input type="text" name="user.uname"><br>--%>
<%--    yong：<input type="text" name="user.age"><br>--%>
<%--    <input type="submit" value="提交">--%>
<%--将数据封装到list和map中--%>
<%--<form action="/param/saveAccount" method="post">--%>
<%--    姓名：<input type="text" name="username"><br>--%>
<%--    密码：<input type="password" name="password"><br>--%>
<%--    金额：<input type="password" name="money"><br>--%>
<%--    用户姓名：<input type="text" name="userList[0].uname"><br>--%>
<%--    年龄：<input type="text" name="userList[0].age"><br>--%>

<%--    用户姓名：<input type="text" name="userMap['one'].uname"><br>--%>
<%--    年龄：<input type="text" name="userMap['one'].age"><br>--%>
<%--    <input type="submit" value="提交">--%>

<%--</form>--%>

<%--<form action="/param/saveUser" method="post">--%>
<%--    姓名：<input type="text" name="uname"><br>--%>
<%--    密码：<input type="text" name="age"><br>--%>
<%--    日期：<input type="text" name="date"><br>--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>

<%--<a href="/param/testServlet">param</a>--%>

<%--<a href="/anno/testRequestParam?name=呵呵">param</a>--%>
<a href="/anno/PathVariable/10">param</a>
</body>
</html>
