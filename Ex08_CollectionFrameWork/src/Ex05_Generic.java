import java.awt.desktop.AppEvent;
import java.util.ArrayList;

/*
Today Point
Generic jdk 1.5 

C# , java(필수기능) 

Why)
Collection 타입의 클래스 >> 데이터 기본 저장 공간 탕비 : Object 
장점 : Object 어떤값을 넣어도 소화 (String , int , Emp...)
단점 : 큰타입에 대한 문제 , 원하는 데이터 타입으로 변경해야하는(다운캐스팅)을 통한 과정이 상당히 번거로움 - 불편

1. 그럼 타입을 처음부터 강제하면 되지 않아?
2. 타입 안정성 확보(타입 강제)
3. 강제 형변환 필요 없어짐 : (Car)Object (필요없다)

제너릭 적용을 위해서는 설계도부터 적용되야 함

 */

class MyGen<T>{  //T >> type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class Person {
	int age = 100;
}

public class Ex05_Generic {
	public static void main(String[] args) {
		
		MyGen<String> mg = new MyGen<String>();
		mg.add("문자열 데이터만");
		String str = mg.get();
		System.out.println("문자열 데이터 : "+ str);
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("홍길동");
		list.add(new Person());
		
		//list 값을 출력하세요
		//Person 객체는 나이를 출력하고 나머지는 값을 출력하세요
		//개선된 for문
		System.out.println(list.toString());
		
		for(Object a : list) {   //이렇게까지 해야되는데 아주아주 불편함
			//System.out.println(a);
			if(a instanceof Person) {
				Person p = (Person) a;  //DownCasting
				System.out.println(p.age);
			}else {
				System.out.println(a);
			}
		}
		
		//Generic 타입을 강제 : 다 먹지는 못하지만 (한 종류만 먹음) >> 
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person p : plist) {  //장점 : 타입을 알고 있다 (강제)
			System.out.println(p.age);
		}
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("문자열");
		
		
		
		
		
		

	}

}
