<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>新規会員登録</title>

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

<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!--[if lt IE 9]>
        <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

</head>
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="Index.jsp">電子漫画購入サイト</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-md-6">
					<div class="headings">

						<form method="post" action="UserRegisterComfirm.jsp">
							<h2>新規会員登録フォーム</h2>
							<p>
								※は必須項目です<br>生年月日は登録後変更できません
							</p>

							<div class="form-group">
								<label class="required">※名前</label><input type="text"
									class="form-control" name="use_rname">
							</div>
							<div class="form-group">
								<label class="required">※生年月日</label><input type="date"
									class="form-control" name="user_birthday">
							</div>
							<div class="form-group">
								<p></p>
								<label class="required">※会員ID</label><input type="email"
									class="form-control" name="user_id" placeholder="メールアドレス">
							</div>
							<div class="form-group">
								<label class="required">※パスワード</label> <input type="password"
									class="form-control" name="password">
							</div>
							<div align="center">
								<button type="submit" class="btn btn-primary " name="signup"
									onclick="location.href='UserRegisterComfirm.jsp'; return false;">会員登録する</button>
							</div>

						</form>
					</div>
				</div>
			</section>
		</section>
	</section>

	<section id="footer">
		<div class="col-xs-6 col-md-3">
			<a class="btn btn-primary btn-xs" href="index02.jsp" roll="btn">トップページ</a>
		</div>
	</section>
	<!-- All the scripts -->

	<script src="bower_components/jquery/dist/jquery.min.js"></script>
	<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="assets/js/wow.min.js"></script>
	<script src="assets/js/owl.carousel.js"></script>
	<script src="assets/js/script.js"></script>


</body>
</html>