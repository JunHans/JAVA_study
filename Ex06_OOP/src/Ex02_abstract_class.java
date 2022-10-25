/*
게임 : 유닛(unit)

unit : 공통기능(이동 좌표 , 이동 , 멈춘다) : 추상화 , 일반화 되어 있다(공통)
unit : 이동방법은 각각 다르다 (이동방법 unit마다 별도의 구현 강제)  ->  이동을 추상클래스로

abstract class Unit{  abstract void move();  }

 */

abstract class Unit {
	int x, y;

	void stop() {
		System.out.println("Unit Start");
	}

	// 이동을 서로 다르게 한다 강제구현 ... 다름을 구현
	abstract void move(int x, int y); // 실행블럭을 만들지 않는다 = 추상함수
}

//Tank
class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 소리내며 이동 : " + this.x + "," + this.y);
	}

	// 필요하다면 Tank만의 구체화되고 특수화되는 내용을 구현
	void changeMode() {
		System.out.println("탱크모드 변환");
	}

}

//해군
class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 뚜뚜대며 이동 : " + this.x + "," + this.y);
	}

	// 특수화되고 구체화 된 부분
	void stimpack() {
		System.out.println("스팀팩 기능");
	}

}

//수송선(드랍쉽)
class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship 하늘로 이동 : " + this.x + "," + this.y);
	}

	// 특수화되고 구체화 된 부분
	void load() {
		System.out.println("Unit load");
	}

	void unload() {
		System.out.println("Unit Unload");
	}

}

public class Ex02_abstract_class {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500, 200);
		tank.stop();
		tank.changeMode();
		
		Marine m = new Marine();
		m.move(200, 300);
		m.stop();
		m.stimpack();
		
		if(tank instanceof Unit) {
			System.out.println("true");  //자바 , 자바스크립트(typeof) 많이 쓰임
		}else {
			System.out.println("false");
		}
		
		
		//1. 탱크 세대를 만들고 같은 좌표(600,800)로 이동시키세요
		//Hint) cart만드는거 , 다형성 이용
		
		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
		for(Tank t : tanklist) {
			t.move(600, 800);
		}
		System.out.println();
//		Tank tank1 = new Tank();   <- 이렇게 만들면 안됨...
//		Tank tank2 = new Tank();
//		tank.move(600, 800);
//		tank1.move(600, 800);
//		tank2.move(600, 800);
		
		//2. 여러개의 유닛 (Tank 1대, Marine 1사람, DropShip 1대 생성하고 같은 좌표로 이동시키세요)
		//Hint) cart만드는거 , 다형성 이용
		Unit[] unitlist = {new Tank(), new Marine(), new Dropship()};
		//단점 : 각 유닛들의 구체화되고 특수화된 자원 접근 불가
		for(Unit u : unitlist) {
			u.move(666, 888);
		}
		
//		tank.move(666, 888);
//		m.move(666, 888);          <- 이렇게 만들면 안됨...
//		d.move(666, 888);
		
		

	}

}
