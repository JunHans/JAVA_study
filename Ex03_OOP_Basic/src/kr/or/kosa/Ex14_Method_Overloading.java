package kr.or.kosa;

class Human2{
	String name;
	int age;
}

class Test2{
	Human2 add(Human2 h) {  //Ŭ�����̸��� �������������� ��� new�Ⱦ��� �̷��� ������ � ���̴�...??�Ф�
		//���� �ڵ�� ������ ����
		h.name = "�ƹ���";
		h.age = 200;
		return h;
		//return null;  //Human2�� �ּҸ� ������ ���� �ʾƿ�
	}
	Human2 add(Human2 h , Human2 h2) {
		h2.name = h.name;
		h2.age = h2.age;
		return h2;
	}
	
}

public class Ex14_Method_Overloading {

	public static void main(String[] args) {                                                     
		Test2 t = new Test2();
		
		Human2 man = new Human2();  //man 0x123 �ּ�
		
		Human2 man2 = t.add(man); //man2 0x123 �ּ�   
		System.out.println(man == man2);  //true

	}

}
