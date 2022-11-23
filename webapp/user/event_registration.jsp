<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
    <title>活动报名</title>
    <style>
        table{
            text-align: center;
        }
    </style>
</head>
<body>
<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">活动名称</th>
        <th scope="col">参与积分</th>
        <th scope="col">开始时间</th>
        <th scope="col">结束时间</th>
        <th scope="col">操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${event}" var="event">
        <tr>
            <td>${event.geteName()}</td>
            <td>${event.getePoint()}</td>
            <td>${event.geteStartTime()}</td>
            <td>${event.geteEndTime()}</td>
            <td><i class="fa-solid fa-pen-to-square"></i><a href="/user/entryEvent?eid=${event.geteID()}&uid=${sessionScope.user.getuId()}&uname=${sessionScope.user.getuName()}&ename=${event.geteName()}">报名</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>