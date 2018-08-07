<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Document</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/dt.css" />

    <link rel="stylesheet" href="<%=request.getContextPath() %>/lib/css/jquery.mCustomScrollbar.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath() %>/lib/dist/css/jquery.emoji.css" />
</head>

<body>
    <!--   主体-->
    <div class="container">
        <!--    路径-->
        <div class="lj">
            <ol class="breadcrumb">
                <li><a href="http://localhost:8080/itjl/">主页</a></li>
                <li class="active"><a href="http://localhost:8080/itjl/dt">动态</a></li>
            </ol>
        </div>
        <div class="zt">
            <!--           主体左边-->
            <div class="zt_l">
                <!--               头像-->
                <div class="zt_l_a">
                    <div class="zt_l_a_s"> </div>
                    <div class="zt_l_a_x">
                        <div class="zt_l_a_x_mz text-center">
                            <span>${userItem.user_name }</span>
                        </div>
                        <div class="zt_l_a_x_lb text-center">
                            关注：<span>${userItem.gz_count}</span>&nbsp;&nbsp; 粉丝：
                            <span>${userItem.fs_count}</span>
                        </div>
                    </div>
                    <div class="zt_l_a_kj">
                        <img src="<%=request.getContextPath() %>/images/zx/new-york.jpg" class="zt_l_a_tx">
                    </div>

                </div>
                <div class="fgh"></div>
                <!--                我的信息-->
                <div class="zt_l_wdxx">
                    <div class=" zt_l_wdxx_fl" id="zt_l_wdxx_fl">
                        <div class="row">
                             <div class="col-sm-3"> </div>
                            <a href="http://localhost:8080/itjl/bk"><div class="col-sm-6">博客模块</div></a>
                             <div class="col-sm-3"></div>
                           
                        </div>
                    </div>
                    <div class="zt_l_wdxx_fl">
                        <div class="row">
                             <div class="col-sm-3"> </div>
                            <a href="http://localhost:8080/itjl/zx"><div class="col-sm-6">资讯模块</div></a>
                             <div class="col-sm-3"></div>                  
                        </div>
                    </div>
                    <div class=" zt_l_wdxx_fl">
                        <div class="row">
                            <div class="col-sm-3"> </div>
                            <a href="http://localhost:8080/itjl/fx"><div class="col-sm-6">分享模块</div></a>
                             <div class="col-sm-3"></div>
                            
                        </div>
                    </div>
                    <div class=" zt_l_wdxx_fl">
                        <div class="row">
                             <div class="col-sm-3"> </div>
                            <a href="http://localhost:8080/itjl/wd"><div class="col-sm-6">问答模块</div></a>
                             <div class="col-sm-3"></div>
                           
                        </div>
                    </div>
                    <div class=" zt_l_wdxx_fl">
                        <div class="row">
                            <div class="col-sm-3"> </div>
                           <a href="http://localhost:8080/itjl/xyzs"><div class="col-sm-6">学院模块</div></a>
                             <div class="col-sm-3"></div>
                            
                        </div>
                    </div>
                </div>

            </div>
            <div class="szfgh"></div>
            <!--           主体中间边-->
            <div class="zt_m">
                <!--               编辑器-->
                <div class="bjq">
                    <div class="bjq_srk">
                        <textarea class="bjq_srk_wbq" rows="4" id="content" contenteditable="true"></textarea>
                    </div>
                    <div class="bjq_an  row">
                        <div class="col-sm-1"> <img src="<%=request.getContextPath() %>/images/huise/games.ico" alt="" class="bjq_an_bq" id="bjq_an_bq"></div>
                        <div class="col-sm-1"></div>
                        <div class="col-sm-6"> </div>
                        <div class="col-sm-2 text-right hs"></div>
                        <div class="col-sm-2"> <button type="button" class="btn btn-info btn-xs bjq_an_fs text-right" onclick="insertDt()">发表动态</button></div>
                    </div>
                </div>
             
                <div class="fgh"></div>
                <!--                展示框-->
                <c:forEach items="${dtList }" var="dtList">
                <div class="zsk">
                    <div class="zsk_tx"><img src="<%=request.getContextPath()%>/${dtList.user.user_tx}" alt="" class="zsk_tx_gs"></div>
                    <div class="zsk_xx">
                        <div class="zsk_xx_id"><span class="zsk_xx_id_zt">${dtList.user.user_name}</span></div>
                        <div class="zsk_xx_sj hs">
                            ${dtList.dt_time}
                        </div>
                        <div class="zsk_xx_wb">
                        	${dtList.dt_nr}                     
                    </div>
                </div>
                <div class="fgh"></div>
                </div>
                 <div class="fgh"></div>
                </c:forEach>
            </div>
            <div class="szfgh"></div>
            <!--           主体右边边-->
            <div class="zt_r">
                <!--              返回主页-->
                <div class="fhan">
                    <a href="http://localhost:8080/itjl/my_home"><div class="fhan_kj text-center hs">返回我的主页</div></a>
                </div>
                <div class="fgh"></div>
                <!--                公告栏-->
                <div class="ggl">
                    <h5>公告栏</h5>
                    <div class="ggl_nr">平台发布后将托管于github，去除数据库</div>
                </div>
              
            </div>
        </div>
    </div>


    <script src="<%=request.getContextPath() %>/lib/script/jquery.mousewheel-3.0.6.min.js"></script>
    <script src="<%=request.getContextPath() %>/lib/script/jquery.mCustomScrollbar.min.js"></script>
    <script src="<%=request.getContextPath() %>/lib/dist/js/jquery.emoji.min.js"></script>
    <script>

	
    function insertDt() {

    	var content = $(".bjq_srk_wbq").val();
    	$.ajax({
			type : "post",
			dataType : "json",
			url : "http://localhost:8080/itjl/insertDt?content=" + content,
			success : function(data) {
				if(data==1){
					alert("动态发布成功！")
				}		
			}
		});
	}
    
        $("#content").emoji({
            button: "#bjq_an_bq",
            showTab: true,
            animation: 'fade',
            icons: [{
                name: "贴吧表情",
                path: "<%=request.getContextPath() %>/lib/dist/img/tieba/",
                maxNum: 50,
                file: ".jpg",
                placeholder: ":{alias}:",
                alias: {
                    1: "hehe",
                    2: "haha",
                    3: "tushe",
                    4: "a",
                    5: "ku",
                    6: "lu",
                    7: "kaixin",
                    8: "han",
                    9: "lei",
                    10: "heixian",
                    11: "bishi",
                    12: "bugaoxing",
                    13: "zhenbang",
                    14: "qian",
                    15: "yiwen",
                    16: "yinxian",
                    17: "tu",
                    18: "yi",
                    19: "weiqu",
                    20: "huaxin",
                    21: "hu",
                    22: "xiaonian",
                    23: "neng",
                    24: "taikaixin",
                    25: "huaji",
                    26: "mianqiang",
                    27: "kuanghan",
                    28: "guai",
                    29: "shuijiao",
                    30: "jinku",
                    31: "shengqi",
                    32: "jinya",
                    33: "pen",
                    34: "aixin",
                    35: "xinsui",
                    36: "meigui",
                    37: "liwu",
                    38: "caihong",
                    39: "xxyl",
                    40: "taiyang",
                    41: "qianbi",
                    42: "dnegpao",
                    43: "chabei",
                    44: "dangao",
                    45: "yinyue",
                    46: "haha2",
                    47: "shenli",
                    48: "damuzhi",
                    49: "ruo",
                    50: "OK"
                },
                title: {
                    1: "呵呵",
                    2: "哈哈",
                    3: "吐舌",
                    4: "啊",
                    5: "酷",
                    6: "怒",
                    7: "开心",
                    8: "汗",
                    9: "泪",
                    10: "黑线",
                    11: "鄙视",
                    12: "不高兴",
                    13: "真棒",
                    14: "钱",
                    15: "疑问",
                    16: "阴脸",
                    17: "吐",
                    18: "咦",
                    19: "委屈",
                    20: "花心",
                    21: "呼~",
                    22: "笑脸",
                    23: "冷",
                    24: "太开心",
                    25: "滑稽",
                    26: "勉强",
                    27: "狂汗",
                    28: "乖",
                    29: "睡觉",
                    30: "惊哭",
                    31: "生气",
                    32: "惊讶",
                    33: "喷",
                    34: "爱心",
                    35: "心碎",
                    36: "玫瑰",
                    37: "礼物",
                    38: "彩虹",
                    39: "星星月亮",
                    40: "太阳",
                    41: "钱币",
                    42: "灯泡",
                    43: "茶杯",
                    44: "蛋糕",
                    45: "音乐",
                    46: "haha",
                    47: "胜利",
                    48: "大拇指",
                    49: "弱",
                    50: "OK"
                }
            }, {
                name: "qq表情",
                path: "<%=request.getContextPath() %>/lib/dist/img/qq/",
                maxNum: 91,
                excludeNums: [41, 45, 54],
                file: ".gif",
                placeholder: "#qq_{alias}#"
            }]
        });
    </script>
</body>

</html>
