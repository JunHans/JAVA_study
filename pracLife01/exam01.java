package pracLife01;


//class Student{
//	
//}

public class exam01 {}
//
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		System.out.println("s1 ������ Student ��ü�� �����մϴ�");
//		
//		Student s2 = new Student();
//		System.out.println("s2������ �� �ٸ� Student ��ü�� �����մϴ�");
//
//	}
//
//}


class Car{
	String company ="�����ڵ���";
	String model = "�׷���";
	String color = "red";
	int maxSpeed = 350;
	int speed;
}

class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("������ �ӵ�:"+myCar.speed);
	}
}
