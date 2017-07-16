package TeamR3.entity;

public class Goods {
	private int goods_id;
	private String goods_name;
	private double goods_price;
	private int goods_type_id;
	private String goods_unit;
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	public Goods(int good_id, String good_name, double good_price,
			int good_type_id, String good_unit) {
		this.goods_id = good_id;
		this.goods_name = good_name;
		this.goods_price = good_price;
		this.goods_type_id = good_type_id;
		this.goods_unit = good_unit;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	public int getGoods_type_id() {
		return goods_type_id;
	}
	public void setGoods_type_id(int goods_type_id) {
		this.goods_type_id = goods_type_id;
	}
	public String getGoods_unit() {
		return goods_unit;
	}
	public void setGoods_unit(String goods_unit) {
		this.goods_unit = goods_unit;
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name
				+ ", goods_price=" + goods_price + ", goods_type_id="
				+ goods_type_id + ", goods_unit=" + goods_unit + "]";
	}
}
