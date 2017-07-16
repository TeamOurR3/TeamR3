package TeamR3.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TeamR3.dao.GoodsDao;
import TeamR3.entity.Goods;

@Repository("goodsDao")
public class GoodsDaoImpl implements GoodsDao{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public List<Goods> queryGoods() {
		return sqlSessionTemplate.selectList("queryGoods");
	}
	@Override
	public int addGoods(Goods goods) {
		return sqlSessionTemplate.insert("addGoods",goods);
	}
	@Override
	public int modifyGoods(Goods goods) {
		return sqlSessionTemplate.update("modifyGoods", goods);
	}
	@Override
	public int delGoods(int goods_id) {
		return sqlSessionTemplate.delete("delGoods", goods_id);
	}
}
