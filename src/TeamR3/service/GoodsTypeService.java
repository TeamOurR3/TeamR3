package TeamR3.service;

import java.util.List;


import TeamR3.entity.GoodsType;

public interface GoodsTypeService {
	public int addGoodsType(GoodsType goodType);
	public int delGoodsType(int goodsType_id);
	public List<GoodsType> queryGoodsType();
	public int modifyGoodsType(GoodsType newGoodsType);
}
