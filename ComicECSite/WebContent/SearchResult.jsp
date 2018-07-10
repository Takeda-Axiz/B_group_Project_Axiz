<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>検索結果画面</title>

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

	<!-- ****************************** Preloader ************************** -->

	<div id="preloader"></div>

	<!-- ****************************** Sidebar ************************** -->

	<!-- ****************************** Header ************************** -->

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
				<section class="col-xs-12">
					<div class="headline">
						<h3>検索結果</h3>
					</div>

					<div class="searchResult">
						<table class="table table-striped">
							<tr>
								<th>No</th>
								<th>タイトル</th>
								<th>カテゴリー</th>
								<th>原作者</th>
								<th>出版社</th>
								<th>値段</th>
							</tr>

							<tr class="info">
								<td>1</td>
								<td><a href="Book0001.jsp">sample01</a></td>
								<td>少年漫画</td>
								<td>00000001</td>
								<td>出版社</td>
								<td>500</td>
							</tr>

							<tr>
								<td>2</td>
								<td><a href="Book0001.jsp">sample02</a></td>
								<td>青年漫画</td>
								<td>00000002</td>
								<td>出版社</td>
								<td>1000</td>
							</tr>

							<tr class="info">
								<td>3</td>
								<td><a href="Book0001.jsp">sample03</a></td>
								<td>少女漫画</td>
								<td>00000003</td>
								<td>出版社</td>
								<td>5000</td>
							</tr>

							<tr>
								<td>4</td>
								<td><a href="Book0001.jsp">sample04</a></td>
								<td>少年漫画</td>
								<td>00000004</td>
								<td>出版社</td>
								<td>10000</td>
							</tr>

						</table>
					</div>
				</section>
			</section>
			<section class="row col-xs-12">
				<div class="col-xs-2 col-md-1" style="margin-bottom: 2em;">
					<a class="btn btn-primary " role="button" href="Index.jsp">トップページ</a>
				</div>
			</section>
		</section>
	</section>

	<section id="footer">
		<section class="container">
			<section class="row">
				<div class="col-sm-6">
					<span>Developed By</span>
					<h1 class="footer-logo">B group</h1>
				</div>
				<div class="col-sm-6">
					<p class="copyright">All Copyright Reserved 2018</p>
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

	<script>
		$(window).load(function() {
			hhead = $(".header").height();
			hlist = $(".searchResult").height();
			if (hhead + hlist < window.innerHeight) {
				$("#banner").css("height", 80 + "vh");
			}
		});
		$(window).resize(function() {
			hhead = $(".header").height();
			hlist = $(".searchResult").height();
			if (hhead + hlist < window.innerHeight) {
				$("#banner").css("height", 80 + "vh");
			}
		});
	</script>

</body>
</html>
