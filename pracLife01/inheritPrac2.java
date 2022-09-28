package pracLife01;


public class inheritPrac2 extends inheritPrac1{
	
	//필드 입력
	String flavor;
	int ABV = 6;
	 
	//생성자 입력
	inheritPrac2(String model, String flavor){
		super("밀맥주",model);
		this.model = model;  //model은 상위 beer클래스로부터 상속받음
		this.flavor = flavor;
	}
	
	//생성자 오버로딩
	inheritPrac2(String model, String flavor, int ABV){
		super("밀맥주",model);
		this.model = model;
		this.flavor = flavor;
		this.ABV = ABV;
	}
	
	//메서드 입력
	public void flavordrink() {
		System.out.println(model + "맥주의" + flavor+ "맛을 마십니다");
	}
	
	//getter
	public String getFlavor() {
		return flavor;
	}
	public int getABV() {
		return ABV;
	}
}