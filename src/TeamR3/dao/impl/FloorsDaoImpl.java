package TeamR3.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.FloorsDao;
import TeamR3.entity.Floors;
@Repository("floorsDao")
public class FloorsDaoImpl implements FloorsDao {

	@Autowired
	private SqlSessionTemplate sst=null;
	
	public SqlSessionTemplate getSst() {
		return sst;
	}

	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	@Override
	public int addFloosMessage(Floors floors) {
		return sst.insert("addFloosMessage", floors);
		
	}

	@Override
	public int deleteFloorsMessage(int floor_id) {
		return sst.delete("deleteFloorsMessage", floor_id);
	}

	@Override
	public List<Floors> queryFloorsmessage() {
		return sst.selectList("queryFloorsmessage");
	
	}

	@Override
	public int modifyFloorMessage(Floors floors) {
		sst.update("modifyFloorMessage", floors);
		return 0;
	}

}
