
//인터페이스 설계
//~할 수 있는 (수리할 수 있는)
interface Irepairable{} //부모로 쓸 빈자원 생성 (Tank2, CommandCenter, Scv)




class Unit2 {
	int hitpoint; // 기본 에너지
	final int MAX_HP;// 최대 에너지
//	Unit2(){}

	Unit2(int hp) {
		this.MAX_HP = hp; // MAX_HP 초기화
	}
}

//지상유닛, 공중유닛, 건물 

//지상유닛
class GroundUnit extends Unit2 {

	public GroundUnit(int hp) {
		super(hp);
	}

}

//공중유닛
class AirUnit extends Unit2 {

	public AirUnit(int hp) {
		super(hp);
	}

}
//건물
class CommandCenter implements Irepairable{}    //같은 부모 가지게 해줌

class Tank2 extends GroundUnit implements Irepairable{  //같은 부모 가지게 해줌

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
//Scv 광물 캐고 , 치료 기능
class Scv extends GroundUnit implements Irepairable{  //같은 부모 가지게 해줌

	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}	
	
	//Scv 구체화 되고 특수화된 고유한 기능 필요
	//수리하다(repair)
	//Tank2 , Scv]
	
	//전자제품 매장 제품이 1000개 있으면  >>  buy 함수를 1000개 만들거냐! -(X)
	//다형성 사용해서  부모타입 buy(Product n)
	
	//문제점)  부모는 찾았다 : GroundUnit (Tank2, Marine2, Scv) 
	// Marine은 어떡해 repair의 대상이 아닌데
	//void repair(Unit2 unit) >> Tank2, Marine2(x), Scv  --(X)
	//void repair(GroundUnit unit) >> Tank2, Marine2(x), Scv  --(X)

	//고민 ??
	
	//** + CommandCenter도 repair 대상 (나도 치료해줘)
	//Tank2, Marine2, Scv, CommandCenter 연결고리가 없다 (연관성 x)
	
	
	//interface Irepairable{}  연관성 : 같은 부모 
	
	//class CommandCenter implements Irepairable{}
	//class Tank2 extends GroundUnit implements Irepairable
	//class Scv extends GroundUnit implements Irepairable
	
	//단, 부모자원만 접근 가능하다
	//단, 재정의된 자원만 접근
	
	
	
	//1. void repair(Irepairable repairunit)  >>  Tank2, CommandCenter, Scv 올 수 있음
	//Irepairable의 자식타입이니 ...
	//repair Tank2, Scv >> scv.hitpoint +=5;
	//repair CommandCenter 다른 방법으로.
	void repair(Irepairable repairunit) {  // 힛포인트에 접근할 방법이 없다
		//repairunit 통해서 Unit2접근할 수 있는 방법?
		
		//답)) Tank2, Scv만 오면 > 부모가 Unit2구나
		//Unit2 unit = (Unit2)repairunit;  //다운캐스팅
		//unit.hitpoint+=5;
		
		//CommandCenter 오면?  > Unit2와 연관성이 없다
		//nit2 unit = (Unit2)repairunit; (예외)
		
		//repair(Irepairable repairunit) 사용
		//비교 (타입에 대한 비교 필요) >> instanceOf >> 탕비에 대한 질문 던져서 너 유닛타입이야 아니야?
		
		if(repairunit instanceof Unit2) {  // 너 유닛2타입이야?
			//Tank2 , Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP; //완충
			}
		}else {
			//다른객체
			System.out.println("다른 충전방식을 통해서 repair 제공");
		}
	}
	
	
	/*
	void repair(Tank2 tank) {  //Tank2의 hp 가져와야함
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
		
		//전투
		tank.hitpoint -=20;
		System.out.println("탱크 : " + tank.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(tank);
		
		System.out.println("탱크 수리 완료 :" + tank.hitpoint);

		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("scv 수리 요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
