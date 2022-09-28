package pracLife01;

public class inheritPrac3 {

	public static void main(String[] args) {
		
		//맥주 레몬맛 객체 생성하기
		inheritPrac2 ip2 = new inheritPrac2("카스", "레몬", 3);
		
		//1에서 상속받은 필드
		System.out.println("타입 : " + ip2.getType());
		System.out.println("알콜도수 : " + ip2.getABV());
		
		//2에서 상속받은 필드
		System.out.println("맛 : "+ ip2.getFlavor());
		
		//2에서 메소드호출
		ip2.flavordrink();
	}

}
