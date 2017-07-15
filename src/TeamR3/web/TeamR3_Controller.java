package TeamR3.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import TeamR3.entity.User;
import TeamR3.service.UserService;

@Controller
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
	
	@RequestMapping("/login2.TeamR3")
	public @ResponseBody User getuser(){
		User user = new User();
		user.setUser_id("11");
		user.setUser_password("111");
       return user;
		
	}
}
