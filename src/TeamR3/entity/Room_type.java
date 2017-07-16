package TeamR3.entity;

public class Room_type {

	private int room_type_id;
	private String room_type_info;
	private int room_type_limit_number;
	private double room_standard_price;
	private double room_discount_price;
	private double room_normal_customer_price;
	private double room_vip_customer_price;
	
	
	public Room_type(int room_type_id, String room_type_info,
			int room_type_limit_number, double room_standard_price,
			double room_discount_price, double room_normal_customer_price,
			double room_vip_customer_price) {
		super();
		this.room_type_id = room_type_id;
		this.room_type_info = room_type_info;
		this.room_type_limit_number = room_type_limit_number;
		this.room_standard_price = room_standard_price;
		this.room_discount_price = room_discount_price;
		this.room_normal_customer_price = room_normal_customer_price;
		this.room_vip_customer_price = room_vip_customer_price;
	}
	public double getRoom_standard_price() {
		return room_standard_price;
	}
	public void setRoom_standard_price(double room_standard_price) {
		this.room_standard_price = room_standard_price;
	}
	public double getRoom_discount_price() {
		return room_discount_price;
	}
	public void setRoom_discount_price(double room_discount_price) {
		this.room_discount_price = room_discount_price;
	}
	public double getRoom_normal_customer_price() {
		return room_normal_customer_price;
	}
	public void setRoom_normal_customer_price(double room_normal_customer_price) {
		this.room_normal_customer_price = room_normal_customer_price;
	}
	public double getRoom_vip_customer_price() {
		return room_vip_customer_price;
	}
	public void setRoom_vip_customer_price(double room_vip_customer_price) {
		this.room_vip_customer_price = room_vip_customer_price;
	}
	public int getRoom_type_id() {
		return room_type_id;
	}
	public void setRoom_type_id(int room_type_id) {
		this.room_type_id = room_type_id;
	}
	public String getRoom_type_info() {
		return room_type_info;
	}
	public void setRoom_type_info(String room_type_info) {
		this.room_type_info = room_type_info;
	}
	public int getRoom_type_limit_number() {
		return room_type_limit_number;
	}
	public void setRoom_type_limit_number(int room_type_limit_number) {
		this.room_type_limit_number = room_type_limit_number;
	}
	public Room_type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
