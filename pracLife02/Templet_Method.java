package pracLife02;

class GlassHouse extends HouseTemplate{
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}
	
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
}
class WoodenHouse extends HouseTemplate{
	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}
	
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}
}

abstract class HouseTemplate{  //공통부분은 하나로 묶고 다른 부분은 재정의해서 쓰도록 추상클래스에서 정의
	//Final 선언으로 Override 방지
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	//기본으로 구현
	private void buildWindows() {
		System.out.println("building Glass Windows");
	}
	//서브클래스에서 직접 구현할 메소드
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
}
//공통된 소스코드의 중복을 피하기 위해 별도의 추상클래스 선언
//확장을 쉽게 가능하게 해주는 패턴 

public class Templet_Method {

	public static void main(String[] args) {
		
		//템플릿 메소드 사용 (WoodenHouse)
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		
		//구분 선 삽입
		System.out.println();
		System.out.println("*********************");
		System.out.println();
		
		//템플릿 메소드 사용(Glass House)
		houseType = new GlassHouse();
		
		houseType.buildHouse();

	}

}
