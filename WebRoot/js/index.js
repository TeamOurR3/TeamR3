$(function(){
	urlmessage();
});


function urlmessage(){
	$('.login-btn').click(function(){
		//检查注册信息完整性
		if($('.login-name').val()==""&&$('.login-psw').val()==""){
			layer.msg('账号密码不能为空！',function(){
				return false;
			})
		};
		if($('.login-name').val()==""&&$('.login-psw').val()!=""){
			layer.msg('账号不能为空！',function(){
				return false;
			})
		};
		if($('.login-name').val()!=""&&$('.login-psw').val()==""){
			layer.msg('密码不能为空！',function(){
				return false;
			})
		};
		if($('.login-name').val().length>10){
			layer.msg('账号长度不能大于20',function(){
				return false;
			})
		};
		
	})
}