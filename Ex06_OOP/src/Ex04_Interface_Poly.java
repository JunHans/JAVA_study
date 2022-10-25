
//�������̽� ����
//~�� �� �ִ� (������ �� �ִ�)
interface Irepairable{} //�θ�� �� ���ڿ� ���� (Tank2, CommandCenter, Scv)




class Unit2 {
	int hitpoint; // �⺻ ������
	final int MAX_HP;// �ִ� ������
//	Unit2(){}

	Unit2(int hp) {
		this.MAX_HP = hp; // MAX_HP �ʱ�ȭ
	}
}

//��������, ��������, �ǹ� 

//��������
class GroundUnit extends Unit2 {

	public GroundUnit(int hp) {
		super(hp);
	}

}

//��������
class AirUnit extends Unit2 {

	public AirUnit(int hp) {
		super(hp);
	}

}
//�ǹ�
class CommandCenter implements Irepairable{}    //���� �θ� ������ ����

class Tank2 extends GroundUnit implements Irepairable{  //���� �θ� ������ ����

	public Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit{

	public Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine2";
	}	
}
//Scv ���� ĳ�� , ġ�� ���
class Scv extends GroundUnit implements Irepairable{  //���� �θ� ������ ����

	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}	
	
	//Scv ��üȭ �ǰ� Ư��ȭ�� ������ ��� �ʿ�
	//�����ϴ�(repair)
	//Tank2 , Scv]
	
	//������ǰ ���� ��ǰ�� 1000�� ������  >>  buy �Լ��� 1000�� ����ų�! -(X)
	//������ ����ؼ�  �θ�Ÿ�� buy(Product n)
	
	//������)  �θ�� ã�Ҵ� : GroundUnit (Tank2, Marine2, Scv) 
	// Marine�� ��� repair�� ����� �ƴѵ�
	//void repair(Unit2 unit) >> Tank2, Marine2(x), Scv  --(X)
	//void repair(GroundUnit unit) >> Tank2, Marine2(x), Scv  --(X)

	//��� ??
	
	//** + CommandCenter�� repair ��� (���� ġ������)
	//Tank2, Marine2, Scv, CommandCenter ������� ���� (������ x)
	
	
	//interface Irepairable{}  ������ : ���� �θ� 
	
	//class CommandCenter implements Irepairable{}
	//class Tank2 extends GroundUnit implements Irepairable
	//class Scv extends GroundUnit implements Irepairable
	
	//��, �θ��ڿ��� ���� �����ϴ�
	//��, �����ǵ� �ڿ��� ����
	
	
	
	//1. void repair(Irepairable repairunit)  >>  Tank2, CommandCenter, Scv �� �� ����
	//Irepairable�� �ڽ�Ÿ���̴� ...
	//repair Tank2, Scv >> scv.hitpoint +=5;
	//repair CommandCenter �ٸ� �������.
	void repair(Irepairable repairunit) {  // ������Ʈ�� ������ ����� ����
		//repairunit ���ؼ� Unit2������ �� �ִ� ���?
		
		//��)) Tank2, Scv�� ���� > �θ� Unit2����
		//Unit2 unit = (Unit2)repairunit;  //�ٿ�ĳ����
		//unit.hitpoint+=5;
		
		//CommandCenter ����?  > Unit2�� �������� ����
		//nit2 unit = (Unit2)repairunit; (����)
		
		//repair(Irepairable repairunit) ���
		//�� (Ÿ�Կ� ���� �� �ʿ�) >> instanceOf >> ���� ���� ���� ������ �� ����Ÿ���̾� �ƴϾ�?
		
		if(repairunit instanceof Unit2) {  // �� ����2Ÿ���̾�?
			//Tank2 , Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP; //����
			}
		}else {
			//�ٸ���ü
			System.out.println("�ٸ� ��������� ���ؼ� repair ����");
		}
	}
	
	
	/*
	void repair(Tank2 tank) {  //Tank2�� hp �����;���
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint+=5;
		}
	}
	
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint +=5;
		}
	}
	*/
}


public class Ex04_Interface_Poly {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint -=20;
		System.out.println("��ũ : " + tank.hitpoint);
		System.out.println("Scv ������û");
		scv.repair(tank);
		
		System.out.println("��ũ ���� �Ϸ� :" + tank.hitpoint);

		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("scv ���� ��û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
