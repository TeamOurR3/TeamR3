package TeamR3.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.GoodTypeDao;
import TeamR3.entity.GoodType;

@Repository("goodtypeDao")
public class GoodTypeDaoImpl implements GoodTypeDao{

	@Autowired
	private SqlSessionTemplate sst = null;
	
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}

	@Override
	public int addGoodType(GoodType goodtype) {
		// TODO Auto-generated method stub
		return sst.insert("addgoodtype", goodtype);
	}

	@Override
	public int delGoodType(int good_type_id) {
		// TODO Auto-generated method stub
		return sst.delete("delgoodtype", good_type_id);
	}

	@Override
	public List<GoodType> queryGoodType() {
		// TODO Auto-generated method stub
		return sst.selectList("querygoodtype");
	}

	@Override
	public int modifyGoodType(int good_type_id, GoodType newgoodtype) {
		// TODO Auto-generated method stub
		return sst.update("modifygoodtype", newgoodtype);
	}

}
