package TeamR3.dao;

import java.util.List;

import TeamR3.entity.Floors;

public interface FloorsDao {
	public int addFloosMessage(Floors floors);
	public int deleteFloorsMessage(int floor_id);
	public List<Floors> queryFloorsmessage();
	public int modifyFloorMessage(Floors floors);

}