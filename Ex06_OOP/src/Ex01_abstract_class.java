/*
추상 클래스 
>> 미완성 클래스(미완성 설계도)
1. 완성된 코드 + 미완성된 코드 
2. 완성된 (함수) = 실행블럭이 있는 함수 + 미완성 (함수) = 실행블럭이 없는 함수 >> public void run();
원래 함수 = public void run(){}
3. 완성된 클래스 (new 가능)  -  미완성 클래스 (스스로 객체 생성 불가)

설계자 입장에서 
>> 의도? 미완성을 왜만들까? >>  반드시 재정의해라  >>  강제적 구현을 목적으로 (믿지 못하니까) 개발자들이 서로를 믿지 못함


 */
class Car{
	void run() {}  //구문이 없어도  : 실행블럭만 있으면 완성된 코드
}
class Hcar extends Car{
	//믿음
	@Override
	void run() { System.out.println("재정의");}
}
//Car만든사람이 run()을 재정의해서 내용을 바꾸어라	
//그러나 강제가 없어요 Hcar만드는 사람이 의무사항이 아님
//위 코드는 강제성이 없다

abstract class Abclass{  //클래스 안에 최소 1개 이상의 추상함수를 가진 클래스
	//완성된 코드
	int position;
	void run() {
		position++;
	}
	
	//미완성 코드 추가 (추상함수 : 미완성 함수)
	abstract void stop();  //실행블럭 X  >> 재정의 강제(Override 강제)
}

class Child extends Abclass{

	@Override
	void stop() {  //실행블럭을 만들면 구현한 것(강제적)
		this.position = 0;
		System.out.println("stop:"+this.position);
	}
	
}
	
	
public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();

//		Child2 ch2 = new Child2();
//		ch2.stop();
		//////////////////////////////////////////////////////
		Abclass ab = ch;  //다형성 
		//상속관계에서 부모타입의 참조변수가 자식타입 객체들의 주소 받을 수 있다 = '다형성'
		//단, 부모는 자신의 것만 볼 수 있다
		//단, 재정의 된 것은 볼 수 있다
		ab.run();   //부모 자기꺼만 사용 가능
		ab.stop();  //자식함수를 호출(구현) ... 재정의 되어서 사용가능 미완성함수라 부모자기껀 쓰지도 못함
	}

}
