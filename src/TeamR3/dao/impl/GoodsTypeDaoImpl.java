package TeamR3.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.GoodsTypeDao;
import TeamR3.entity.GoodsType;

@Repository("goodsTypeDao")
public class GoodsTypeDaoImpl implements GoodsTypeDao{
	@Autowired
	private SqlSessionTemplate sst = null;
	public void setSst(SqlSessionTemplate sst) {
		this.sst = sst;
	}
	@Override
	public int addGoodsType(GoodsType goodType) {
		return sst.insert("addGoodsType", goodType);
	}
	@Override
	public int delGoodsType(int goodsType_id) {
		return sst.delete("delGoodsType", goodsType_id);
	}
	@Override
	public List<GoodsType> queryGoodsType() {
		return sst.selectList("queryGoodsType");
	}
	@Override
	public int modifyGoodsType(GoodsType newGoodsType) {
		return sst.update("modifyGoodsType", newGoodsType);
	}
}
