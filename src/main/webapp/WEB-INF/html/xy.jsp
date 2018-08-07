<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Document</title>
      <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/xy.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/carousel.css">

    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src='<%=request.getContextPath() %>/js/xylbt.js'></script>
    <script src='<%=request.getContextPath() %>/js/xy.js'></script>
    
    <style>
        #banner1 {
            width: 100%;
            height: 300px;
        }
        .box{ width:  100%; height: 250px;overflow: hidden;}
		.box div{ width: 10%;  float: left; transition: all 1s;}
		 img{  width: 540px; cursor: pointer;}
		.box:hover div{ width: 5%; }
		.box div:hover{ width: 55%; }
    </style>
</head>

<body>
    <div class="container">
        <div class="col-sm-2" style="margin-right: -20px;">
            <div class="l_zt" style="background-color: #43c9ab;">
                <!--               导航左边-->
                 <a href=""><div class="text-center" style="background-color: #43c9ab;height: 120px;line-height: 120px;font-size: 20px;color: #fff;"><b>学院</b></div></a>
                 <a href="" data-toggle="modal" data-target="#cjxz"><div class="text-center" style="background-color: #199d80;height: 60px;line-height: 60px;font-size: 15px;color: #fff;"><b>创建小组</b></div></a>
                <hr style="margin: 0px;">
                 <a href="http://localhost:8080/itjl/bx" data-toggle="modal" data-target="#xqbx"><div class="text-center" style="background-color: #199d80;height: 60px;line-height: 60px;font-size: 15px;color: #fff;"><a href="http://localhost:8080/itjl/bx"><b>发布需求</b></a></div></a>
                <hr style="margin: 0px;">
                <div class="text-center" style="background-color: #199d80;height: 60px;line-height: 60px;font-size: 15px;color: #fff;"><a href="http://localhost:8080/itjl/"><b>返回首页</b></a></div>

                <div class="fgh"></div>
                <!--                分类-->
                <div class="row  text-center" style="margin: 0px;background-color: #3a3536;color: #f4f4f4;padding: 10px;">
                    <div class="col-sm-6" style="margin-top: 30px;"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>主页</div>
                    </div>
                    <div class="col-sm-6" style="margin-top: 30px;border-left: 1px solid #f4f4f4;"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>博客</div>
                    </div>
                    <div class="col-sm-6" style="margin-top: 30px;"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>分享</div>
                    </div>
                    <div class="col-sm-6" style="margin-top: 30px;border-left: 1px solid #f4f4f4"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>动态</div>
                    </div>
                    <div class="col-sm-6" style="margin: 30px 0px;"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>资讯</div>
                    </div>
                    <div class="col-sm-6" style="margin: 30px 0px;border-left: 1px solid #f4f4f4"><span class="glyphicon glyphicon-home" style="font-size: 30px;"></span>
                        <div>问答</div>
                    </div>
                </div>
                <div class="fgh"></div>
                <div class="text-center" style="margin: 0px;background-color: #3a3536;color: #f4f4f4;padding: 10px;height: 500px">
                    11111111
                </div>
            </div>
            
        </div>
        <div class="col-sm-10">
            <!--           轮播图-->
            <div id='banner1'></div>
            <div class="fgh"></div>
            <div class="row">
                <div class="col-sm-9">
                    <div class="" style="background-color: #fff;height: 305px;padding: 20px;">
                        <div class="row" style="padding-left:15px;">
                            <div class="col-sm-1 xy_tz" style="padding-right:0px;height: 30px;"><a data-toggle="tab" href="#home">热点</a></div>
                            <div class="col-sm-1 xy_tz" style="padding-right:0px;height: 30px;"><a data-toggle="tab" href="#home">公告</a></div>
                            <div class="col-sm-1 xy_tz" style="padding-right:0px;height: 30px;"><a data-toggle="tab" href="#home">需求</a></div>
                            <div class="col-sm-1 xy_tz" style="padding-right:0px;height: 30px;"><a data-toggle="tab" href="#home">项目</a></div>
                            <div class="col-sm-1 xy_tz" style="padding-right:0px;height: 30px;"><a data-toggle="tab" href="#home">活动</a></div>
                            
                        </div>
                        <hr style="margin-top: 0px">
                         <div id="home" class="tab-pane fade in active">
                            <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                                 <div class="row" style="margin-bottom: 5px;">
                                <div class="col-sm-10">
                                    [活动]3月3日周六新服“沧海云帆-月华流照”开放！ 
                                </div>
                                <div class="col-sm-2 text-right">2018-07-12</div>
                                </div>
                          </div>
                    </div>
                </div>
                <div class="col-sm-3" style="margin-left: -20px;">
                    <div style="height: 150px;">
                        <img src="<%=request.getContextPath() %>/images/jpa.jpg" style="height: 150px;width: 225px;">
                    </div>
                    <div class="fgh"></div>
                    <div style="height: 145px;">
                        <img src="<%=request.getContextPath() %>/images/jpa.jpg" style="height: 145px;width: 225px;">
                    </div>
                </div>
            </div>
            <div class="fgh"></div>
            <div class="box">
                <div><img src="<%=request.getContextPath() %>/images/sfq/1.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/2.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/3.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/4.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/5.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/6.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/7.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/8.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/9.png" alt=""></div>
                <div><img src="<%=request.getContextPath() %>/images/sfq/10.png" alt=""></div>
            </div>
            <div class="fgh"></div>
            <div class="row" style="padding:0px 15px;">
                <div class="col-sm-6" style="background-color: dimgray;height: 120px;"></div>
                 <div class="col-sm-6" style="background-color: dimgray;height: 120px;"></div>
                  <div class="col-sm-6" style="background-color: dimgray;height: 120px;"></div>
                   <div class="col-sm-6" style="background-color: dimgray;height: 120px;"></div>
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
					<h4 class="modal-title" id="myModalLabel">创建小组</h4>
				</div>
				<div class="modal-body">
					<form role="form" action="cjxz" method="post">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="group_name"
										placeholder="请输入小组名称">
								</div>
							</div>
						</div>
						
							<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="group_bq"
										placeholder="请输入小组标签">
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="group_ms"
										placeholder="请描述您创建的小组">
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<label for="name" class="hs">注意:小组最大人数为15人</label>
								</div>
							</div>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">算了</button>
							<button type="submit" class="btn btn-success" >确定创建</button>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	
	

    <script>
   
		
        window.onload = function() {
        	var http_request ="<%=request.getContextPath() %>";
            var banner1 = new Carousel();
            //图片地址数组。不要少于三张
            var imgSrcDate = [""+http_request+"/images/a1.png", ""+http_request+"/images/a2.png", ""+http_request+"/images/a3.png", ""+http_request+"/images/a4.png", ""+http_request+"/images/a5.png", ""+http_request+"/images/a6.png"];
            banner1.init({
                container: "#banner1",
                datas: imgSrcDate,
                autoplaySpeed: 3000,
                autoplay: true
            });
        }
        
    </script>
</body>

</html>

