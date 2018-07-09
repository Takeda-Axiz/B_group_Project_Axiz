<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>更新確認画面</title>

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
<body id="home">

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="">管理者専用ページ</a>
				</section>
			</section>
		</section>
	</header>


	<section id="banner">
		<section class="container">
			<form action="ComicUpdateResult.jsp" method="post">
				<section class="row">
					<div class="col-md-6">
						<h3>※この内容で更新してよろしいですか？</h3>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								ID:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								タイトル:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								巻数:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								原作者:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								カテゴリー:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								発売日:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								表紙画像:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								出版社:</label><input type="text" name="id" readonly>
						</p>

						<p>
							<label for="inputEmail3" class=" col-xs-3 control-label">
								本体価格:</label><input type="text" name="id" readonly>
						</p>
					</div>
				</section>
				<section class="row">
					<input class="btn btn-primary btn-md" type="submit" value="更新">
					<input class="btn btn-primary btn-md" type="submit"
						value="漫画更新ページへ戻る"
						onclick="location.href='AdminSelect.jsp'; return false;">
				</section>
			</form>
			<section class="row">
				<div>
					<img src="assets/img/clearline.png" class="img-responsive" alt=""
						style="margin: 0 auto;">
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
