<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Document</title>
<link
	href="https://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css"
	rel="stylesheet">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
<script src="<%=request.getContextPath()%>/js/zc.js"
	type="text/javascript"></script>
<script src="https://static.geetest.com/static/tools/gt.js"></script>	
</head>

<body>
	
<jsp:include page="header.jsp"></jsp:include>
	<div class="zc_bj">
		<!--    注册栏-->
		<div class="container"
			style="background-color: #fff; padding-right: 0px; padding-left: 0px;margin-top: 100px;">
			<div class="row text-center" style="margin: 0px;">

				<a href="http://localhost:8080/itjl/login">
					<div class="col-sm-6" style="background-color: #f3f4f5; height: 80px; color: #666666;">
						<h2>登陆</h2>
					</div>
				</a>

				<div class="col-sm-6"
					style="background-color: #fff; height: 80px; color: darkcyan; border-top: solid 2px;">
					<h2>注册</h2>
				</div>



			</div>
			<hr style="margin: 0px;">

			<div class="row" style="margin-top: 30px;">
				<div class="col-sm-1"></div>
				<div class="col-sm-4">
					<form action="register" method="POST" role="form" id="form">
						<!--      账号-->
						<div class="form-group">
							<input type="text" class="form-control" placeholder="请输入昵称"
								name="user_name">
						</div>
						<!--       密码-->
						<div class="form-group">
							<input type="password" class=" form-control" placeholder="请输入密码"
								name="user_password">
						</div>
						<!--       重复密码-->
						<div class="form-group">
							<input type="password" class=" form-control "
								placeholder="请再次输入密码" name="user_password_yz">
						</div>

						<!--       验证码-->
						<div class="form-group">
						<div id="captcha"></div>
						</div>
						<!--        同意勾选-->
						<div class="form-group">
							<input type="checkbox" name="jz" required> <span id="user_ty_tb"></span>
							我已同意《用户使用协议》和《账号中心规范》 请输入“我已查看并且同意协议”
						</div>
						<!--        确定按钮-->
						<div class="form-group">
							<button class="btn btn-primary btn-block btn-test" type="submit"
								style="background-color: darkcyan; margin-bottom: 80px;">开始注册</button>
						</div>
					</form>
				</div>
				<div class="col-sm-1"></div>
				<div class="col-sm-6 text-center"
					style="border-left: solid 2px #f3f4f5; height: 300px;">
					<div class="row" style="margin-top: 30px;">
						<div class="col-sm-3"></div>
						<div class="form-group col-sm-6">
							<button type="submit" class="btn btn-info btn-block">QQ登陆</button>
						</div>
					</div>

					<div class="row">
						<div class="col-sm-3"></div>
						<div class="form-group col-sm-6">
							<button type="submit" class="btn btn-success btn-block">微信登陆</button>
						</div>
					</div>

					<div class="row">
						<div class="col-sm-3"></div>
						<div class="form-group col-sm-6">
							<button type="submit" class="btn btn-warning btn-block">新浪登陆</button>
						</div>
					</div>

					<div class="row">
						<div class="col-sm-3"></div>
						<div class="form-group col-sm-6">
							<button type="submit" class="btn btn-default btn-block">其他登陆</button>
						</div>
					</div>



				</div>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
                <script>
                    var handler = function (captchaObj) {
                         // 将验证码加到id为captcha的元素里
                         captchaObj.appendTo("#captcha");//弹出层
                         captchaObj.bindOn(".btn-test");//弹出模式指定的触发事件
                     };
                    $.ajax({
                        // 获取id，challenge，success（是否启用failback）
                        url: "getYz",//将调用这个接口进行初始化，这是我本地方法。后面会有介绍如何使用，若是http协议，直接改为http即可
                        type: "get",
                        dataType: "json", // 使用jsonp格式
                        success: function (data) {
                            if(data!=null){
                                // 使用initGeetest接口
                                // 参数1：配置参数，与创建Geetest实例时接受的参数一致
                                // 参数2：回调，回调的第一个参数验证码对象，之后可以使用它做appendTo之类的事件
                                initGeetest({
                                    gt: data.gt,
                                    challenge: data.challenge,
                                    product: "popup", // 产品形式 弹出
                                    https : true,
                                    offline: !data.success
                                }, handler);
                            }
                        }
                    });
                </script>
</body>
</html>