<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<%@ include file="/WEB-INF/html/header.jsp"%>

	<!--头部下的图-->
	<div class="top_img"></div>
	<!--导航栏-->
	<div class="top_nav">
		<div class="container">
			<div class="row">
				<div class="col-sm-7">
					<div class="row text-center">
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/xyzs"><img
								src="images/nav_1.ico" class="top_ico"> &nbsp;学院</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/bk"><img
								src="images/nav_2.ico" class="top_ico"> &nbsp;博客</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/fx"><img
								src="images/nav_3.ico" class="top_ico"> &nbsp;分享</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/wd"><img
								src="images/nav_4.ico" class="top_ico"> &nbsp;问答</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/dt"><img
								src="images/nav_5.ico" class="top_ico"> &nbsp;动态</a>
						</div>
						<div class="col-sm-2 top_nav_div">
							<a href="http://localhost:8080/itjl/zx"><img
								src="images/nav_6.ico" class="top_ico"> &nbsp;资讯</a>
						</div>
					</div>
				</div>
				<div class="col-sm-1"></div>
				<div class="col-sm-4 text-right">
					<form class="form-inline"></form>
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
			<div class="index_lbt_r" style="padding: 20px;">
				<h4>头条</h4>
				<hr>
				<p><a href="http://tech.it168.com/a2018/0507/3201/000003201826.shtml">-专访蚂蚁金服冯柯：自研技术再难也要</a></p>
			<p><a href="http://tech.it168.com/a2018/0516/3203/000003203506.shtml">-专访丨七个尖锐的问题,听OceanBase</a></p>
			<p><a href="http://localhost:8080/itjl/zxDetail/34">-Android应用优化之流畅度优化实操</a></p>
			<p><a href="http://localhost:8080/itjl/zxDetail/25">-Java 动手写爬虫: 四、日志埋点输出 </a></p>
			<p><a href="http://tech.it168.com/a2018/0514/3202/000003202937.shtml">-深入浅出读自研数据库发展、实践与未</a></p>
			<p><a href="http://tech.it168.com/a2018/0507/3201/000003201963.shtml">-数据库厂商都怕低价竞争？阿里云说并</a></p>
			</div>
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
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-1">
										<span class="label label-danger">top</span>
									</div>
									<div class="col-sm-9"
										style="margin-left: -30px; margin-bottom: 3px;"><a href="http://localhost:8080/itjl/showBk/45">Jmeter搭建及入门</a></div>
									<div class="col-sm-2 " style="margin-top: 3px;">
										指数：1200
									</div>
								</div>
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-1">
										<span class="label label-danger">top</span>
									</div>
									<div class="col-sm-9"
										style="margin-left: -30px; margin-bottom: 3px;"><a href="http://localhost:8080/itjl/showBk/31">ASIC开发设计流程</a></div>
									<div class="col-sm-2 " style="margin-top: 3px;">
										指数：1060
									</div>
								</div>
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-1">
										<span class="label label-danger">top</span>
									</div>
									<div class="col-sm-9"
										style="margin-left: -30px; margin-bottom: 3px;"><a href="http://localhost:8080/itjl/showBk/33">python 软件目录结构规范</a></div>
									<div class="col-sm-2 " style="margin-top: 3px;">
										指数：1050
									</div>
								</div>
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-1">
										<span class="label label-danger">top</span>
									</div>
									<div class="col-sm-9"
										style="margin-left: -30px; margin-bottom: 3px;"><a href="http://localhost:8080/itjl/showBk/29">为什么老板宁愿高薪招新人，也不愿加薪留老员工？</a></div>
									<div class="col-sm-2 " style="margin-top: 3px;">
										指数：350
									</div>
								</div>
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-1">
										<span class="label label-danger">top</span>
									</div>
									<div class="col-sm-9"
										style="margin-left: -30px; margin-bottom: 3px;"><a href="http://localhost:8080/itjl/showBk/30">使用SonarCloud为.NET-NET-Core项目集成静态检查</a></div>
									<div class="col-sm-2 " style="margin-top: 3px;">
										指数：12
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
								<div class="qcontainer" style="margin-bottom: 20px;">
									<div class="film">
										<div class="face front">
											<img src="images/photo01.jpg"
												style="width: 180px; height: 200px;">
										</div>
										<div class="face back">
											<h3>CSDN</h3>
											<h4 class="text-center"><a href="https://www.csdn.net/" style="color: #fff;">点击跳转</a></h4>
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
											<h3>开源中国</h3>
											<h4 class="text-center"><a href="https://www.oschina.net/" style="color: #fff;">点击跳转</a></h4>
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
											<h3>Github</h3>
											<h4 class="text-center"><a href="https://github.com/" style="color: #fff;">点击跳转</a></h4>
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
											<h3>ItPub</h3>
											<h4 class="text-center"><a href="http://www.itpub.net/" style="color: #fff;">点击跳转</a></h4>
										</div>
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
							<h4>热门下载</h4>
							<hr style="margin-top: 5px;">
							<div class="row">
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/25">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/fx/1.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">爬虫数据采集</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/18">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/fx/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">区块链介绍</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/19">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/fx/3.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">面向对象设计原理与模式</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/20">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/fx/4.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">智能传感器</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/21">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/fx/5.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">软件设计与优化</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/14">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/sfq/2.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">ssh框架源码</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/13">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/sfq/3.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">mysql数据库优化方案</div>
											</div>
										</div>
									</a>
								</div>
								<div class="col-sm-3">
									<a href="http://localhost:8080/itjl/fx/detail/1">
										<div class="thumbnail" style="height: 140px; width: 100%">
											<img src="images/sfq/4.png" alt="通用的占位符缩略图"
												style="height: 100px; width: 100%">
											<div class="caption">
												<div class="text-center" style="font-size: 12px;">java面试宝典</div>
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
				<div class="mk_yxxz mk_r_ty" style="padding: 20px;">
					<h4>公告</h4>
					<hr>
					<p>1.编写文章需要注册登陆才能执行</p>
					<p>2.网站共有6个模块</p>
					<p>3.数据管理在github进行</p>
					<p>4.用户主页可修改用户信息</p>
					<p>5.部分功能不能运行</p>
				</div>
				<div class="fgx"></div>
				<!--模块：外站推荐-->
				<div class="mk_wztj mk_r_ty" style="padding: 20px;">
					<h4>24小时热点</h4>
					<hr>
					<p><a href="http://blog.itpub.net/22664653/viewspace-2153419">-【Redis】获取没有设置ttl的key脚本</a></p>
					<p><a href="http://blog.itpub.net/31408204/viewspace-2148383">-Oracle创建表空间、创建用户以及授权</a></p>
					<p><a href="http://localhost:8080/itjl/showBk/32">-数据可视化-Tableau-故事</a></p>
					<p><a href="http://localhost:8080/itjl/showBk/38">-Maven环境隔离</a></p>
					<p><a href="http://localhost:8080/itjl/showBk/42">-使用IDEA将git上传项目到github</a></p>
					<p><a href="http://blog.itpub.net/23718752/viewspace-2153468">-分布式关系型数据库RadonDB体验归</a></p>
				</div>
			</div>
		</div>
		<div class="fgx"></div>
	</div>
	
	
</body>

</html>
