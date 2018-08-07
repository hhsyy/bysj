<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Document</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/xy.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/xy.js"></script>
</head>

<body>
	<div class="container">	
		<div class="row">
			<div class="col-sm-9">			
					<div id="xqlb_one">
						<div class="col-cm-12">
							<div style="padding: 20px; background-color: #fff;">
								<div class="row" style="margin-bottom: 10px;">
									<div class="col-sm-12" style="font-size: 18px;">
										<a href="">[需求标题]&nbsp;${xq.xq_bq }</a>
									</div>
								</div>
								<div class="row hs">
									<div class="col-sm-12">
										<span class="glyphicon glyphicon-user"></span>&nbsp;<span><a
											href="">${xq.user.user_name }</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<span class="glyphicon glyphicon-time"></span>&nbsp;<span><a
											href="">${xq.xq_time}</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-eye-open"></span>&nbsp;<span><a
											href="">${xq.xq_ll }</a></span>	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-comment"></span>&nbsp;<span><a
											href="">0</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-tag"></span>&nbsp;&nbsp;<span><a
														href="">${xq.xq_bq }</a></span>
												
									</div>
									
													
									<hr>
								</div>
								<div class="row hs">
									<div class="col-sm-12">
										<a href="">${xq.xq_nr}</a>
									</div>
								</div>
								<hr>
								<div class="row">
									
									<div class="col-sm-8 hs">
										<span>悬赏:${xq.xq_jf}</span>&nbsp;&nbsp;&nbsp;
										<span>收藏:0</span>&nbsp;&nbsp;&nbsp;
										<span>有意:0</span>
									</div>
									<div class="col-sm-2">
										<button type="button" class="btn btn-default" onclick="alert('请联系qq1062849557用户');">对此有意</button>
									</div>
									<div class="col-sm-2">
										<button type="button" class="btn btn-default" onclick="alert('已收藏');">收藏该需求</button>
									</div>
								</div>
							</div>
						</div>
					</div>
			</div>
			<div class="col-sm-3">
			<!--                我的信息-->
				<div class="wdxx">
					<div class="row">
						<div class="col-sm-12">
							<div class="panel panel-default">
								<div class="panel-heading clearfix">
									<img src="<%=request.getContextPath()%>/images/4.png" alt=""
										class="thumbnail col-sm-4 "
										style="width: 80px; height: 80px; border-radius: 50%; margin-bottom: 0px;">
									<div class="col-sm-7" style="margin: 20px 0px 0px 10px;">
										<div class="row">
											<div style="font-size: 15px;">小易牛逼哈哈</div>
											等级：
											<div class="label label-warning">lv11</div>
										</div>
									</div>
								</div>
								<div class="panel-body hs">
									<span class="wdxx_fl"> <span
										class="glyphicon glyphicon-home">&nbsp;</span> <a href="http://localhost:8080/itjl/">首页</a>
										<span class="glyphicon glyphicon-chevron-right"
										style="margin-left: 120px;"></span>
									</span>
									<hr style="margin: 5px;">
									<span class="wdxx_fl"> <span
										class="glyphicon glyphicon-home">&nbsp;</span> <a href="http://localhost:8080/itjl/wd">问答</a>
										<span class="glyphicon glyphicon-chevron-right"
										style="margin-left: 120px;"></span>
									</span>
									<hr style="margin: 5px;">
									<span class="wdxx_fl"> <span
										class="glyphicon glyphicon-tasks">&nbsp;</span> <a href="http://localhost:8080/itjl/bk">博客</a>
										<span class="glyphicon glyphicon-chevron-right"
										style="margin-left: 120px;"></span>
									</span>
									<hr style="margin: 5px;">
									<span class="wdxx_fl"> <span
										class="glyphicon glyphicon-bold">&nbsp;</span> <a href="http://localhost:8080/itjl/fx">分享</a>
										<span class="glyphicon glyphicon-chevron-right"
										style="margin-left: 120px;"></span>
									</span>
									<hr style="margin: 5px;">
									<span class="wdxx_fl"> <span
										class="glyphicon glyphicon-calendar">&nbsp;</span><a href="http://localhost:8080/itjl/dt">动态</a>
										<span class="glyphicon glyphicon-chevron-right"
										style="margin-left: 120px;"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--                小组标签-->
				<div class="xzbq">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">小组标签</h3>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-sm-4">
									<span class="glyphicon glyphicon glyphicon-tags"></span><span
										style="margin: 0px 0px 0px 15px;">java</span>
								</div>
								
							</div>

						</div>
					</div>
				</div>
				<!--                项目标签-->
				<div class="xzbq">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">项目标签</h3>
						</div>
						<div class="panel-body ">
							<div class="row">
								<div class="col-sm-4" style="margin-bottom: 10px;">
									<span class="label label-default">java</span>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!--                热门推荐-->
				<div class="xzbq">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">热门推荐</h3>
						</div>
						<div class="panel-body ">
							<div>
								<a href="#" class="thumbnail"
									style="width: 100%; height: 120px;"> <img
									src="<%=request.getContextPath()%>/images/3.png"
									alt="通用的占位符缩略图" style="width: 100%; height: 100%;">
								</a>
							</div>
							<hr>
							<div class="row" style="margin-bottom: 10px;">
								<div class="col-sm-3">
									<span class="label label-default ">推荐</span>
								</div>
								<div class="col-sm-9 hs rmtj_zt">
									<a href="">暂无</a>
								</div>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

<script type="text/javascript">
	function getZpdetail() {
		var zp_id = $(".zp_id").val();
		alert(zp_id);
		$.ajax({
			type : "post",
			dataType : "json",
			url : "",
			success : function(data) {
				
			}
		});
	}
</script>
</body>
</html>