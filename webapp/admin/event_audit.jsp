<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="../assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
  <title>审核页</title>
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
    <th scope="col">用户编号</th>
    <th scope="col">用户姓名</th>
    <th scope="col">活动名</th>
    <th scope="col">审核状态</th>
    <th scope="col">操作</th>
  </tr>
  </thead>
  <tbody>
    <c:forEach items="${eventStaffs}" var="eventStaffs">
      <tr>
        <td>${eventStaffs.getEsUID()}</td>
        <td>${eventStaffs.getEsUName()}</td>
        <td>${eventStaffs.getEsEName()}</td>
        <td>
          <c:if test="${eventStaffs.getEsStatus() == 0}">
            <span class="badge badge-warning">待审核</span>
          </c:if>
          <c:if test="${eventStaffs.getEsStatus() == 1}">
            <span class="badge badge-primary">已通过</span>
          </c:if>
          <c:if test="${eventStaffs.getEsStatus() == 2}">
            <span class="badge badge-danger">未通过</span>
          </c:if>
        </td>
        <td><i class="fa-solid fa-check"></i><a href="#">通过</a>&nbsp;&nbsp;<i class="fa-solid fa-xmark"></i><a href="#">拒绝</a></td>
      </tr>
    </c:forEach>


  <tr>
<%--    <td>小北</td>--%>
<%--    <td>活动1</td>--%>


  </tr>
  </tbody>
</table>
</body>
</html>