<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
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
		    	<c:if test="${memberType=='zcYes'}">
                     <h2 class="col-sm-12">注册成功</h2>
			        <p class="col-sm-12">欢迎注册IT爱好者交流中心，请遵守网站规则浏览网站</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/login">
			       		  前往登陆</a></div><div class="col-sm-2"><a class="btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/">
			       		  回到首页</a></div>
			        </p>
                </c:if>
                <c:if test="${memberType=='loginYes'}">
                     <h2 class="col-sm-12">登陆成功</h2>
			        <p class="col-sm-12"><shiro:principal property="user_name"/>，欢迎登陆IT爱好者交流中心，祝您使用愉快！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/my_home">
			       		 我的主页</a></div><div class="col-sm-2"><a class="btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/">
			       		  回到首页</a></div>
			        </p>
                </c:if>
                
                  <c:if test="${memberType=='WdYes'}">
                     <h2 class="col-sm-12">发布成功</h2>
			        <p class="col-sm-12">新的提问已发布请返回浏览</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/wd">
			       		 返回问答模块</a></div>
			        </p>
                </c:if>
                
                 <c:if test="${memberType=='FxYes'}">
                     <h2 class="col-sm-12">发布成功</h2>
			        <p class="col-sm-12">文件已上传成功！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/fx">
			       		 返回分享模块</a></div>
			        </p>
                </c:if>
                
                 <c:if test="${memberType=='BkYes'}">
                     <h2 class="col-sm-12">发布成功</h2>
			        <p class="col-sm-12">博文发布成功！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/bk">
			       		 返回博客模块</a></div>
			        </p>
                </c:if>
                
                 <c:if test="${memberType=='ZxYes'}">
                     <h2 class="col-sm-12">发布成功</h2>
			        <p class="col-sm-12">资讯发布成功！</p>
			        <p><div class="col-sm-2"><a class="btn btn btn-default btn-lg" role="button" href="http://localhost:8080/itjl/zx">
			       		 返回资讯模块</a></div>
			        </p>
                </c:if>
		    </div>
		</div>
	</div>
   
    <jsp:include page="foot.jsp"></jsp:include>
</body>
</html>