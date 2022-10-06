package kr.or.kosa;

/*
 �Լ����� parameter ���� ����, �ּ� ����
 void m(int x) {}  x������ ���� �޴���
 int y = 200;
 ȣ�� m(y);
 y = 1000; ���� ...
 
 call by value  ������
 
 -----------------------------------------------
 void m2(Car) {c,color= "red";}  >>>c������ �ּ� ���� �޴´�
 
 Car c2 = new Car();
 ȣ�� m2(c2);  //���� Ÿ���� �ּҰ��� �����Ѵ� (Today Point)
 
 call by ref �ּҰ�����
 
 */


class Data{
	int i;
}

public class ex12_Method_Call {
	static void scall(Data sdata) {  //default static
		System.out.println("�Լ�: " + sdata.i);
		sdata.i = 111;  //OxA���� i���� 111�� 
		
	}
	
	static void vcall(int x) {  //default static
		System.out.println("before x :"+ x);
		x = 8888;
		System.out.println("after x :"+x);
	}

	public static void main(String[] args) {
		Data d = new Data(); //d�� �ּҰ� OxA ...
		d.i = 100;
		System.out.println("d.i:" + d.i);
		
		//scall(d); //�ּҰ� ���� (OxA����)
		
		//System.out.println("after d.i : "+ d.i);  //111
		////////////////////////////////////////////////////
		
		vcall(d.i);; //���� ����
		System.out.println("d.i:"+d.i);  //������ 100 ���� ������� �ʾƿ�

	}

}
