
//아파트 설계도
class Apt{   //설게도 == 데이터 타입(작은타입들을 모아넣은 큰타입)
	int window;   //new를 선언하지 않으면 그냥 종이쪼가리다
}


//데이터 타입 변수명 ex) int number;  >> number 라는 변수는 타입에 맞는 값을 가진다
//Apt apt; 

public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		
		int number=100; //int는 4바이트
		
		Apt apt; //선언 Apt 타입 apt 변수
		         //apt변수는 APT타입의 값을 지녀야 하는데 주소값 
		         //실제로 아파트를 메모리에 올려야 아파트가 생성이 되고 그 주소가 만들어 져요     
		         //유일한 방법 : new (연산자)
		//apt에는 주소가 담긴다 ... 앞으로 지어질 아파트의 주소를 담을 수 있는 변수 ... 4바이트
		apt = new Apt(); // heap이라는 메모리에 아파트가 한채 만들어지고 그리고 주소가 생성되고
					    // 생성된 주소값을 apt변수가 가진다
		                // 집을 짓는건 heap영역(관리영역)에 짓기로 약속함
		
		System.out.println("apt 변수가 가지는 값은 : " + apt);
		//apt 변수가 가지는 값은 : Apt@626b2d4a      : 조작된 값 
		//Apt + @ + 626b2d4a  >> 설계도의 이름 + @ + 주소값
		
		Apt apt2 = new Apt(); 
		
		System.out.println(apt == apt2);  //두변수의 주소가 같아요? 두개의 주소는 틀려요 false
		
		
		Apt apt3 = apt2; //주소값 같음
		
		System.out.println(apt3 == apt2);  //같은집에 동거를 시작
		apt2.window = 20;
		
		System.out.println("apt3 : 창문의 수 : " + apt3.window); //아까는 다른 변수에 영향안줬는데 주소를 공유하니 영향을 줌
		//값타입은 영향 안줌 ... 주소타입은 영향 줌
		
		
		//값타입과 주소타입 증명하기
//		/*
//		>>>>>
//		Ex03_Object_Variable 소스파일
//		Javac Ex03_Object_Variable.java >>Ex03_Object_Variable.class 실행파일
//		java Ex03_Object_Variable 엔터
//		
//		JVM 동작 >> OS >> JAVA 메모리 구성 (구획정리) >> 자원할당 (메모리) >> 프로그램 종료
//		>> 사용했던 메모리 OS에게 반환 ... end
//		>>>>>
//		이클립스 통합 개발툴 CTRL + F11
//		 
//		1. main 함수안에 지역변수는 반드시 초기화 하고 사용 
//		2. 약속 >> main 함수 >> 시작점을 가지는 함수 >> 영역이 제일 먼저 실행 
//		
//		 */
	}

}
