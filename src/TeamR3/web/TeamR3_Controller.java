package TeamR3.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD
import TeamR3.entity.Floors;
import TeamR3.entity.User;
import TeamR3.service.FloorsService;
=======
import com.alibaba.fastjson.JSONObject;

import TeamR3.entity.GoodType;
import TeamR3.entity.MyJsonObject;
import TeamR3.entity.User;
import TeamR3.service.GoodTypeService;
>>>>>>> 6dc3dce26db2f7f927a075e794f871f2f4df1355
import TeamR3.service.UserService;

@Controller
@RequestMapping("/test")
public class TeamR3_Controller {
	@Autowired
	private UserService userService = null;
<<<<<<< HEAD
	private FloorsService floorsService=null;
=======
	private GoodTypeService goodtypeService = null;

	public void setGoodtypeService(GoodTypeService goodtypeService) {
		this.goodtypeService = goodtypeService;
	}
>>>>>>> 6dc3dce26db2f7f927a075e794f871f2f4df1355


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setFloorsService(FloorsService floorsService) {
		this.floorsService = floorsService;
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
	
	@RequestMapping(value="/register.TeamR3")
	public @ResponseBody int adduser(
			@RequestParam(value = "user_id")String id,
			@RequestParam(value = "user_name")String name,
			@RequestParam(value = "user_password")String password,
			@RequestParam(value = "user_right")int right,
			@RequestParam(value = "user_job")String job){
		User user = new User();
		user.setUser_id(id);
		user.setUser_name(name);
		user.setUser_password(password);
		user.setUser_right(right);
		user.setUser_job(job);
		return userService.adduser(user);	
	}
	
	@RequestMapping(value="/modifyuser.TeamR3")
	public @ResponseBody int modifyuser(
			@RequestParam(value = "user_id")String id,
			@RequestParam(value = "user_name")String name,
			@RequestParam(value = "user_password")String password,
			@RequestParam(value = "user_right")int right,
			@RequestParam(value = "user_job")String job)
	{
		User user = new User();
		user.setUser_id(id);
		user.setUser_name(name);
		user.setUser_password(password);
		user.setUser_right(right);
		user.setUser_job(job);
		return userService.modifyuser(user.getUser_id(),user);	
	}
	
	@RequestMapping(value="/deluser.TeamR3")
	public @ResponseBody int deluser(@RequestParam(value = "user_id")String id){
		User user = new User();
		user.setUser_id(id);
		return userService.deluser(user.getUser_id());	
	}
	
	@RequestMapping(value="/querygoodtype.TeamR3")
	public @ResponseBody List<GoodType> querygoodtype(){
		return goodtypeService.queryGoodType();
	}
	
	@RequestMapping(value="/addgoodtype.TeamR3")
	public @ResponseBody int addgoodtype(
			@RequestParam(value = "good_type_id")int id,
			@RequestParam(value = "good_type_info")String info){
		GoodType goodtype=new GoodType();
		goodtype.setGood_type_id(id);
		goodtype.setGood_type_info(info);
		return goodtypeService.addGoodType(goodtype);
	}
	
	@RequestMapping(value="/login2.TeamR3",method=RequestMethod.POST)
	public @ResponseBody MyJsonObject getuser2(@RequestParam(value="account") String account,@RequestParam(value="password") String password ){
            User user=new User();
            
       return new MyJsonObject(200, "test");
		
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
