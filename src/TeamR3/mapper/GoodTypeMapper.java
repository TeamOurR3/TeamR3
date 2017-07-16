package TeamR3.mapper;

import java.util.List;

import TeamR3.entity.GoodType;

public interface GoodTypeMapper {

	public int addGoodType(GoodType goodtype);
	
	public int delGoodType(int good_type_id);
	
	public List<GoodType> queryGoodType();
	
	public int modifyGoodType(int good_type_id,GoodType newgoodtype);
}
