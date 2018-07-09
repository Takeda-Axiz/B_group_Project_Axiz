<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Topページ</title>

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
				<div class="col-xs-6">
					<a class="logo" href="Index.jsp">電子漫画購入サイト</a>
				</div>

				<section class="subscribe-wrap">
					<div class="col-xs-3">
						<div class="row">
							<form role="form" method="post" action="SearchResult.jsp">
								<div class="col-xs-12">
									<select class="form-control" name="Category">
										<option value="title">タイトル</option>
										<option value="author">原作者</option>
										<option value="release date">発売日</option>
										<option value="publisher">出版社</option>
									</select>
								</div>
								<div class="col-xs-10">
									<div class="form-group">
										<input type="text" class="form-control" name="search"
											placeholder="カテゴリー検索">
									</div>
								</div>
								<div class="col-xs-2">
									<button type="submit" class="btn btn-custom"
										style="font-size: 14px;">
										<i class="ion-ios-arrow-thin-right"></i>
									</button>
								</div>
							</form>
						</div>
					</div>
				</section>

				<div class="col-xs-3">
					<form action="Login.jsp" class="pull-right">
						<input class="btn btn-primary btn-sm active" id="setLogin"
							type="button" value="ログアウト"
							onclick="changeGlyphicon(); location.href='Index02.jsp'; return false;">
						<input class="btn btn-primary btn-sm active" type="button"
							value="マイページ" onclick="location.href='MyPage.jsp'; return false;">
						<input class="btn btn-primary btn-sm active hidden" id="setLogout"
							type="button" value="ログアウト"
							onclick="changeGlyphicon(); location.href=''; return false;">
						<a class="btn" href="Cart.jsp" role="button"><img
							src="assets/img/cart.png" class="img-responsive" alt="cartImage"></a>
					</form>
					<!--<a class="btn btn-primary btn-lg active" href="Login.html" role="button">ログイン</a>
				<a class="btn btn-primary btn-lg active" href="Login.html" role="button" disabled>ログアウト</a>
				<a class="btn" href="cart.html" role="button"><img src="assets/img/cart.png" class="img-responsive" alt="cartImage"></a>-->

				</div>
			</section>
		</section>
	</header>

	<!-- ****************************** Banner ************************** -->

	<section id="banner">
		<section class="container">
			<section class="row">
				<div>
					<img src="assets/img/clearline.png" class="img-responsive" alt=""
						style="margin: 0 auto;">
				</div>

				<div class="col-md-12">
					<img src="assets/img/ad.png" class="img-responsive"
						alt="advertisement" style="margin: 0 auto;">
				</div>
			</section>
		</section>
	</section>

	<!-- ****************************** Gallery Section ************************** -->

	<section id="banner" class="block">
		<section class="container">
			<section class="row">
				<div class="title-box" style="color: #000;">
					<h1 class="block-title wow animated rollIn">
						<span class="bb-top-left" style="border-color: #000;"></span> <span
							class="bb-bottom-left" style="border-color: #000;"></span>
						最新おすすめ漫画 <span class="bb-top-right" style="border-color: #000;"></span>
						<span class="bb-bottom-right" style="border-color: #000;"></span>
					</h1>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12">
					<div id="screenshots" class="owl-carousel owl-theme">
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-1.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-2.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-3.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-4.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-5.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-6.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-7.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-3.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-5.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-1.png"
								class="img_res wow animated zoomIn"></a>
						</div>
					</div>
					<div class="customNavigation">
						<a class="btn prev gallery-nav wow animated bounceInLeft"><i
							class="ion-ios-arrow-left"></i></a> <a
							class="btn next gallery-nav wow animated bounceInRight"><i
							class="ion-ios-arrow-right"></i></a>
					</div>
				</div>
			</section>
		</section>
	</section>

	<!-- ****************************** Gallery Section ************************** -->

	<section id="banner" class="block">
		<section class="container">
			<section class="row">
				<div class="title-box" style="color: #000;">
					<h1 class="block-title wow animated rollIn">
						<span class="bb-top-left" style="border-color: #000;"></span> <span
							class="bb-bottom-left" style="border-color: #000;"></span> 昔懐かし漫画
						<span class="bb-top-right" style="border-color: #000;"></span> <span
							class="bb-bottom-right" style="border-color: #000;"></span>
					</h1>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12">
					<div id="screenshots2" class="owl-carousel owl-theme"">
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-1.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-2.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-3.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-4.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-5.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-6.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-7.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-3.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-5.png"
								class="img_res wow animated zoomIn"></a>
						</div>
						<div class="item" style="width: 235px;">
							<a href="Book0001.jsp"><img src="assets/img/screenshot-1.png"
								class="img_res wow animated zoomIn"></a>
						</div>
					</div>
					<div class="customNavigation">
						<a class="btn prev2 gallery-nav wow animated bounceInLeft"><i
							class="ion-ios-arrow-left"></i></a> <a
							class="btn next2 gallery-nav wow animated bounceInRight"><i
							class="ion-ios-arrow-right"></i></a>
					</div>
				</div>
			</section>
		</section>
	</section>

	<!-- ****************************** Subscribe Section ************************** -->

	<!-- ****************************** Footer ************************** -->

	<section id="footer">
		<section class="container">
			<section class="row">
				<div class="col-sm-6">
					<span>Developed By</span>
					<h1 class="footer-logo">Axiz</h1>
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

	<script type="text/javascript">
		var clickNumber = 0;
		function changeGlyphicon() {
			clickNumber++;
			if ((clickNumber % 2) == 0) {
				document.getElementById("setLogin").className = "btn btn-primary btn-sm active";
				document.getElementById("setLogout").className = "btn btn-primary btn-sm active hidden";
			} else {
				document.getElementById("setLogin").className = "btn btn-primary btn-sm active hidden";
				document.getElementById("setLogout").className = "btn btn-primary btn-sm active";
			}
		}
	</script>
</body>
</html>
