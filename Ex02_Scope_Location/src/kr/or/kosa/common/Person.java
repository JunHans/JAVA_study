package kr.or.kosa.common;

/*
 * class == 설계도 == 데이터 타입
 설계도는 종이 쪼가리다 >> 구체화시켜야 한다(메모리에 올리는 행위) >> 올린 것을 객체라고 한다
 구체화 된것 : 객체 , 인스턴스
 
 설계도 : feild(고유, 상태, 부품) + method(기능) + constrctor(생성자 함수)
 
 public class Ex_01 Basic{
 	public static void main(String[] args{
 		여기안에다 코드 연습
 		main 이름을 가진 함수안 지역
 		String name="초기화";     local variable > 접근자 받지 않음 > 함수가 호출돠면 생성 > 함수 종료되면 같이 소멸 
 		int age = 0;
 		}
	}
	
	
 */	
public class Person {

		public String name;  // default (자동) 값 = null
		public int age;// default (자동) 0
		public boolean power;  // default (자동) false (컴퓨터는 부정적)
		//기능
		//정보를 출력하는 기능
		public void personPrint() {
			System.out.printf("이름은 %s 나이는 %d 파워는 %s",name,age,power);
		}
		
	    // member field >> instance variable >> 객체변수
		// 1. member variable 초기화 하지 않아도 된다 >> why? >> 아무것도 쓰지 않았다면 default 값을 주겠다
		// 초기화 : 변수가 처음으로 값을 할당 받는것
		// 질문 : 저 name member field 초기화 하고 싶은데요 가능할까요? > 
		// 필요하다면 당근 초기화를 할 수 있다 : public int age=100;
		// Today Point : why 초기화 안할까? ... 
		// **** 생성되는 객체(사람) 마다 , [다른이름을 가질 수 있다] ****
		// Person memver dield 당신이 사람을 만들때 마다 값을 가지게 할거 아니야! 굳이 초기화를 할필요 없어
		
		// main(){
//			Person 남자 =new Person(); 사람 한명 만든것
//			남자.name = "김유신";
//			남자.age = 100;
//			남자.power = true;
//			
//			Person 여자 =new Person(); 사람 2명
//			여자.name = "유관순";
//			여자.age = 20;
//			여자.power = false;
		
//			Person 인간 = new Person();
		


}
