<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>登录界面</title>
  <link rel="stylesheet" href="assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
  <link rel="stylesheet" href="assets/css/register.css">
  <script src="assets/js/jquery-3.6.1.min.js"></script>
  <script src="assets/js/user.js"></script>
</head>
<body>
<div class="content">
  <ul id="ul1">
    <li class="cur">登录</li>
    <li>注册</li>
  </ul>
  <div id="div0">
    <form action="/LoginServlet" method="post">
      <h3 class="mb-3">请登录</h3>
      <div class="form-group">
        手机号：<input type="text" name="u_phone" placeholder="请输入手机号">
      </div>
      <div class="form-group">
        密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="u_password" placeholder="请输入密码">
      </div>

      <div class="form-group">
        <button class="btn btn-primary btn-lg btn-block" type="submit">登录</button>
      </div>
    </form>
  </div>

  <div id="div1" style="display:none">
    <form action="/RegisterServlet" method="post">
      <h3 class="mb-3">请输入新的账号</h3>

      <div class="form-group">
        姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name="u_name" placeholder="请输入姓名">
      </div>

      <div class="form-group">
        密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="u_password" placeholder="请输入密码">
      </div>

      <div class="form-group">
        确认密码：<input type="password" name="u_re_password" placeholder="请确认密码">
      </div>

      <div class="form-group">
        身份证号：<input type="text" name="u_identification_number" placeholder="请输入身份证号">
      </div>

      <div class="form-group">
        手&nbsp;&nbsp;机&nbsp;&nbsp;号：<input type="text" name="u_phone" placeholder="请输入手机号">
      </div>

      <div>
        性别：<select name="u_sex">
        <option value="1" selected>男</option>
        <option value="0">女</option>
      </select>&nbsp;&nbsp;&nbsp;&nbsp;
        民族：<select name="u_ethnic">
        <option value="汉族" selected>汉族</option>
        <option value="蒙古族">蒙古族</option>
        <option value="回族">回族</option>
        <option value="藏族">藏族</option>
        <option value="维吾尔族">维吾尔族</option>
        <option value="苗族">苗族</option>
        <option value="彝族">彝族</option>
        <option value="壮族">壮族</option>
        <option value="布依族">布依族</option>
        <option value="朝鲜族">朝鲜族</option>
        <option value="满族">满族</option>
        <option value="瑶族">瑶族</option>
        <option value="白族">白族</option>
        <option value="土家族">土家族</option>
        <option value="哈尼族">哈尼族</option>
        <option value="哈萨克族">哈萨克族</option>
        <option value="傣族">傣族</option>
        <option value="黎族">黎族</option>
        <option value="傈僳族">傈僳族</option>
        <option value="佤族">佤族</option>
        <option value="畲族">畲族</option>
        <option value="高山族">高山族</option>
        <option value="拉祜族">拉祜族</option>
        <option value="水族">水族</option>
        <option value="东乡族">东乡族</option>
        <option value="纳西族">纳西族</option>
        <option value="景颇族">景颇族</option>
        <option value="柯尔克孜族">柯尔克孜族</option>
        <option value="土族">土族</option>
        <option value="达翰尔族">达翰尔族</option>
        <option value="仫佬族">仫佬族</option>
        <option value="羌族">羌族</option>
        <option value="布朗族">布朗族</option>
        <option value="撒拉族">撒拉族</option>
        <option value="毛南族">毛南族</option>
        <option value="仡佬族">仡佬族</option>
        <option value="锡伯族">锡伯族</option>
        <option value="阿昌族">阿昌族</option>
        <option value="普米族">普米族</option>
        <option value="塔吉克族">塔吉克族</option>
        <option value="乌孜别克族">乌孜别克族</option>
        <option value="俄罗斯族">俄罗斯族</option>
        <option value="鄂温克族">鄂温克族</option>
        <option value="德昂族">德昂族</option>
        <option value="保安族">保安族</option>
        <option value="裕固族">裕固族</option>
        <option value="京族">京族</option>
        <option value="塔塔尔族">塔塔尔族</option>
        <option value="独龙族">独龙族</option>
        <option value="鄂伦春族">鄂伦春族</option>
        <option value="赫哲族">赫哲族</option>
        <option value="门巴族">门巴族</option>
        <option value="珞巴族">珞巴族</option>
        <option value="基诺族">基诺族</option>
        <option value="外入中籍">外入中籍</option>
      </select>
      </div><br>
      <div class="form-group">
        所在村：<select name="u_village">
        <option value="village" selected>学田村</option>
        <option value="village" selected>窦庄村</option>
        <option value="village" selected>刘庄村</option>
        <option value="village" selected>童台社区</option>
        <option value="village" selected>石台村</option>
        <option value="village" selected>梧桐村</option>
        <option value="village" selected>白顶山村</option>
      </select>
      </div>
      <div class="form-group">
        <button class="btn btn-primary btn-lg btn-block" type="submit">注册</button>
      </div>
    </form>
  </div>
</div>
<div class="bottom-nav">
<%--  <jsp:include page="bottom_nav.jsp"></jsp:include>--%>
</div>
</body>
</html>
