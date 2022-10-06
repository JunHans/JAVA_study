package kr.or.kosa;
/*
생성자 함수(constructor)
1. 함수(특수한 목적)
2. 목적(member field 초기화) >> static{}  , {초기자 블럭}

3. 일반함수와 다른점
3.1 함수의 이름이 고정되어 있음(class의 이름과 동일)
3.2 return 타입이 없어요 (객체 생성과 동시에 호출) (return을 받을 대상이 없다)
3.3 실행시점 >> new 를 통해서 객체 생성 >> heap 공간 생성 >> member field 자리 잡음 >> 자동으로 생성자 함수 호출
3.4 return 타입(x) >> void >> public void(생략) 클래스 이름 >> public 클래스 이름(){} 

4. why 왜 쓸까 : [생성되는 객체]마다 [강제적으로] member field 값을 [초기화] 할 수 있다

class Car {String color;}
>> 설계도를 만들었어 자동차의 색상은 니가 만들 때 알아서 해 

A) 저 무조건 파란색 차 만들거예요 ...  그러니 처음부터 파란색으로 설계해 주세요
class Car {String color="blue"}

B) 저는 차 색상은 제가 알아서 설정할게요
class Car{String color;}
Car car = new Car();
car.color="gold";
문제)
자동차를 색상을 설정하지 않고 출고 ...
null 이란 색상 (없는 색상)

>>> 차량을 만들떄 무조건 새ㅔㄱ상을 입력하게 할 수 있는 방법 ...
>>> 함수... , {  }  (강제성이 없거나 또는 입력값을 강제하지 못해요)

5. 생성자 함수 (... overloading기법 적용 가능)

6. 생성자 오버로딩을 통해서 다양한 강제사랑 구현할 수 있어야 함

****************생성자를 쓰는 가장 중요한 목적은 강제적 member field 초기화***********

 */
//만약에 폰 꺼지면? 어떡해야되냐 그럴떄 쓰려고 있는게 명부아니냐, 폰꺼졌는데 사진은 어떻게 찍나
//남아서까지 공부하고 있었고 남은사람들도 봤다 불합리한거 아니냐

class Car1{
	String carname="포니";
	//당신이 만약 Car 설계도를 만들때...
	//컴파일러가 알아서 함수를 생성 ....
	//생성자 함수
	//public Car(){} 자동으로 생산 .... 
	
	//개발자가 직접 구현한다면 
	public Car1() {  //자동 호출
		System.out.println("기본생성자 호출^^");
		carname = "내마음";
	}
}

class Car4{
	String carname;
	//생략되어 있다
	//public Car4(){}생성자 생략
}

class Car2{
	String carname;  //null문자
	public Car2() {  //default constructor 초기화
		carname="포니";
	}
}

class Car3 {  //설계자의 의도 : 너 기본 자동차 이름 생산 ,,,,  자동차 이름 넣어서 생성해도 돼 
	String carname;
	public Car3() {
		carname="기본이름";
	}
	//overloading통해서
	public Car3(String name) {  // 오전 POINT
		carname = name;
	}
}

//자동차의 이름은 무조건 자동차가 만들어 질 떄 사용하게 해.... 설계도

class Car5 {  //설계자의 의도 : 너 기본 자동차 이름 생산 ,,,,  자동차 이름 넣어서 생성해도 돼 
	String carname;
	//overloading통해서
	public Car5(String name) {  // 오전 POINT
		carname = name;
	}
}
//위 코드는 public Car5(){} 구현하지 않았어요 ... 구현하지 않아도 컴파일러가 자동생산 한다면서요
//예외적으로 개발자가 오버로딩 된 생성자를 한개라도 만든다면 컴파일러는 자동으로 default 생성자를 만들지 않아요



public class Ex15_Constructor {

	public static void main(String[] args) {
		Car1 car = new Car1();  //new Car() 괄호가 함수의 괄호  //default constructor
		System.out.println(car.carname);
		
		
		Car3 car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("mycar");
		System.out.println(car4.carname);

	}

}
