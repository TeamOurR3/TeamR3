package TeamR3.dao;



import java.util.List;

import TeamR3.entity.User;

public interface UserDao {
	public List<User> getAllUser();
	
	public User getUser(User user);
	
	public int addUser(User user);
	
	public int modifyUser(User newUser);
	
	public int delUser(String user_id);
}
