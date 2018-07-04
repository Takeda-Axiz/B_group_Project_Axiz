
<!DOCTYPE html>
<html lang="en">
<head>
<title>管理者ログイン画面</title>

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
<body>

	<header class="sticky" id="header">
		<section class="container">
			<section class="row" id="logo_menu">
				<section class="col-xs-12">
					<a class="logo" href="">管理者専用ページ</a>
				</section>
			</section>
		</section>
	</header>

	<section id="banner">
		<section class="container">
			<div class="headings" style="padding:0 0 50% 0;">
				<form action="AdminTop.html" method="post">
					<section class="row">
						<div class="row col-xs-12 col-md-6">
							<h3>管理者IDとパスワードを入力してください</h3>
							<br> <input type="text" class="form-control" name="id"
								placeholder="管理者ID" /> <input type="password"
								class="form-control" name="pass" placeholder="パスワード" />
						</div>
					</section>
					<br>
					<section class="row">
						<div class="row col-xs-6 col-md-3">
							<button class="btn btn-lg btn-primary btn-block" name="Submit" value="Login" type="Submit">
								ログイン
							</button>
						</div>
					</section>
				</form>
				<section class="row">
					<div>
						<img src="assets/img/clearline.png" class="img-responsive" alt="" style="margin: 0 auto;">
					</div>
				</section>
			</div>
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