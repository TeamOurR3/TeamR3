package TeamR3.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import TeamR3.entity.Floors;
import TeamR3.entity.User;
import TeamR3.service.FloorsService;
import TeamR3.service.UserService;

@Controller
public class TeamR3_Controller {
	@Autowired
	private UserService userService = null;
	private FloorsService floorsService=null;


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setFloorsService(FloorsService floorsService) {
		this.floorsService = floorsService;
	}


	@RequestMapping("/login.TeamR3")
	public @ResponseBody int getuser(
			@RequestParam(value = "user_id")String id,
			@RequestParam(value = "user_password")String password){
		User user = new User();
		user.setUser_id(id);
		user.setUser_password(password);
		User resultUser = userService.getuser(user);
		if(resultUser!=null){
			System.out.println(resultUser);
			return resultUser.getUser_right();
		}else{
			System.out.println("匹配失败");
			return 0;
		}
		
	}
	@RequestMapping("/addFloorsMessage.TeamR3")
	public @ResponseBody int AddFloorsMessage(
			@RequestParam(value = "floor_id")int floor_id,
			@RequestParam(value = "floor_comments")String floor_comments,
			@RequestParam(value = "floor_room_number")String floor_room_number,
			@RequestParam(value = "floor_customer_number")String floor_customer_number){
		Floors floors=new Floors();
		floors.setFloor_id(floor_id);
		floors.setFloor_comments(floor_comments);
		floors.setFloor_room_number(floor_room_number);
		floors.setFloor_customer_number(floor_customer_number);
		floorsService.addFloosMessage(floors);
			System.out.println(floors);
			return 0;
		}
	@RequestMapping("/deleteFloorsMessage.TeamR3")
	public @ResponseBody int DeleteFloorsMessage(
			@RequestParam(value = "floor_id")int floor_id){
		Floors floors=new Floors();
		floors.setFloor_id(floor_id);
		floorsService.deleteFloorsMessage(floor_id);
			
			return 0;
		}
	
	@RequestMapping("/queryFloorsmessage.TeamR3")
	public List<Floors> QueryFloorsmessage(){
		
		return floorsService.queryFloorsmessage();
			
			
		}
	
	
}
