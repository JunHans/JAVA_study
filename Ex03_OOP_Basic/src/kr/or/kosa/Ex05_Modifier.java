package kr.or.kosa;
import java.awt.CardLayout;



public class Ex05_Modifier {

	public static void main(String[] args) {
		Car car = new Car();
		int speed1 = car.getSpeed();
		System.out.println("speed : " + speed1);
		
		car.speedUp();
		car.speedUp();
		speed1 = car.getSpeed();
		System.out.println("speed : " + speed1);
		
		car.speedDown();
		car.speedDown();
		speed1 = car.getSpeed();
		System.out.println("speed : " + speed1);
		
		speed1 = car.getSpeed();
		System.out.println("speed : " + speed1);
	}

}
