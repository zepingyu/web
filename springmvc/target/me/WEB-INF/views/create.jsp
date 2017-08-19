<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 17-7-31
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD User From</title>
</head>
<body>
<form action="save" method="post" modelAttribute="form" >
    <fieldset>
        <legend>创建用户</legend>
        <p>
            <label>姓名：</label> <input type="text" id="name" name="name" tabindex="1">
        </p>
        <p>
            <label>年龄：</label> <input type="text" id="age" name="age" tabindex="2">
        </p>
        <p>
            <label>密码：</label> <input type="text" id="pwd" name="pwd" tabindex="3">
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" value="取消">
            <input id="submit" type="submit" tabindex="5" value="创建">
        </p>
    </fieldset>
</form>

</body>
</html>
