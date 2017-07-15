package TeamR3.entity;

import java.io.Serializable;

public class MyJsonObject implements Serializable{

	 private int code;
	 private String message;
	 private Object object;
	 
	public MyJsonObject(int code, String message, Object object) {
		this.code = code;
		this.message = message;
		this.object = object;
	}
	 
	 
}
