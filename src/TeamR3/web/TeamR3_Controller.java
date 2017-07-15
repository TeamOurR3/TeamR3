package TeamR3.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import TeamR3.entity.MyJsonObject;
import TeamR3.entity.User;
import TeamR3.service.UserService;

@Controller
@RequestMapping("/test")
public class TeamR3_Controller {
	@Autowired
	private UserService userService = null;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	@RequestMapping("/login.TeamR3")
	public @ResponseBody User getuser(
			@RequestParam(value = "user_id")String id,
			@RequestParam(value = "user_password")String password){
		User user = new User();
		user.setUser_id(id);
		user.setUser_password(password);
		User resultUser = userService.getuser(user);
		if(resultUser!=null){
			System.out.println(resultUser);
			return resultUser;
		}else{
			System.out.println("匹配失败");
			return resultUser;
		}
		
	}
	
	@RequestMapping(value="/login2.TeamR3",method=RequestMethod.POST)
	public @ResponseBody MyJsonObject getuser2(@RequestParam(value="account") String account,@RequestParam(value="password") String password ){

       return new MyJsonObject(200, "成功注册", null);
		
	}
}
