<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>新規会員登録確認</title>

<!-- meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- css -->
<link rel="stylesheet"
	href="bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="bower_components/ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="assets/css/owl.carousel.css">
<link rel="stylesheet" href="assets/css/owl.theme.css">
<link rel="stylesheet" href="assets/css/animate.css">
<link rel="stylesheet" href="assets/css/style.css">

<!-- fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic|Roboto+Condensed:300italic,400italic,700italic,400,300,700|Oxygen:400,300,700'
	rel='stylesheet'>

</head>
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="">電子漫画購入サイト</a>
				</section>
			</section>
		</section>
	</header>


	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-md-6">
<form method="post" action="UserRegisterComfirm.jsp">
<h1>新規会員登録確認フォーム</h1>
<p>入力項目に間違いはありませんか？</p>
<div class="form-group">
 <label>※名前</label><input type="hidden" class="form-control" name="user_name" value="${user_name}">
 <div class="formbox">
 <p>${user_name}</p>
 </div>
  </div>
  <div class="form-group">
    <label>※生年月日</label>
    <input type="hidden" class="form-control" name="user_birthday" value="${ birthday}">
    <div class="formbox">
    <p>${ birthday}</p>
    </div>
  </div>
  <div class="form-group">
    <label>※会員ID (メールアドレス)</label>
    <input type="hidden"  class="form-control" name="user_id" value="${user_id}">
        <div class="formbox">
    <p>${user_id}</p>
    </div>
  </div>
  <div class="form-group">
   <label>※パスワード(再入力)</label> <input type="password" class="form-control" name="password">
  </div>
  <div align="center">
  <button type="submit" class="btn btn-primary" name="signup" onclick="location.href='UserRegisterResult.jsp'; return false;">会員登録確定する</button>
  </div>
  <br>
   <button type="submit" class="btn btn-primary " name="signup" onclick="location.href='UserRegister.jsp'; return false;">新規会員登録ページへ戻る</button>
</form>
<br>
			<div class="col-xs-6 col-md-3">
					<a class="btn btn-primary " href="Index02.jsp">トップページ</a>
				</div>

				</div>
			</section>
		</section>
	</section>

	<!-- ****************************** Footer ************************** -->

	<section id="footer">
		<section class="container">
			<section class="row">
				<div class="col-sm-6">
					<span>Developed By</span>
					<h1 class="footer-logo">B group</h1>
				</div>

				<div class="col-sm-6">

				</div>
			</section>
		</section>
	</section>

	<!-- All the scripts -->

	<script src="bower_components/jquery/dist/jquery.min.js"></script>
	<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="assets/js/wow.min.js"></script>
	<script src="assets/js/owl.carousel.js"></script>
	<script src="assets/js/script.js"></script>

</body>
</html>
