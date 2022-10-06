package kr.or.kosa;
/*
원칙 : 객체를 만들때 생성자는 1개만 호출 가능(new Car() or new Car(10)...)

this(객체를 가리키는 this) : 여러개의 생성자를 호출 가능

코드량도 감소
 */
/*
class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //default 생성자
		
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	void print() {
		System.out.println(this.color+"," +this.geartype+","+this.door);
	}
	
}
*/
/*
Zcar2 = 저희 자동차매장은 차를만들수 있습니다
자동차는 컬러 기어타입 문을 선택할수 있고 
옵션은 세가지로 기본옵 션, 옵션1) 컬러와 도어 선택하고 기어타입은 기본, 옵션2) 컬러 도어 기어타입을 모두 선택할 수 있는 옵션
으로 선택할 수 있습니다
*/
class Zcar2 {
	String color;
	String geartype;
	int door;
	
	Zcar2(){  //기본옵션 (red,1,auto)
		this("red",1,"auto");
		System.out.println("default");
	}
	
	Zcar2(String color, int door){  //옵션1 color, door 변경 (geartype = auto)
		this(color,door,"auto");
		System.out.println("overloading param 2개");
	}
	Zcar2(String color, int door, String geartype){  //옵션2 color, door, geartype)
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading param 3개");
	}
}


class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //default 생성자 --- 기본값
		this("red", "auto",2);
//		this.color = "red";
//		this.geartype= "auto";
//		this.door=2;
		System.out.println("default ...");
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("over loading ...");
	}
	void print() {
		System.out.println(this.color+"," +this.geartype+","+this.door);
	}
	
}


public class Ex20_this {

	public static void main(String[] args) {
		
		Zcar zcar = new Zcar();
		//Zcar zcar2 = new Zcar(null, null, 0);
		zcar.print();
		
//		Zcar zcar2 = new Zcar("blue", "auto", 3);
//		zcar2.print();
	}

}
