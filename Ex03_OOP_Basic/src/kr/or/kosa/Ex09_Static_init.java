package kr.or.kosa;

//static 변수는 객체마다 같은 값을 가지게 할거야를 목적으로 설계
//instance 변수는 객체마다 다른 값을 가지게 할거야를 목적으로 설계

//위 두변수에 대해서 초기화를 하는 방법

class InitTest {
	static int cv = 10;
	static int cv2;
	int iv = 9;

	// 3놈은 사실 디폴트 값은 초기화를 하지 않아도 되요
	
	static{
		//static 자원에 초기화 블럭
		//언제 실행 : static int cv = 10; , static int cv2; 이 두녀석이 올라가고 난 직후 실행됨
		cv = 1111;
		cv2 = cv + 2222; //조작된 값의 표현이 가능 
	}
	

	{
		// 초기자 블럭(member field 초기화)
		// 객체가 생성되고 나서 int iv가 메모리에 올라가고 나서 바로 호출됨{블럭}
		// 인위적인 코드가 가능 if(iv> 10) iv = 100;
		System.out.println("초기자 블럭");
		// iv = 2222;
		if (iv > 10) iv = 1000;
		
		cv = 100;  //초기화  >> 객체가 new가 되지 않으면 ... 초기화가 실행안되요 Static에 대해서, 스태틱은 제일먼저올라가고 new 가 실행되어야
	}
}

public class Ex09_Static_init {

	public static void main(String[] args) {
		//InitTest t = new InitTest();
		//System.out.println(t.iv);
		
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
								// static이 올라가고 바로 직후 ,static초기자블럭이 실행되고 디폴트 값이 조작된 값으로 바뀐다
								// static초기자블럭은 꽤 쓰이고 그냥 초기자 블럭은 별로 안쓰인다 (더 많이 쓰이는 같은기능을 하는 게 있어서)
	}

}
