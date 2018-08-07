$(function () {

    //导航栏颜色
    var zt_l_wdxx_fl = document.getElementsByClassName("zt_l_wdxx_fl");
    var dhl_fl_a = document.getElementsByClassName("dhl_fl_a");
    $(zt_l_wdxx_fl[0]).addClass("zt_l_wdxx_fl_hover");
    for (var i = 0; i < dhl_fl_a.length; i++) {
        $(zt_l_wdxx_fl[i]).click(function () {
            $(".zt_l_wdxx_fl").removeClass("zt_l_wdxx_fl_hover");
            $(".dhl_fl_a").removeClass("dhl_fl_a_hover");
            $(this).addClass("zt_l_wdxx_fl_hover");
        });

        $(dhl_fl_a[i]).click(function () {

            $(".dhl_fl_a").removeClass("dhl_fl_a_hover");
            $(".zt_l_wdxx_fl").removeClass("zt_l_wdxx_fl_hover");
            $(this).addClass("dhl_fl_a_hover");
        });

    }
    
    //打开评论
     $(".zsk_xx_dz_c").click(function () {
            $(".dtpl").show();
              
    }); 
    
    $(".dtpl_s").click(function () {
            $(".dtpl").hide();
              
    });
    
    

    //查看全文
    $(".qw").click(function () {
        if ($(".qw").text() == "查看全文") {
            $(".zsk_xx_wb").css("height", "auto");
            $(".qw").text("收起全文");
        }else if($(".qw").text() == "收起全文"){
             $(".zsk_xx_wb").css("height", "200px");
            $(".qw").text("查看全文");
        }      
    });
    
     if ( $(".zsk_xx_wb").height()>=200) {
        $(".qw").show();
     }


    //图片查看
    var x = 10;
    var y = 20;
    $("a.img_xs").mouseover(function (e) {

        var img_xs = "<div id='img_xs'><img src='" + this.href + "' alt='产品预览图'/><\/div>"; //创建 div 元素
        $("body").append(img_xs); //把它追加到文档中						 
        $("#img_xs")
            .css({
                "top": (e.pageY + y) + "px",
                "left": (e.pageX + x) + "px"
            }).show("fast"); //设置x坐标和y坐标，并且显示
    }).mouseout(function () {

        $("#img_xs").remove(); //移除 
    }).mousemove(function (e) {
        $("#img_xs")
            .css({
                "top": (e.pageY + y) + "px",
                "left": (e.pageX + x) + "px"
            });
    });

    //播放器
    //设置flash路径，Video.js会在不支持html5的浏览中使用flash播放视频文件
    videojs.options.flash.swf = "video-js.swf";
    var myPlayer = videojs('my-video');
    myPlayer.play();

});
