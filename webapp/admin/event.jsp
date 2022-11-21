<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
  <title>活动发布</title>
  <style>
    form{
      text-align: center;
    }
  </style>
</head>
<body>
<form action="/AddEvent" method="post">
  <h5>活动发布</h5>
  <div class="form-group">
    活&nbsp;&nbsp;动&nbsp;&nbsp;名&nbsp;&nbsp;称&nbsp;:<input type="text" name="e_name">
  </div>
  <div class="form-group">
    活动上限人数:<input type="text" name="e_people_number">
  </div>
  <div class="form-group">
    活&nbsp;&nbsp;动&nbsp;&nbsp;地&nbsp;&nbsp;点&nbsp;:<input type="text" name="e_address">
  </div>
  <div class="form-group">
    活动开始时间:<input type="datetime-local" name="e_start_time">
  </div>
  <div class="form-group">
    活动结束时间:<input type="datetime-local" name="e_end_time">
  </div>
  <div class="form-group">
    活&nbsp;&nbsp;动&nbsp;&nbsp;简&nbsp;&nbsp;介&nbsp;:<textarea name="e_introduction" cols="20" rows="5"></textarea>
  </div>
  <div class="form-group">
    活&nbsp;&nbsp;动&nbsp;&nbsp;积&nbsp;&nbsp;分&nbsp;:
    <select name="e_point">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
    </select>

  </div>
  <div class="form-group">
    <button class="btn btn-primary btn-lg btn-block" type="submit">发布活动</button>
    <button class="btn btn-primary btn-lg btn-block" type="reset">重置</button>
  </div>
</form>
</body>
</html>
