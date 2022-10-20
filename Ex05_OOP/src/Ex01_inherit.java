/*
OOP: 객체지향 프로그래밍의 특징
특징 1. 여러개의 조각들(클래스)을 조립해서 하나의 큰 제품을 만드는 행위
특징 2. 상속(여러개의 클래스들을 이어주는)
특징 3. 캡슐화 (은닉화) >> private
특징 4. 다형성 (상속관계에서 부모타입이 자식타입의 주소를 가질 수 있다)

상속
java : child extends Base (아버지의 자산을 물려받으면 최소한 아버지와 같거나 더 많을 것)
C# : child : Base 

상속의 특징
1. 다중상속이 불가능 (단일상속 (계층적 상속가능))
2. 단일상속(계층적 상속)가능 (여러개의 클래스를 상속)
3. 다중상속의 지원(interface)

상속
1. 진정한 의미? : 재사용성 
2. 단점 : 초기 설계비용이 많이 든다 (장기적으로 보면 비용 적게듬)
3. 재사용성을 높이려면 >> 설계할 떄  시간이 많이듬(여러 설계도 분할... 부모,자식 관계)

상속관계에서는 부모부터 메모리에 올라간다

GrandFather -> Father -> Child  < Heap 메모리에는 객체3개>
 */

//사용자가(개발자) 만드는 모든 클래스는 default로 Object라는 클래스를 상속
// class Car extends Object 라고 해석
//Object란 클래스는 모든 클래스의 root(최상위) : 모든 클래스의 부모

class Car{  // extends Object
	
}

class GrandFather extends Object{  //맨위에있는 그랜드파더만 Object상속받는다
	public int gmoney = 5000;
    private int pmoney = 10000;  //내꺼야 : 상속관계에서도 private는 상속받지 못한다 : 간접적으로 public함수 통해서 쓸수는있음 (클래스 내부에선 private, public 동등하다)
	public GrandFather() {
		System.out.println("그랜드파더");
	}
}

class Father extends GrandFather {  //파더는 그랜드파더를 상속받는다
	public int fmoney = 53000;

	public Father() {
		System.out.println("파더");
}
}

class Child extends Father {  //차일드는 파더를 상속받는다
	public int cmoney = 1000;

	public Child() {
		System.out.println("차일드");
	}
}

public class Ex01_inherit {

	public static void main(String[] args) {
		Child child = new Child();  //Heap메모리에 객체 3개 만들어진다 GrandFather -> Father -> Child
		                            //실질적으로는 사실 Object까지 4개가 올라감
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);

		Car car = new Car();
		
	}

}
