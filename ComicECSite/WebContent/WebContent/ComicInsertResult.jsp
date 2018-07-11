<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>漫画情報登録確定画面</title>

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

<style>
.headings p {
	text-align: left;
}

.headings a {
	margin-left: 0px;
	margin-right: 0px;
}
</style>
</head>
<body id="home">

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="AdminTop.jsp">管理者専用ページ</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-md-6 col-xs-12">
					<div class="headings">
						<h3>漫画情報登録確定</h3>
						<p>漫画情報が確定しましました。</p>
						<a class="btn btn-primary btn-md" href="AdminReference.jsp">登録漫画一覧</a>
						<a class="btn btn-primary btn-md" href="AdminTop.jsp">管理者ページ</a>
					</div>
				</div>

				<div>
					<img src="assets/img/clearline.png" class="img-responsive" alt=""
						style="margin: 0 auto;">
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

				<div class="col-sm-6"></div>
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
