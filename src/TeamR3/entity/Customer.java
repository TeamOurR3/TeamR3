package TeamR3.entity;

import java.math.BigInteger;
public class Customer {

	private BigInteger customer_id;
	private String customer_name;
	private int customer_sex;
	private String customer_password;
	private int customer_tel;
	private int customer_point;
	private String customer_level;
	private String customer_identity;
	
	
	public BigInteger getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(BigInteger customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(int customer_sex) {
		this.customer_sex = customer_sex;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public int getCustomer_tel() {
		return customer_tel;
	}
	public void setCustomer_tel(int customer_tel) {
		this.customer_tel = customer_tel;
	}
	public int getCustomer_point() {
		return customer_point;
	}
	public void setCustomer_point(int customer_point) {
		this.customer_point = customer_point;
	}
	public String getCustomer_level() {
		return customer_level;
	}
	public void setCustomer_level(String customer_level) {
		this.customer_level = customer_level;
	}
	public String getCustomer_identity() {
		return customer_identity;
	}
	public void setCustomer_identity(String customer_identity) {
		this.customer_identity = customer_identity;
	}
	public Customer(BigInteger customer_id, String customer_name,
			int customer_sex, String customer_password, int customer_tel,
			int customer_point, String customer_level, String customer_identity) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_sex = customer_sex;
		this.customer_password = customer_password;
		this.customer_tel = customer_tel;
		this.customer_point = customer_point;
		this.customer_level = customer_level;
		this.customer_identity = customer_identity;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
