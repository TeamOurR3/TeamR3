$(function(){
	urlmessage();
});


function urlmessage(){
	$('.login-btn').click(function(){
		//检查注册信息完整性
		var user_id = $('.login-name').val();
		var user_password = $('.login-psw').val();
		var loginUrl = '/test/login2.TeamR3';
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
		console.log(user_id);
		console.log(user_password);
		publicDom.post(loginUrl,{
				account: user_id,
				password: user_password
			},function(response){
				if (response.Code !== 0) {
					layer.msg("登录成功");
				}
				else {
					layer.msg(response.Msg);
				}
			},function(err){
				layer.msg(err.Msg);
			});
	})
}