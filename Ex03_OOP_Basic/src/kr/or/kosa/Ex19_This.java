package kr.or.kosa;

/*
this (이것)
1. 객체 자신을 가리키는 this(앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음
((( 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재 )))

2. this 객체 자신의 주소(생성자 호출) >> [원칙적으로는 생성자는 객체생성시] [한개만 호출]
그런데 this 학습하면 예외적으로 this() 통해서 여러개의 생성자를 호출할 수 있다

 */

class Test{
	int i;
	int j;
	Test() { //생성자
	}
	Test(int i, int j){
		this.i = i; // Teat 의 i = i
		this.j = j;
	}
}


class Book2{
	String bookname;
	
	Book2(String bookname){
		this.bookname = bookname;  //이 bookname은 Book2의 것
	}
}



//Today Point
class Socar{
	String color;
	String geartype;
	int door;
	
	Socar(){  //기본설정
		this.color = "red";//member field(instance variable)사용시 반드시 this 활용
		this.geartype = "auto";
		this.door = 2;
	}
	
	Socar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + " , " + this.geartype+" , " + this.door);	
	}
}



public class Ex19_This {

	public static void main(String[] args) {
		Test t = new Test(100, 200);
		System.out.println(t.i);
		
		Socar socar = new Socar();
		socar.print();
		
		Socar socar2 = new Socar("gold", "auto", 6);
		socar2.print();

	}

}
