package kr.or.kosa;

/*
OOP 객체 지향 프로그래밍  (여러개의 조각들(설계도)을 만들어서 조합하는 행위)
>>> 여러개의 설계도를 재사용하는 방법
1. 상속 (재사용성)
2. 캡슐화 (은닉화) : private ... setter , getter (직접 할덩을 막고 간접할당을 통해서 데이터 보내겠다)
3. 다형성 : 하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것


>>>method overloading(오버로딩)
1. 하나의 이름으로 여러가지 기능을 하는 함수
System.out.println() >>> println()함수 이름은 한개... 사용방법은 여러개
1. 오버로딩은 성능 향상? -> 무관하다 
2. 편하게 사용하라고 ... 설계짜가 개발자를 배려 ...(개발자)
3. 오버로딩을 사용하지 않아도 문제되지 않는다 ... 단지 개발자가 좀 불편할 뿐

문법) 함수 이름은 같고 parameter [개수]와 [타입]을 다르게 하면 오버로딩이라 한다
1. 함수이름은 동일
2. prameter 갯수 또는 타입은 달라야 한다
3. return 타입은 오버로딩의 판단기준이 아니다
4. parameter 의 순서가 다름을 인정(주의)
 */

class Human {
	String name;
	int age;
}

class OverTest { // 클래스 설계
	int add(int i) {
		return 100 + i;
	}
	// int add(int s) { 이름 충돌

	// }
	int add(int i, int j) {
		System.out.println("오버로딩 : " + i + "," + j);
		return i + j;
	}

	String add(String s) {
		System.out.println("오버로딩 : " + s);
		return "Hello" + s;
	}

	String add(String s, int i) {
		return "오버로딩";
	}

	String add(int i, String s) { // 순서가 다른걸 인정해서 컴퓨터는 오버로딩으로 인정함
		return "";
	}
	
	void add(Human human) {  // 이것도 오버로딩 인정  //Human 타입의 객체 주소가 들어와야 한다
		human.name = "홍길동";
		human.age = 100;
		System.out.println(human.name+ "," + human.age);
	}
}

public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("A"); // 자동으로 파라메터가 String 녀석을 호출
		System.out.println('a'); // 자동으로 파라메터가 char 녀석 호출
		
		//System. 설계더
		//memory System sys = new System();

		System.out.
		/*
		 * System.out.println(); System.out.printlnStrig("A"); System.out.println('a');
		 * 당신은 함수를 다 암기해서 사용해야하는 거 아니냐 ... 이름이 다 틀리니까
		 */

		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200, 300);
		System.out.println(result);

	}

}
