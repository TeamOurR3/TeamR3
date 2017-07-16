package TeamR3.entity;

public class Floors {
	
  private int floor_id;
  private String floor_comments;
  private String floor_room_number;
  private String floor_customer_number;
  
  
  
   public Floors(int floor_id, String floor_comments, String floor_room_number,
		String floor_customer_number) {
	super();
	this.floor_id = floor_id;
	this.floor_comments = floor_comments;
	this.floor_room_number = floor_room_number;
	this.floor_customer_number = floor_customer_number;
   }
   
   public Floors() {
	super();
	
  }

   public String getFloor_comments() {
	return floor_comments;
   }
   public void setFloor_comments(String floor_comments) {
	this.floor_comments = floor_comments;
   }
   public int getFloor_id() {
	return floor_id;
   }
   public void setFloor_id(int floor_id) {
	this.floor_id = floor_id;
   }
   public String getFloor_room_number() {
	return floor_room_number;
   }
   public void setFloor_room_number(String floor_room_number) {
	this.floor_room_number = floor_room_number;
   }
   public String getFloor_customer_number() {
	return floor_customer_number;
   }
   public void setFloor_customer_number(String floor_customer_number) {
	this.floor_customer_number = floor_customer_number;
   }

     
  
  
  

}
