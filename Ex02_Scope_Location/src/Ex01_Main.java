import kr.or.kosa.common.Car;

/*
 클래스 == 설계도 == 타입
 
 클래스 구성 요소 (설계도라고 판단할려면 최소한 무엇을 가지고 있어야 한다?)
 = [필드 + 함수] + 생성자 함수
 
 필드(member field) >> 데이터, 정보 담아야 한다 >> 고유정보 , 상태정보 , 부품정보 >> 이걸 담은게 field >> variable
 함수(method) >> 기능 (행위) >> 자동차 >> 달린다, 멈춘다, 소리가난다
 +  추가적으로 생성자 >> 특수한 목적의 함수 >> 객체가 만들어질 때 member field 를 초기화하기 위한 목적으로 쓰는 함수
 
 클래스 , 필드, 생성자 , 함수 : 영역(범위가 있음) >> 접근자, 한정자, 수정자
 >>> public, private, default, protected
 
 >> kr.or.common 안에 Car클래스 생성 >> public class Car { }  >> 나 다 오픈할꺼야
 
 >>kr.or.common 안에 AirPlaine 클래스 생성 >>  Class AirPlaine { >> default class AirPlaine}  
 >>default의 의미는 같은 폴더에서는 공유하겠다 : [같은 package 안에서 오픈할수있게 하고] [다른 package 에서는 접근 불가하게 하겠다]
 >>디폴트 접근자는 : 같은 폴더내에서 만들어서 연습용으로 쓴다
 
 하나의 물리적파일은 java파일은 여러개의 클래스를 가질 수 있다
 >> Ex01_Main.java 파일은 그안에 Ex01_Main 이라는 클래스를 하나가지고 있다
 >>일반적으로는 필요한 클래스를 별도의 파일로 생성해서 사용 ......
 >>그냥 연습... 해볼  굳이 물리적으로 물리적 파일을 만들필요 있나?
 >> 하나의 물리적 파일은 여러개의 클래스를 가질 수 있지만 public은 하나만 클래스 가질수 있다(대표) **별표
 
 
 */

class Emp{ //공부하거나 실습할때 바로 확인 쉽다... 굳이 접근자붙일 필요없고...
	
}

class Test { //컴파일러가 default class Test 해석
	int data; //instance Variable  //컴파일러가 default int data 로 해석
	public int p_data; //부모가(Test) 퍼블릭이 안붙어 있는데 지가 뭐라고 퍼블릭을 붙여?
	                     //에러는 아니지만 다른 폴더에서 사용 불가 .. public이 의미 없다
	private int pri_data; //private 감추다 , 숨기다 , 캡슐화(은닉) "이 변수를 감출거야" 
}



public class Ex01_Main {

	public static void main(String[] args) {
		Car car = new Car(); // import 단축기 : 컨트롤 + 쉬프트 + o (다른 소스를 받았어요 import가 없어요...)
		//Airplain air = new AirPlian(); 이런 클래스 없는데.. 해석 .. 보이지 않아요
		APT apt = new APT();
		Emp e = new Emp();
		
		Test t = new Test();
		// t.pri_data 사용할 수 없다
		

}
}
