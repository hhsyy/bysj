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
	href="<%=request.getContextPath()%>/css/fx.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/fx.js"></script>
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
				<li><a href="http://localhost:8080/itjl">主页</a></li>
				<li><a href="http://localhost:8080/itjl/fx">分享</a></li>
				<li class="active"><a href="#">${fx.fx_bt}</a></li>
			</ol>
		</div>
		<div class="row">
			<!--      body左-->
			<div class="c_l col-sm-9" style="padding: 20px;">
				<!--               信息数据-->
				<div class="row">
					<a class="col-sm-1" href="#"> <img src="../../${fx.fx_tp}"
						alt="媒体对象" style="width: 80px; height: 80px;">
					</a>
					<div class="col-sm-1"></div>
					<div class="col-sm-10" style="margin: 10px 10px 10px 25px;">
						<h4>${fx.fx_bt}</h4>
						<div class="row hs">
							<div class="col-sm-12 nr_dx">大小:&nbsp;${fx_size}
								&nbsp;&nbsp;&nbsp;时间:&nbsp;${fx.fx_time}
								&nbsp;&nbsp;&nbsp;上传者:&nbsp;${fx.user.user_name}&nbsp;&nbsp;&nbsp;标签:&nbsp;${fx.fx_bq}
								c++</div>

						</div>
					</div>
				</div>
				<!--                信息注释-->
				<div class="row" style="padding: 0px 15px;">
					<div class="col-sm-12 hs"
						style="background-color: #f4f4f4; font-size: 16px; padding: 5px;">说明:${fx.fx_ms}</div>
				</div>
				<hr>
				<div class="row hs">
					<div class="col-sm-7 nr_dx">综合评分：0（0位用户评分）</div>
					<div class="col-sm-5 nr_bq text-right">
						收藏:&nbsp;0&nbsp;&nbsp;&nbsp;评论:&nbsp;0 &nbsp;&nbsp;&nbsp;<a
							href="" data-toggle="modal" data-target="#cjxz">举报</a>
					</div>
				</div>
				<hr>
				<!--           信息评价-->
				<div class="row hs">
					<div class="col-sm-7">下载量:&nbsp;${fx.fx_xzl}&nbsp;&nbsp;&nbsp;&nbsp;所需积分:&nbsp;${fx.fx_jf}</div>
					<div class="col-sm-5 text-right">
						<shiro:user>
											<button type="button" class="btn btn-warning btn-xs" onclick="alert('收藏成功');">点击收藏</button>
											</shiro:user>
											<shiro:guest> 
 									<button type="button" class="btn btn-warning btn-xs" onclick="alert('未登录')">点击收藏</button>
											</shiro:guest>
						<button type="button" class="btn btn-info btn-xs"
							onclick="alert('用户量较少，功能暂不开启')">我要评分</button>
						<button type="button" class="btn btn-success btn-xs">
							<shiro:user>
								<a
									href="http://localhost:8080/itjl/fx/download?savepath=${fx.fx_wj}&filename=${fx.fx_bt}">立刻下载</a>
							</shiro:user>
							<shiro:guest>
								<a href="http://localhost:8080/itjl/login">立刻下载</a>
							</shiro:guest>

						</button>
					</div>

				</div>
			</div>



			<!--      body右-->
			<div class="c_r col-sm-3">
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
										<img src="<%=request.getContextPath()%>/images/1.jpg" alt=""
											class="wdxx_tx" />

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
											积分:<span class="grxx_jf"><shiro:principal
														property="user_jy" /></span>
											</shiro:user>
											<shiro:guest> 
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
				<div class="fgx"></div>
				<!--            热门下载-->
				<div class="row">
					<div class="col-sm-12">
						<div class="rmxz" style="padding: 20px">
							<h4>热门下载</h4>
							<c:forEach items="${fxListdate}" var="fx" begin="0" end="4">
								<div class="media">
									<a class="media-left" href="#"> <img class="media-object"
										src="<%=request.getContextPath()%>/${fx.fx_tp}" alt="媒体对象">
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
										src="<%=request.getContextPath()%>/${hyb.user_tx}" alt="媒体对象">
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
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="cjxz" data-backdrop="static"
		data-keyboard="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">举报用户</h4>
				</div>
				<div class="modal-body">
					<form role="form">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">举报对象:&nbsp;&nbsp;&nbsp;&nbsp;${fx.user.user_name}</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">举报文件:&nbsp;&nbsp;&nbsp;&nbsp;${fx.fx_bt}</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									举报理由: <br>
									<br> <select class="form-control">
										<option>色情、暴力、反动内容</option>
										<option>内容抄袭等版权问题</option>
										<option>营销广告或垃圾内容</option>
										<option>辱骂或人身攻击</option>
										<option>其他问题</option>
									</select>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									补充说明: <br>
									<br>
									<textarea class="form-control" rows="5"></textarea>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">算了</button>
							<button type="button" class="btn btn-info" onclick="alert('该举报已发送至github服务器！');">提交</button>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>

</html>
