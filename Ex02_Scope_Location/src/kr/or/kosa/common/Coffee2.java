package kr.or.kosa.common;

public class Coffee2 {
	public static void main(String[] args) {
//		Coffee1 coffee = new Coffee1();
//		
//		System.out.println("~<자판기의 기본정보>~");
//		coffee.c();
//		coffee.c1();
//		coffee.c2();
//		
//		System.out.println("*******************************************");
//		
//		int result = Coffee1.addShot(2);
//		System.out.println("샷 추가시 가격 : " + result);
		
		Coffee1 cc = new Coffee1();
		cc.shotAdd();
		cc.shotAdd();
		cc.shotRemove();
	

		//cc.deCaff();
		cc.print_Info();
	}
}
