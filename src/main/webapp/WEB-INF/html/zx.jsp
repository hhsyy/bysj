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

<script
	src="<%=request.getContextPath()%>/js/bootstrap-paginator.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/zx.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/zx.js"></script>
<link href="<%=request.getContextPath()%>/css/pgwslider.min.css"
	rel="stylesheet">
<script src="<%=request.getContextPath()%>/js/pgwslider.min.js"></script>


<script type="text/javascript">
	$(document).ready(function() {

		$(document).ready(function() {

			$('.pgwSlider').pgwSlider();

		});

	});
</script>
</head>


<body>
	<!--   导航栏下图片-->
	<div class="dhl_tp"></div>
	<div class="fgh"></div>
	<!--   主体-->
	<div class="container">
		<!--    路径-->
		<div class="lj">
			<ol class="breadcrumb row">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li class="active"><a href="http://localhost:8080/itjl/zx">资讯</a></li>
			</ol>
		</div>
		<!--        主体-->
		<div class="zt row">
			<!--        主体左-->
			<div class="zt_l col-sm-9">
				<!--               轮播图-->
				<div class="lbt row">
					<div class="col-sm-12">
						<ul class="pgwSlider">

							<li><a href="https://blog.csdn.net/tanksyg/article/details/80332972">
							<img
								src="<%=request.getContextPath()%>/images/zx/paris.jpg"
								alt="大数据"
								data-description="Hadoop生态系统"></a></li>

							<li><a href="https://blog.csdn.net/weixin_38655836/article/details/80333404"><img
								src="<%=request.getContextPath()%>/images/zx/new-york.jpg"
								alt="hadoop2.0中的jobtracker和tasktracker哪里去了"
								data-large-src="<%=request.getContextPath()%>/images/zx/new-york.jpg"></a></li>
							<li><a href="https://blog.csdn.net/servletcome/article/details/80331471"><img
								src="<%=request.getContextPath()%>/images/zx/shanghai.jpg">
								<span>zookeeper集群安装</span></a></li>

							<li><a href="https://blog.csdn.net/seaReal1/article/details/80332047" target="_blank"> <img
									src="<%=request.getContextPath()%>/images/zx/new-york.jpg"><span>Hadoop、Hbase基本命令及调优方式</span>
							</a></li>
						</ul>
					</div>
				
				</div>
				
				<input id="total" value="${pagelist.total }" hidden> <input
					id="cpage" value="${pagelist.cpage}" hidden> <input id="fl"
					value="${pagelist.flpage}" hidden>
				<div class="fgh row"></div>
				<!--                导航栏左-->
				<div class="dhl_l row">
					<div class="row text-center">
						<div class="col-sm-2 dhl_l_zt" onclick="qbclick() ">全部咨询</div>
						<div class="col-sm-2 dhl_l_zt" onclick="bwclick() ">博文资讯</div>
						<div class="col-sm-2 dhl_l_zt" onclick="rjgxclick() ">软件更新咨询</div>
						<div class="col-sm-6"></div>

					</div>
				</div>
				<hr>
				
				<!--                展示内容-->
				<c:forEach items="${zxList}" var="zx">
					
					<div class="zsnr row">
						<div class="zsnr_kj col-sm-12">
							<div class="row">
								<div class="nrzs_l col-sm-10">
									<div class="zsnr_s row">
										<span class="zsnr_bt col-sm-12"><a
											href="http://localhost:8080/itjl/zxDetail/${zx.zx_id }">${zx.zx_bt }</a></span>
									</div>
									<div class="zsnr_z hs row">
										<div class="col-sm-12">
											<a href="http://localhost:8080/itjl/zxDetail/${zx.zx_id }">${zx.zx_nr }</a>
										</div>
									</div>
									<div class="zsnr_x  row hs">
										<span class="sj col-sm-12">时间:${zx.zx_time }
											&nbsp;&nbsp;&nbsp;浏览量:${zx.zx_ll }
											&nbsp;&nbsp;&nbsp;来自:${zx.user.user_name }</span>
									</div>
								</div>
								<div class="nrzs_r col-sm-2 text-right">
									<a href=""><img src="${zx.user.user_tx }" class="nrzs_r_tx"></a>
								</div>
							</div>
						</div>
					</div>
					<hr style="margin: 5px 0px;">
				</c:forEach>
				<div id="example" style="text-align: center">
					<ul id="pageLimit"></ul>
				</div>
			</div>
			<!--        主体右-->
			<div class="zt_r col-sm-3">


				<!-- 搜索栏-->
				<div class=" row">
					<div class="col-sm-12 ssl" style="padding: 0px 5%;">
						<div class="input-group">
							<input type="text" class="form-control ssltext"
								placeholder="请输入关键字"> <span class="input-group-btn">
								<input type="submit" class="btn btn-default" value="搜索"
								onclick="sslclick()" />
							</span>
						</div>
					</div>
				</div>
				<div class="fgh row"></div>
				<!--              提供资讯-->
				<div class="fhan">
					<a href="http://localhost:8080/itjl/bx"><div
							class="fhan_kj text-center hs">提供资讯</div></a>
				</div>
				<div class="fgh row"></div>

				<!--                归档日期-->
				<div class="row">
					<div class="col-sm-12">
						<div class="panel panel-default gdri">
							<div class="panel-heading">
								<h3 class="panel-title">归档日期</h3>
							</div>
							<div class="panel-body hs">
								<div class="row" style="margin-bottom: 2%;">
									<a href="">
										<div class="col-sm-6">2018-02-01</div>
										<div class="col-sm-6 text-right">1篇</div>
									</a>
								</div>
								<div class="row" style="margin-bottom: 2%;">
									<a href="">
										<div class="col-sm-6">2018-02-01</div>
										<div class="col-sm-6 text-right">1篇</div>
									</a>
								</div>
								<div class="row" style="margin-bottom: 2%;">
									<a href="">
										<div class="col-sm-6">2018-02-01</div>
										<div class="col-sm-6 text-right">1篇</div>
									</a>
								</div>
								<div class="row" style="margin-bottom: 2%;">
									<a href="">
										<div class="col-sm-6">2018-02-01</div>
										<div class="col-sm-6 text-right">1篇</div>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	

	
	
	<script type="text/javascript">
		var flid = $("#fl").val();
		var total = $("#total").val();
		var cpage = $("#cpage").val();
		if (total % 10 == 0) {
			total = total / 10;
		} else {
			total = total / 10 + 1
		}
		var dhl_l_zt = document.getElementsByClassName("dhl_l_zt");
		
		$(dhl_l_zt[flid]).addClass("dhl_l_zt_hover");

		for (var i = 0; i < dhl_l_zt.length; i++) {
			$(dhl_l_zt[i]).click(function() {
				$(".dhl_l_zt").removeClass("dhl_l_zt_hover");
				$(this).addClass("dhl_l_zt_hover");
			});
		}
		$('#pageLimit').bootstrapPaginator(
				{
					currentPage : cpage,
					totalPages : total,
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
						location.href = "http://localhost:8080/itjl/zx?page="
								+ page + "&flid=" + flid;
					}
				});

		function qbclick() {
			location.href = "http://localhost:8080/itjl/zx?flid=0";
		}

		function sslclick() {
			location.href = "http://localhost:8080/itjl/zx?ssltext="
					+ $(".ssltext").val();
		}

		function bwclick() {
			location.href = "http://localhost:8080/itjl/zx?flid=1";
		}
		function rjgxclick() {
			location.href = "http://localhost:8080/itjl/zx?flid=2";
		}
	</script>
</body>
</html>