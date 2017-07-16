package TeamR3.entity;

public class GoodType {

	private int good_type_id;
	
	private String good_type_info;

	public int getGood_type_id() {
		return good_type_id;
	}



	public void setGood_type_id(int good_type_id) {
		this.good_type_id = good_type_id;
	}

	public String getGood_type_info() {
		return good_type_info;
	}

	public void setGood_type_info(String good_type_info) {
		this.good_type_info = good_type_info;
	}
	
	public GoodType(int good_type_id, String good_type_info) {
		this.good_type_id = good_type_id;
		this.good_type_info = good_type_info;
	}



	public GoodType() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "GoodType [good_type_id=" + good_type_id + ", good_type_info="
				+ good_type_info + "]";
	}
	
	
}
