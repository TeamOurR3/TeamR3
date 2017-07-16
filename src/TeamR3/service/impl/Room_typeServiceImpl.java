package TeamR3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.Room_typeDao;
import TeamR3.entity.Room_type;
import TeamR3.service.Room_typeService;
@Service("room_typeService")
public class Room_typeServiceImpl implements Room_typeService {

	@Autowired
	Room_typeDao room_typeDao = null;
	
	public Room_typeDao getRoom_typeDao() {
		return room_typeDao;
	}

	public void setRoom_typeDao(Room_typeDao room_typeDao) {
		this.room_typeDao = room_typeDao;
	}

	@Override
	public List<Room_type> getAllRoom_type() {
		// TODO Auto-generated method stub
		return room_typeDao.getAllRoom_type();
	}

	@Override
	public int addRoom_type(Room_type room_type) {
		// TODO Auto-generated method stub
		return room_typeDao.addRoom_type(room_type);
	}

	@Override
	public int delectRoom_type(int room_type_id) {
		// TODO Auto-generated method stub
		return room_typeDao.delectRoom_type(room_type_id);
	}

	@Override
	public int updateRoom_type(Room_type room_type) {
		// TODO Auto-generated method stub
		return room_typeDao.updateRoom_type(room_type);
	}

}
