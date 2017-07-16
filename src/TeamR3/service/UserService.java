package TeamR3.service;

import org.springframework.stereotype.Service;

import TeamR3.entity.User;
@Service
public interface UserService {

	public User getuser(User user);
	
    public int adduser(User user);
	
	public int modifyuser(String user_id, User newuser);
	
	public int deluser(String user_id);
}
