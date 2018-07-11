<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>本棚</title>
<!-- meta -->
<meta charset="UTF-8">
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
					<a class="logo" href="index">電子漫画購入サイト</a>
				</section>
				<form action="index" class="pull-right">
					<input class="btn btn-primary btn-sm active" id="logout"
						type="button" value="ログアウト">
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
								<form role="form" action="selectBookShelf" method="post">
									<div class="col-xs-12">
										<select class="form-control" name="Category">
											<option value="title">タイトル</option>
											<option value="author">原作者</option>
											<option value="release_date">購入日</option>
											<option value="category">カテゴリー</option>
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

					<form action="bookSelect" method="post">
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

								<c:forEach var="list" items="${userComicList}" varStatus="status">
									<tr class="info">
										<td>
											${status.count}
											<input type="hidden" name="comicId" value="${fn:escapeXml(list.comicId)}">
										</td>
										<td><button style="display:inline-block; border: none; background-color: #D6F2F3; color: #00f; text-decoration: underline; cursor: pointer;">${fn:escapeXml(list.comicTitle)}</button></td>
										<td>${fn:escapeXml(list.authorName)}</td>
										<td>${fn:escapeXml(list.purchaseTimestamp)}</td>
										<td>${fn:escapeXml(list.categoryName)}</td>
										<td>${fn:escapeXml(list.numberOfTurns)}巻</td>
									</tr>
								</c:forEach>
							</table>
						</div>
						<div class="row">
							<div>
								<input type="button" class="btn btn-primary" value="トップページ"
									onclick="location.href='index'; return false;"><br>
								<br> <input type="button" class="btn btn-primary"
									value="マイページ"
									onclick="location.href='myPage'; return false;">
							</div>
						</div>
					</form>
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

	<script>

	//	$('a#titleLink').click(function() {
	//		$('form').attr('action', 'bookSelect');
	//		$('form').attr('method', 'post');
	//		$('form').submit();
	//	});

	</script>

</body>
</html>
