/*
user 사용자 <> provider 제공자

class A{}
class B{}
둘의 관계: A는 B를 사용합니다

1. 상속 : A extends B
2. 포함 : A라는 클래스가 멤버필드로 B를 사용  class A {B b;}
   2.1 부분적 포함
   2.2 전체 
   
public class B{}
public class A{
	public int i; 멤버필드 인스턴스베리어블
	public B b;  //A는 B를 사용합니다 (포함)
	public A(){
		b = new B();  //생성자를 통해서 초기화
	}
} 
>> main 함수
A a = new A();  //B도 같이 메모리에 생성됨
a.b.자원;
 
 >> 포함관계로 사용시 
 >> B는 독자생성 불가능 >> A라는 객체가 만들어져야 B도 같이 생성됨
 >> A a = new A(); 해야만 B객체 생성됨
 >> A , B 같은 운명 공동체다 (전체집합 관계)
 >> 자동차와 엔진 , 노트북과 CPU <-> 노트북과 마우스(뺐다 꼈다)
 --------------------------------------------------------
public class B{}
public class A{
	public int i;
	public B b;  //A는 B를 사용합니다
	public A(){  }
	
	//method
	void m(B b){  //파라미터 안을 저렇게 명확하게 넣어버리면 안좋다 > 제한적임
		this.b = b;
	}
}
main 함수 영역
>> A a = new A();
>> B b = new B();
>> a.m()b;
>> 같은 운명이 아니다  (부분집합 관계)
>> 학교(A)와 학생(B) , 노트북과 마우스  (부분집합 관계)
  
  
class A{}
class B{}
둘의 관계: A는 B를 사용합니다
        

A는 B를 참조합니다  (포함관계)
B를 멤버필드로 사용

 */
interface Icall{
	void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D가 Icall 인터페이스의 m() 재정의");
	}
}
class F implements Icall{

	@Override
	public void m() {
		System.out.println("F가 Icall 인터페이스의 m() 재정의");
	}
}
//현대적인 프로그래밍 방식은 interface가 대세!  >>  유연성이란게 필요  >>  대충 만들어도 대충 들어맞으면 된다 (느슨한 코드) 
// >> 느슨하게 ... >> interface를 디커플링하게

class C{
	void method(Icall ic) {  //Icall 을 구현하는 모든 객체의 주소가 올 수 있다
		ic.m();
	}
	
	/*
	 확장성 변환 무시 ....
	 void method(D d){}
	 void m(F f){}
	 */
}

public class Ex16_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();  //mplements Icall 했기 때문에
		F f = new F();  //mplements Icall 했기때문에
		
		c.method(d);
		c.method(f);
	}

}
