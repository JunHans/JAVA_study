package kr.or.kosa;

/*
�ڵ��� ������ �Դϴ�.
��������� ������ �ڵ����� �ȷ��� �մϴ�.
���� �ڵ����� �⺻ ����� �� �� �� �ְ� ....  �������� ���� �ɼ��� ���� �� �� �ֽ��ϴ�.

�ڵ����� �⺻��
���� ���� 4�� , �ڵ����� ���� �⺻�� red  4���� �⺻ �Դϴ�
�׷��� ����
���� ������ ���� �����ϰ�  �ڵ����� ���� �⺻�� red  ���� �� �� �ְ�
���� ������ �⺻���� �ϰ� �ڵ����� ���� ���� �����ϰ�
���� ������ �ڵ����� ���� ��� ���� �Ͽ� ���� ������ �� �ֽ��ϴ�

�ڵ��� ����

1. �⺻ ���  
2. �ɼ� : �� ���� , �ڵ����� ���� �⺻
3. �ɼ� : �ڵ����� ���� ���� , �� �⺻
4. �ɼ� : �ڵ����� ���� ���� , �� ����
*/

class Car9{
	public int door;
	public String color;
	
	public Car9() {  //default 
		this.door = 4;
		this.color = "red";
	}
	
	public Car9(int door) {  
		this.door=door;
		this.color="red";
	}
	
	public Car9(String color) {   
		this.door = 4;
		this.color = color;
	}
	public Car9(int door, String color) {   
		this.door=door;
		this.color=color;
	}
	public void carInfoPrint() {
		System.out.printf("door : %d, color: %s ����\n", door,color);
	}
}

public class Ex16_Constructor_Quiz {
	public static void main(String[] args) {
		//���� ���� �� ���� �Ǹ�
		//4���� �ɼ� ���� �Ǹ�
		Car9 car = new Car9();
		car.carInfoPrint();
		
		Car9 car1 = new Car9(10,"gold");
		car1.carInfoPrint();
		
		Car9 car2 = new Car9(9);
		car2.carInfoPrint();
		
		Car9 car3 = new Car9("blue");
		car3.carInfoPrint();
	}
	
	
}
