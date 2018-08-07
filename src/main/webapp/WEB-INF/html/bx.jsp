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
<link media="all" rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/fileinput.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<script src="<%=request.getContextPath()%>/js/fileinput.min.js"
	type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/fileinput_locale_zh.js"
	type="text/javascript"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/bx.css" />
<script src="<%=request.getContextPath()%>/js/bk.js"></script>
<link href="https://cdn.quilljs.com/1.3.5/quill.snow.css"
	rel="stylesheet">
<script src="https://cdn.quilljs.com/1.3.5/quill.js"></script>

</head>

<body>
	<div class="container">
		<!--    路径-->
		<div class="lj row">
			<ol class="breadcrumb col-sm-12">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li class="active"><a href="http://localhost:8080/itjl/bx">编写</a></li>
			</ol>
		</div>
		<div class="fgh"></div>
		<!--        编写主体-->
		<div class="bxzt row">
			<div class="bxzt_l text-center col-sm-2">
				<h4 class="hs row">内容</h4>
				<hr>
				<!--               文章编写-->
				<div class="wzbx bxzt_l_fl row" data-toggle="tab" href="#wzbx">
					编写文章</div>
				<!--                资源上传-->
				<div class="zysc bxzt_l_fl row" data-toggle="tab" href="#zysc">资源上传</div>
				<!--                需求编写-->
				<div class="zysc bxzt_l_fl row" data-toggle="tab" href="#xqbx">需求编写</div>
				<!--                草稿箱-->
				<div class="cgx bxzt_l_fl row" data-toggle="tab" href="#cgx">草稿箱</div>
			</div>
			<div class="bxzt_r col-sm-10">
				<div class="tab-content">
					<div id="wzbx" class="tab-pane fade in active">
						<form action="bxxx" method="post">
							<div class="bxzt_r_top row">
								<div class="btn-group col-sm-2">
									<div class="form-group">
										<select class="form-control" name="lb_id">
											<option value="1">原创</option>
											<option value="2">转载</option>
											<option value="3">外文翻译</option>
										</select>
									</div>
								</div>
								<div class="col-sm-10">
									<div class="form-group">
										<input type="text" class="form-control" id="name"
											placeholder="请输入文章标题" name="bk_bt">
									</div>
								</div>

							</div>
							<!--                    输入框-->
							<div class="srk row">
								<div class="col-sm-12">
									<div id="editor1" class="editor"></div>
								</div>

							</div>

							<input type="hidden" class="form-control wz_nr" name="wz_nr"
								placeholder="最多输入三个标签并以-隔开">

							<!--                        文章参数-->
							<div class="row wzcs">
								<!--                      文章标签-->
								<div class="wzcs_bq col-sm-12">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">文章标签:</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" name="wz_bq"
												placeholder="最多输入三个标签并以-隔开">
										</div>
									</div>
								</div>
								<!--                       文章分类-->
								<div class="wzcs_fl col-sm-12">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">文章类别:</label>
										<div class="col-sm-9">
											<select class="form-control wz_sx" name="wz_sx"
												onchange="showZx()">
												<option value="1">博客</option>
												<option value="2">资讯</option>
											</select>
										</div>
									</div>
								</div>

								<div class="wzcs_fl col-sm-12  zx_lb" hidden="hidden">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">资讯类别:</label>
										<div class="col-sm-9">
											<select class="form-control" name="zx_lb_id">
												<option value="1">博文资讯</option>
												<option value="2">软件更新资讯</option>
											</select>
										</div>
									</div>
								</div>
								<!--                       能否转载-->
								<div class="wzcs_fl col-sm-12">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">能否转载:</label>
										<div class="col-sm-9 form-inline">
											<div class="row">
												<div class="radio col-sm-2">
													<label> <input type="radio" name="bk_zt" id="wz_zz"
														value="1" checked> 可以
													</label>
												</div>
												<div class="radio col-sm-2">
													<label> <input type="radio" name="bk_zt" id="wz_zz"
														value="0" checked>不可以
													</label>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="srk_an text-right col-sm-12">
									<div class="row">
										<div class="col-sm-1">
											<button type="submit" class="btn btn-primary"
												onclick="send_nr()">发表文章</button>
										</div>
										<div class="col-sm-1"></div>
										<div class="col-sm-1">
											<button type="button" class="btn btn-primary">暂存草稿</button>
										</div>
										<div class="col-sm-1"></div>
										<div class="col-sm-1">
											<button type="button" class="btn btn-primary">清空所有</button>
										</div>

									</div>
								</div>
							</div>
						</form>
					</div>

					<div id="zysc" class="tab-pane fade in bxzt_r_zysc">

						<h4>上传资源</h4>
						<hr>
						<div class="col-sm-12 ">
							<form class="form-horizontal " action="sczy" method="post" enctype="multipart/form-data">
								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label">资源名称</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="fx_bt"
											placeholder="资源名称">
									</div>
								</div>

								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label">资源类别</label>
									<div class="col-sm-5">
										<select class="form-control" name="fx_lb">
											<option value="1">压缩包</option>
											<option value="2">文档</option>
											<option value="3">源码</option>
											<option value="4">软件</option>
											<option value="5">其他</option>
										</select>
									</div>
								</div>

								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label">资源标签</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="fx_bq"
											placeholder="请输入资源标签，多个请以“,”隔开">
									</div>
								</div>

								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label">所需积分</label>
									<div class="col-sm-5">
										<input type="text" class="form-control " name="fx_jf"
											placeholder="请输入下载所需积分">
									</div>
								</div>

								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label">资源描述</label>
									<div class="col-sm-8">
										<textarea class="form-control fx_wb" rows="5" cols="30"
											style="resize: none; width: 600px" name="fx_wb"></textarea>
									</div>
								</div>
								<input type="hidden" class="form-control fx_ms" name="fx_ms">
								<div class="form-group form-horizontal">
									<label for="firstname" class="col-sm-2 control-label">上传资源</label>
									<div class="col-sm-8">
										<input id="input-1a" type="file" class="file"
											data-show-preview="false" data-show-upload="false" name="file">
									</div>
								</div>
								<div class="form-group">
									<label for="firstname" class="col-sm-2 control-label"></label>
									<div class="col-sm-2">
										<button type="submit" class="btn btn-primary"
											onclick="send_fx()">开始上传</button>
									</div>
								</div>
							</form>
						</div>
					</div>

					<div id="xqbx" class="tab-pane fade in">
						<form action="xqbx" method="post"></form>
							<div class="bxzt_r_top row">

								<div class="col-sm-12">
									<div class="form-group">
										<input type="text" class="form-control" id="name"
											placeholder="请输入需求标题" name="xq_bt">
									</div>
								</div>

							</div>
							<!--                    输入框-->
							<div class="srk row">
								<div class="col-sm-12">
									<div id="editor2" class="editor"></div>
								</div>

							</div>

							<input type="hidden" class="form-control xq_nr" name="xq_nr"
								placeholder="最多输入三个标签并以-隔开">

							<!--                        文章参数-->
							<div class="row wzcs">
								<!--                      文章标签-->
								<div class="wzcs_bq col-sm-12">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">需求标签:</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" name="xq_bq"
												placeholder="最多输入三个标签并以-隔开">
										</div>
									</div>
								</div>
								<!--                       文章分类-->
								<div class="wzcs_fl col-sm-12">
									<div class="form-group row">
										<label for="firstname" class="col-sm-2 control-label lable">需求悬赏:</label>
										<div class="col-sm-9">
											<input type="text" class="form-control" name="xq_jf"
												placeholder="请输入悬殊积分数额">
										</div>
									</div>
								</div>

								<div class="srk_an text-right col-sm-12">
									<div class="row">
										<div class="col-sm-1">
											<button type="submit" class="btn btn-success"
												onclick="send_xq()">需求发布</button>
										</div>
										<div class="col-sm-1"></div>
										<div class="col-sm-1">
											<button type="button" class="btn btn-success">清空所有</button>
										</div>

									</div>
								</div>
							</div>
						</form>
					</div>

					<div id="cgx" class="tab-pane fade in bxzt_r_cgx">

						<h4>草稿箱</h4>
						<hr>
						<div class=" cgx_a">
							<div class="col-sm-12">
								<h5>
									<b>小子别太猛</b>
								</h5>
							</div>
							<div class="hs col-sm-12">
								<div class="row">
									<span class="col-sm-1">原创</span> <span class="col-sm-2">2018-08-05</span>
									<span class="col-sm-4">标签</span> <span class="col-sm-5">
										<div class="row">
											<span class="col-sm-2">分类</span> <span class="col-sm-2">编辑</span>
											<span class="col-sm-2">删除</span>
										</div>
									</span>

								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<script>
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

		var quill1 = new Quill('#editor1', {
			modules : {
				toolbar : toolbarOptions
			},
			theme : 'snow'
		});

		function send_nr() {
			var wz_nr = quill1.container.firstChild.innerHTML;
			$(".wz_nr").val(wz_nr);
		}

		var quill2 = new Quill('#editor2', {
			modules : {
				toolbar : toolbarOptions
			},
			theme : 'snow'
		});

		function send_fx() {
			var fx_ms = $(".fx_wb").val();
			$(".fx_ms").val(fx_ms);
		}

		function send_xq() {
			var xq_nr = quill2.container.firstChild.innerHTML;
			$(".xq_nr").val(xq_nr);
		}

		function showZx() {
			if ($(".wz_sx").val() == 1) {
				$(".zx_lb").hide();
			} else if ($(".wz_sx").val() == 2) {
				$(".zx_lb").show();
			}

		}
	</script>
</body>

</html>