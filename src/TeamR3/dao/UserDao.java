package TeamR3.dao;



import TeamR3.entity.User;

public interface UserDao {
<<<<<<< HEAD
	public abstract User getuser(User user);
=======

	public User getuser(User user);
	
	public int adduser(User user);
	
	public int modifyuser(String user_id, User newuser);
	
	public int deluser(String user_id);
>>>>>>> 77d36948da2c89b12b44b35932e475442db7ae48
}
