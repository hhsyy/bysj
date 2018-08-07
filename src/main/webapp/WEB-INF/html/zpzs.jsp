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
		<!--        主体-->
		<div class="row">
			<div class="col-sm-9">
					<!--                    项目展示详情-->
					<div id="xmzs_one">
						<div class="row">
							<div class="col-sm-12">
								<div class="xmzs_xq"
									style="background-color: #fff; width: 100%; height: auto;">

									<div class="panel panel-default">
										<div class="panel-heading">
											<div class="row" style="margin-bottom: 5px;">
												<div class=" col-sm-12 text-right">
														<button type="button" class="btn btn-default">返回列表</button>
													
												</div>
											</div>
											<div class="row" style="margin-bottom: 15px;">
												<div class="col-sm-12"
													style=" font-size: 18px;">
													<a href="">${zp.zp_bt}</a>
												</div>
											</div>
											<div class="row hs" style="margin-bottom: 5px;">
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;<span><a
														href="">${zp.groupg.group_name }</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-time"></span>&nbsp;&nbsp;<span><a
														href="">${zp.zp_sj}</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-eye-open"></span>&nbsp;&nbsp;<span><a
														href="">${zp.zp_ll}</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-comment"></span>&nbsp;&nbsp;<span><a
														href="">0</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-tag"></span>&nbsp;&nbsp;<span><a
														href="">${zp.zp_tag }</a></span>
												</div>
											</div>
										</div>
										<div class="panel-body">
											<!--                                           图片预览-->
											<div class="row">
												<div class="col-sm-12">
													<div
														style="height: 500px; width: 100%; background-color: cadetblue; border-radius: 10px; padding: 50px;">
														<div
															style="width: 100%; height: 50px; background-color: #fff; border-top-left-radius: 10px; border-top-right-radius: 10px;">
															<div class="text-center"
																style="line-height: 50px; font-size: 18px;">
																<b>简单预览</b>
															</div>
														</div>
														<img src="../${zp.zp_ylt}"
															alt=""
															style="height: 350px; width: 100%; border-bottom-left-radius: 10px; border-bottom-right-radius: 10px;">
													</div>

												</div>
											</div>
											<hr>
											<!--                                            按钮-->
											<div class="row text-center">
												<div class="col-sm-3">
													<button type="button" class="btn btn-success col-sm-12" onclick="alert('收藏成功');">收藏作品</button>
												</div>
												<div class="col-sm-3">
													<button type="button" class="btn btn-danger col-sm-12" onclick="alert('暂不开启');">下载作品</button>
												</div>
												<div class="col-sm-3">
													<button type="button" class="btn btn-warning col-sm-12" onclick="alert('暂不开启');">关注小组</button>
												</div>
												<div class="col-sm-3">
													<a href="http://localhost:8080/itjl/xz/${zp.zp_id}"><button type="button" class="btn btn-info col-sm-12">进入小组</button></a>
												</div>
											</div>
											<hr>
											<!--                                            描述-->
											<div class="row">
												<div class="col-sm-12">
													<blockquote>
														<p>描述:${zp.zp_ms}</p>
													</blockquote>
												</div>
											</div>
											<hr>
										</div>
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