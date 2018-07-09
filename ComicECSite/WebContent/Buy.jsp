<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>購入確認画面</title>

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


	<div id="preloader"></div>

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
				<div class="field">

					<div class="headline">
						<h3>購入確認</h3>
						<p>現在のチャージ残高：3000円</p>
					</div>
					<form action="BuyConfirm.jsp" method="post">
						<div class="">
							<table class="table table-striped">
								<tr>
									<th>No</th>
									<th>タイトル</th>
									<th>原作者</th>
									<th>出版社</th>
									<th>値段</th>
								</tr>

								<tr class="info">
									<td>1</td>
									<td><a href="Book0001.jsp">sample01</a></td>
									<td>00000001</td>
									<td>出版社</td>
									<td>500</td>
								</tr>

								<tr>
									<td>2</td>
									<td><a href="Book0001.jsp">sample02</a></td>
									<td>00000002</td>
									<td>出版社</td>
									<td>1000</td>
								</tr>

								<tr class="info">
									<td>3</td>
									<td><a href="Book0001.jsp">sample03</a></td>
									<td>00000003</td>
									<td>出版社</td>
									<td>5000</td>
								</tr>

								<tr>
									<td>4</td>
									<td><a href="Book0001.jsp">sample04</a></td>
									<td>00000004</td>
									<td>出版社</td>
									<td>10000</td>
								</tr>
								<tr class="info">
									<th colspan="4">合計</th>
									<td>16500</td>
								</tr>
							</table>
						</div>
					</form>
					<form action="BuyConfirm.jsp" method="post">
						<div class="row col-xs-6 col-md-3 pull-right">
							<button class="btn btn-lg btn-primary btn-block " name="Submit"
								value="Login" type="Submit">購入確定</button>
						</div>
						<br> <br> <br>
						<div class="row col-xs-6 col-md-3 pull-right">
							<input type="submit" class="btn btn-lg btn-primary btn-block"
								name="button" value="カートへ戻る"
								onclick="location.href='Cart.jsp'; return false;">
						</div>
					</form>
				</div>

				<br>
				<form action="Index.jsp" method="post" class="col-md-2">
					<div class="link">
						<input type="submit" class="btn btn-lg btn-primary btn-block"
							value="トップページ"> <input type="submit"
							class="btn btn-lg btn-primary btn-block" name="button"
							value="マイページ" onclick="location.href='MyPage.jsp'; return false;">
					</div>
				</form>


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