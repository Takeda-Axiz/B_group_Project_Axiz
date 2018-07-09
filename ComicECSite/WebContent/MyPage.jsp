<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>マイページ</title>

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

<style>
.btn {
	width: 150px;
}

.box {
	position: relative;
	height: 80px;
}

.btn.children {
	position: absolute;
	right: 0;
	bottom: 100;
}
</style>

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
					<div class="col-xs-6">
						<div class="row" style="text-align: center;">
							<form role="form" method="post">
								<div class="col-xs-12">

									あなたの所有しているチャージ金額 <font color="red">1000円</font>

								</div>
								<div class="col-xs-10">
									<div class="form-group">
										ポイント数 <font color="red">10pt</font>
									</div>
								</div>
							</form>
							<form action="Index.html" class="pull-right">
								<input class="btn btn-primary btn-sm active" id="setLogin"
									type="button" value="ログアウト"
									onclick="location.href='Index02.jsp'; return false;">
							</form>

						</div>
					</div>
				</section>
			</section>
		</section>
	</header>

	<!-- ****************************** Banner ************************** -->

	<section id="banner" class="all-wrapper">
		<section class="container">
			<section class="row">

				<br>
				<br>
				<div class="col-lg-12 text-center" style="margin-top: 23px;">
					<a class="btn btn-primary btn-lg" href="BookSelect.jsp">my本棚ページ</a>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12 text-center" style="margin-top: 23px;">
					<a class="btn btn-primary btn-lg" href="Charge.jsp">チャージ</a>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12 text-center" style="margin-top: 23px;">
					<a class="btn btn-primary btn-lg" href="EditAccount.jsp">会員情報変更</a>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12 text-center" style="margin-top: 23px;">
					<a class="btn btn-primary btn-lg" href="UserLeave.jsp">退会</a>
				</div>
			</section>
			<section class="row">
				<div class="box col-xs-2 col-md-1">
					<br> <br> <br> <br> <br> <br> <br>
					<br> <a class="btn children btn-primary " href="Index.jsp">TOPページ</a>
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

				<div class="col-xs-6 col-md-3 col-xs-offset-8 col-md-offset-10">
					<a class="btn btn-primary"
						href="mailto:info@example.com?
						subject=%e3%81%8a%e5%95%8f%e3%81%84%e5%90%88%e3%82%8f%e3%81%9b
						&amp;body=%e3%81%8a%e5%95%8f%e3%81%84%e5%90%88%e3%82%8f%e3%81%9b%e5%86%85%e5%ae%b9%e3%82%92%e3%81%94%e8%a8%98%e5%85%a5%e3%81%8f%e3%81%a0%e3%81%95%e3%81%84%e3%80%82 %0D%0A
						 %0d%0a %201%2e%e3%80%8e%e3%81%8a%e5%95%8f%e3%81%84%e5%90%88%e3%82%8f%e3%81%9b%e9%a0%85%e7%9b%ae%e3%82%92%e3%81%94%e8%a8%98%e5%85%a5%e4%b8%8b%e3%81%95%e3%81%84%e3%80%82%e3%80%8f%e3%81%ab%e3%81%a4%e3%81%84%e3%81%a6%20 %0D%0A
						 %0d%0a 2%2e%e5%86%85%e5%ae%b9 %0D%0A
						 %e4%be%8b%20%e3%83%bb%e8%b3%bc%e5%85%a5%e3%81%97%e3%81%9f%e3%81%ae%e3%81%ab%e6%9c%ac%e6%a3%9a%e3%81%ab%e6%bc%ab%e7%94%bb%e3%81%8c%e5%85%a5%e3%81%a3%e3%81%a6%e3%81%84%e3%81%aa%e3%81%84%0d%0a%20%e3%80%80%e3%83%bb%e6%bc%ab%e7%94%bb%e3%82%92%e9%96%93%e9%81%95%e3%81%a3%e3%81%a6%e8%b3%bc%e5%85%a5%e3%81%97%e3%81%a6%e3%81%97%e3%81%be%e3%81%a3%e3%81%9f%e3%80%81%e8%bf%94%e9%87%91%e3%81%97%e3%81%a6%e6%ac%b2%e3%81%97%e3%81%84%0d%0a%e3%80%80
						 ">
						お問い合わせ</a>
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

