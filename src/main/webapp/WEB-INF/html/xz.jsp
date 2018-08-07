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
<link href="https://cdn.quilljs.com/1.3.5/quill.snow.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/xy.css" />
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/xy.js"></script>
    

<script src="https://cdn.quilljs.com/1.3.5/quill.js"></script>
</head>

<body>
    <div class="container">
        <div class="row">
<!--           小组信息-->
            <div class="col-sm-3">
<!--               信息头部-->
                <div class="row">
                    <div class="col-sm-12">
                        <img src="<%=request.getContextPath() %>/${xz.group_tp}" alt="" style="height: 150px;width: 100%">
                    </div>
                    <div class="col-sm-12">
                        <div style="width: 100%;height: 120px;background-color: #fff;padding: 10px 10px">
                            <div class="row">
                                <div class="text-left col-sm-8" style="font-size: 15px">${xz.group_name }</div>
                            <div class="text-right col-sm-4" ><span class="label label-warning">lv${xz.group_lv }</span></div>
                            </div>
                            <hr style="margin: 8px 0px;">
                            <div class="row hs text-center">
                                <div class="col-sm-4">成员</div>
                                <div class="col-sm-4">作品</div>
                                <div class="col-sm-4">关注</div>
                            </div>
                            <hr style="margin:9px 0px;">
                            <div class="row hs text-center">
                                <div class="col-sm-4">1</div>
                                <div class="col-sm-4">0</div>
                                <div class="col-sm-4">0</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="fgh"></div>
<!--               信息成员-->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="xxcy" style="width: 100%;height: auto;
                           background-color: #fff;padding: 10px;">
                            <h5>小组成员</h5>
                            <div class="row">
                                <div class="col-sm-4 text-center">
                                    <img src="<%=request.getContextPath() %>/images/3.png" alt="" style="width: 50px;height: 50px;border-radius: 50%;">
                                    <div>小易</div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
                <div class="fgh"></div>
                <!--                公告-->
               <div class="row">
                   <div class="col-sm-12">
                       <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    公告
                                </h3>
                            </div>
                            <div class="panel-body">
                                ${xz.group_gg }
                            </div>
                        </div>
                   </div>
               </div>
<!--                小组标签-->
               <div class="row">
                   <div class="col-sm-12">
                       <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    小组标签
                                </h3>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                <div class="col-sm-4" style="margin-bottom: 10px;">
                                    <span class="label label-default">暂无</span>
                                </div>
                              、
                            </div>
                            </div>
                        </div>
                   </div>
               </div>
               <!--               发布作品-->
            <div class="row">
                <div class="col-sm-12">
                    <button type="button" class="btn btn-default col-sm-12" data-toggle="modal"
									data-target="#myModal">发布作品</button>
                </div>
            </div>
            <div class="fgh"></div>
<!--               小组设置-->
            <div class="row">
                <div class="col-sm-12">
                    <button type="button" class="btn btn-default col-sm-12"  onclick="alert('github托管，不支持设置')">小组设置</button>
                </div>
            </div>
            <div class="fgh"></div>
<!--               我想加入-->
            <div class="row">
                <div class="col-sm-12">
                    <button type="button" class="btn btn-default col-sm-12" onclick="alert('停止招人')">我想加入</button>
                </div>
            </div>
             </div>
            <div class="col-sm-9">
                <div class="row">
                    <div class="col-sm-12">
                        <div style="width: 100%;height: 50px;background-color: #fff;padding-left: 20px;">
                            <div style="line-height: 50px;font-size: 18px;">小组作品浏览</div>
                        </div>
                    </div>
                   <div class="col-sm-12"> <div class="fgh"></div></div>
                    <div class="col-sm-12">
                         <div class="row">
                            <div class="col-sm-12">
<!--                               展示主体-->
                                <div class="xmzs" style="background-color: #fff;padding: 20px;">
<!--                                   展示标题-->
                                    <div class="row" style="margin-bottom: 5px;">
                                        <div class="col-sm-2"><span class="label label-info">信息标签</span></div>
                                        <div class="col-sm-10" style="margin-left: -7%;font-size: 18px;"><a href="">开源权限框架 Shiro 整合 web 项目的数据库设计</a></div>
                                    </div>
<!--                                    展示信息-->
                               <div class="row hs" style="margin-bottom: 5px;">
                                   <div class="col-sm-2"><span class="glyphicon glyphicon-user"></span>&nbsp;<span><a href="">小oo易</a></span></div>
                                   <div class="col-sm-2"><span class="glyphicon glyphicon-time"></span>&nbsp;<span><a href="">2018-02-02</a></span></div> 
                                   <div class="col-sm-2"><span class="glyphicon glyphicon-eye-open"></span>&nbsp;<span><a href="">6545</a></span></div>
                                   <div class="col-sm-2"><span class="glyphicon glyphicon-comment"></span>&nbsp;<span><a href="">26</a></span></div>
                               </div>
                               <!--                                    展示内容-->
                               <div class="row hs xmzs_nr">
                                  <div class="col-sm-12">
                                      <a href="">Apache Shiro 是功能强大并且容易集成的开源权限框架，它能够完成认证、授权、加密、会话管理等功能。认证和授权为权限控制的核心，简单来说，“认证”就是证明你是谁！ Shiro 相关的教程有很多，但是网上大多数认证和授权为权限控制的核心，简单来说，“认证”就是证明你是谁！ Shiro 相关的教程有很多，但是网上大多数</a>
                                  </div>
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
	<div class="modal fade" id="myModal" data-backdrop="static"=data-keyboard="false">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">提问</h4>
				</div>
				<div class="modal-body">
					<form role="form" action="sczp" method="post">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="zp_bt"
										placeholder="请输入作品名称">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<div id="editor2" class="editor" style=" min-height:300px;">
										作品描述
									</div>
								</div>
							</div>
						</div>
						<input type="hidden" class="form-control zp_ms" name="zp_ms">
						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="zp_tag"
										placeholder="请输入标签名称">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="form-group">
									<input type="text" class="form-control" name="zp_jf"
										placeholder="下载所需积分">
								</div>
							</div>
						</div>
                                
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">算了</button>
							<button type="submit" class="btn btn-primary" onclick="send_nr()">上传作品</button>
						</div>
					</form>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
    
    <script type="text/javascript">
    
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

	var quill = new Quill('#editor2', {
		modules : {
			toolbar : toolbarOptions
		},
		theme : 'snow'
	});
	
	function send_nr() {
		var zp_nr=quill.container.firstChild.innerHTML;
		$(".zp_ms").val(zp_nr);
	}
    </script>
</body>
</html>