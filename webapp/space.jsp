<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>个人中心</title>
    <link rel="stylesheet" href="assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
    <style>
        .row>div>a>img{
            border-radius: 75%;
            width: 100%;
        }
        ul>li{
            list-style: none;
        }

        h5{
            text-align: center;
        }
        .h5{
            text-align: left;
        }
        .div1{
            text-align: center;
        }
        .left>ul{
            float: left;
            margin: 2px;
            padding: 2px;
        }
        .left>ul>li{
            width: 100%;
        }
        .right{
            margin: 4px;
            padding: 4px;
        }
        .div2{
            width: 70%;
            float: right;
        }
    </style>
</head>
<body>
<div class="tou">
    <!--  个人信息  -->
    <div class="row">
        <div class="col-5">
            <a href="user.jsp"><img src="assets/img/user-logo.jpg"></a>
        </div>
        <div class="col-7">
            <h5 class="h5">点击头像登录</h5>
        </div>
    </div>

    <div class="row">
        <div class="col-4 div1">
            <c:if test="${user!=null}">
                <h5>${spaceInfo.getuVillage()}</h5>
            </c:if>
            <c:if test="${user==null}">
                <h6>登录后查看</h6>
            </c:if>
            <span>所在村</span>
        </div>
        <div class="col-4 div1">
            <c:if test="${user!=null}">
                <h5>${spaceInfo.getuEventCount()}</h5>
                <%--<h5>0</h5>--%>
            </c:if>
            <c:if test="${user==null}">
                <h6>登录后查看</h6>
            </c:if>
            <span>参加活动总数</span>
        </div>
        <div class="col-4 div1">
            <c:if test="${user!=null}">
                <h5>${spaceInfo.getuPoint()}</h5>
                <%--<h5>0</h5>--%>
            </c:if>
            <c:if test="${user==null}">
                <h6>登录后查看</h6>
            </c:if>
            <span>活动总积分</span>
        </div>
    </div>
    <!--  活动  -->
    <div class="left">
        <ul>
            <li><i class="fa-solid fa-user-group"></i><a href="#">家庭信息</a></li>
            <li><i class="fa-solid fa-book-open-reader"></i><a href="#">党员学习</a></li>
            <li><i class="fa-solid fa-hand-holding-heart"></i><a href="#">公益活动</a></li>
            <li><i class="fa-solid fa-face-smile"></i><a href="#">便民服务</a></li>
            <li><i class="fa-solid fa-lock-open"></i><a href="#">修改密码</a></li>
            <li><i class="fa-solid fa-right-from-bracket"></i><a href="#">安全退出</a></li>
        </ul>
        <div class="right">
            <div class="div2">
                家庭信息
            </div>
        </div>
    </div>
</div>
</body>
</html>