package TeamR3.service;

import java.util.List;

import TeamR3.entity.Goods;

public interface GoodsService {
	public abstract List<Goods> queryGoods();
	public abstract int addGoods(Goods goods);
	public abstract int modifyGoods(Goods goods);
	public abstract int delGoods(int goods_id);
}
