/*
다형성(상속관계에서 존재) 
디형성 : 여러가지 성질(형태) 가질수 있는 능력 

C#: 다형성 (overloading, override)
java: [상속솬계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질수 있다 
>> [하나의 참조변수] == [부모타입]
>>[여러개의 타입] == 부모를 상속받은 자식타입들


다형성 : 현실세계 >> 부모는 자식에게 모든것을 준다 
	   프로그램 세계 >> 자식이 부모에게 조건없이 드린다 
 */

class Tv2 { // 부모(분모 : 공통사항 >> 일반화, 추상화)
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CapTv만의 특수화되고 구체화 되고 고유한 정보를 만들어야 함

	String text;

	String captionText() {
		return this.text = "현재 자막 처리중...";
	}
}

	public class Ex10_inherit_Poly {

		public static void main(String[] args) {

			CapTv ct = new CapTv();
			ct.power();
			ct.chUp();
			System.out.println(ct.captionText());
			
			
			//////////////////////////////////////////
			Tv2 tv2 = ct;
			//[상속관계]에서 [부모타입]은 [자식타입]의 주소를 가질 수 있다.
			//단, 부모는 [ 자신의 자원만 접근 ] 가능하다
			//단, 재정의는 제외함
			
			
			System.out.println(ct.toString());  //CapTv@5e91993f
			System.out.println(tv2.toString()); //CapTv@5e91993f  같은 주소값

			//tv2.captionText()  //자식자원은 접근 불가!(부모타입의 자원만 접근)
			                     //단, 재정의는 제외하고 
			
			
			
		}

	}

