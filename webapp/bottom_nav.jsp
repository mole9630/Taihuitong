<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="assets/css/style.css">
  <link rel="stylesheet" href="assets/plugins/fontawesome-free-6.2.0-web/css/all.min.css">
</head>
<body>
<div class="navigation">
  <ul>
    <li class="list active">
      <a href="#">
        <span class="icon"><i class="fa-solid fa-house"></i></span>
        <span class="text">Home</span>
      </a>
    </li>
    <li class="list">
      <a href="#">
        <span class="icon"><ion-icon name="person-outline"></ion-icon></span>
        <span class="text">Profile</span>
      </a>
    </li>
    <li class="list">
      <a href="#">
        <span class="icon"><i class="fa-solid fa-pen-to-square"></i></span>
        <span class="text">在线举报</span>
      </a>
    </li>
    <li class="list">
      <a href="#">
        <span class="icon"><i class="fa-solid fa-layer-group"></i></span>
        <span class="text">美丽乡村</span>
      </a>
    </li>
    <li class="list">
      <a href="#">
        <span class="icon"><i class="fa-solid fa-user"></i></span>
        <span class="text">我的</span>
      </a>
    </li>
    <div class="indicator"></div>
  </ul>
</div>
<script>
  const list =document.querySelectorAll('.list')
  function activeLink(){
    list.forEach((item)=>item.classList.remove('active'));
    this.classList.add('active')
  }
  list.forEach((item)=>item.addEventListener('click',activeLink))
</script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>