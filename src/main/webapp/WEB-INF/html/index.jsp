<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Document</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="stylesheet" type="text/css" href="css/head_foot.css" />
<link href="css/reset.css" rel="stylesheet" type="text/css">
<style type="text/css">
li {
	list-style: none;
}

ul {
	margin: 0;
	padding: 0;
}

.contentbox {
	width: 100%;
	clear: left;
}

.qcontainer {
	-webkit-perspective: 400;
	-moz-perspective: 400;
	float: left;
	width: 180px;
	margin-right: 20px;
}

.film {
	width: 100%;
	height: 200px;
	-webkit-transform-style: preserve-3d;
	-webkit-transition: 1.5s;
	-moz-transform-style: preserve-3d;
	-moz-transition: 1.5s;
}

.qcontainer:hover .film {
	-webkit-transform: rotateY(180deg);
	-moz-transform: rotateY(180deg);
}

.face {
	position: absolute;
	-webkit-backface-visibility: hidden;
	-moz-backface-visibility: hidden;
}

.face h3 {
	color: white;
	text-align: center;
}

.back {
	-webkit-transform: rotateY(180deg);
	-moz-transform: rotateY(180deg);
	background: -webkit-gradient(linear, left top, left bottom, from(#fdbb5a),
		to(#db5726));
	background: -moz-linear-gradient(top, #fdbb5a, #db5726);
	width: 180px;
	height: 200px;
}

.slider-outer {
	width: 100%;
	height: 100%;
	position: relative;
}

.img-item {
	position: absolute;
	width: 100%;
	height: 100%;
	transition: all 2s;
	/*设置子元素在3D空间中呈现*/
	transform-style: preserve-3d;
}

/*让图片可以构成一个有四个面的长方体 start*/
.img {
	width: 100%;
	height: 100%;
	position: absolute;
	background-size: cover;
}

.img:nth-child(1) {
	background: url(images/1.png) no-repeat;
	transform: rotateX(0deg) translateZ(150px);
	background-size: cover;
}

.img:nth-child(2) {
	background: url(images/2.png) no-repeat;
	transform: rotateX(-90deg) translateZ(150px);
}

.img:nth-child(3) {
	background: url(images/3.png) no-repeat;
	transform: rotateX(-180deg) translateZ(150px);
}

.img:nth-child(4) {
	background: url(images/4.png) no-repeat;
	transform: rotateX(-270deg) translateZ(150px);
}

/*让图片可以构成一个有四个面的长方体 end*/
.btns {
	position: absolute;
	top: 50%;
	width: 100%;
	height: 70px;
	margin-top: -35px;
}

.prev, .next {
	width: 70px;
	height: 70px;
	line-height: 70px;
	text-align: center;
	background-color: rgba(0, 0, 0, .3);
	color: #fff;
	font-size: 30px;
	cursor: pointer;
	position: absolute;
}

.prev {
	left: 0;
}

.next {
	right: 0;
}

#content ul {
	width: 100%;
}

#content ul li {
	margin-right: 29px;
	width: 200px;
	height: 180px;
	float: left;
}

#content ul li:last-child {
	margin-right: 0;
}

#content ul li a {
	position: relative;
	display: block;
	width: 100%;
	height: 100%;
	/*舞台（动画元素的父容器）perspective*/
	-webkit-perspective: 800px;
	-moz-perspective: 800px;
}

#content ul li a>div {
	position: absolute;
	left: 0;
	height: 0;
	width: 100%;
	height: 100%;
	color: #fff;
	/*动画元素transform-style*/
	-webkit-transform-style: preserve-3d;
	-moz-transform-style: preserve-3d;
	-webkit-transition: .8s ease-in-out;
	-moz-transition: .8s ease-in-out;
	/*动画元素背后设置为hidden*/
	-webkit-backface-visibility: hidden;
	-moz-backface-visibility: hidden;
}

#content ul li a div:first-child {
	/*
            绕y轴旋转
            */
	-webkit-transform: rotateY(0);
	-moz-transform: rotateY(0);
	z-index: 2;
}

#content ul li a div:last-child {
	background: url("images/bg.jpg") no-repeat 0 0;
	-webkit-transform: rotateY(180deg);
	-moz-transform: rotateY(180deg);
	z-index: 1;
}

#content ul li a:hover div:first-child {
	-webkit-transform: rotateY(-180deg);
	-moz-transform: rotateY(-180deg);
}

