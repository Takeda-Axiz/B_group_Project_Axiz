<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Book0001</title>

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

<style>
p {
	text-align: left;
	margin-top: 25px;
	font-size: 20px;
	margin-left: 440px;
}

div.b {
	float: left;
	width: 400px;
	height: 400px;
	margin-top: 25px;
}

div.z {
	margin-top: 150px;
}
</style>
</head>
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="Index.html">電子漫画購入サイト</a>
				</section>
			</section>
		</section>
	</header>


	<section id="banner">
		<section class="container">
			<section class="row">

				<div class="headings">
					<h1>ワンピース 1巻</h1>
					<div class="b">
						<img src="gazou/onw.jpg" width="400" height="400">
					</div>
					<p>タイトル ワンピース</p>
					<p>原作者名 鈴木稔也</p>
					<p>購入日 1000年6月5日</p>
					<p>カテゴリー 少年漫画</p>

					<p>海賊王を夢見る少年モンキー・D・ルフィを主人公とする、「ひとつなぎの大秘宝（ワンピース）」を巡る海洋冒険ロマン。
						夢への冒険・仲間たちとの友情といったテーマを前面に掲げ、バトルやギャグシーン、感動エピソードをメインとする少年漫画の王道を行く物語として人気を博している</p>

					<div class="z">
						<form action="Cart.html">
							<input type="submit" class="btn btn-primary btn-md"
								value="カートへ入れる"> <input type="submit"
								class="btn btn-primary btn-md" value="ポイント購入"
								onclick="location.href='PointConfirm.html'; return false;">
						</form>
						<br> <a href="Index.html" class="btn btn-primary btn-sm">戻る</a>
					</div>

					<div>
						<img src="assets/img/clearline.png" class="img-responsive" alt=""
							style="margin: 0 auto;">
					</div>
				</div>
			</section>
		</section>
	</section>

	<footer></footer>

	<!-- All the scripts -->

	<script src="bower_components/jquery/dist/jquery.min.js"></script>
	<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="assets/js/wow.min.js"></script>
	<script src="assets/js/owl.carousel.js"></script>
	<script src="assets/js/script.js"></script>



</body>
</html>
