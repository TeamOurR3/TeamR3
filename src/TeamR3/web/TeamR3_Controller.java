package TeamR3.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import TeamR3.entity.MyJsonObject;

@Controller
@RequestMapping("/test")
public class TeamR3_Controller {
	
	// Controller Demo
	@RequestMapping(value="/login2.TeamR3",method=RequestMethod.POST)
	public @ResponseBody MyJsonObject getuser2(@RequestParam(value="account") String account,@RequestParam(value="password") String password ){
       
            
       return new MyJsonObject(200, "test");
		
	}
	
}
