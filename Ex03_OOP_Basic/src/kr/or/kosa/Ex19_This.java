package kr.or.kosa;

/*
this (�̰�)
1. ��ü �ڽ��� ����Ű�� this(������ ������ ��ü�� �ּҸ� ���� ���̶�� ����)
�ν��Ͻ� �ڽ��� ����Ű�� ��������. �ν��Ͻ��� �ּҰ� ����Ǿ�����
((( ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� ���� )))

2. this ��ü �ڽ��� �ּ�(������ ȣ��) >> [��Ģ�����δ� �����ڴ� ��ü������] [�Ѱ��� ȣ��]
�׷��� this �н��ϸ� ���������� this() ���ؼ� �������� �����ڸ� ȣ���� �� �ִ�

 */

class Test{
	int i;
	int j;
	Test() { //������
	}
	Test(int i, int j){
		this.i = i; // Teat �� i = i
		this.j = j;
	}
}


class Book2{
	String bookname;
	
	Book2(String bookname){
		this.bookname = bookname;  //�� bookname�� Book2�� ��
	}
}



//Today Point
class Socar{
	String color;
	String geartype;
	int door;
	
	Socar(){  //�⺻����
		this.color = "red";//member field(instance variable)���� �ݵ�� this Ȱ��
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
