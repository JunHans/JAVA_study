package pracLife01;


//class Student{
//	
//}

public class exam01 {}
//
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		System.out.println("s1 변수가 Student 객체를 참조합니다");
//		
//		Student s2 = new Student();
//		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다");
//
//	}
//
//}


class Car{
	String company ="현대자동차";
	String model = "그랜저";
	String color = "red";
	int maxSpeed = 350;
	int speed;
}

class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도:"+myCar.speed);
	}
}
