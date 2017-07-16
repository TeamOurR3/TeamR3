package TeamR3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.GoodTypeDao;
import TeamR3.dao.UserDao;
import TeamR3.entity.GoodType;
import TeamR3.service.GoodTypeService;

@Service("goodtypeService")
public class GoodTypeServiceImpl implements GoodTypeService{
	
	@Autowired
	private GoodTypeDao goodtypeDao = null;

	public void setGoodtypeDao(GoodTypeDao goodtypeDao) {
		this.goodtypeDao = goodtypeDao;
	}

	@Override
	public int addGoodType(GoodType goodtype) {
		// TODO Auto-generated method stub
		return goodtypeDao.addGoodType(goodtype);
	}

	@Override
	public int delGoodType(int good_type_id) {
		// TODO Auto-generated method stub
		return goodtypeDao.delGoodType(good_type_id);
	}

	@Override
	public List<GoodType> queryGoodType() {
		// TODO Auto-generated method stub
		return goodtypeDao.queryGoodType();
	}

	@Override
	public int modifyGoodType(int good_type_id, GoodType newgoodtype) {
		// TODO Auto-generated method stub
		return goodtypeDao.modifyGoodType(good_type_id, newgoodtype);
	}

}
