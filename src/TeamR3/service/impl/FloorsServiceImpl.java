package TeamR3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.FloorsDao;
import TeamR3.entity.Floors;
import TeamR3.service.FloorsService;
@Service("floorsService")
public class FloorsServiceImpl implements FloorsService {

	@Autowired
	private FloorsDao floorsDao=null;
	
	
	public FloorsDao getFloorsDao() {
		return floorsDao;
	}

	public void setFloorsDao(FloorsDao floorsDao) {
		this.floorsDao = floorsDao;
	}

	@Override
	public int addFloosMessage(Floors floors) {
		return floorsDao.addFloosMessage(floors);
		 
	}

	@Override
	public int deleteFloorsMessage(int floor_id) {
		return floorsDao.deleteFloorsMessage(floor_id);
		
	}

	@Override
	public List<Floors> queryFloorsmessage() {
		return floorsDao.queryFloorsmessage();
		
	}

	@Override
	public int modifyFloorMessage(Floors floors) {
		
		return floorsDao.modifyFloorMessage(floors);
	}

}
