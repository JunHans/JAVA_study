package pracLife01;


public class inheritPrac2 extends inheritPrac1{
	
	//�ʵ� �Է�
	String flavor;
	int ABV = 6;
	 
	//������ �Է�
	inheritPrac2(String model, String flavor){
		super("�и���",model);
		this.model = model;  //model�� ���� beerŬ�����κ��� ��ӹ���
		this.flavor = flavor;
	}
	
	//������ �����ε�
	inheritPrac2(String model, String flavor, int ABV){
		super("�и���",model);
		this.model = model;
		this.flavor = flavor;
		this.ABV = ABV;
	}
	
	//�޼��� �Է�
	public void flavordrink() {
		System.out.println(model + "������" + flavor+ "���� ���ʴϴ�");
	}
	
	//getter
	public String getFlavor() {
		return flavor;
	}
	public int getABV() {
		return ABV;
	}
}