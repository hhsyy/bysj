<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	href="<%=request.getContextPath()%>/css/bk.css" />

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/lbt_bk.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/carousel.js"></script>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/bk.js"></script>

<script
	src="<%=request.getContextPath()%>/js/bootstrap-paginator.min.js"></script>
</head>


<body>
<!--   导航栏下图片-->
	<div class="dhl_tp"></div>
	<div class="fgh"></div>
	<div class="container">
		<!--    路径-->
		<div class="lj">
			<ol class="breadcrumb row">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li class="active"><a href="http://localhost:8080/itjl/bk">博客</a></li>
			</ol>
		</div>
		<!--        主体-->
		<div class="zt">
			<div class="zt_l">
				<div class="zt_l_top">
					<!--           轮播图-->
					<div class="lbt">
						<div class="carousel-content">
							<ul class="carousel">
								<li><img
									src="<%=request.getContextPath()%>/images/bk/images/a1.png"></li>
								<li><img
									src="<%=request.getContextPath()%>/images/bk/images/a2.png"></li>
								<li><img
									src="<%=request.getContextPath()%>/images/bk/images/a3.png"></li>
								<li><img
									src="<%=request.getContextPath()%>/images/bk/images/a4.png"></li>
								<li><img
									src="<%=request.getContextPath()%>/images/bk/images/a5.png"></li>
							</ul>
							<ul class="img-index"></ul>

						</div>
					</div>
					<!--                图组-->
					<div class="tz">
						<div class="tz_1"
							style=" background-image:url(<%=request.getContextPath()%>/images/bk/images/a6.png);">
							<div class="tz_wz text-center">
								<a href="http://localhost:8080/itjl/showBk/41">庖丁解---idea妞</a>
							</div>
						</div>
						<div class="tz_1"
							style=" background-image:url(<%=request.getContextPath()%>/images/bk/images/a7.png);">
							<div class="tz_wz text-center">
								<a href="http://localhost:8080/itjl/showBk/37">如何在linux环境下调试...</a>
							</div>
						</div>
						<div class="tz_2"
							style=" background-image:url(<%=request.getContextPath()%>/images/bk/images/a8.png);">
							<div class="tz_wz text-center">
								<a href="http://localhost:8080/itjl/showBk/32">数据可视化-Tableau-故事</a>
							</div>
						</div>
						<div class="tz_2"
							style=" background-image:url(<%=request.getContextPath()%>/images/bk/images/a9.png);">
							<div class="tz_wz text-center">
								<a href="http://localhost:8080/itjl/showBk/38">Maven环境隔离</a>
							</div>
						</div>
					</div>
				</div>
				<div class="fgh"></div>
				<!--                消息更新提示-->
				<input id="total" value="${qPage.total }" hidden> <input
					id="cpage" value="${qPage.cpage}" hidden>
				<div class="zt_l_body">
					<!--                   信息展示-->
					<c:forEach items="${ bkList}" var="bkList">
						<div class='zsk'>
							<div class='zsk_tj'>
								<div class='zsk_tj_xx text-center'>
									<h4 class='zsk_tj_xx_sj tj_count'>${ bkList.bk_tjl}</h4>
									<h5 class='zsk_tj_xx_sj'>推荐</h5>
								</div>
							</div>
							<a href='http://localhost:8080/itjl/showBk/${ bkList.bk_id}'><div
									class='zsk_bt h'>${ bkList.bk_bt}</div></a>
							<div class='zsk_nr'>
								<span class='zsk_nr_lb h'>类别:${ bkList.bk_bq}</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span
									class='zsk_nr_zz h'>作者:${ bkList.user.user_name}</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span
									class='zsk_nr_rq h'>日期:${ bkList.time}</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span
									class='zsk_nr_lll h'>浏览量:${ bkList.bk_ll}</span>&nbsp;&nbsp;
							</div>
						</div>
						<div class='fgx'></div>
					</c:forEach>
					<div id="example" style="text-align: center">
						<ul id="pageLimit"></ul>
					</div>
				</div>

			</div>
			<div class="zt_r">
				<!-- 搜索栏-->
				<div class="ssl">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="请输入关键字"
							id="ssltext"> <span class="input-group-btn"> <input
							type="submit" class="btn btn-default" value="查询"
							onclick="sslclick()" /></span>
					</div>
					<div class="fgh"></div>
					<!--            个人信息-->
					<div class="grxx">
						<!--               头像行-->
						<div class="grxx_tx row">
							<div class="col-sm-3">
								<img
									src="<%=request.getContextPath()%>/images/bk/images/left_btn1.png"
									alt="" class="grxx_tx_tp">
							</div>
							<div class="col-sm-6">
								<div class="grxx_tx_id">无</div>
								<div class="grxx_tx_ch">无</div>
							</div>
							<div class="col-sm-3">
								<button type="button" class="btn btn-warning btn-xs">
									lv&nbsp;<span class="grxx_lv">0</span>
								</button>
							</div>
						</div>
						<div class="fgx"></div>
						<!--                数据行-->
						<div class="sjh row">
							<div class="conteiner text-center">
								<div class="row">
									<div class="col-sm-3">文章</div>
									<div class="col-sm-3">粉丝</div>
									<div class="col-sm-3">关注</div>
									<div class="col-sm-3">收藏</div>
								</div>

								<div class="row ">
									<div class="col-sm-3 grxx_wz">无</div>
									<div class="col-sm-3 grxx_fs">无</div>
									<div class="col-sm-3 grxx_gz">无</div>
									<div class="col-sm-3 grxx_sc">无</div>
								</div>
							</div>
						</div>
						<div class="fgx"></div>
						<!--                       徽章 -->
						<div class="hz row">
							签名:&nbsp;&nbsp;&nbsp;&nbsp;<span class="grxx_gxqm">无</span>
						</div>
						<!--                       等级-->
						<div class="jf row ">
							经验:&nbsp;&nbsp;&nbsp;&nbsp;<span class="grxx_jy">无</span>
						</div>
					</div>
					<div class="fgh"></div>

					<!--                    发表文章-->
					<div class="fbwz">
						<div class="fbwz_an text-center">
							<button type="button" class="btn btn-info"
								onclick="window.location.href = 'http://localhost:8080/itjl/bx';">发表文章</button>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="http://localhost:8080/itjl/my_home"><button
									type="button" class="btn btn-info">我的主页</button></a>
						</div>
					</div>
					<div class="fgh"></div>
					<!--                    博客分类-->
					<div class="bkfl">
						<h4>分类</h4>
						<div class="bkfl_kj"></div>

					</div>
					<div class="fgh"></div>
					<!--                    热门博客-->
					<div class="rmbk">
						<h4>热门博客</h4>
						<div class="rmbk_kj">
							<c:forEach items="${bkTjl }" var="bkTjl" begin="0" end="8">
							<div class='rmbk_a'>
								<div class='rmbk_a_l'>
									<img src='<%=request.getContextPath()%>/${bkTjl.user.user_tx }' alt='' class='rmbk_a_l_tp'>
								</div>
								<div class='rmbk_a_r'>
									<div class='rmbk_a_r_bt'>
										<b><a href='http://localhost:8080/itjl/showBk/${ bkTjl.bk_id}' title=''>${bkTjl.bk_bt}</a></b>
									</div>
									<div class='rmbk_a_r_nr'>标签:${bkTjl.bk_bq}</div>
								</div>
							</div>
							</c:forEach>
						</div>
					</div>
					<div class="fgh"></div>
				</div>

			</div>
		</div>
	</div>


	<shiro:user>
		<input type="text" id="user_id"
			value="<shiro:principal property="user_id"/>" hidden />
	</shiro:user>
	<script type="text/javascript">
		var userid = $("#user_id").val();

		$(function() {
			$(".zt_l_body").append("");
			var a = document.getElementsByClassName("zsk_tj_xx");
			for (var i = 0; i < a.length; i++) {
				var tj_count = parseInt($(".tj_count").eq(i).text());

				if (tj_count <= 100) {
					$(".zsk_tj_xx").eq(i).addClass("blue");
				} else if (tj_count >= 100 && tj_count <= 1000) {
					$(".zsk_tj_xx").eq(i).addClass("yellow");
				} else {
					$(".zsk_tj_xx").eq(i).addClass("red");
				}
			}
			$.ajax({
				type : "post",
				dataType : "json",
				url : "http://localhost:8080/itjl/selectUserxx/" + userid,
				success : function(data) {
					$(".grxx_tx_id").text(data.user_name);
					$(".grxx_tx_ch").text(data.ch);
					$(".grxx_tx_tp").attr('src', "/itjl/" + data.user_tx);
					$(".grxx_fs").text(data.fs_count);
					$(".grxx_sc").text(data.sc_count);
					$(".grxx_wz").text(data.wz_count);
					$(".grxx_gz").text(data.gz_count);
					$(".grxx_gxqm").text(data.gxqm);
					$(".grxx_jy").text(data.jy);
					$(".grxx_lv").text(data.dj);
				}
			});

			$.ajax({
				type : "post",
				dataType : "json",
				url : "http://localhost:8080/itjl/selectfl",
				success : function(data) {
					for (var i = 0; i < data.length-1; i++) {
						$(".bkfl_kj").append(
								"<a href='http://localhost:8080/itjl/bk?str="
										+ data[i]
										+ "'><div class='bkfl_a text-center'>"
										+ data[i] + "</div></a>");
					}
				}
			});

			$(".carousel-content").carousel({
				carousel : ".carousel", //轮播图容器
				indexContainer : ".img-index", //下标容器
				timing : 5000, //自动播放间隔
				animateTime : 800, //动画时间
				auto : true, //是否自动播放
			});

		});

		var total = $("#total").val();
		var cpage = $("#cpage").val();

		if (total % 10 == 0) {
			total = total / 10;
		} else {
			total = total / 10 + 1
		}
		$('#pageLimit').bootstrapPaginator({
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
				location.href = "http://localhost:8080/itjl/bk?page=" + page;
			}
		});

		function sslclick() {
			location.href = "http://localhost:8080/itjl/bk?ssl="+$("#ssltext").val();
		}
	</script>
</body>
</html>