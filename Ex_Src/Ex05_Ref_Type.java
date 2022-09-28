
/*
클래스는 설계도이다  , 클래스는 데이터 타입이다
클래스 == 설계도 == 타입

 클래스는 구체화를 통해서 사용 (집을 짓는 행위)
 프로그램에서는 [ new 연산자 ]를 통해서 memory 에 집을 짓는다 >> 만들어진 것  >> 객체 (인스턴스)

 
 설계도를 종류 2가지
 1. 독자적으로 실행가능한 설계도  >>  public static void main(String[] args) 가지고 있는 클래스
 2. 독자적으로 실행 불가능  >>  main 함수가 없는 나머지 클래스  >>  남을 도와주는 클래스  >>  라이브러리(LIB)
 
 */
class Apt2 { // main 함수가 없어요 종이쪼가리에 지나지 않아  
	int door=10;
	int window=20;
}
//class Car{ // public static void main(String[] args) 같은폴더안에 어떤 자바파일이 이 클래스이름을 갖고있구나	
//}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		//Apt2라는 설계도를 가지고
		//구체화된 산물 생간 (객체를 만들겠다)
		
		int num;
		num=100; //정수값을 넣어주면 ...
		Apt2 apt2;  //주소값을 ...
		apt2 = new Apt2(); //Apt2 설계도를 기반으로 아파느를 지었어요 (JVM >> memory >> Heap)
		
		System.out.println("apt2 : " + apt2); //주소값을 가지고 있어요 
		//Apt2@626b2d4a
		
		Apt2 ssapt = apt2; //할당을 통해서 주소값으 할당받는구나 ... ssapt변수는 apt2가 가지고 있는 주소값으로 초기화 된 것 ... 두변수의 기묘한 동거
		ssapt.door=100; //.연산자는 주소를 찾아가는 연산자
		
		System.out.println("apt2 바라보는 door : " + apt2.door); //ssapt의 도어가 100개가 되면 apt2의 도어도 100개 된다 
		

	}

}

//탕비은 값타입 참조타입으로 나뉜다
//참조타입은 값을 가진게 아니라 주소값을 가지고 있다
