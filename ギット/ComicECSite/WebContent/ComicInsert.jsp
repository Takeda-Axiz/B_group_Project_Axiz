<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>漫画登録画面</title>

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
	form{
		margin-top: 20px;
	}
	#banner div{
		margin-top: 20px;
	}
</style>
</head>
<body id="home">

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<div class="col-xs-6">
					<a class="logo" href="AdminTop.html">管理者専用ページ</a>
				</div>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<p><h3><b>漫画登録情報を入力してください<br>
				<span class="required"></span>※は必須です</b></h3></p>

				<form action="ComicInsertResult.html" method="post">
					<fieldset class="label-60">
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※タイトル</label><input type="text"name="name">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※カテゴリ</label><input type="text" name="category">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※値段</label><input type="text" name="price">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※出版社</label><input type="text" name="publisher">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※表紙画像</label><input type="text" name="front" placeholder="Path">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">発売日</label><input type="date"  name="release_date">
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※原作者名</label><input type="text" name="author">
						</div>
						あらすじ<br>
						<textarea name="arasuzi" rows="11" cols="80"></textarea><br>
					</fieldset>
					<input class="btn btn-primary btn-md" type="submit" name="button" value="登録">
				</form>
			</section>
			<section class="row">
				<div class="col-xs-12">
					<a class="btn btn-primary btn-xs" href="AdminTop.html" style="margin-left: 0px;">管理者ページに戻る</a>
				</div>
			</section>
			<section class="row">
				<img src="assets/img/clearline.png" class="img-responsive" alt="" style="margin: 0 auto;">
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
