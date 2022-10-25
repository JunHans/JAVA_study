/*
���� : ����(unit)

unit : ������(�̵� ��ǥ , �̵� , �����) : �߻�ȭ , �Ϲ�ȭ �Ǿ� �ִ�(����)
unit : �̵������ ���� �ٸ��� (�̵���� unit���� ������ ���� ����)  ->  �̵��� �߻�Ŭ������

abstract class Unit{  abstract void move();  }

 */

abstract class Unit {
	int x, y;

	void stop() {
		System.out.println("Unit Start");
	}

	// �̵��� ���� �ٸ��� �Ѵ� �������� ... �ٸ��� ����
	abstract void move(int x, int y); // ������� ������ �ʴ´� = �߻��Լ�
}

//Tank
class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �Ҹ����� �̵� : " + this.x + "," + this.y);
	}

	// �ʿ��ϴٸ� Tank���� ��üȭ�ǰ� Ư��ȭ�Ǵ� ������ ����
	void changeMode() {
		System.out.println("��ũ��� ��ȯ");
	}

}

//�ر�
class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �ѶѴ�� �̵� : " + this.x + "," + this.y);
	}

	// Ư��ȭ�ǰ� ��üȭ �� �κ�
	void stimpack() {
		System.out.println("������ ���");
	}

}

//���ۼ�(�����)
class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship �ϴ÷� �̵� : " + this.x + "," + this.y);
	}

	// Ư��ȭ�ǰ� ��üȭ �� �κ�
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
			System.out.println("true");  //�ڹ� , �ڹٽ�ũ��Ʈ(typeof) ���� ����
		}else {
			System.out.println("false");
		}
		
		
		//1. ��ũ ���븦 ����� ���� ��ǥ(600,800)�� �̵���Ű����
		//Hint) cart����°� , ������ �̿�
		
		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
		for(Tank t : tanklist) {
			t.move(600, 800);
		}
		System.out.println();
//		Tank tank1 = new Tank();   <- �̷��� ����� �ȵ�...
//		Tank tank2 = new Tank();
//		tank.move(600, 800);
//		tank1.move(600, 800);
//		tank2.move(600, 800);
		
		//2. �������� ���� (Tank 1��, Marine 1���, DropShip 1�� �����ϰ� ���� ��ǥ�� �̵���Ű����)
		//Hint) cart����°� , ������ �̿�
		Unit[] unitlist = {new Tank(), new Marine(), new Dropship()};
		//���� : �� ���ֵ��� ��üȭ�ǰ� Ư��ȭ�� �ڿ� ���� �Ұ�
		for(Unit u : unitlist) {
			u.move(666, 888);
		}
		
//		tank.move(666, 888);
//		m.move(666, 888);          <- �̷��� ����� �ȵ�...
//		d.move(666, 888);
		
		

	}

}
