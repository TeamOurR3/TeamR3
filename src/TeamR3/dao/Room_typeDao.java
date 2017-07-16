package TeamR3.dao;

import java.util.List;

import TeamR3.entity.Room_type;

public interface Room_typeDao {

	public List<Room_type> getAllRoom_type();
	public int addRoom_type(Room_type room_type);
	public int delectRoom_type(int room_type_id);
	public int updateRoom_type(Room_type room_type);
}
