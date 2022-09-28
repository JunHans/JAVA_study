package pracLife01;

import java.util.Scanner;
//bean 은 무엇을 넣으시겠습니까? - 에스프레소 or 디카페인 선택  bean : "espresso” || "decaffeine”
//물베이스로 하시겠습니까, 우유 베이스로 하시겠습니까?        - 물 or 우유 선택  contain: "water” || "milk” || “”
//시럽은 넣으시나요? -                             - syrup: "vanilla” || "chocolate” || “”
//출력 : 이름 bean: , contain: , syrup : 

public class CoffeeRefactoring {
	private String bean;
	private String contain;
	private String syrup;
	private int beanNum; // 숫자 받아오는 선택지
	private int baseNum; // 숫자 받아오는 선택지
	private int syrupNum; // 숫자 받아오는 선택지

	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println();

		while (true) {
			menuInfo(); // 안내 & 메뉴판 출력
			int s = Integer.parseInt(sc.nextLine()); // 메뉴판을 보고 입력한 숫자

			switch (s) { // 입력한 숫자 s 대입
			case 1:
				printBean(); // Bean 선택 & 출력
				beanNum = chooseBean();  //이 코드 만으로도 chooseBean이 호출되고 실행된 뒤 beanNum으로 저장된다
				if (beanNum == 1) { // 에스프레소 선택 & 출력
					printBase();

					baseNum = chooseBase();
					if (baseNum == 1) { // 물 베이스 선택 & 출력
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						} else if (syrupNum == 2) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						}
					} else if (baseNum == 2) { // 물 베이스 선택 & 출력
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						} else if (syrupNum == 2) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						}
					}
				} else if (beanNum == 2) { // 에스프레소 선택 & 출력
					printBase();

					baseNum = chooseBase();
					if (baseNum == 1) { // 물 베이스 선택 & 출력
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						} else if (syrupNum == 2) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						}
					} else if (baseNum == 2) { // 물 베이스 선택 & 출력
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						} else if (syrupNum == 2) { // 시럽 선택 & 출력
							result(beanNum, baseNum, syrupNum);// 다 합친 결과값 출력
						}
					}
				} else {
					System.out.println("Bean을 먼저 선택해야 합니다"); // 없어도 됨
				}
				break;

			case 2:
				System.out.println("시스템을 종료합니다 ^^7"); // 2번 입력할 경우 시스템종료 코드
				System.exit(0);
				break;
			default:
				System.out.println("       잘못된 값을 입력하셨습니다"); // 1, 2가 아닌 다른 숫자를 입력할 경우 경고문 출력
				System.out.println("          다시 입력해주세요");
			}
		}
	}

	// 메뉴판 출력
	private void menuInfo() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("  음료 제조 시스템에 오신 것을 환영합니다");
		System.out.println("        <<음료 주문 순서>>");
		System.out.println("         1. Bean 선택");
		System.out.println("         2. 베이스 선택");
		System.out.println("         3. 시럽 종류 선택");
		System.out.println("         4. 시스템 종료");
		System.out.println("  순으로 진행됩니다. 순서에 따라 진행하세요");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" 프로그램을 시작하시려면 <1번>을 눌러주시고");
		System.out.println(" 프로그램을 종료하시려면 <2번>을 눌러주세요 ^^7");
	}

	// Bean 종류 출력
	public void printBean() {
		System.out.println();
		System.out.println("원두 선택");
		System.out.println("1. 에스프레소");
		System.out.println("2. 디카페인 (추가금액 X)");
		System.out.println();
		//chooseBean();
	}

	// Bean 선택
	public int chooseBean() {
		System.out.println("원하시는 원료를 선택해주세요");
		int b = Integer.parseInt(sc.nextLine());
		if (b != 1 && b != 2) {
			System.out.println("잘못된 번호를 입력하셨습니다");

		}
		return b;
	}

	// 베이스 출력
	private void printBase() {
		System.out.println();
		System.out.println("베이스 선택");
		System.out.println("1. 물 베이스");
		System.out.println("2. 우유 베이스");
		System.out.println();
		//chooseBase();
	}

	// 베이스 선택
	public int chooseBase() {
		System.out.println("원하시는 베이스를 선택해주세요");
		int w = Integer.parseInt(sc.nextLine());
		if (w != 1 && w != 2) {
			System.out.println("잘못된 번호를 입력하셨습니다");
			chooseBase();
		}
		return w;
	}

	// 시럽 출력
	private void printSyrup() {
		System.out.println();
		System.out.println("시럽 선택");
		System.out.println("1. 설탕 시럽");
		System.out.println("2. 시럽 추가 안함");
		System.out.println();
		//chooseSyrup();
	}

	// 시럽 선택
	public int chooseSyrup() {
		System.out.println("원하시는 시럽을 선택해주세요 (200원 추가)");
		int s = Integer.parseInt(sc.nextLine());
		if (s != 1 && s != 2) {
			System.out.println("잘못된 번호를 입력하셨습니다");
			chooseSyrup();
		}
		return s;
	}

	// 앞에서 모아온 선택지들을 조합하여 그에 맞는 결과 값 출력
	public void result(int beanNum, int baseNum, int syrupNum) {
		System.out.println();
		if (beanNum == 1 && baseNum == 1 && syrupNum == 1) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 아메리카노 + 설탕시럽 추가입니다>\n<가격 : 3400원>");
		} else if (beanNum == 1 && baseNum == 1 && syrupNum == 2) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 아메리카노입니다>\n<가격 : 3200원>");
		} else if (beanNum == 1 && baseNum == 2 && syrupNum == 1) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 카페라떼 + 설탕시럽추가입니다>\n<가격 : 3900원>");
		} else if (beanNum == 1 && baseNum == 2 && syrupNum == 2) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 카페라떼입니다>\n<가격 : 3700원>");
		} else if (beanNum == 2 && baseNum == 1 && syrupNum == 2) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 디카페인 아메리카노 + 설탕시럽추가입니다>\n<가격 : 3400원>");
		} else if (beanNum == 2 && baseNum == 1 && syrupNum == 1) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 디카페인 아메리카노입니다>\n<가격 : 3200원>");
		} else if (beanNum == 2 && baseNum == 2 && syrupNum == 2) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 디카페인 카페라떼입니다>\n<가격 : 3700원>");
		} else if (beanNum == 2 && baseNum == 2 && syrupNum == 1) {
			System.out.println("<짜잔~~! 고객님이 주문하신 음료는 디카페인 카페라떼 + 시럽추가입니다>\n<가격 : 3700원>");
		} else {
			System.out.println("<엥? 조합에 맞지 않는 주문입니다>");  //사실 필요없음
		}
	}

//	public void result(int beanNum, int baseNum, int syrupNum) {
//		this.beanNum = beanNum;
//		this.baseNum = baseNum;
//		this.syrupNum = syrupNum;
//		
//		System.out.println("고객님이 주문하신 음료는[%S]입니다", );
//	}

}