#content ul li a:hover div:last-child {
	-webkit-transform: rotateY(0);
	-moz-transform: rotateY(0);
}

#content ul li a div h3 {
	margin: 0 auto 15px;
	padding: 15px 0;
	width: 200px;
	height: 16px;
	line-height: 16px;
	font-size: 14px;
	text-align: center;
	border-bottom: 1px #fff dashed;
}

#content ul li a div p {
	padding: 0 10px;
	font-size: 12px;
	text-indent: 2em;
	line-height: 18px;
}
</style>
<script type="text/javascript">
	$(function() {
		var num = 0;
		$("#j_silder_outer .img-item").each(function(index, el) {
			$(this).css({
				"left" : $(this).width() * index + "px",
				/*让每个img-item延时一定时间执行动画*/
				"transitionDelay" : index * 0.3 + "s"
			});
			$(this).find(".img").css({
				"backgroundPosition" : -$(this).width() * index + "px"
			});
			;
		});

		$(".prev").on(
				"click",
				function() {
					$("#j_silder_outer .img-item").css("transform",
							"rotateX(" + (++num * 90) + "deg)");
				});

		$(".next").on(
				"click",
				function() {
					$("#j_silder_outer .img-item").css("transform",
							"rotateX(" + (--num * 90) + "deg)");
				});

		var timejg = 10000; //轮播间隔时间
		var time = setInterval(move, timejg);

		function move() {
			$("#j_silder_outer .img-item").css("transform",
					"rotateX(" + (--num * 90) + "deg)");
		}
		$('.slider-outer').hover(function() {
			clearInterval(time);
		}, function() {
			time = setInterval(move, timejg);
		});

	})
</script>
</head>

