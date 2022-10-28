import java.util.ArrayList;
import java.util.List;

//https://cafe.naver.com/kosait/329

/*
자바 8가지 기본타입(값타입) : JAVA API 제공

8가지 기본 타입에 대해서 객체 형태로 사용 가능하도록 만든 클래스 = Wrapper Class
 [ 사용 용도 ]
1. 매개변수로 객체가 요구될 때
2. 기본형 값이 아닌 객체형태로 저장이 필요할 때
3. 객체간 값을 비교할 때
4. 타입 변환시 처리

>> Generic 설계 (객체 형태)  >>  int >Integer 


 */

public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100; //값타입
		/*
		Integer n = new Integer(500);
		System.out.println("n : "+ n); //500  >>  toString 재정의 되었기에 값이 리턴됨
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		*/
		
		//POINT
		//Parameter 활용
		//제너릭(generic) : 객체 생성시 타입을 강제하는 방식으로 사용 >> 파라메터에 값타입을 못 씀 >> 파라메터에 Wrapper Class만 쓸 수 있게
		List<Integer> li = new ArrayList<Integer>();
		li.add(100); 
		//li.add("A");
		for(int value : li) {
			System.out.println(value);
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3);  //False - 주소값 비교
		System.out.println(i2.equals(i3));  //True - 주소값을 비교하는게 아니라 값을 비교함 (주소를 찾아가서 값을 비교)
		
		//String  >>  문자열 값 비교할 때 >> equals (실제 값을 비교하도록 재정의가 되어있음)
		
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5); //True

		
	}

}
