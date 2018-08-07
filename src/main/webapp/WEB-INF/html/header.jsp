<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Document</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/head_foot.css" />

</head>

<body>
	<!--导航栏-->
	<div class="web_header">
		<div class="header_show">
			<div class="container-fluid">
				<div class="row header_a_center">
					<div class="col-sm-8">
						<div class="row">
							<div class="col-sm-6">
								<div class="row">
									<div class="col-sm-2">
										<img src="<%=request.getContextPath()%>/images/logo.png"
											class="header_img"
											style="width: 60px; height: 40px; margin-top: 5px;">
									</div>
									<div class="col-sm-10">
										<img src="<%=request.getContextPath()%>/images/wzlogo.png"
											style="margin-left: -30px;width: auto; height: 35px;margin-top: 7px;">
									</div>
								</div>
							</div>
							<div class="col-sm-6"></div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="row text-center">
							<div class="col-sm-2 header_a_center_div">
								<a href="http://www.hhsyy22.top">进入博客</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<div class="dropdown">
									<a href="http://hao.shejidaren.com/">
										设计导航 
									</a>
								</div>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a href="http://tool.oschina.net/apidocs">在线文档</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a href="https://www.nowcoder.com/">牛客网</a>
							</div>
							<div class="col-sm-2 header_a_center_div">
								<a href="http://localhost:8080/itjl/">网站主页</a>
							</div>
							<div class="col-sm-2 header_a_center_div "">
								<shiro:user>
									<a id=" user_tx"> <img class="img-circle header_tx"
										src="<shiro:principal property="user_tx"/>"
										data-toggle="popover" alt="头像"
										style="width: 40px; height: 40px; margin-top: 7px;"
										data-container="body" data-toggle="popover" />
									</a>
								</shiro:user>
								<shiro:notAuthenticated>
									<a href="http://localhost:8080/itjl/login">登陆/注册</a>
								</shiro:notAuthenticated>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(function() {
			$("[data-toggle='popover']")
					.popover(
							{
								//title : '<div style="text-align:left; color:gray; font-size:12px;">用户名称</div>',
								placement : 'bottom',
								trigger : 'manual',//manual 触发方式
								html : 'true',
								content : '<div class="row"><a href="http://localhost:8080/itjl/my_home"  class="glyphicon glyphicon-user header_tc" style="padding:5px;">&nbsp个人中心</a></div><div style="height:10px;"></div><div class="row"><a href="http://localhost:8080/itjl/logout" class="glyphicon glyphicon-log-out header_tc" style="padding:5px;"">&nbsp退出平台</a></div>'
							}).on(
							"mouseenter",
							function() {
								var _this = this;
								$(this).popover("show");
								$(this).siblings(".popover").on("mouseleave",
										function() {
											$(_this).popover('hide');
										});
							}).on("mouseleave", function() {
						var _this = this;
						setTimeout(function() {
							if (!$(".popover:hover").length) {
								$(_this).popover("hide")
							}
						}, 100);
					});
		});
	</script>
</body>

</html>
