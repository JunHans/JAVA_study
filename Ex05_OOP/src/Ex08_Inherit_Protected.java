import kr.or.kosa.Pclass;

/*
상속관계에서 접근자 : protected

public
private
default  (같은 폴더(패키지))
protected

protected : 양면성(바퀴) >> 어떨 떈 default, 어떨 땐 public
>> 상속이 없는 클래스 안에서 protected는 >> default와 동일
>> 결국 상속관계에서만 의미를 가짐 >> public
 */
class Dclass{
	public int i; //클래스가 디폴트라서 변수에 퍼블릭 의미 없음
	private int p;
	int s;  //default
	protected int k;  //default (왜? 안써도 어차피 디폴트라 안써요)
}


class Child2 extends Pclass{  //상속관계
	void method() {
		this.k = 100; //상속관계 >> 자식은 부모의 protectd 자원을 public 처럼 사용
		System.out.println(this.k);
	}
}


public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k  >>   객체를 만들어 사용하면 디폴트랑 똑같다
		Child2 ch = new Child2();
		ch.method();

	}

}
