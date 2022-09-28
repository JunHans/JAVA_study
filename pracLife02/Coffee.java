package pracLife02;
 
public class Coffee{  //커피만들기를 위한 커피 클래스
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();                 //각 단계별 메소드 구현
		addSugarAndMilk();
	}
	
	public void boilWater() {
		System.out.println("물 끓이는 중");
	}
	public void brewCoffeeGrinds() {
		System.out.println("필터로 커피우려내는 중");
	}
	public void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
	public void addSugarAndMilk() {
		System.out.println("설탕과 우유 추가하는 중");
	}
}

public class Tea{
	void prepareRecipe() {
		boilWater();
		brewTeaBag();
		pourInCup();                 //각 단계별 메소드 구현
		addLemon();
	}
	
	public void boilWater() {
		System.out.println("물 끓이는 중");
	}
	public void brewTeaBag() {
		System.out.println("차 우려내는 중");
	}
	public void addLemon() {
		System.out.println("레몬 추가하는 중");
	}
	public void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
}
