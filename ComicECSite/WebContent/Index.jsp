<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
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

<style>
.img_res {
	display: block;
	width: 70%;
	height: auto;
	max-width: 100%;
	margin: auto;
}

.block-title {
	font-size: 2.8em;
}
</style>

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
					<a class="logo hidden-xs" href="Index.jsp">電子漫画購入サイト</a>
					<!-- ****************************** 携帯端末用タイトル ************************** -->
					<a class="title hidden-lg col-xs-6.5" href="index.jsp">電子漫画購入サイト</a>
				</div>

				<section class="subscribe-wrap">
					<div class="col-xs-3">
						<div class="row">
							<form role="form" method="post" action="searchResult.jsp">
								<div class="col-xs-12">
									<select class="form-control hidden-xs" name="Category">
										<option value="title">タイトル</option>
										<option value="category">カテゴリー</option>
										<option value="author">原作者</option>
										<option value="publisher">出版社</option>
									</select>
								</div>
								<div class="col-xs-10">
									<div class="form-group hidden-xs">
										<input type="text" class="form-control" name="search"
											placeholder="">
									</div>
								</div>
								<div class="col-xs-2 hidden-xs">
									<button type="submit" class="btn btn-custom"
										style="font-size: 14px;">
										<i class="ion-ios-arrow-thin-right"></i>
									</button>
								</div>
							</form>
						</div>
					</div>
				</section>

				<div class="col-xs-3 ">
					<form action="login.jsp" class="pull-right">
						<c:if test="${not empty userLogin}">
							<input class="btn btn-primary btn-sm active" id="logout"
								type="button" value="ログアウト">
							<input class="btn btn-primary btn-sm active" id="myPage"
								type="button" value="マイページ">
						</c:if>

						<c:if test="${empty userLogin}">
							<input class="btn btn-primary btn-sm active" id="login"
								type="button" value="ログイン">
							<input class="btn btn-primary btn-sm active" id="signUp"
								type="button" value="新規登録">
						</c:if>

						<a class="btn" href="cart.jsp" role="button"> <img
							src="assets/img/cart.png" class="img-responsive hidden-xs"
							alt="cartImage"></a>
					</form>
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


	<!-- ****************************** 携帯端末用検索フォーム ************************** -->
	<section id="banner" class="block hidden-lg">
		<div class="row">
			<form role="form" method="post" action="SearchResult.jsp">
				<div class="col-xs-10">
					<select class="form-control hidden-lg" name="Category">
						<option value="title">タイトル</option>
						<option value="category">カテゴリー</option>
						<option value="author">原作者</option>
						<option value="publisher">出版社</option>
					</select>
				</div>
				<a class="btn" href="cart.jsp" role="button"> <img
					src="assets/img/cart_tell.png" class="img-responsive hidden-lg"
					alt="cartImage"></a>
				<div class="col-xs-10">
					<div class="form-group hidden-lg">
						<input type="text" class="form-control" name="search"
							placeholder="">
					</div>
				</div>
				<div class="col-xs-2 hidden-lg">
					<button type="submit" class="btn btn-custom"
						style="font-size: 14px;">
						<i class="ion-ios-arrow-thin-right"></i>
					</button>
				</div>
			</form>
		</div>
	</section>

	<!-- ****************************** Gallery Section ************************** -->

	<section id="banner" class="block">
		<section class="container">
			<section class="row hidden-xs" style="height: 50px;">
				<div class="title-box " style="color: #000; font-size: 10px;">
					<h1 class="block-title wow animated rollIn">
						<span class="bb-top-left" style="border-color: #000;"></span> <span
							class="bb-bottom-left" style="border-color: #000;"></span>
						最新おすすめ漫画 <span class="bb-top-right" style="border-color: #000;"></span>
						<span class="bb-bottom-right" style="border-color: #000;"></span>
					</h1>
				</div>
			</section>
			<!-- ****************************** 携帯端末用検索フォーム ************************** -->
			<section class="row  hidden-lg" style="height: 35px;">
				<div class="title-box" style="color: #000; font-size: 6.5px;">
					<h1 class="block-title wow animated rollIn">
						<span class="bb-top-left" style="border-color: #000;"></span> <span
							class="bb-bottom-left" style="border-color: #000;"></span>
						最新おすすめ漫画 <span class="bb-top-right" style="border-color: #000;"></span>
						<span class="bb-bottom-right" style="border-color: #000;"></span>
					</h1>
				</div>
			</section>

			<form action="SelectComic" method="post">
				<div class="col-xs-12">
					<div id="screenshots" class="owl-carousel owl-theme">
						<div class="item">
							<button name="comicId" value="1" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-1.png" class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="2" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-2.png"
									class="img_res wow animated zoomIn">
							</button>

						</div>
						<div class="item">
							<button name="comicId" value="3" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-3.png"
									class="img_res wow animated zoomIn">
							</button>

						</div>
						<div class="item">
							<button name="comicId" value="4" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-4.png"
									class="img_res wow animated zoomIn">
							</button>

						</div>
						<div class="item">
							<button name="comicId" value="5" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-5.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="6" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-6.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="7" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-7.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="8" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-3.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="9" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-5.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
						<div class="item">
							<button name="comicId" value="10" style="border: none; background: rgba(0, 0, 0, 0);">
								<img src="assets/img/screenshot-1.png"
									class="img_res wow animated zoomIn">
							</button>
						</div>
					</div>
					<div class="customNavigation">
						<a class="btn prev gallery-nav wow animated bounceInLeft"><i
							class="ion-ios-arrow-left"></i></a> <a
							class="btn next gallery-nav wow animated bounceInRight"><i
							class="ion-ios-arrow-right"></i></a>
					</div>
				</div>
			</form>
		</section>
	</section>

	<!-- ****************************** Gallery Section ************************** -->

	<c:if test="${not empty userLogin}">
		<section id="banner" class="block">
			<section class="container">
				<section class="row  hidden-xs" style="height: 50px;">
					<div class="title-box" style="color: #000; font-size: 10px;">
						<h1 class="block-title wow animated rollIn">
							<span class="bb-top-left" style="border-color: #000;"></span> <span
								class="bb-bottom-left" style="border-color: #000;"></span>
							昔懐かし漫画 <span class="bb-top-right" style="border-color: #000;"></span>
							<span class="bb-bottom-right" style="border-color: #000;"></span>
						</h1>
					</div>
				</section>
				<!-- ****************************** 携帯端末用検索フォーム ************************** -->
				<section class="row  hidden-lg" style="height: 25px;">
					<div class="title-box" style="color: #000; font-size: 6.5px;">
						<h1 class="block-title wow animated rollIn">
							<span class="bb-top-left" style="border-color: #000;"></span> <span
								class="bb-bottom-left" style="border-color: #000;"></span>
							昔懐かし漫画 <span class="bb-top-right" style="border-color: #000;"></span>
							<span class="bb-bottom-right" style="border-color: #000;"></span>
						</h1>
					</div>
				</section>
				<section class="row">
					<div class="col-xs-12">
						<div id="screenshots2" class="owl-carousel owl-theme">
							<div class="item">
								<button name="comicId" value="1" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-1.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="2" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-2.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="3" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-3.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="4" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-4.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="5" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-5.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="6" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-6.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="7" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-7.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="8" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-3.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="9" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-5.png"
										class="img_res wow animated zoomIn">
								</button>
							</div>
							<div class="item">
								<button name="comicId" value="10" style="border: none; background: rgba(0, 0, 0, 0);">
									<img src="assets/img/screenshot-1.png"
										class="img_res wow animated zoomIn">
								</button>
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
	</c:if>

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

	<script type="text/javascript">
		$(':button#logout').click(function() {
			$('form').attr('action', 'index');
			$('form').attr('method', 'post');
			$('form').submit();
		});

		$(':button#myPage').click(function() {
			$('form').attr('action', 'myPage');
			$('form').attr('method', 'post');
			$('form').submit();
		});

		$(':button#login').click(function() {
			$('form').attr('action', 'login');
			$('form').attr('method', 'post');
			$('form').submit();
		});

		$(':button#signUp').click(function() {
			$('form').attr('action', 'agreement.jsp');
			$('form').attr('method', 'post');
			$('form').submit();
		});

		$(':button#comicBtn').click(function() {
			$('input').attr('type', 'hidden');
			$('input').attr('name', '');
			$('input').attr('value', '1');
		});
	</script>
</body>
</html>
