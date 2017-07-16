package TeamR3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import TeamR3.entity.Room_type;

@Service
public interface Room_typeService {

	public List<Room_type> getAllRoom_type();
	public int addRoom_type(Room_type room_type);
	public int delectRoom_type(int room_type_id);
	public int updateRoom_type(Room_type room_type);
}
