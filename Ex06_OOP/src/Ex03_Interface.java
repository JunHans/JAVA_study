/*
추상 클래스 와 인터페이스

추상클래스와 인터페이스의 공통점
1. 스스로 객체 생성이 불가능 하다 (new 연산자 사용 불가)
1.1 두놈의 차이점 : 추상클래스(완성 + 미완성) , 인터페이스(모든 것이 미완성) 

2. 사용
추상클래스 extends
인터페이스 implements

class Car extends Abclass{} ;
class Car implements Ia() ; 
둘 다 추상자원을  갖고 있다  >>  extends , implements  >>  강제적 구현 목적(재정의) 

추상클래스와 인터페이스의 다른점
3. 추상클래스 (완성된 코드 일부 갖고 있다) 그러나 인터페이스는 전체가 미완성임
3.1 원칙적으로 클래스는 다중 상속(계층적 상속) 그러나 인터페이스는 유일하게 >> 다중구현이 가능하다 >> 작은 단위로
>> 여러개를 만들어서   >> 그것들을 모아모아서 큰 약속 >>  너무 큰 약속을 만들면 사용성이 떨어짐
Ia , Ib , Ic
class Test entends Object implements Ia, Ib, Ic
Tip) 인터페이스와 인터페이스끼리는 상속이 가능하다(extends) >>  약속을 크게 만들 수 있다

4. 인터페이스 (상수를 제외한 나머지는 미완성(추상))  >>  JDK8(Default 값 , static 값)

 
인터페이스 : 약속, 표준을 만드는 것 (규칙과 규약)
소프트웨어 설계 최상위 단계 ... 
초급 개발자가 인터페이스를 설계할 일은 많지 않다...
초급 개발자는 만들어진 인터페이스를 사용하는 방법과 처리하는데에 초점을 맞춤
구현부를 가지지 않는다  ..  약속에 대한 정의만  ..  

초급개발자의 시선으로
1. 인터페이스를 [[[[ 다형성 ]]]] 입장으로 접근 (인터페이스는 부모 타입) ************
2. 서로 연관성이 없는 클래스를 하나의 묶어주는 기능 한다(같은 부모를 가지게 함으로써)
3. Java API 수 많은 (미리 만들어진) 인터페이스를 제공(설계하지 않아도 ) 사용가능
4. 인터페이스 (~able) : 날수있는 , 수리할 수 있는
5. 객체간 연결고리 (객체간 소통)  >> [[[ 다형성 ]]]
**설계표준 >> 구현 >> 재정의


interface
1. 실제 구현브를 가지고 있지 않다 : 실행블럭이 없다 : 규칙(약속)을 만드는 행위
 시스템에서 이동하는 것을 move라는 이름을 사용하고 이동시에는 좌표값을 받아야 한다
 >> 합의 >> void move(int x, int y); {구현은 알아서} 클래스가 알아서...  >> 재정의 >> 구현
 java API 인터페이스 설계하고 구현하는 클래스 이미 다 생성 
 >> Collection(동적배열)  >>  Vector , [[[ArrayList]]] , HashSet, [[[HashMap]]]
 Collection 클래스는 수많은 인터페이스를 구현하고 있는 클래스  

2. 생성방법 
2.1 상수(final)     :  [public static final] VERSION=1;  >>  int VERSION=1;     -- <메모리에 올라가서 딱 안바뀌고 버티고 있는 놈>
                     생략 하면 컴파일러가 알아서 [public static final] 붙여줍니다
2.2 추상 함수(method) : [public abstract] void run();  >>  void run();
                     생략 하면 컴파일러가 알아서 [public abstract] 붙여줍니다
                     
interface Aa{
	int VERSION=1;  //[public static final]
	void run();    //[public abstract]
	String move(int x , int y);
}

종류 
interface Aable{}  //아무 자원을 가지지 않아도 됨  이걸 연관성없는 클래스들의 부모로 주고 묶음
interface Aable{int num=10;}
interface Aable{void run();}


class Test extends Objext implements Ia, Ib, Ic {}
class Test implements Ia, Ib, Ic


 */

interface Ia{
	int AGE=100;  //상수                  // [ public static final ] int AGE
	String GENDER = "남";  //상수 - 대문자   // [ public static final ] String GENDER (원래는 이게 정상적 표현)
	String print();  //추상함수            //  [ public abstract ] String print();
	void messege(String str);  //추상함수  //  [ public abstract ] void messege(String str);
}

interface Ib{
	int AGE =10;
	void info();
	String val(String s);
}


class Test2 extends Object implements Ia {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messege(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test3 extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messege(String str) {
		// TODO Auto-generated method stub
		
	}  //다중 구현
	
}

public class Ex03_Interface {
	public static void main(String[] args) {

		Test2 t2 = new Test2();
		///////////////////////////////////////////////////////////////////////
		Ia ia = t2;  //Ia 인터페이스는 Test2의 부모 = 부모는 자식객체의 주소를 가질 수 있다 = 다형성
		///////////////////////////////////////////////////////////////////////
		
		ia.messege("재정의");  //재정의된 자원(자식 함수) 호출
		System.out.println(ia.GENDER);
		
		///////////////////////////////////////////////////////////////////////
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ib2.AGE);
		
		

	}

}
