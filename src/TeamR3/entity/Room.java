package TeamR3.entity;

public class Room {

	private int room_id;
	private int room_status;
	private int room_floor;
	private Room_type room_type;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getRoom_status() {
		return room_status;
	}
	public void setRoom_status(int room_status) {
		this.room_status = room_status;
	}
	public int getRoom_floor() {
		return room_floor;
	}
	public void setRoom_floor(int room_floor) {
		this.room_floor = room_floor;
	}
	public Room_type getRoom_type() {
		return room_type;
	}
	public void setRoom_type(Room_type room_type) {
		this.room_type = room_type;
	}
	public Room(int room_id, int room_status, int room_floor,
			Room_type room_type) {
		super();
		this.room_id = room_id;
		this.room_status = room_status;
		this.room_floor = room_floor;
		this.room_type = room_type;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
