package kr.or.kosa;


//새들의 공통사항(일반, 추상) : 새는 날 수 있다 , 새는 빠르다
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("flying");
	}
	
	//설계자 고민 : Bird [상속]하는 당신은 moveFast자원에 대해서 [재정의]를 했으면 좋겠어 -> protected
	protected void moveFast() {
		fly();
	}
}
