package TeamR3.mapper;

import TeamR3.entity.User;

public interface UserMapper {

	public User getuser(User user);
	
	public int adduser(User user);
	
	public int modifyuser(String user_id, User newuser);
	
	public int deluser(String user_id);
}
