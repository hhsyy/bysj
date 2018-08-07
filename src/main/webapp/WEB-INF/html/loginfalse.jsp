<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="jumbotron" style="background-color: #fff">
		    <div class="container">
		        <c:if test="${memberType=='zcNo'}">
                     <h2 class="col-sm-12">注册失败</h2>
			        <p class="col-sm-12">欢迎注册IT爱好者交流中心，请遵守网站规则浏览网站</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/zc">
			       		  返回注册</a></div><div class="col-sm-2"><a class="btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/">
			       		  回到首页</a></div>
			        </p>
                </c:if>
                
                  <c:if test="${memberType=='loginNo'}">
                     <h2 class="col-sm-12">登录失败</h2>
			        <p class="col-sm-12">用户名或密码错误，请重新登录！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/login">
			       		  重新登陆</a></div><div class="col-sm-2"><a class="btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/">
			       		  回到首页</a></div>
			        </p>
                </c:if>
                 <c:if test="${memberType=='WdNo'}">
                     <h2 class="col-sm-12">发布失败</h2>
			        <p class="col-sm-12">系统出现问题，请重新发布</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/wd">
			       		 返回问答模块</a></div>
			        </p>
                </c:if>
                <c:if test="${memberType=='FxNo'}">
                     <h2 class="col-sm-12">发布失败</h2>
			        <p class="col-sm-12">文件上传失败！请返回重新上传。</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/bx">
			       		 返回重新上传</a></div><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/fx">
			       		 返回分享模块</a></div>
			        </p>
                </c:if>
                
                 <c:if test="${memberType=='BkNo'}">
                     <h2 class="col-sm-12">发布失败</h2>
			        <p class="col-sm-12">系统出现问题，请重新发布！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/bx">
			       		 返回编写模块</a></div>
			        </p>
                </c:if>
                
                 <c:if test="${memberType=='ZxNo'}">
                     <h2 class="col-sm-12">发布失败</h2>
			        <p class="col-sm-12">系统出现问题，请重新发布！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/bx">
			       		 返回编写模块</a></div>
			        </p>
                </c:if>
		    </div>
		</div>
	</div>

	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>