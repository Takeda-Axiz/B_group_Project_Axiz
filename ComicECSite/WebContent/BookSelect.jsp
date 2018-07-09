<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<title>本棚</title>
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
<style>
table {
	margin-top: 100px
}

div.a {
	margin-top: 30px;
	width: 250px;
	height: 70px;
	line-height: 30px;
	line-width: 90px;
	color: #FFF text-decoration: none text-align: center background-color: #f39800
		/*ボタン色*/
     border-radius: 5px /*角丸*/
     -webkit-transition: all 0.5s transition: all 0.5s
}
</style>
</head>
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-md-6">
					<a class="logo" href="Index.jsp">電子漫画購入サイト</a>
				</section>
				<form action="Index.html" class="pull-right">
					<input class="btn btn-primary btn-sm active" id="setLogin"
						type="button" value="ログアウト"
						onclick="location.href='Index02.jsp'; return false;">
				</form>
			</section>
		</section>
	</header>
	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-xs-12">
					<h1>MY本棚ページ</h1>

					<section class="subscribe-wrap" style="margin-top: 23px;">
						<div class="col-xs-3">
							<div class="row" style="margin-top: 23px;">
								<form role="form" action="BookSelect.jsp" method="post">
									<div class="col-xs-12">
										<select class="form-control" name="Category">
											<option value="title">タイトル</option>
											<option value="author">原作者</option>
											<option value="release date">購入日</option>
											<option value="publisher">カテゴリー</option>
										</select>
									</div>
									<div class="col-xs-10">
										<div class="form-group">
											<input type="text" class="form-control " name="search"
												placeholder="カテゴリー検索">
										</div>
									</div>
									<div class="col-xs-2">
										<button type="submit" class="btn btn-custom"
											style="font-size: 20px;">
											<i class="ion-ios-arrow-thin-right"></i>
										</button>
									</div>
								</form>
							</div>
						</div>
					</section>

					<div class="row">
						<table class="table table-striped">
							<tr>
								<th>No.</th>
								<th>タイトル</th>
								<th>原作者</th>
								<th>購入日</th>
								<th>カテゴリー</th>
								<th>巻数</th>
							</tr>

							<tr class="info">

								<td>1</td>
								<td><a href="Book001.jsp">ワンピース 1巻</a></td>
								<td>鈴木稔也</td>
								<td>1995年8月4日</td>
								<td>少年漫画</td>
								<td>1巻</td>
							</tr>

							<tr>
								<td>2</td>
								<td><a href="Book002.jsp">ワンピース 2巻</a></td>
								<td>鈴木稔也</td>
								<td>2001年8月6日</td>
								<td>少年漫画</td>
								<td>2巻</td>
							</tr>

							<tr class="info">
								<td>3</td>
								<td><a href="Book008.jsp">ドラゴンボール 1巻</a></td>
								<td>鈴木稔也</td>
								<td>2015年10月24日</td>
								<td>少年漫画</td>
								<td>1巻</td>
							</tr>

							<tr>
								<td>4</td>
								<td><a href="Book004.jsp">ドラゴンボール 2巻</a></td>
								<td>鈴木稔也</td>
								<td>2004年12月19日</td>
								<td>少年漫画</td>
								<td>2巻</td>
							</tr>

							<tr class="info">
								<td>5</td>
								<td><a href="Book005.jsp">名探偵コナン 1巻</a></td>
								<td>鈴木稔也</td>
								<td>1999年1月3日</td>
								<td>少年漫画</td>
								<td>1巻</td>
							</tr>

							<tr>
								<td>6</td>
								<td><a href="Book006.jsp">名探偵コナン 2巻</a></td>
								<td>鈴木稔也</td>
								<td>2006年9月26日</td>
								<td>少年漫画</td>
								<td>2巻</td>
							</tr>

						</table>
					</div>
					<div class="row">
						<div>
							<input type="button" class="btn btn-primary" value="トップページ"
								onclick="location.href='Index.jsp'; return false;"><br>
							<br> <input type="button" class="btn btn-primary"
								value="マイページ"
								onclick="location.href='MyPage.jsp'; return false;">
						</div>
					</div>

				</div>
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