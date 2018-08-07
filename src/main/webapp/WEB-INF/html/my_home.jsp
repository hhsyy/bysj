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
<link media="all" rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/fileinput.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/fileinput.min.js"
	type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/fileinput_locale_zh.js"
	type="text/javascript"></script>

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/my_home.css" />

</head>

<body>
	<!--      导航栏下的图-->
	<div class="dhl_tp"></div>
	<!--      个人头像及导航-->
	<div class="container">
		<div class="dhl row">
			<div class="dhl_l col-sm-2">
				<div class="row">
					<a href="#" class="img-thumbnail "> <img
						src="<%=request.getContextPath()%>/<shiro:principal property="user_tx" />"
						alt="通用的占位符缩略图" class="tx">
					</a>
				</div>
			</div>
			<div class="dhl_m col-sm-8" style="margin-left: -60px;">
				<div class=" dhl_middel row"><b><shiro:principal property="user_name" />的空间</b></div>
				<div class=" dhl_bottom row">
					<div class="dhl_bottom_gs " data-toggle="tab" href="#home">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 主页 </span>
					</div>
					<div class="dhl_bottom_gs" data-toggle="tab" href="#zp">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 作品 </span>
					</div>

					<div class="dhl_bottom_gs" data-toggle="tab" href="#sc">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 收藏 </span>
					</div>
					<div class="dhl_bottom_gs" data-toggle="tab" href="#gz">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 关注 </span>
					</div>
					<div class="dhl_bottom_gs" data-toggle="tab" href="#xx">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 消息 </span>
					</div>
					<div class="dhl_bottom_gs" data-toggle="tab" href="#xz">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 小组 </span>
					</div>
					<div class="dhl_bottom_gs" data-toggle="tab" href="#sz">
						<img src="<%=request.getContextPath()%>/images/huise/house.ico"
							alt="" class="dhl_bottom_gs_tb"> <span
							class="dhl_bottom_gs_zt"> 设置 </span>
					</div>

				</div>
			</div>

			<div class="dhl_r col-sm-2">
				<div class="row">
					<div class="col-sm-6">
						<!--                   关注量-->
						<div class="gzl">
							关注：<span>15</span>
						</div>

					</div>
					<div class="col-sm-6">
						<!--                   粉丝-->

						<div class="fs">
							粉丝：<span>15</span>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="fgh"></div>
		<!--    信息主体-->
		<div class="xxzt row">
			<div class="tab-content">
				<div id="home" class="tab-pane fade in active">
					<div class="home_l">
						<!--                       最新发布-->
						<div class="home_zxfb">
							<p>最新发布</p>
							<div class="home_zxfb_nr">
								<img src="<%=request.getContextPath()%>/images/fx/2.png" alt=""
									class="home_zxfb_nr_tp">
								<div class="home_zxfb_nr_zt">
									<div class="text-center">java 面向对象</div>
									<div class="text-center">2018-1-5</div>
								</div>
							</div>

						</div>
						<div class="fgh"></div>
						<!--                       最新收藏-->
						<div class="home_zxsc">
							<div class="home_zxfb">
								<p>最新收藏</p>
								<div class="home_zxfb_nr">
									<img src="<%=request.getContextPath()%>/images/fx/2.png" alt=""
										class="home_zxfb_nr_tp">
									<div class="home_zxfb_nr_zt">
										<div class="text-center">java 面向对象</div>
										<div class="text-center">2018-1-5</div>
									</div>
								</div>

							</div>
						</div>
					</div>
					<div class="home_r">
						<!--                       我的信息-->
						<div class="wdxx">
							<h4>个性签名</h4>
							&nbsp;&nbsp;等级:&nbsp;&nbsp;lv<shiro:principal property="user_lv_id" /><br>
							&nbsp;&nbsp;积分:&nbsp;&nbsp;<shiro:principal property="user_jy" /><br>
						</div>
						<div class="fgh"></div>
						<!--                       我的公告-->
						<div class="wdgg">
							<h4>个性签名</h4>
							<shiro:principal property="user_gxqm" />
						</div>
					</div>
				</div>
				<div id="zp" class="tab-pane fade in">
					<div class="zp_l">
						<p>作品分类</p>
						<div class="text-center zp_l_fl">全部</div>
						<div class="text-center zp_l_fl">博客</div>
						<div class="text-center zp_l_fl">小组</div>
						<div class="text-center zp_l_fl">资讯</div>
						<div class="text-center zp_l_fl">分享</div>
					</div>

					<div class="zp_r">
						<div class="home_zxfb_nr">
							<img src="<%=request.getContextPath()%>/images/fx/2.png" alt=""
								class="home_zxfb_nr_tp">
							<div class="home_zxfb_nr_zt">
								<div class="text-center">java 面向对象</div>
								<div class="text-center">2018-1-5</div>
							</div>
						</div>

						<div class="zp_fy">
							<ul class="pager">
								<li class="previous disabled"><a href="#">&larr; Older</a></li>
								<li class="next"><a href="#">Newer &rarr;</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div id="sc" class="tab-pane fade in">
					<div class="sc_kj">
						<h4>收藏</h4>
						<ul class="nav nav-pills">
							<li class="active"><a href="#">博文</a></li>
							<li><a href="#">资讯</a></li>
							<li><a href="#">作品</a></li>
							<li><a href="#">分享</a></li>
							<li><a href="#">问答</a></li>
						</ul>
						<div class="sc_zs">
							<div class="home_zxfb_nr">
								<img src="<%=request.getContextPath()%>/images/fx/2.png" alt=""
									class="home_zxfb_nr_tp">
								<div class="home_zxfb_nr_zt">
									<div class="text-center">java 面向对象</div>
									<div class="text-center">2018-1-5</div>
								</div>
							</div>
						</div>
						<div class="zp_fy">
							<ul class="pager">
								<li class="previous disabled"><a href="#">&larr; Older</a></li>
								<li class="next"><a href="#">Newer &rarr;</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div id="gz" class="tab-pane fade in">
					<div class="zp_l">
						<p>关注单位</p>
						<div class="text-center zp_l_fl">全部</div>
						<div class="text-center zp_l_fl">博主</div>
						<div class="text-center zp_l_fl">小组</div>
						<div class="text-center zp_l_fl">机构</div>
					</div>

					<div class="zp_r">
						<div class="home_zxfb_nr ">
							<div class="gz_tp_kj text-center">
								<img src="<%=request.getContextPath()%>/images/fx/2.png" alt=""
									class="home_zxfb_nr_ytp">
							</div>
							<div class="home_zxfb_nr_zt">
								<div class="text-center">称号</div>
								<div class="text-center">小易</div>

								<div class="text-center">2018-1-5</div>
							</div>
						</div>

						<div class="zp_fy">
							<ul class="pager">
								<li class="previous disabled"><a href="#">&larr; Older</a></li>
								<li class="next"><a href="#">Newer &rarr;</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div id="xx" class="tab-pane fade in">
					<div class="xx_kj">
						<h4>消息</h4>
						<ul class="nav nav-pills ">
							<li class="active"><a href="#">全部</a></li>
							<li><a href="#">系统</a></li>
							<li><a href="#">来客</a></li>

							<li><a href="#">已发送</a></li>
							<li><a href="#">已读</a></li>
							<li><a href="#">未读</a></li>
						</ul>
						<div class="xx_zs">
							<form>
								<table class="table table-hover">
									<thead>
										<tr>
											<th>名称</th>
											<th>内容</th>
											<th>类别</th>
											<th>时间</th>
											<th>已读/未读</th>
											<th>查看</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Tanmay</td>
											<td>Bangalore</td>
											<td>560001</td>
											<td>Bangalore</td>
											<td>560001</td>
											<td>
												<button type="button" class="btn btn-success btn-xs">阅读</button>
											</td>
										</tr>
										<tr>
											<td>Sachin</td>
											<td>Mumbai</td>
											<td>400003</td>
											<td>Bangalore</td>
											<td>560001</td>
											<td>
												<button type="button" class="btn btn-success btn-xs">阅读</button>
											</td>
										</tr>
										<tr>
											<td>Uma</td>
											<td>Pune</td>
											<td>411027</td>
											<td>Bangalore</td>
											<td>560001</td>
											<td>
												<button type="button" class="btn btn-success btn-xs">阅读</button>
											</td>
										</tr>
									</tbody>
								</table>
							</form>
						</div>
					</div>
				</div>
				<div id="xz" class="tab-pane fade in">
					<div class="xz"></div>
				</div>
				<div id="sz" class="tab-pane fade in">
					<div class="sz">
						<div class="zp_l">
							<p>设置</p>
							<div class="text-center zp_l_fl" data-toggle="tab" href="#jbsz">基本设置</div>
							<div class="text-center zp_l_fl" data-toggle="tab" href="#yssz">隐私设置</div>
							<div class="text-center zp_l_fl" data-toggle="tab" href="#gjsz">高级设置</div>
							<div class="text-center zp_l_fl" data-toggle="tab" href="#zsbj">展示编辑</div>
						</div>

						<div class="zp_r">
							<div class="tab-content">
								<div id="jbsz" class="tab-pane fade in active">
									<h3>基本设置</h3>
									<hr>
									<form class="form-horizontal jbsz_gs"">
										<div class="form-group">
											<label for="firstname" class="col-sm-2 control-label">昵称</label>
											<div class="col-sm-4">
												<input type="text" class="form-control" id="user_name"
													placeholder="请输入名字">
											</div>
										</div>

										<div class="form-group">
											<label for="firstname" class="col-sm-2 control-label">性别</label>
											<div class="col-sm-4">
												<select class="form-control" id="userSex_id">
													<option value="1">男</option>
													<option value="2">女</option>
													<option value="3">未知</option>
												</select>

											</div>
										</div>
										<div class="form-group">
											<div class="col-sm-2"></div>
											<div class="col-sm-10">
												<button type="button" class="btn btn-primary btn-sm"
													onclick="updateUser();">提交</button>
											</div>
										</div>

									</form>
								</div>
								<div id="yssz" class="tab-pane fade">
									<h3>隐私设置</h3>
									<hr>
									<div class="row">
										<div class="col-sm-1"></div>
										<div class="col-sm-2">
											<h4>作品展示</h4>
										</div>

										<div class="col-sm-4">
											<div class="btn-group btn-group-sm">
												<button type="button" class="btn btn-primary">显示</button>
												<button type="button" class="btn btn-default">隐藏</button>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-1"></div>
										<div class="col-sm-2">
											<h4>收藏展示</h4>
										</div>

										<div class="col-sm-4">
											<div class="btn-group btn-group-sm">
												<button type="button" class="btn btn-primary">显示</button>
												<button type="button" class="btn btn-default">隐藏</button>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-1"></div>
										<div class="col-sm-2">
											<h4>关注展示</h4>
										</div>

										<div class="col-sm-4">
											<div class="btn-group btn-group-sm">
												<button type="button" class="btn btn-primary">显示</button>
												<button type="button" class="btn btn-default">隐藏</button>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-1"></div>
										<div class="col-sm-2">
											<h4>小组展示</h4>
										</div>

										<div class="col-sm-4">
											<div class="btn-group btn-group-sm">
												<button type="button" class="btn btn-primary">显示</button>
												<button type="button" class="btn btn-default">隐藏</button>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-sm-1"></div>
										<div class="col-sm-2">
											<h4>禁止浏览名单</h4>
										</div>

										<div class="col-sm-4">
											<textarea class="form-control" rows="5" cols="30"
												style="resize: none; width: 400px"></textarea>
										</div>
									</div>
								</div>
								<div id="gjsz" class="tab-pane fade">
									<h3>高级设置</h3>
									<div class="row">
										<form class="form-horizontal">
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label"><h4>密码更改</h4></label>
											</div>
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">原密码</label>
												<div class="col-sm-4">
													<input type="password" class="form-control"
														id="user_password" placeholder="请输入原密码"> <input
														type="hidden" class="form-control" id="start_password"
														value="<shiro:principal property="user_password" />">
												</div>
											</div>

											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">新密码</label>
												<div class="col-sm-4">
													<input type="password" class="form-control"
														id="user_password1" placeholder="请输入新密码">
												</div>
											</div>
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">新密码</label>
												<div class="col-sm-4">
													<input type="password" class="form-control"
														id="user_password2" placeholder="请再次输入新密码">
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-2"></div>
												<div class="col-sm-10">
													<button type="button" class="btn btn-primary btn-sm"
														onclick="updatePwd();">提交</button>
												</div>
											</div>
										</form>

									</div>
								</div>
								<div id="zsbj" class="tab-pane fade">
									<h3>展示编辑</h3>
									<div class="row">
										<hr>
										<form class="form-horizontal " action="sctx" method="post"
											enctype="multipart/form-data" id="scform">
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label"><h4>头像更改</h4></label>
											</div>
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">新头像</label>
												<div class="col-sm-8">
													<input id="file-0" class="file" type="file" multiple
														data-min-file-count="1" data-show-upload="false"
														name="file">
												</div>
												<div class="col-sm-2">
													<button type="sumit" class="btn btn-primary btn-xm">提交</button>
												</div>
											</div>
										</form>
										<hr>
										<form class="form-horizontal " role="form">
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label"><h4>封面更改</h4></label>
											</div>
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">新封面</label>
												<div class="col-sm-8">
													<form enctype="multipart/form-data">
														<input id="file-1" type="file" multiple class="file"
															data-overwrite-initial="false" data-min-file-count="2">
													</form>
												</div>
											</div>

										</form>
										<hr>
										<form class="form-horizontal " role="form">
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label"><h4>签名设置</h4></label>
											</div>
											<div class="form-group">
												<label for="firstname" class="col-sm-2 control-label">内容</label>
												<div class="col-sm-8">

													<div class="col-sm-4">
														<textarea class="form-control" rows="5" cols="30"
															style="resize: none; width: 400px"  id="gxqm"></textarea>
													</div>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-2"></div>
												<div class="col-sm-6 text-right">
													<button type="button" class="btn btn-primary btn-sm" onclick="qxqm()">提交</button>
												</div>
											</div>

										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var dhl_bottom_gs = document.getElementsByClassName("dhl_bottom_gs");
		$(dhl_bottom_gs[0]).addClass("dhl_bottom_gs_hover");

		for (var i = 0; i < dhl_bottom_gs.length; i++) {
			$(dhl_bottom_gs[i]).click(function() {
				$(".dhl_bottom_gs").removeClass("dhl_bottom_gs_hover");
				$(this).addClass("dhl_bottom_gs_hover");
			});
		}
		//修改签名
		function qxqm() {
			var gxqm = $("#gxqm").val();
			$.ajax({
				type : "post",
				dataType : "json",
				url : "http://localhost:8080/itjl/updateUserBy?user_gxqm="+gxqm,
				success : function(data) {
					if (data == 1) {
						alert("资料修改成功！")
					} else {
						alert("资料修改失败！")
					}
				}
			});
		}
		//修改用户名
		function updateUser() {
			var user_name = $("#user_name").val();
			var userSex_id = $("#userSex_id").val();
			$.ajax({
				type : "post",
				dataType : "json",
				url : "http://localhost:8080/itjl/updateName?user_name="
						+ user_name + "&userSex_id=" + userSex_id,
				success : function(data) {
					if (data == 1) {
						alert("资料修改成功！")
					} else {
						alert("资料修改失败！")
					}
				}
			});
		}
		//修改密码		
		function updatePwd() {
			var user_password = $("#user_password").val();
			var start_password = $("#start_password").val();
			var user_password1 = $("#user_password1").val();
			var user_password2 = $("#user_password2").val();

			if (user_password2 != user_password1) {
				alert("两次密码不一致！请重新修改");
			} else {
				if (user_password != start_password) {
					alert("原密码不正确！请重新修改");
				} else {

					$
							.ajax({
								type : "post",
								dataType : "json",
								url : "http://localhost:8080/itjl/updatePwd?user_password="
										+ user_password1,
								success : function(data) {
									if (data == 1) {
										alert("资料修改成功！")
									} else {
										alert("资料修改失败！")
									}

								}
							});
				}
			}
		}
		$(function(){  
		$("#scform").ajaxForm(function(data){    
			if (data == 1) {
				alert("资料修改成功！")
			} else {
				alert("资料修改失败！")
			} 
	    }); 
		}); 
	</script>
</body>

</html>
