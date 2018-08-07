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
		<!--       导航-->
		<div class="row" style="height: 50px; padding: 0px 15px;">
			<div class="col-sm-4"
				style="height: 50px; line-height: 50px; background-color: #fff;">
				<div class="row">
					<div class="col-sm-4 text-center xydhl_zt" data-toggle="tab"
						href="#menu1">
						<b>小组列表</b>
					</div>
					<div class="col-sm-4 text-center xydhl_zt" data-toggle="tab"
						href="#menu2"">
						<b>项目展示</b>
					</div>
					<div class="col-sm-4 text-center xydhl_zt" data-toggle="tab"
						href="#menu3">
						<b>需求列表</b>
					</div>
				</div>
			</div>
			<div class="col-sm-7"
				style="height: 50px; line-height: 50px; background-color: #fff;"></div>
			<div class="col-sm-1">
				<div class="row"
					style="height: 50px; line-height: 50px; background-color: #fff;">
					
				</div>
			</div>
		</div>
		<div class="fgh"></div>
		<!--        主体-->
		<div class="row">
			<div class="col-sm-9">
				<div class="tab-content">
					<!--                   小组列表-->
					<div id="menu1" class="tab-pane fade in active">
						<div class="row">
							<c:forEach items="${xzlist}" var="list">
								<div class="col-sm-4 xzzs"
									style="height: 300px; width: 280px; margin-bottom: 15px; margin-right: 10px;"
									onclick="location.href='http://localhost:8080/itjl/xz/${list.group_id}'">
									<div class="thumbnail" style="width: 280px; height: 100%;">
										<img src="<%=request.getContextPath()%>/${list.group_tp}"
											alt="通用的占位符缩略图" style="width: 280px; height: 150px;"
											class="xzzs_tp">
										<div class=' text-center hs xzzs_jr'
											style='position: absolute; top: 70px; left: 145px'
											hidden="hidden">
											<span class="glyphicon glyphicon-log-out"></span>
										</div>
										<div class="caption">
											<h4>${list.group_name}</h4>
											<div class="hs" style="height: 60px; margin-bottom: 10px;">说明:${list.group_ms}</div>
											<div class="hs row">
												<span class="glyphicon glyphicon glyphicon-tags col-sm-1"></span><span
													class="col-sm-10" style="margin-top: -3px;">${list.group_bq}</span>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
					<!--                    项目展示-->
					<div id="menu2" class="tab-pane fade">
						<c:forEach items="${zplist }" var="zplist">
							<div class="row xmzs_zt">
								<div class="col-sm-12">
									<!--                               展示主体-->
									<div class="xmzs">
										<!--                                   展示标题-->
										<div class="row" style="margin-bottom: 5px;">
											<div class="col-sm-2">
												<span class="label label-info">${zplist.zp_tag }</span>
											</div>
											<div class="col-sm-10"
												style="margin-left: -7%; font-size: 18px;">
												<a href="http://localhost:8080/itjl/zpzs/${zplist.zp_id}">${zplist.zp_bt}</a>
											</div>
										</div>
										<!--                                    展示信息-->
										<div class="row hs" style="margin-bottom: 5px;">
											<div class="col-sm-2">
												<span class="glyphicon glyphicon-user"></span>&nbsp;<span><a
													href="">${zplist.groupg.group_name }</a></span>
											</div>
											<div class="col-sm-2">
												<span class="glyphicon glyphicon-time"></span>&nbsp;<span><a
													href="">${zplist.zp_sj }</a></span>
											</div>
											<div class="col-sm-2">
												<span class="glyphicon glyphicon-eye-open"></span>&nbsp;<span><a
													href="">${zplist.zp_ll }</a></span>
											</div>
											<div class="col-sm-2">
												<span class="glyphicon glyphicon-comment"></span>&nbsp;<span><a
													href="">0</a></span>
											</div>
										</div>
										<!--                                    展示内容-->
										<div class="row hs xmzs_nr">
											<div class="col-sm-12">
												<a href="">Apache Shiro ${zplist.zp_ms}</a>
											</div>
										</div>
									</div>
								</div>

							</div>

							<div class="fgh"></div>
						</c:forEach>
					</div>
					<!--                    需求列表-->
					<div id="menu3" class="tab-pane fade in">
					<c:forEach items="${xqlist }" var="xqlist">
						<div class="row">
							<div class="col-sm-12">
								<div class="xqlb" style="height: 100px; background-color: #fff;">
									<div class="row">
										<div class="col-sm-3">
											<img src="<%=request.getContextPath()%>/images/3.png"
												alt="通用的占位符缩略图" style="height: 100px; width: 100%;">
										</div>
										<div class="col-sm-9">
											<div class="row" style="margin-bottom: 5px; margin-top: 5px;">
												<div class="col-sm-12" style="font-size: 18px;">
													<a href="http://localhost:8080/itjl/xqzs/${xqlist.xq_id}">${xqlist.xq_bt }</a>
												</div>
											</div>
											<div class="row hs">
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-user"></span>&nbsp;<span><a
														href="">${xqlist.user.user_name}</a></span>
												</div>
												<div class="col-sm-3">
													<span class="glyphicon glyphicon-time"></span>&nbsp;<span><a
														href="">${xqlist.xq_time }</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-eye-open"></span>&nbsp;<span><a
														href="">${xqlist.xq_ll }</a></span>
												</div>
												<div class="col-sm-2">
													<span class="glyphicon glyphicon-comment"></span>&nbsp;<span><a
														href="">0</a></span>
												</div>
											</div>

											<div class="row hs">
												<div class="col-sm-12 xqlb_nr">
													<a href="">${xqlist.xq_nr }</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="fgh"></div>
						</c:forEach>
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
											<div style="font-size: 15px;">未登录</div>
											等级：
											<div class="label label-warning">lv0</div>
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
var xzzs = document.getElementsByClassName("xzzs");
var xydhl_zt = document.getElementsByClassName("xydhl_zt");
$(xydhl_zt[0]).addClass(" xydhl_zt_hover");
for(var i=0;i<xydhl_zt.length;i++){
    $(xydhl_zt[i]).click(function() {
        $(".xydhl_zt").removeClass(" xydhl_zt_hover");
        $(this).addClass(" xydhl_zt_hover");
    });
}
</script>
</body>
</html>