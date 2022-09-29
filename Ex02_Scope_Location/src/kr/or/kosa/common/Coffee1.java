package kr.or.kosa.common;

public class Coffee1 {
	/*
	 자판기는 아메리카노를 판매한다. (기본 1500원)

자판기의 아메리카노는 기본 2샷을 가지고 있다.

샷을 추가할 수 있다. (최대 4샷, 300원)

샷을 뺄 수 있다. (최소 1샷)

자판기는 아메리카노를 디카페인 아메리카노로 변경할 수 있다.

디카페인 아메리카노로 메뉴 이름이 변경된다.

가격이 추가된다. (300원)

자판기는 메뉴와 현재 가격을 출력한다.
	 */
//	public int data;
//	private int mimPrice;
//	
//	public String menuname = "아메리카노";  //default = 아메리카노
//	public int price = 1500; //default = 1500
//	public int shot = 2; //default 
//	
//	public void c() {
//		System.out.println("자판기가 파는 것 : 아메리카노");
//	}
//	public void c1() {
//		System.out.println("가격 : 1500원");
//	}
//	public void c2() {
//		System.out.println("기본 샷 : 2샷");
//	}
//	private String name = "아메리카노";
	
//	private int add(int i) {
//		return i + 100;
//	}
//	public void addshot() {
//		//함수는 다른 함수를 호출할수 있다
//		int result = add(100);
//		System.out.println("call result : " + result);
		
	
//	public static int addShot(int data) {
//		
//		if(data == 1) {
//			return 1799 + data;
//		} else if(data == 2) {
//			return 2098 + data;
//		}else if(data == 3) {
//			return 2397 + data;
//		}else if(data == 4) {
//			return 2696 + data;
//		} 
//		return data;
//	}
//	
	
	private String name = "아메리카노";
	private int price = 1500;
	private int shot = 2;

	
	public void shotAdd() {
		if (shot <=4) {
			shot++;
			price += 300;
		} else {
		System.out.println("더 이상 추가할 수 없습니다.");
		}
	}
	
	public void shotRemove() {
		if (shot > 1) {
			shot--;
			if (shot >= 2) {
				price -= 300;
				
			}
		} else {
			System.out.println("더 이상 제외할 수 없습니다.");
		}
	}
	
	public void deCaff() {
		name = "디카페인 아메리카노";
		price += 300;
	}
	
	public void print_Info() {
		System.out.printf("메뉴: %s\n가격: %d원\n", name, price);
	}
	
	
}
