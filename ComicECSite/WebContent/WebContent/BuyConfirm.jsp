<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>購入完了</title>

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

</head>
<body>


	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="">電子漫画購入サイト</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-md-9">
					<div class="headings">

						<h2 class="wow animated fadeInDown">ご購入ありがとうございました。</h2>
						<p>現在のチャージ残高：${afterBalance }円</p>
						<div class="row">
							<div class="col-xs-3 col-sm-3 col-md-3">
								<div>
									<a href="Index.jsp"
										class="polo-btn store wow animated bounceInUp"
										style="color: #000;"><i></i>トップページ</a>
								</div>
							</div>
							<div class="col-xs-3 col-sm-3 col-md-3">
								<div>
									<a href="MyPage.jsp"
										class="polo-btn store wow animated bounceInUp"
										style="color: #000;"><i></i>マイページ</a>
								</div>
							</div>
							<div class="col-xs-3 col-sm-3 col-md-3">
								<div>
									<form action="BookShelf" method="post">
									<button class="polo-btn store wow animated bounceInUp"
										id="bookshelfSearch" style="color: #000;"><i></i>本棚検索</button>
									</form>
								</div>
							</div>
						</div>
					</div>
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

				<div class="col-sm-6">

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

		$(':button#bookshelfSearch').click(function() {
			$('form').attr('action', 'BookShelf');
			$('form').attr('method', 'post');
			$('form').submit();
		});

	</script>

</body>
</html>
