package TeamR3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.GoodsTypeDao;
import TeamR3.entity.GoodsType;
import TeamR3.service.GoodsTypeService;

@Service("goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService{
	@Autowired
	private GoodsTypeDao goodsTypeDao;
	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}

	@Override
	public int addGoodsType(GoodsType goodType) {
		return goodsTypeDao.addGoodsType(goodType);
	}
	@Override
	public int delGoodsType(int goodsType_id) {
		return goodsTypeDao.delGoodsType(goodsType_id);
	}
	@Override
	public List<GoodsType> queryGoodsType() {
		return goodsTypeDao.queryGoodsType();
	}
	@Override
	public int modifyGoodsType(GoodsType newGoodsType) {
		return goodsTypeDao.modifyGoodsType(newGoodsType);
	}
}