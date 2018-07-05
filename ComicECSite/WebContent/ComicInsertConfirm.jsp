<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>漫画情報登録確認画面</title>

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
					<a class="logo" href="">管理者専用ページ</a>
				</div>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<h3><b>漫画情報登録確認</h3>

				<h3>これでよろしいですか？</b></h3>

				<form action="ComicInsertResult.html" method="post">
					<fieldset class="label-60">
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※タイトル</label><input type="text"name="name" value="ワンピース" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※カテゴリ</label><input type="text" name="category" value="少年" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※値段</label><input type="text" name="price" value="500円" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※出版社</label><input type="text" name="publisher" value="集英社" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※評価</label><input type="text" name="evaluation" placeholder="1～5段階" value="3.3" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※発売日</label><input type="date"  name="release_date" value="2018年7月2日" readonly>
						</div>
						<div>
							<label for="inputEmail3" class="col-xs-2 control-label">※原作者名</label><input type="text" name="author" value="尾田栄一郎" readonly>
						</div>
						※あらすじ<br>
						<textarea readonly name="arasuzi" rows="11" cols="80">aaaaaaaaaaaaaaa</textarea><br>
					</fieldset>
					<div>
						<input class="btn btn-primary btn-md" type="submit" name="button" value="登録">
						<input class="btn btn-primary btn-md" type="submit" name="button" onclick="location.href='ComicInsert.html'; return false;" value="戻る">
					</div>
				</form>
			</section>
			<section class="row">
				<div>
					<img src="assets/img/clearline.png" class="img-responsive" alt="" style="margin: 0 auto;">
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