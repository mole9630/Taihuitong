<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="../assets/plugins/bootstrap-4.6.1-dist/css/bootstrap.min.css">
  <title>发布文章</title>
  <style>
    form{
      text-align: center;
    }
  </style>
</head>
<body>
<form action="/AddArticle" method="post">
  <h5>文章发布</h5>
  <div class="form-group">
    <span>文章标题：</span><input type="text" name="a_title">
  </div>
  <div class="form-group">
    <span>文章作者：</span><input type="text" name="a_author">
  </div>
  <div class="form-group">
    <span>文章内容：</span><input type="text" name="a_content">
  </div>
  <div class="form-group">
    <button class="btn btn-primary btn-lg btn-block" type="submit">发布</button>
    <button class="btn btn-primary btn-lg btn-block" type="reset">取消</button>
  </div>
</form>
</body>
</html>