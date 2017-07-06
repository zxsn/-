$(function() {
	// 点击复选框全选或全不选效果
	$("#allCheckBox").click(function() {
		var checked = $(this).is(":checked");
		$(".cart_td_1").children().attr("checked", checked);
	});
	// 判断是否全选
	function ifAllChecked() {
		var checkedBoxs = $(".cart_td_1").children();
		var sum = checkedBoxs.size();
		var k = 0;
		checkedBoxs.each(function(index, dom) {
			if ($(dom).is(":checked"))
				k++;
		});
		if (k == sum) {
			$("#allCheckBox").attr("checked", true);
		} else {
			$("#allCheckBox").attr("checked", false);
		}
	}
	ifAllChecked();// 页面加载完后运行
	// 单选判断
	$(".cart_td_1").children().click(function() {
		ifAllChecked();
	});
	
	
	
});


