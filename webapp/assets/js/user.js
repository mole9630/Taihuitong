// 单击事件
$(function() {
    $("#ul1 li").each(function(index) {
        $(this).click(function() {
            $("#div0,#div1").css("display", "none");
            $("#div" + index).css("display", "block");
            $("#ul1 li").removeClass("cur");
            $("#ul1 li:eq(" + index + ")").addClass("cur");
        });
    });
});