<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\6\28 0028
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>ID</td>
        <td>姓名</td>
    </tr>
    <c:forEach items="${categoryList}" var="category">

        <tr>
            <td>${category.id}</td>
            <td>${category.name}</td>
        </tr>

    </c:forEach>

</table>
<div style="text-align:center">
    <a href="?start=0">首  页</a>
    <a href="?start=${page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count}">下一页</a>
    <a href="?start=${page.last}">末  页</a>
</div>

</body>
</html>
