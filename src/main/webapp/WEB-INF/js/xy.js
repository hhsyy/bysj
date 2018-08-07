$(function () {
    
    
    for(var i=0;i<xzzs.length;i++){
        $(xzzs[i]).hover(function() {
                    $(this).children().children().eq(0).css("opacity", "0.5");
                    $(this).children().children().eq(1).fadeIn();    
                }, function () {
                $(this).children().children().eq(0).css("opacity", "inherit");
                $(this).children().children().eq(1).fadeOut();
                    
            });
    }
           
})