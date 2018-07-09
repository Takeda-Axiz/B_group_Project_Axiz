<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>管理者漫画更新・削除検索<</title>

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
form {
	margin-top: 20px;
}

#banner div {
	margin-top: 20px;
}
</style>
</head>
<body id="home">

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<div class="col-xs-6">
					<a class="logo" href="AdminTop.html">管理者専用ページ</a>
				</div>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<section class="row">
				<p>
				<h3>
					<b>更新・削除する項目を選択してください<br> <span class="required"></span></b>
				</h3>
				</p>

				<form action="ComicInsertResult.html" method="post">
					<c:if test="${not empty errmsg}">
						<p class="error">${fn:escapeXml(errmsg)}</p>
					</c:if>
					<c:forEach var="comic" items="${comicList}">
						<fieldset class="label-60">
							<input type="hidden" value="${comic.comicId}">
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">タイトル</label><input
									type="text" name="name" value="${comic.comicTitle}" readonly>
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">巻数</label><input
									type="text" name="numberOfTurns" value="${comic.numberOfTurns}">
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">カテゴリー選択</label>
								<select class="control-labell" name="Category"
									value="${comic.categoryName}" style="width: 142px">
									<option value="0">少年漫画</option>
									<option value="1">青年漫画</option>
									<option value="2">少女漫画</option>
								</select>
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">値段</label><input
									type="text" name="price" value="${comic.basePrice}">
							</div>


							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">出版社選択</label>
								<select class="control-labell" name="publisher"
									value="${comic.publisherName}" style="width: 142px">
									<option value="0">集英社</option>
									<option value="1">講談社</option>
									<option value="2">ノース・スターズ・ピクチャーズ</option>
								</select>
							</div>


							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">表紙画像</label><input
									type="text" name="front" value="${comic.imageData}"
									placeholder="Path">
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">URL</label><input
									type="text" name="URL" value="${comic.viewPage}" placeholder="Path">
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">発売日</label><input
									type="date" name="release_date" value="${comic.releaseDate}">
							</div>
							<div>
								<label for="inputEmail3" class="col-xs-2 control-label">原作者</label><input
									type="text" name="author" value="${comic.authorName}">
							</div>
							あらすじ<br>
							<textarea name="summary" rows="11" cols="80" value="${comic.introduction}"></textarea>
							<br>
						</fieldset>

						<input class="btn btn-primary btn-lg" id="update" type="submit"
							value="更新">
						<input class="btn btn-primary btn-lg" id="delete" type="submit"
							value="削除">
					</c:forEach>
				</form>
			</section>
			<br> <br>
			<section class="row">
				<div class="col-xs-12">
					<a class="btn btn-primary btn-xs" href="AdminReference.jsp"
						style="margin-left: 0px;">登録漫画一覧へ戻る</a>
				</div>
			</section>
			<section class="row">
				<img src="assets/img/clearline.png" class="img-responsive" alt=""
					style="margin: 0 auto;">
			</section>
		</section>
	</section>

	<br>
	<br>

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
		$(':submit#update').click(function() {
			$('form').attr('action', 'ComicUpdateResult.jsp');
			$('form').attr('method', 'post');
			$('form').submit();
		});

		$(':submit#delete').click(function() {
			$('form').attr('action', 'AdminComicDelete');
			$('form').attr('method', 'post');
			$('form').submit();
		});
	</script>

</body>
</html>
