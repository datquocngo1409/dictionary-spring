<%--
  Created by IntelliJ IDEA.
  User: datquocngo
  Date: 06/12/2018
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <form method="post" action="/dictionary">
        ENG: <br>
        <input type="text" name="eng" id="eng" height="30" width="300" value="${eng}">
        <button type="submit">TRANSLATE</button>
    </form>
        VN: <br>
        <input type="text" name="vn" id="vn" height="30" width="300" value="${vn}">
</body>
</html>
