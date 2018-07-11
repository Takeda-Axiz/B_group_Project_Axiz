<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
/*
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
*/
<html>
<head>
<title>漫画の詳細（ワンピース）</title>
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
				<section class="col-xs-12">
					<a class="logo" href="">電子漫画購入サイト</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<c:if test="${empty comicId}">
					<p>見つかりませんでした</p>
				</c:if>


				<c:if test="${not empty comicId}">
					<h3>${comicTitle}</h3>
					<div class="b">
						<img src=${imageData } width="80%" height="100%">
					</div>
					<p>タイトル:${comicTitle}</p>
					<p>原作者:${authorName}</p>
					<p>購入日:${purchase}</p>
					<p>カテゴリー:${category}</p>

					<p>${introduction}</p>

				</c:if>

				<div class="z">


					<br>
					<form role="form" method="post" action="Book001.html">
						<c:if test="${not empty individual_evaluation }">
							<p>あなたの評価：${individual }</p>
						</c:if>
						<c:if test="${empty individual_evaluation}">
							<div class="col-xs-2">
								<select class="form-control" name="Category">
									<option value="title">評価を選択</option>
									<option value="valuation1">1</option>
									<option value="valuation2">2</option>
									<option value="valuation3">3</option>
									<option value="valuation4">4</option>
									<option value="valuation5">5</option>
								</select>
							</div>
						</c:if>
						<div class="col-xs-1">
							<button type="submit" class="btn btn-custom"
								style="font-size: 14px;">
								<i class="ion-ios-arrow-thin-right"></i>
							</button>
						</div>
					</form>
				</div>
				<br> <br>
				<input type="button" class="btn btn-primary " value="閲覧する"
					onclick="location.href='ComicRead.html'; return false;"> <br>
				<br>
				<a class="btn btn-primary " href="BookSelect.jsp">本棚へ戻る</a>
				</div>
			</section>
			<section class="row">
				<img src="assets/img/clearline.png" class="img-responsive" alt=""
					style="margin: 0 auto;">
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
