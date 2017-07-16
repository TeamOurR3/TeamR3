package TeamR3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import TeamR3.entity.GoodType;

@Service
public interface GoodTypeService {

	public int addGoodType(GoodType goodtype);
	
	public int delGoodType(int good_type_id);
	
	public List<GoodType> queryGoodType();
	
	public int modifyGoodType(int good_type_id,GoodType newgoodtype);
}
