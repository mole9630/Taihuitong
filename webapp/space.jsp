<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>个人中心</title>
    <link rel="stylesheet" href="assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
    <style>
        .top>a>img{
            border-radius: 75%;
            width: 25%;
        }
        ul>li{
            list-style: none;

        }

    </style>
</head>
<body>
<div class="top">
    <a href="user.html"><img src="assets/img/user-logo.jpg"></a>
    <h5>点击头像登录</h5>
    <div class="row">
        <div class="col-4"><h5>0</h5>居住人数</div>
        <div class="col-4"><h5>0</h5>工艺活动</div>
        <div class="col-4"><h5>0</h5>活动积分</div>
    </div>
</div>

<div>
    <ul>
        <li><i class="fa-solid fa-user-group"></i><a href="#">家庭信息</a></li>
        <li><i class="fa-solid fa-book-open-reader"></i><a href="#">党员学习</a></li>
        <li><i class="fa-solid fa-hand-holding-heart"></i><a href="#">公益活动</a></li>
        <li><a href="#">便民服务</a></li>
        <li><i class="fa-solid fa-lock-open"></i><a href="#">修改密码</a></li>
        <li><i class="fa-solid fa-right-from-bracket"></i><a href="#">安全退出</a></li>
    </ul>
</div>
</body>
</html>