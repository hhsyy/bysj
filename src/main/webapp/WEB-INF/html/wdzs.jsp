<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           <%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Document</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/wd.css" />
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
				<li><a href="http://localhost:8080/itjl/wd">问答</a></li>
				<li class="active">${wd.wd_bt}</li>
			</ol>
		</div>
        <div class="zt row">
            <!--           主题左边-->
            <div class="zt_l col-sm-9">
                <div class="zt_l_zt row">
                    <div class="row">
                       <div class="col-sm-12"><h4>[${wd.wd_fl.wd_fl_name}]&nbsp;<b>${wd.wd_bt}</b></h4> </div>
                    </div>
                    <div class="row">
                       <div class="col-sm-12 hs">来自于<span>${wd.user.user_name}</span>的提问&nbsp;&nbsp;&nbsp; 标签:<span>${wd_bq}</span>
                       &nbsp;&nbsp;&nbsp; 时间:<span>${date}</span>
                       </div>
                       
                    </div>
                    <hr>
<!--                    内容-->
                    <div class="row"><div class="col-sm-12">${wd.wd_nr}</div></div>
                    <hr>
                    <div class="row hs">
                    <shiro:user><div class="col-sm-8"><c:if test="${wd.user.user_name}==<shiro:principal property='user_name' />"><button type="button" class="btn btn-default">已解决</button></c:if></div></shiro:user>
                    <div class="col-sm-4 text-right">&nbsp;<a href="" onclick="alert('文章收藏成功')" >收藏&nbsp;&nbsp;&nbsp;&nbsp;<a href="" data-toggle="modal" data-target="#cjxz">举报</a></div>
                    </div>                   
                </div>
            </div>
            <!--           主题右边-->
            <div class="zt_r col-sm-3">
                
                <!--                    我的信息-->
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
								<div class="form-group">举报对象:&nbsp;&nbsp;&nbsp;&nbsp;${wd.user.user_name}</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">举报文件:&nbsp;&nbsp;&nbsp;&nbsp;${wd.wd_bt}</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									举报理由: 
									<br><br>
									<select class="form-control">
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
									补充说明:
									<br><br>
									<textarea class="form-control" rows="5"></textarea>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">算了</button>
							<button type="submit" class="btn btn-info" onclick="alert('该举报已发送至github服务器！');">提交</button>
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