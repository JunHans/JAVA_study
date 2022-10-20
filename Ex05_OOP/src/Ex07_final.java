/*
변수 <-> 상수
상수 : 한번 값이 [초기화]되면 변경불가
상수자원 : 고유값 (주민번호 , 수학의 파이PI , 시스템번호(버전번호) )
상수는 관용적으로 대[문자]

java : final int NUM = 10;
C# : const integer NUM = 10;

final 키워드 
1. final class Car {} > 클래스 앞에 final이 붙으면 > 상속금지 (마지막 클래스)
public final class Math

2. public final void print(){} >> 함수앞에 final 붙으면 > 상속관계에서 재정의 금지 (Override 금지)

 */

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI); //값을 못바꾸는 PI
	}
}

class Vcard2{  //설계자 입장에서 이렇게 만들었다는 것은 ..만든 카드마다 다른 상수값을 가지게 하겠다
	final String KIND;
	final int NUM;
	
	//Vcard2(){}
	
	Vcard2(String kind , int num){  // 너 초기화하려고 이코드 썻구나?
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
}


public class Ex07_final {

	public static void main(String[] args) {
		Vcard vc = new Vcard();
		//vc.KIND = "aaa";  //The final field Vcard.KIND cannot be assigned = 변경불가
		System.out.println(vc.KIND);
		vc.method();
		
		
		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade",2);
		System.out.println(v1.toString());
		
		Vcard2 v3 = new Vcard2("spade",3);
		System.out.println(v1.toString());
		
		//v3.KIND = "aaa";
	}

}
