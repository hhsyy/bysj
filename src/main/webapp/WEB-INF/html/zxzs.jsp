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
	href="<%=request.getContextPath()%>/css/bk.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/bk.js"></script>
<link href="https://cdn.quilljs.com/1.3.5/quill.snow.css"
	rel="stylesheet">
<script src="https://cdn.quilljs.com/1.3.5/quill.js"></script>
</head>
<body style="background-color: #f4f4f4">
	<div class="container">
		<!--    路径-->
		<div class="lj">
			<ol class="breadcrumb row">
				<li><a href="http://localhost:8080/itjl/">主页</a></li>
				<li><a href="http://localhost:8080/itjl/zx">资讯</a></li>
				<li><a href="#">${zx.zx_bt}</a></li>
			</ol>
		</div>
		<div class="fgh"></div>
		<!--        主体-->
		<div class="zt">
			<div class="zt_l">
				<div class="zt_l_body">
					<!--                    文章主体-->
					<div class="wzzt">
						<div hidden="hidden" id="user_id">${zx.user.user_id}</div>
						<div class="wzzt_top_bt">
							<div class="wzzt_top_bt row">
								<h3 class="col-sm-12">
									<b>${zx.zx_bt}</b>
								</h3>
							</div>
							<div class="wzzt_top_xx hs row">
								<div class="col-sm-8">${zx.lb.lb_name}&nbsp;&nbsp;&nbsp;<span>标签:&nbsp;${zx.zx_bq}</span>&nbsp;&nbsp;&nbsp;&nbsp;<span>时间:&nbsp;${zx.zx_time}&nbsp;&nbsp;&nbsp;&nbsp;来自&nbsp;${zx.user.user_name}</span></div>
								<div class="col-sm-4 text-right">&nbsp;<a href="" onclick="alert('外站数据，无法收藏');">收藏</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="" data-toggle="modal" data-target="#cjxz">举报</a></div>
							</div>
						</div>
						<hr>
						<div class="wzzt_nr">
							<div class="wzzt_nr_zt">${zx.zx_nr}</div>
							<div class="wzzt_foot text-left hs">
								版权声明：<span>本文为博主原创文章，未经博主允许不得转载。</span>
							</div>
						</div>
						<div class="wzzt_an ">
							<div class="wzzt_an_a text-center" hidden="hidden">全文阅读</div>
						</div>

					</div>
					<div class="fgh"></div>
					
				
				</div>
			</div>
			<div class="zt_r">
				<!--              返回-->
				<div class="fhan">
					<a href="http://localhost:8080/itjl/zx"><div
							class="fhan_kj text-center hs">返回继续浏览</div></a>
				</div>
				<div class="fgh"></div>
				<!--            个人信息-->
				<div class="grxx">
					<!--               头像行-->
					<div class="grxx_tx row">
						<div class="col-sm-3">
							<img
								src="<%=request.getContextPath()%>/images/bk/images/left_btn1.png"
								alt="" class="grxx_tx_tp" id="grxx_tx_tp">
						</div>
						<div class="col-sm-6">
							<div class="grxx_tx_id">小oo易</div>
							<div class="grxx_tx_ch">决定大师</div>
						</div>
						<div class="col-sm-3">
							<button type="button" class="btn btn-warning btn-xs">
								lv&nbsp;<span class="grxx_lv">20</span>
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
								<div class="col-sm-3 grxx_wz">1222</div>
								<div class="col-sm-3 grxx_fs">156</div>
								<div class="col-sm-3 grxx_gz">2315</div>
								<div class="col-sm-3 grxx_sc">8547</div>
							</div>
						</div>
					</div>
					<div class="fgx"></div>
					<!--                       徽章 -->
					<div class="hz row">
						说明&nbsp;&nbsp;&nbsp;&nbsp;<span class="grxx_gxqm">爵士小熊</span>
					</div>
					<!--                       等级-->
					<div class="jf row ">
						经验：<span class="grxx_jy">15</span>
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
								<div class="form-group">
									举报对象:${zx.user.user_name}
								</div>
							</div>
						</div>
						
							<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									举报文章:${zx.zx_bt}
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
								举报理由:<br>
									<br>  <select class="form-control">
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
									补充说明:<br>
									<br>
									<textarea class="form-control" rows="5"></textarea>
								</div>
							</div>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">算了</button>
							<button type="submit" class="btn btn-info"  onclick="alert('该举报已发送至github服务器！');">提交</button>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	
	<script type="text/javascript">
	var userid = $("#user_id").text();
		$.ajax({
			type : "post",
			dataType : "json",
			url : "http://localhost:8080/itjl/selectUserxx/"+userid,
			success : function(data) {
				$(".grxx_tx_id").text(data.user_name);
				$(".grxx_tx_ch").text(data.ch);
				$(".grxx_tx_tp").attr('src',"/itjl/"+data.user_tx);
				$(".grxx_fs").text(data.fs_count);
				$(".grxx_sc").text(data.sc_count);
				$(".grxx_wz").text(data.wz_count);
				$(".grxx_gz").text(data.gz_count);
				$(".grxx_gxqm").text(data.gxqm);
				$(".grxx_jy").text(data.jy);
				$(".grxx_lv").text(data.dj);
			}
		});
		

	</script>
</body>

</html>