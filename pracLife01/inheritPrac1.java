package pracLife01;



public class inheritPrac1 {
	String type;
	String model;
	
	//������ (��ü�� �����ϱ�)
	public inheritPrac1(String type, String model) {
		this.type = type;
		this.model = model;
	}
	
	public void drink() {
		System.out.println("���ʴϴ�");
	}
	
	public void mix() {
		System.out.println("�����ϴ�");
	}
	
	public String getType() {
		return type;
	}
	
	public String getModel() {
		return model;
	}
}

