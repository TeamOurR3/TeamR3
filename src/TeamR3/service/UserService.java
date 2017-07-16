package TeamR3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import TeamR3.entity.User;
@Service
public interface UserService {
	public List<User> getAllUser();
	
	public User getUser(User user);
	
	public int addUser(User user);
	
	public int modifyUser(User newUser);
	
	public int delUser(String user_id);
}
