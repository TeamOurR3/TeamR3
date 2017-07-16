package TeamR3.dao;



import TeamR3.entity.User;

public interface UserDao {

	public User getuser(User user);
	
	public int adduser(User user);
	
	public int modifyuser(String user_id, User newuser);
	
	public int deluser(String user_id);
}
