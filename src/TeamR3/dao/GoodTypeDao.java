package TeamR3.dao;

import java.util.List;

import TeamR3.entity.GoodType;

public interface GoodTypeDao {

	public int addGoodType(GoodType goodtype);
	
	public int delGoodType(int good_type_id);
	
	public List<GoodType> queryGoodType();
	
	public int modifyGoodType(int good_type_id,GoodType newgoodtype);
}
