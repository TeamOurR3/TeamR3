package TeamR3.dao;

import java.util.List;

import TeamR3.entity.Goods;

public interface GoodsDao {
	public abstract List<Goods> queryGoods();
	public abstract int addGoods(Goods goods);
	public abstract int modifyGoods(Goods goods);
	public abstract int delGoods(int goods_id);
}
