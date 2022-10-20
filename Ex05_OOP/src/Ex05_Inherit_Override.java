import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}
class Test3 extends Test2{
	int x= 300;  //부모 무시하기  //이런방식은 쓰지 마세요 굳이 아래에서 바꿀 필요없음  안쓰면 내거도 쓰고 부모것도 쓸수 있는데 이러면 내거밖에 못씀
	
	//재정의 (검증)
	@Override
	void print() {
		System.out.println("자식이 부모의 함수를 재정의"); //재정의
	}
	
	void print(String str) {  // 이건 overloading
		System.out.println("나는 오버로딩 함수야");
	}
}

public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);  //자식 것이 나옴
		
		t3.print();
		t3.print("나는 오버로딩");
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp);             //kr.or.kosa.Emp@cac736f  ->  Emp [enpno=1000, ename=홍길동] toString을 재정의해서
		System.out.println(emp.toString());  //kr.or.kosa.Emp@cac736f  ->  Emp [enpno=1000, ename=홍길동]
		
		//emp 출력하면 사실은 암묵적으로 emp.toString하는 것과 같음
		//toStrng()은 Object의 자원 .... 주소값 return
		
		//toString을 재정의 했다면 결과는 재정의 된 내용 출력
		//Emp [enpno=1000, ename=홍길동]
		//Emp [enpno=1000, ename=홍길동]
		
		//주로 자바 API가 제공하는 수많은 클래스가 Object 클래스의 toString()을 재정의 하고 있다

	}

}
