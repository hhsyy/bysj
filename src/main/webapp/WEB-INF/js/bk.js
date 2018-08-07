$(function () {
			
			if($(".wzzt_nr_zt").height()>260){
				$(".wzzt_an_a").show();
			}
			
			
			
            //全部展开
            $(".wzzt_an_a").click(function () {
                $(".wzzt_nr").css("height", "auto");
                $(".wzzt_an_a").hide();
            });



        //bx.html
            // 编写导航 
            $(".wzbx").addClass("bxzt_l_fl_hover");
            
            var bxzt_l_fl = document.getElementsByClassName("bxzt_l_fl");
    
            for (var i = 0; i < bxzt_l_fl.length; i++) {
                
                $( bxzt_l_fl[i]).click(function () {
                    $(".bxzt_l_fl").removeClass("bxzt_l_fl_hover");
                    $(this).addClass("bxzt_l_fl_hover");

                });
            }
            
            
            

})
