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
	href="<%=request.getContextPath()%>/css/wd.css" />

<link href="https://cdn.quilljs.com/1.3.5/quill.snow.css"
	rel="stylesheet">
<script src="https://cdn.quilljs.com/1.3.5/quill.js"></script>
<script
	src="<%=request.getContextPath()%>/js/bootstrap-paginator.min.js"></script>
</head>


<body>
	<!--  导航栏下的图-->
	<div class="dhl_tp"></div>

	<!--   主体-->
	<div class="container">
		<!--    路径-->
		<div class="lj" style="margin-top: 5px;">
			<ol class="breadcrumb row">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li class="active"><a href="http://localhost:8080/itjl/wd">问答</a></li>
			</ol>
		</div>
		<input id="total" value="${qpage.total }" hidden> <input
			id="cpage" value="${qpage.cpage}" hidden> <input id="fl"
			value="${qpage.flpage}" hidden>
		<div class="zt row">
			<!--           主题左边-->
			<div class="zt_l col-sm-9">
				<!--               分类-->
				<div class="fl row">
					<div class="col-sm-2 fl_zt">
						<img
							src="<%=request.getContextPath()%>/images/huise/speechbubble.ico"
							class="fl_tb"><span class="" onclick="qbclick()">&nbsp;&nbsp;全部</span>
					</div>
					<div class="col-sm-2 fl_zt">
						<img
							src="<%=request.getContextPath()%>/images/huise/lightbulb.ico"
							class="fl_tb"><span class="" onclick="wjjclick()">&nbsp;&nbsp;未解决</span>
					</div>
					<div class="col-sm-2 fl_zt ">
						<img src="<%=request.getContextPath()%>/images/huise/magnet.ico"
							class="fl_tb"><span class="" onclick="yjjclick()">&nbsp;&nbsp;已解决</span>
					</div>

					<div class="col-sm-6"></div>
				</div>
				<div class="fgh row"></div>


				<!--                展示区-->
				<div class="zsq_kj_a">
					<c:forEach items="${wdList}" var="wd">
						<div class='zsq row'>
							<div class='zdq_l col-sm-10'>
								<div class='zdq_l_sj row'>
									<span class=' hs col-sm-2'>${wd.wd_date}</span><span
										class=' hs col-sm-3'>来自于&nbsp ${wd.user.user_name }</span> <span
										class=' hs col-sm-3'>题型: ${wd.wd_fl.wd_fl_name}</span><span
										class=' hs col-sm-3'>积分: ${wd.wd_jf}</span>
								</div>
								<div class='zdq_l_bt row'>
									<div class='col-sm-12'>
										<a href='http://localhost:8080/itjl/showWd/${wd.wd_id}'
											class='zdq_l_bt_zt'>${wd.wd_bt}</a>
									</div>
								</div>
								<div class='zdq_l_jj row'>
									<div class='col-sm-12'>${wd.wd_nr}</div>
								</div>
								<div class='zdq_l_bq row'>
									<div class='col-sm-2'>
										<span>标签:${wd.wd_bq}</span>
									</div>
									<div class='col-sm-2 hs'>
										<span>浏览量:${wd.wd_ll}</span>
									</div>
									<div class='col-sm-2 hs'>
										收藏:0<span>2</span>
									</div>
								</div>
							</div>
							<div class='zdq_r col-sm-2 text-right'>
								<div class='zdq_r_sl text-center'>
									<span class='zdq_r_sl_zt'>0</span>
								</div>
								<div class=' hs'>回答人数</div>
							</div>
						</div>
						<hr>
					</c:forEach>
				</div>
				<div class="fgx"></div>
				<div id="example" style="text-align: center">
					<ul id="pageLimit"></ul>
				</div>

			</div>
			<!--           主题右边-->
			<div class="zt_r col-sm-3">
				<!-- 搜索栏-->
				<div class="ssl row">
					<div class="col-sm-12">
						<div class="input-group">
							<input type="text" class="form-control " placeholder="请输入关键字"
								id="ssltext"> <span class="input-group-btn"> <input
								type="button" class="btn btn-default" onclick="sslclick()"
								value="搜索" />
							</span>
						</div>
					</div>
				</div>
				<div class="fgh"></div>
				<!--右边编辑区-->
				<div class=" row">
					<div></div>
					<!--            编辑导航-->
					<div class="bjdh col-sm-12">
						<div class="bjdh_kj">
							<div class="row">
							<shiro:user>
								<div class="col-sm-4 bjdh_kj_a" data-toggle="modal"
									data-target="#myModal">
									
									<div class="row">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h9.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row ">
											<div class="col-sm-12 text-center">提问</div>
										</div>
									</div>
								</div>
									</shiro:user>
									<shiro:guest> 
 										<div class="col-sm-4 bjdh_kj_a" onclick="location.href='http://localhost:8080/itjl/login'">
									
									<div class="row">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h9.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row ">
											<div class="col-sm-12 text-center">提问</div>
										</div>
									</div>
								</div>
			
									</shiro:guest>
								
								<div class="col-sm-4 bjdh_kj_a" onclick="alert('功能暂未开启')">
									<div class="row">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h1.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row">
											<div class="col-sm-12 text-center">回复</div>
										</div>
									</div>
								</div>
								<div class="col-sm-4 bjdh_kj_a" onclick="alert('功能暂未开启')">
									<div class="row ">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h5.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row">
											<div class="col-sm-12 text-center">已发</div>
										</div>
									</div>
								</div>
								<a href="http://localhost:8080/itjl/">
								<div class="col-sm-4 bjdh_kj_a">
									<div class="row">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h13.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row">
											<div class="col-sm-12 text-center">主页</div>
										</div>
									</div>
								</div>
								</a>
								<div class="col-sm-4 bjdh_kj_a" onclick="alert('功能暂未开启')">
									<div class="row">
										<div class="col-sm-12 text-center">
											<img
												src="<%=request.getContextPath()%>/images/bangong/h11.png"
												alt="通用的占位符缩略图" class="bjdh_tb">
										</div>
										<div class="row">
											<div class="col-sm-12 text-center" >签到</div>
										</div>
									</div>
								</div>
							</div>


						</div>
					</div>

				</div>
				<div class="fgh"></div>
				<!--                    我的信息-->
				<div class="row">
					<div class="col-sm-12">
						<div class="panel panel-default wdxx">
							<div class="panel-heading">
								<h3 class="panel-title">基本信息</h3>
							</div>
							<div class="panel-body">
								<div class="row wdxx_row">
									<div class="col-sm-3">昵称</div>
									<div class="col-sm-8">
										<shiro:user>
											<shiro:principal property="user_name" />
										</shiro:user>
										<shiro:guest> 
 									 未登录
									</shiro:guest>
									</div>
								</div>
								<div class="row wdxx_row">
									<div class="col-sm-3">等级</div>
									<div class="col-sm-8">

										<shiro:user>
											<span class="label label-warning" style="margin-top: 10px;">
												lv<shiro:principal property="user_lv_id" />
											</span>
											<input id="user_id"
												value="<shiro:principal property="user_id"/>" hidden>
										</shiro:user>

										<shiro:guest> 
 									 	无
									</shiro:guest>
										</span>
									</div>
								</div>
								<div class="row wdxx_row">
									<div class="col-sm-3">积分</div>
									<div class="col-sm-8">
										<shiro:user>
											<shiro:principal property="user_jy" />
										</shiro:user>
										<shiro:guest> 
 									 无
									</shiro:guest>
										
									</div>
								</div>
								<div class="row wdxx_row">
									<div class="col-sm-3">性别</div>
									<div class="col-sm-8">
											<shiro:user>
											男
										</shiro:user>
										<shiro:guest> 
 									无
									</shiro:guest>
									</div>
								</div>
								<div class="row wdxx_row">
									<div class="col-sm-3">成就</div>
									<div class="col-sm-8">
											<shiro:user>
											IT新手
										</shiro:user>
										<shiro:guest> 
 									无
									</shiro:guest>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!--                    活跃榜-->
				<div class="row">
					<div class="col-sm-12">
						<div class="panel panel-default hyb">
							<div class="panel-heading">
								<h3 class="panel-title">活跃榜</h3>
							</div>
							<div class="panel-body">

								<c:forEach items="${hyblist }" var="hyb">
									<div class="media">
										<a class="media-left" href="#"> <img
											class="media-object hyb_tx"
											src="<%=request.getContextPath()%>/${hyb.user_tx}" alt="媒体对象">
										</a>
										<div class="media-body">
											<h4 class="media-heading">${hyb.user_name}</h4>
											<span>回答：0</span>
										</div>
									</div>

								</c:forEach>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>


	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" data-backdrop="static"
		data-keyboard="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">提问</h4>
				</div>
				<div class="modal-body">
					<form role="form" action="sendWd" method="post">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="wd_bt"
										placeholder="请输入问题标题">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<div id="editor" class="editor"></div>
								</div>
							</div>
						</div>
						<input type="hidden" class="form-control wd_nr" name="wd_nr">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="wd_bq"
										placeholder="请输入标签名称">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-2">
								<div class="form-group">
									<div class="checkbox">
										<label> 积分数 </label>
									</div>
								</div>
							</div>
							<div class="col-sm-3">
								<div class="form-group">
									<select class="form-control" name="wd_jf">
										<option value="1">1分</option>
										<option value="2">2分</option>
										<option value="3">3分</option>
										<option value="5">5分</option>
										<option value="10">10分</option>
									</select>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">算了</button>
							<button type="submit" class="btn btn-primary" onclick="send_nr()">提交问题</button>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<script>
		var flid = $("#fl").val();

		var fl_zt = document.getElementsByClassName("fl_zt");
		$(fl_zt[flid]).addClass("fl_zt_hover");

		for (var i = 0; i < fl_zt.length; i++) {
			$(fl_zt[i]).click(function() {
				$(".fl_zt").removeClass("fl_zt_hover");
				$(this).addClass("fl_zt_hover");
			});
		}

		var total = $("#total").val();
		var cpage = $("#cpage").val();
		if (total % 10 == 0) {
			total = total / 10;
		} else {
			total = total / 10 + 1
		}

		function qbclick() {
			location.href = "http://localhost:8080/itjl/wd?flid=0";
		}

		function sslclick() {
			location.href = "http://localhost:8080/itjl/wd?ssltext="
					+ $("#ssltext").val();
		}

		function yjjclick() {
			location.href = "http://localhost:8080/itjl/wd?flid=2";
		}
		function wjjclick() {
			location.href = "http://localhost:8080/itjl/wd?flid=1";
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
						location.href = "http://localhost:8080/itjl/wd?page="
								+ page + "&flid=" + flid;
					}
				});

		var toolbarOptions = [ [ 'bold', 'italic', 'underline', 'strike' ], // toggled buttons
		[ 'blockquote', 'code-block' ], [ {
			'list' : 'ordered'
		}, {
			'list' : 'bullet'
		} ], [ {
			'size' : [ 'small', false, 'large', 'huge' ]
		} ], // custom dropdown
		[ {
			'header' : [ 1, 2, 3, 4, 5, 6, false ]
		} ],

		[ {
			'color' : []
		}, {
			'background' : []
		} ], // dropdown with defaults from theme
		[ {
			'font' : []
		} ], [ {
			'align' : []
		} ], [ 'link', 'image' ], [ 'clean' ] // remove formatting button
		];

		var quill = new Quill('#editor', {
			modules : {
				toolbar : toolbarOptions
			},
			theme : 'snow'
		});

		function send_nr() {
			var wd_nr = quill.container.firstChild.innerHTML;
			$(".wd_nr").val(wd_nr);
		}
	</script>
</body>
</html>