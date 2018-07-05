<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>チャージ画面</title>

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
				<div class="col-md-6">
					<div class="headings">
						<div class="field">

							<form action="ChargeResult.html" method="post">
								<div class="form">
									<label>シリアルコード</label> <input type="text" class="form-control"
										name="serialCode" value="0123401234" readonly>
								</div>

								<div class="form">
									<label>チャージ金額</label> <input type="text" class="form-control"
										name="chargeMoney" value="100000" readonly><label>円</label>
								</div>

								<div class="submit">
									<label>上記の内容でチャージします</label><br> <label>よろしいですか？</label><br>
									<input type="submit" class="btn btn-lg btn-primary btn-block"
										value="はい"> <input type="submit"
										class="btn btn-lg btn-primary btn-block" name="button"
										value="いいえ"
										onclick="location.href='Charge.html'; return false;">
								</div>
							</form>

						</div>
					</div>
				</div>
			</section>
		</section>
	</section>

	<footer></footer>


	<!-- All the scripts -->

	<script src="bower_components/jquery/dist/jquery.min.js"></script>
	<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="assets/js/wow.min.js"></script>
	<script src="assets/js/owl.carousel.js"></script>
	<script src="assets/js/script.js"></script>
</body>
</html>