package TeamR3.entity;

public class GoodsType {
	private int goods_type_id;
	private String goods_type_info;
	public GoodsType() {
		// TODO Auto-generated constructor stub
	}
	public GoodsType(int goods_type_id, String goods_type_info) {
		this.goods_type_id = goods_type_id;
		this.goods_type_info = goods_type_info;
	}
	public int getgoods_type_id() {
		return goods_type_id;
	}
	public void setgoods_type_id(int goods_type_id) {
		this.goods_type_id = goods_type_id;
	}
	public String getgoods_type_info() {
		return goods_type_info;
	}
	public void setgoods_type_info(String goods_type_info) {
		this.goods_type_info = goods_type_info;
	}
	@Override
	public String toString() {
		return "goodsType [goods_type_id=" + goods_type_id + ", goods_type_info="
				+ goods_type_info + "]";
	}
}
