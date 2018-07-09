<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>強制退会画面</title>

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

<!-- jQuery -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

</head>
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<div class="col-xs-6">
					<a class="logo hidden-xs" href="AdminTop.jsp">管理者ページ</a>

				</div>

				<section class="subscribe-wrap">
					<div class="col-xs-6">
						<div class="row">
							<p>強制退会させたい会員のメールアドレスを入力して下さい。</p>
							<div class="col-xs-10">
								<div>
									<label class="required">会員ID</label><input type="text"
										name="user_id">
									<button type="submit" class="btn btn-primary" name="signup"
										onclick="location.href='UnsubscribeConfirm.jsp'; return false;">確認</button>
								</div>
							</div>

							</form>
						</div>
					</div>
				</section>


				</div>
			</section>
		</section>
	</header>


	<section id="banner">
		<section class="container">
			<section class="row">
				<div class="col-md-12">

					<h2>強制退会</h2>

					<table class="table table-striped">
						<tr>
							<th>メールアドレス</th>
							<th>ユーザー名</th>
							<th>生年月日</th>
							<th>残高</th>
							<th>ポイント</th>
							<th>登録日時</th>
							<th>更新日時</th>
						</tr>

						<c:forEach var="list" items="${userList}">
							<tr class="info">
							<td>${list.user_id }</a></td>
							<td>${list.user_name }</td>
							<td>${list.birthday }</td>
							<td>${list.balance }</td>
							<td>${list.point }</td>
							<td>${list.insert }</td>
							<td>${list.update }</td>
						</tr>
						</c:forEach>

					</table>





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
	</section>

	<p id="pageTop">
		<a href="#">ページ<br>トップへ
		</a>
	</p>


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


	<script>
$(function(){
var topBtn=$('#pageTop');
topBtn.hide();




$(window).scroll(function(){
  if($(this).scrollTop()>80){


    topBtn.fadeIn();

  }else{


    topBtn.fadeOut();

  }
});




topBtn.click(function(){
  $('body,html').animate({
  scrollTop: 0},500);
  return false;

});


});
</script>

</body>
</html>