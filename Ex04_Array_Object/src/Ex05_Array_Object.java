//클래스 === 타입 === 설계도

// 이번꺼 아주 중요~~~~~!

class Person {
	String name;
	int age;

	// 사람이 만들어질 떄 반드시 이름과 나이를 가지게 하려면 -> 생성자 생성
	// Person(String name, int age){this.name = name; this.age = age;}
	void print() {
		System.out.println(this.name + "." + this.age);
	}
}

public class Ex05_Array_Object {

	public static void main(String[] args) {
		int[] intarr = new int[10]; // 값타입 배열 (8가지) + String
		boolean[] booarr = new boolean[5]; // 값타입 배열 (5개의 방에 false가 들어있다)

		Person p = new Person(); // 참조변수 (p 라는 변수는 주소값)
		p.name = "임준한";
		p.age = 29;
		p.print();
		// 사람 3명 만들어라
		// Person p1 = new Person();
		// Person p2 = new Person();
		// Person p3 = new Person(); 어 같은 타입 변수가 여러개 있네? 하나로 묶어야지
		// int[] intarr = new int[10];
		Person[] persons = new Person[3];
		System.out.println("persons : " + persons);
		System.out.println("persons[0]" + persons[0]); // 각각의 방은 null이란 디폴트값을 갖는다
		// 객체배열은 방을 만들고 방에 객체를 넣어두는 작업을 해야한다
		// persons[0] person객체의 주소를 가진다
		persons[0] = new Person();
		Person p2 = new Person();
		persons[1] = p2;
		persons[2] = new Person();
		System.out.println("persons[0] :" + persons[0]);
		System.out.println("persons[1] :" + persons[1]);
		System.out.println("persons[2] :" + persons[2]);

		persons[0].name = "임준한";
		persons[0].age = 29;
		// 객체배열은 방을 만드는 것과 방을 채우는 작업은 별도다 *****
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name);
		}

		// 객체 배열 3가지 방법으로 만들기
		// 1. int[] arr = new int[10];
		Person[] parray = new Person[10]; // 방만 생성 new person 10개 생성
		for (int i = 0; i < parray.length; i++) {
			parray[i] = new Person();
			System.out.println("주소값 : " + parray[i]);
		}
		// 2. int[] arr = new int[]{10,20,30};
		Person[] parray2 = new Person[] { new Person(), new Person(), new Person() }; // 주소를 만들어서 넣어주면 된다

		// 3. int[] arr = {10,20,30};
		Person[] parray3 = { new Person(), new Person(), new Person() };
		
	}

}
