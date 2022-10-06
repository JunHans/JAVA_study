package kr.or.kosa;

public class Ex11_Static_Method {

	public void method() {  //heap 메모리에 올려야 사용가능
		System.out.println("나 일반 함수야");
		
		public static void smethod() {
			System.out.println("나 스태틱 함수야");
		}
	}

	public static void main(String[] args) {
		// smethod 사용가능? -> 가능!
		Ex11_Static_Method ex11 = new Ex11_Static_Method();
		// ex11 참조변수 (주소를 가지고 변수)는 static 접근, 일반 접근 가능
		ex11.method();

	}

}
