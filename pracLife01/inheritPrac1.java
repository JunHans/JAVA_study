package pracLife01;



public class inheritPrac1 {
	String type;
	String model;
	
	//생성자 (객체값 세팅하기)
	public inheritPrac1(String type, String model) {
		this.type = type;
		this.model = model;
	}
	
	public void drink() {
		System.out.println("마십니다");
	}
	
	public void mix() {
		System.out.println("섞습니다");
	}
	
	public String getType() {
		return type;
	}
	
	public String getModel() {
		return model;
	}
}

