package TeamR3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import TeamR3.entity.Floors;
@Service
  public interface FloorsService {
	public int addFloosMessage(Floors floors);
	public int deleteFloorsMessage(int floor_id);
	public List<Floors> queryFloorsmessage();
	public int modifyFloorMessage(Floors floors);

  }
