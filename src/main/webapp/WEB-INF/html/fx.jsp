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
	href="<%=request.getContextPath()%>/css/fx.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/fx.js"></script>
<script
	src="<%=request.getContextPath()%>/js/bootstrap-paginator.min.js"></script>
</head>

<body>
	<!--  导航栏下的图-->
	<div class="dhl_tp"></div>
	<div class="fgh"></div>
	<!--   body框-->
	<div class="container">
		<!--    路径-->
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li class="active"><a href="http://localhost:8080/itjl/fx">分享</a></li>
			</ol>
		</div>
		<div class="row">
			<!--      body左-->
			<div class="c_l col-sm-9">
				<div class="c_l_show">
					<!-- 导航栏         -->
					<div class="dhl row">
						<ul class="nav nav-tabs " role="tablist">
							<li class="active"><a data-toggle="tab" href="#rmtj">最新上传</a></li>
							<li><a data-toggle="tab" href="#ymgj">精品资源</a></li>
						</ul>
					</div>
					<input id="datepage_total" value="${datepage.total }" hidden>
					<input id="datepage_cpage" value="${datepage.cpage}" hidden>
					<!--                下载展示-->
					<div class="tab-content">
						<div id="rmtj" class="tab-pane fade in active">
							<c:forEach items="${fxListdate}" var="fx">
								<div class="ymxz row">
									<div class="ymxz_l col-sm-1">
										<img src="${fx.fx_tp}" class="ymxz_flt">
									</div>
									<div class="ymxz_m col-sm-8" style="margin-left: 20px;">
										<div class="row_1 row">
											<div class="col-sm-12">
												<a href="http://localhost:8080/itjl/fx/detail/${fx.fx_id}">${fx.fx_bt}</a>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-12">
												上传者:<span class="zz">${fx.user.user_name}</span>&nbsp;&nbsp;&nbsp;
												时间:<span class="sj">${fx.fx_time}</span>&nbsp;&nbsp;&nbsp;
												标签:<span class="sj">${fx.fx_bq}</span>
											</div>
										</div>

									</div>
									<div class="ymxz_r col-sm-2 text-right">
										积分:<a class="cb">${fx.fx_jf}</a>
									</div>
								</div>
							</c:forEach>
							<div id="example" style="text-align: center">
								<ul id="pageLimit1"></ul>
							</div>

						</div>

						<div id="ymgj" class="tab-pane fade in">
							<c:forEach items="${fxListxzl}" var="fx">
								<div class="ymxz row">
									<div class="ymxz_l col-sm-1">
										<img src="${fx.fx_tp}" class="ymxz_flt">
									</div>
									<div class="ymxz_m col-sm-8" style="margin-left: 20px;">
										<div class="row_1 row">
											<div class="col-sm-12">
												<a href="http://localhost:8080/itjl/fx/detail/${fx.fx_id}">${fx.fx_bt}</a>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-12">
												上传者:<span class="zz">${fx.user.user_name}</span>&nbsp;&nbsp;&nbsp;
												时间:<span class="sj">${fx.fx_time}</span>&nbsp;&nbsp;&nbsp;
												标签:<span class="sj">${fx.fx_bq}</span>
											</div>
										</div>
									</div>
									<div class="ymxz_r col-sm-2 text-right">
										积分：<a class="cb">${fx.fx_jf}</a>
									</div>
								</div>
							</c:forEach>
							<div id="example" style="text-align: center">
								<ul id="pageLimit2"></ul>
							</div>
						</div>
					</div>
				</div>
			</div>



			<!--      body右-->
			<div class="c_r col-sm-3">
				<!-- 搜索栏-->
				<div class="ssl row">
					<div class="col-sm-12">
						<div class="input-group">
							<input type="text" class="form-control ssltext"
								placeholder="请输入关键字"> <span class="input-group-btn">
								<input type="submit" class="btn btn-default" value="查询"
								onclick="sslclick()" />
							</span>
						</div>
					</div>
				</div>
				<div class="fgx"></div>
				<!-- 资料展示-->
				<div class="row">
					<div class="col-sm-12">
						<div class=" zlzs" style="padding-top: 10px;">
							<div class="row">
								<div class="col-sm-5 text-right">
									<shiro:user>
										<img
											src="<%=request.getContextPath()%>/<shiro:principal property="user_tx" />"
											alt="" class="wdxx_tx">
									</shiro:user>
									<shiro:guest> 
 									<img src="<%=request.getContextPath()%>/images/1.jpg" alt="" class="wdxx_tx"/>
			
									</shiro:guest>

								</div>
								<div class="col-sm-7">
									<div class="row">
										<div class="col-sm-12">
											<h4>
												昵称:<a href="" class="grxx_tx_id"> <shiro:user>
														<shiro:principal property="user_name" />
													</shiro:user> <shiro:guest> 
 									未登录
									</shiro:guest></a>
											</h4>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-12" class="grxx_lv">
											<shiro:user>
											 等级:<span class="label label-warning">lv<shiro:principal
														property="user_lv_id" /></span>
											</shiro:user>
											<shiro:guest> 
 									等级:<span class="label label-warning">lv0</span>
											</shiro:guest>

										</div>
									</div>
									<div class="row">
										<div class="col-sm-12" style="padding-top: 5px;">
											 <shiro:user>
											积分:<span class="grxx_jf"><shiro:principal property="user_jy" /></span>		
													</shiro:user> <shiro:guest> 
 									积分:<span class="grxx_jf">无</span>
									</shiro:guest>
											
										</div>
									</div>
								</div>

							</div>
							<hr>
							<div class="wdxx_an row" style="padding-bottom: 10px;">
								<div class="col-sm-12">
									<div class="row">
										<div class="col-sm-2"></div>
										<div class="col-sm-4">
											<a href="http://localhost:8080/itjl/my_home"><button
													type="button" class="btn btn-danger">我的空间</button></a>
										</div>
										<div class="col-sm-4">
											<a href="http://localhost:8080/itjl/bx"><button
													type="button" class="btn btn-danger">上传资源</button></a>
										</div>
										<div class="col-sm-2"></div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<div class="fgx"></div>
				<!--            热门下载-->
				<div class="row">
					<div class="col-sm-12">
						<div class="rmxz" style="padding: 20px">
							<h4>热门下载</h4>
							<c:forEach items="${fxListdate}" var="fx" begin="0" end="4">
								<div class="media">
									<a class="media-left" href="#"> <img class="media-object"
										src="${fx.fx_tp}" alt="媒体对象">
									</a>
									<div class="media-body"
										style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">
										<a href="http://localhost:8080/itjl/fx/detail/${fx.fx_id}"><h4
												class="media-heading">${fx.fx_bt}</h4></a> <span>${fx.user.user_name}</span>&nbsp;
										<span class="">时间：${fx.fx_time}</span>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
				<div class="fgx"></div>
				<!--            贡献榜-->
				<div class="row">
					<div class="col-sm-12">
						<div class="gxb" style="padding: 20px">
							<h4>贡献榜</h4>
							<c:forEach begin="0" end="4" items="${fxUserCount}" var="hyb">
								<div class="media">
									<a class="media-left" href="#"> <img class="media-object"
										src="${hyb.user_tx}" alt="媒体对象">
									</a>
									<div class="media-body">
										<h4 class="media-heading">${hyb.user_name}</h4>
										<span class="">文件上传数量:${hyb.count}</span>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<script type="text/javascript">
		var datepage_total = $("#datepage_total").val();
		var datepage_cpage = $("#datepage_cpage").val();

		if (datepage_total % 10 == 0) {
			datepage_total = datepage_total / 10;
		} else {
			datepage_total = datepage_total / 10 + 1
		}
		$('#pageLimit1').bootstrapPaginator({
			currentPage : datepage_cpage,
			totalPages : datepage_total,
			size : "normal",
			bootstrapMajorVersion : 3,
			alignment : "right",
			numberOfPages : 5,
			itemTexts : function(type, page, current) {
				switch (type) {
				case "first":
					return "首页";
				case "prev":
					return "上一页";
				case "next":
					return "下一页";
				case "last":
					return "末页";
				case "page":
					return page;
				}
			},
			//点击事件
			onPageClicked : function(event, originalEvent, type, page) {
				location.href = "http://localhost:8080/itjl/fx?page=" + page;
			}
		});

		$('#pageLimit2').bootstrapPaginator({
			currentPage : datepage_cpage,
			totalPages : datepage_total,
			size : "normal",
			bootstrapMajorVersion : 3,
			alignment : "right",
			numberOfPages : 5,
			itemTexts : function(type, page, current) {
				switch (type) {
				case "first":
					return "首页";
				case "prev":
					return "上一页";
				case "next":
					return "下一页";
				case "last":
					return "末页";
				case "page":
					return page;
				}
			},
			//点击事件
			onPageClicked : function(event, originalEvent, type, page) {
				location.href = "http://localhost:8080/itjl/fx?page=" + page;
			}
		});

		function sslclick() {
			location.href = "http://localhost:8080/itjl/fx?ssltext="
					+ $(".ssltext").val();
		}
	</script>
</body>

</html>
