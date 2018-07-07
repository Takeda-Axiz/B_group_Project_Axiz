<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>漫画一覧</title>

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

</head>
<body id="home">

	<!-- ****************************** Header ************************** -->

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-6">
					<a class="logo" href="AdminTop.jsp">管理者専用ページ</a>
				</section>
				<section class="col-xs-1 col-xs-offset-5" style="margin-top: 1em">
					<a class="btn btn-primary btn-lg" href="ComicInsert.jsp">漫画登録ページへ</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<section class="subscribe-wrap">
					<div class="col-xs-offset-3 col-xs-6">
						<div class="row">
							<form action="AdminComicSearch" role="form" method="post">
								<div class="col-xs-12">
									<select class="form-control" name="category">
										<option value="title">作品名</option>
										<option value="author">原作者名</option>
										<option value="category">カテゴリー</option>
										<option value="saleDay">発売日</option>
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

				<div class="adminReference">
					<form action="AdminSelect.jsp" method="post">
						<table border="1" class="table table-striped table-hover">
							<thead class="active">
								<tr>
									<th>ID</th>
									<th>作品名</th>
									<th>巻数</th>
									<th>原作者名</th>
									<th>カテゴリー</th>
									<th>発売日</th>
									<th>出版社</th>
									<th>本体価格</th>
									<th>更新責任者</th>
									<th>更新日付</th>
									<th>更新・削除</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach var="comicList" items="comic">
									<tr class="active">
										<td>${fn:escapeXml(comic.comicId)}</td>
										<td>${comic.comicTitle}</td>
										<td>${comic.numberOfTurns}</td>
										<td>${comic.authorName}</td>
										<td>${comic.categoryName}</td>
										<td>${comic.releaseDate}</td>
										<td>${comic.publisherName}</td>
										<td>${comic.basePrice}</td>
										<td>?</td>
										<td>${comic.updateTimestamp}</td>
										<td><input type="submit" value="更新・削除"> <input
											type="hidden" name="comic" value="${comic}"></td>
									</tr>

									<tr class="active">
										<td>002</td>
										<td>Sample2</td>
										<td>2巻</td>
										<td>ああああ</td>
										<td>少年漫画</td>
										<td>2001年9月3日</td>
										<td>Axiz月間文集</td>
										<td>400円</td>
										<td>鈴木稔也</td>
										<td>2018年7月3日</td>
										<td><input type="submit" value="更新・削除"></td>
									</tr>

									<tr class="active">
										<td>003</td>
										<td>Sample3</td>
										<td>3巻</td>
										<td>ああああ</td>
										<td>少年漫画</td>
										<td>2001年9月3日</td>
										<td>Axiz月間文集</td>
										<td>400円</td>
										<td>鈴木稔也</td>
										<td>2018年7月3日</td>
										<td><input type="submit" value="更新・削除"></td>
									</tr>

									<tr class="active">
										<td>004</td>
										<td>Sample4</td>
										<td>4巻</td>
										<td>ああああ</td>
										<td>少年漫画</td>
										<td>2001年9月3日</td>
										<td>Axiz月間文集</td>
										<td>400円</td>
										<td>鈴木稔也</td>
										<td>2018年7月3日</td>
										<td><input type="submit" value="更新・削除"></td>
									</tr>

									<tr class="active">
										<td>005</td>
										<td>Sample5</td>
										<td>5巻</td>
										<td>ああああ</td>
										<td>少年漫画</td>
										<td>2001年9月3日</td>
										<td>Axiz月間文集</td>
										<td>400円</td>
										<td>鈴木稔也</td>
										<td>2018年7月3日</td>
										<td><input type="submit" value="更新・削除"></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
				</div>
			</section>
			<section class="row">
				<div class="col-xs-12">
					<a class="btn btn-primary btn-xs" href="AdminTop.jsp"
						style="margin-left: 0px;">管理者ページに戻る</a>
				</div>
			</section>
			<section class="row">
				<img src="assets/img/clearline.png" class="img-responsive" alt=""
					style="margin: 0 auto;">
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

	<script>
		$(window).load(function() {
			hhead = $("#header").height();
			hlist = $(".adminReference").height();
			if (hhead + hlist < window.innerHeight) {
				$("#banner").css("height", 100 + "vh");
			}
		});
		$(window).resize(function() {
			hhead = $("#header").height();
			hlist = $(".adminReference").height();
			if (hhead + hlist < window.innerHeight) {
				$("#banner").css("height", 100 + "vh");
			}
		});
	</script>

</body>
</html>

