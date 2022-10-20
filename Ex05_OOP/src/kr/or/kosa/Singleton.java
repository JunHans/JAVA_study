package kr.or.kosa;
//디자인 패턴 (생성 패턴) >>> new 를 통해 작업

//싱글톤 ...( 객체 하나를 만들어서 공유하겠다 )
//의도 : 하나의 객체를 공유하는 보장성 코드 ....

//공유IP
//공유프린터
//이런걸 설계할때 쓰이는 방법




public class Singleton {
	private static Singleton p; //p라는 변수가 주소를 가지게 ... new 필요
	private Singleton() {
		//생성자에서 접근자 private .. 생성자함수 호출 못하니 객체생성 불가  new
	} 
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();  //같은 클래스 내부에서 public과 private은 동등
		}
		return p;
	}
	
}
/*
 Singleton s = new Singleton();  //디폴트생성자의 괄호
 */