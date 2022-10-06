package kr.or.kosa;
/*
��Ģ : ��ü�� ���鶧 �����ڴ� 1���� ȣ�� ����(new Car() or new Car(10)...)

this(��ü�� ����Ű�� this) : �������� �����ڸ� ȣ�� ����

�ڵ差�� ����
 */
/*
class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //default ������
		
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
Zcar2 = ���� �ڵ��������� ��������� �ֽ��ϴ�
�ڵ����� �÷� ���Ÿ�� ���� �����Ҽ� �ְ� 
�ɼ��� �������� �⺻�� ��, �ɼ�1) �÷��� ���� �����ϰ� ���Ÿ���� �⺻, �ɼ�2) �÷� ���� ���Ÿ���� ��� ������ �� �ִ� �ɼ�
���� ������ �� �ֽ��ϴ�
*/
class Zcar2 {
	String color;
	String geartype;
	int door;
	
	Zcar2(){  //�⺻�ɼ� (red,1,auto)
		this("red",1,"auto");
		System.out.println("default");
	}
	
	Zcar2(String color, int door){  //�ɼ�1 color, door ���� (geartype = auto)
		this(color,door,"auto");
		System.out.println("overloading param 2��");
	}
	Zcar2(String color, int door, String geartype){  //�ɼ�2 color, door, geartype)
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading param 3��");
	}
}


class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){ //default ������ --- �⺻��
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
