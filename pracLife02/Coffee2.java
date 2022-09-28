package pracLife02;

abstract class CaffeinBeverage{  //추상클래스
	
	final void prepareRcipe() {  //Tea와 Coffee를 만들때 똑같은 prepareRcipe()메소드를 사용합니다. 서브클래스에서 이 메소드를 오버라이드해서 아무렇게나 음료를 만들지 못하도록 final로 선언합니다. 두번째와 네번째 단계는 brew와 addCondiments라는 일반화된 메소드로 바꾸었습니다.
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();   //Coffee와 Tea에서 이 두메소드를 서로 다른방식으로 처리하기 때문에 추상메소드로 선언합니다. 서브클래스에서 알아서 하도록 합시다.

	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	void pourInCup(){
		System.out.println("컵에 따라는 중");
	}
}

//Tea와 Coffee는 CaffeinBeverage을 상속
//두클래스 모두 brew(), addCondiments()를 재정의 해야함 부모클래스 CaffeinBeverage에서 abstract로 선언
class Tea extends CaffeinBeverage{
	public void brew() {
		System.out.println("차를 우려내는 중");
	}
	public void addCondiments() {
		System.out.println("레몬 추가하는 중");
	}
}
class Coffee extends CaffeinBeverage{
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
	}
}




