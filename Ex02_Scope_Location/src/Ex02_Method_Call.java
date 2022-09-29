import kr.or.kosa.common.Fclass;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		
		//Fclass 생성 ... 바꿔말하면 메몰에 올려야 한다 ... 객체 생성
		Fclass fclass = new Fclass();
		
		fclass.m();  //호출했다 = 그의 이름을 불러 주었어요 Call
		fclass.m2(100);
		
		int result = fclass.m3(); //1000이라는 값을 받을 준비르르 하는 것 int result =
		System.out.println("m3함수 호출시 돌려받은 값 : " + result);
		int result2 = fclass.m4(555);
		System.out.println("m4함수 호출시 돌려받은 값 : " + result2);
		
		result2 = fclass.sum(100, 200, 300);
		System.out.println("sum함수 호출시 돌려받은 값 : " + result2);
		
		fclass.callSuvSum();
		
		result2 = fclass.opSum(-10);
		System.out.println("opSum함수 호출시 돌려받은 값 : " + result2);
		
		
		//Quiz
//		int result3 = fclass.maxminimum(5, 10);
		result2 = fclass.maxminimum(50, 10);  //재할당을 해주는 것이기 때문에 result2를 써줌
		System.out.println("더 큰 값 : " + result2);
		//System.out.println("더 큰 값 : " + fclass.maxminimum(5, 10));
	}

}
