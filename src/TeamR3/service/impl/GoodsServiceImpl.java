package TeamR3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TeamR3.dao.GoodsDao;
import TeamR3.entity.Goods;
import TeamR3.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao goodsDao;
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	@Override
	public List<Goods> queryGoods() {
		return goodsDao.queryGoods();
	}
	@Override
	public int addGoods(Goods goods) {
		return goodsDao.addGoods(goods);
	}
	@Override
	public int modifyGoods(Goods goods) {
		return goodsDao.modifyGoods(goods);
	}
	@Override
	public int delGoods(int goods_id) {
		return goodsDao.delGoods(goods_id);
	}
	@Override
	public double queryBygoods_name(String goods_name) {
		return goodsDao.queryBygoods_name(goods_name);
		
	}
}
