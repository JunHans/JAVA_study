package kr.or.kosa;
/*
 static member field : 객체간 공유자원
 static method : why : 첫날 첫시간에 했던 코드에 힌트가... 
  1.객체 생성 없이 ....
  2.많이 사용해요
  3.설계도를 만들때 고려해요(당신이 그 자원을 (기능) 많이 사용한다면)
  4.[자원 많이 쓰네] -> [너 편하게 쓰게 해줄게] .. new 객체 쓰기 불편하지? -> 편하게 써  >>> static 설계
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//일반함수
		//new통해서 heap > 사용
		//1. iv 제어가능
		//2. 일반함수가 스태틱 자원쓸수있나? - > 먼저메모리에 올라가있으면 무조건 쓸수 있다
		cv = 100;
		//why :static자원은 객체 생성이전에 memory에 올라가 있음)
	}
	static void print() {
		//static 함수
		//1. cv 제어가능
		//2. static자원은 일반변수 iv제어가능할까? 안될까? 
		// iv = 1000; 불가 (static자원은 일반자원보다 우선한다 , 먼저 나가있기 때문에 스태틱이 먼저나가있을 때 일반 자원은 없다)
		
		//결과: static은 static자원만 가지고 놀아요
		cv = 10000000;
	}
}

public class Ex10_Static_method {

	public static void main(String[] args) {
		StaticClass.print();  //new 없이 함수 사용 ...
		
		System.out.println(StaticClass.cv);
		
		//일반자원을 하려면(객체 생성)
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print();
		
	}

}