<body>
	<!--头部-->
	<div class="web_header">
		<div class="header_show">
			<div class="container-fluid">
				<div class="row header_a_center">
					<div class="col-sm-8">
						<div class="row">
							<div class="col-sm-6">
								<div class="row">
									<div class="col-sm-4">
										<img src="images/logo.png" class="header_img">
									</div>
									<div class="col-sm-8">
										<a>IT爱好者交流中心</a>
									</div>
								</div>

							</div>
							<div class="col-sm-6"></div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="row text-center">
							<div class="col-sm-2 header_a_center_div">
								<a>友情链接</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a>帮助文档</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a>在线客服</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a>资料库</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a>控制台</a>
							</div>
							<div class="col-sm-2 header_a_center_div " data-toggle="modal"
								data-target="#myModal">
								<a>登陆/注册</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	

	<!--头部下的图-->
	<div class="top_img"></div>
	<!--导航栏-->
	<div class="top_nav">
		<div class="container">
			<div class="row">
				<div class="col-sm-7">
					<div class="row text-center">
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/xy"><img src="images/nav_1.ico" class="top_ico"> &nbsp;学院</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/bk"><img src="images/nav_2.ico" class="top_ico"> &nbsp;博客</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/fx"><img src="images/nav_3.ico" class="top_ico"> &nbsp;分享</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/wd"><img src="images/nav_4.ico" class="top_ico"> &nbsp;问答</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/dt"><img src="images/nav_5.ico" class="top_ico"> &nbsp;动态</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/zx"><img src="images/nav_6.ico" class="top_ico"> &nbsp;资讯</a>
						</div>
					</div>
				</div>
				<div class="col-sm-1"></div>
				<div class="col-sm-4 text-right">
					<form class="form-inline">
						<input class="form-control" type="text" placeholder="Search">
						<button class="btn btn-primary" type="submit">Search</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div class="fgx"></div>
	<!--导航下-->
	<div class="container">
		<!-- 轮播图-->
		<div class="index_lbt">
			<div class="index_lbt_l">
				<div class="slider-outer" id="j_silder_outer">
					<div class="img-item">
						<div class="img"></div>
						<div class="img"></div>
						<div class="img"></div>
						<div class="img"></div>
					</div>
					<div class="btns" data-num="0">
						<div class="prev">&lt;</div>
						<div class="next">&gt;</div>
					</div>
				</div>
			</div>
			<div class="index_lbt_r"></div>
		</div>
		<div class="fgx"></div>
		<!--模块-->
		<div class="mk">
			<!--模块左-->
			<div class="mk_l">
				<!--模块：热门博文-->
				<div class="row">
					<div class="col-sm-12">
						<div class="mk_rmbw" style="padding: 20px;">
							<h4>热门博文</h4>
							<hr style="margin-top: 5px;">
							<div class="row">
								<div class="col-sm-1">
									<span class="label label-danger">1</span>
								</div>
								<div class="col-sm-9"
									style="margin-left: -40px; margin-top: 3px;">元素提供了用于缩写的标记，比如
									WWW 或 HTTP</div>
								<div class="col-sm-2 " style="margin-top: 3px;">
									<div>推荐人数:999</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-1">
									<span class="label label-danger">1</span>
								</div>
								<div class="col-sm-9"
									style="margin-left: -40px; margin-top: 3px;">元素提供了用于缩写的标记，比如
									WWW 或 HTTP</div>
								<div class="col-sm-2 " style="margin-top: 3px;">
									<div>推荐人数:999</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-1">
									<span class="label label-danger">1</span>
								</div>
								<div class="col-sm-9"
									style="margin-left: -40px; margin-top: 3px;">元素提供了用于缩写的标记，比如
									WWW 或 HTTP</div>
								<div class="col-sm-2 " style="margin-top: 3px;">
									<div>推荐人数:999</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-1">
									<span class="label label-danger">1</span>
								</div>
								<div class="col-sm-9"
									style="margin-left: -40px; margin-top: 3px;">元素提供了用于缩写的标记，比如
									WWW 或 HTTP</div>
								<div class="col-sm-2 " style="margin-top: 3px;">
									<div>推荐人数:999</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-1">
									<span class="label label-danger">1</span>
								</div>
								<div class="col-sm-9"
									style="margin-left: -40px; margin-top: 3px;">元素提供了用于缩写的标记，比如
									WWW 或 HTTP</div>
								<div class="col-sm-2 " style="margin-top: 3px;">
									<div>推荐人数:999</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="fgx"></div>
				<div class="row">
					<div class="col-sm-12">
						<div style="padding: 20px;">
							<div class="contentbox">
								<div class="qcontainer">
									<div class="film">
										<div class="face front">
											<img src="images/photo01.jpg"
												style="width: 180px; height: 200px;">
										</div>
										<div class="face back">
											<h3>这是老大!!</h3>
										</div>
									</div>
								</div>
								<div class="qcontainer">
									<div class="film">
										<div class="face front">
											<img src="images/photo02.jpg"
												style="width: 180px; height: 200px;">
										</div>
										<div class="face back">
											<h3>这是大姐头!!</h3>
										</div>
									</div>
								</div>
								<div class="qcontainer">
									<div class="film">
										<div class="face front">
											<img src="images/photo03.jpg"
												style="width: 180px; height: 200px;">
										</div>
										<div class="face back">
											<h3>这是小清!!</h3>
										</div>
									</div>
								</div>
								<div class="qcontainer">
									<div class="film">
										<div class="face front">
											<img src="images/photo04.jpg"
												style="width: 200px; height: 200px;">
										</div>
										<div class="face back">
											<h3>这是学霸!!</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="fgx"></div>
				<!--模块：作品-->
				<div class="row">
					<div class="col-sm-12">
						<div class="mk_zp" style="padding: 20px;">
							<h4>小组作品</h4>
							<hr style="margin-top: 5px;">
							<div class="row">
								<div class="col-sm-6">
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>

								</div>
								<div class="col-sm-6">
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>
									<div class="row">
										<div class="col-sm-1" style="margin-top: 2px;">
											<span class="glyphicon glyphicon-bookmark"></span>
										</div>
										<div class="col-sm-7 ">元素提供了用于缩写的标记</div>
										<div class="col-sm-3 hs">2018-10-1</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="fgx"></div>
				<!--模块：书籍-->
				<div class="row">
					<div class="col-sm-12">
						<div class="mk_js" style="padding: 20px;">
							<h4>热门书籍</h4>
							<hr style="margin-top: 5px;">
							<div class="row">
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java经典概要</div>
											</div>
										</div>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- 模块右-->
			<div class="mk_r">
				<!--模块：优秀小组-->
				<div class="mk_yxxz mk_r_ty"></div>
				<div class="fgx"></div>
				<!--模块：外站推荐-->
				<div class="mk_wztj mk_r_ty"></div>
				<div class="fgx"></div>
				<!--模块：娱乐网站-->
				<div class="mk_ylwz mk_r_ty"></div>
				<div class="fgx"></div>
				<!--模块：等级榜-->
				<div class="mk_djb mk_r_ty"></div>
			</div>
		</div>
		<div class="fgx"></div>
	</div>



</body>

</html>
