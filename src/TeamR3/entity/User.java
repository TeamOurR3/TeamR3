package TeamR3.entity;

public class User {

	private int user_id;
	private String user_name;
	private String user_password;
	private int user_right;
	private String user_job;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getUser_right() {
		return user_right;
	}
	public void setUser_right(int user_right) {
		this.user_right = user_right;
	}
	public String getUser_job() {
		return user_job;
	}
	public void setUser_job(String user_job) {
		this.user_job = user_job;
	}
	
	public User(int user_id, String user_name, String user_password,
			int user_right, String user_job) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_right = user_right;
		this.user_job = user_job;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
