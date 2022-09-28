package pracLife01;

import java.util.Scanner;

class Cine1 {
	private String seat1[][];
	private String seat2[][];
	private int movie;
	private int x, y;
	private String password; // 비밀번호가 다른사람이 같은 숫자로 설정하면 중복되니, 난수를 활용해서
								// 비밀번호 값을 주는게 좋음(날짜정보, 날씨 등등과 난수 합쳐도 좋고)

	Scanner sc = new Scanner(System.in);

//생성자
	public Cine1() {
		seat1 = new String[5][5];
		seat2 = new String[6][6];
	}

	// 예매 프로그램 시작 함수
	public void start() {
		System.out.println("영화 예매 프로그램 시작");
		System.out.println();

		initSeat(seat1);
		initSeat(seat2);

		while (true) {
			printInfo(); //시스템 메뉴 출력
			int n = Integer.parseInt(sc.nextLine());

			switch (n) {
			case 1:
				printMovie(); //영화정보출력
				movie = selectMovie();  //영화종류선택

				if (movie == 1) {
					printSeat(seat1); // 영화의 좌석 정보 출력
					selectSeat(seat1); // 영화 예매
				} else {
					printSeat(seat2); // 영화의 좌석 정보 출력
					selectSeat(seat2); // 영화 예매
				}
				break;
			case 2:
				checkInfo(); // 예매 정보 확인
				break;
			case 3: // 예매취소
				if (movie == 1) {
					drop(seat1);
				} else if (movie == 2) {
					drop(seat2);
				} else {
					System.out.println("예매내역이 없습니다");
				}
				break;
			case 4: // 좌석확인
				printMovie();  //영화정보출력

				switch (selectMovie()) {
				case 1:
					printSeat(seat1);
					break;
				case 2:
					printSeat(seat2);
					break;
				default:
					System.out.println("잘못된 값입니다");
				}
				
				break;
			case 5:
				System.out.println("예매 프로그램 종료 실행");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력값입니다\n다시 입력해 주세요");
			}
		}
	}

	// 좌석 초기화
	private void initSeat(String[][] seat) {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				// 좌석을 초기화
				seat[i][j] = "__"; // 문자열로 초기화
			}
		}
	}

	// 메뉴판
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("       [영화 예매 시스템]");
		System.out.println("1. 예매하기 2. 예매조회 3. 예메취소");
		System.out.println("4. 좌석확인 5. 프로그램 종료");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("번호를 선택해주세요 : ");
	}
	// 영화 종류 출력
	private void printMovie() {
		System.out.println("-----------------------------");
		System.out.println("[영화 예매]");
		System.out.println("| 1. 해리포터 | 2. 반지의제왕 |");
		System.out.println("-----------------------------");
		System.out.println();
	}

	// 영화종류 선택
	private int selectMovie() {
		System.out.println("원하는 영화를 선택하세요");
		System.out.println();
		int m = Integer.parseInt(sc.nextLine());
		if (m != 1 && m != 2) {
			System.out.println("잘못된 값을 입력하였습니다");
			selectMovie();
		}
		return m;
	}

	// 해당 영화의 좌석현황
	void printSeat(String[][] seat) {
		System.out.printf("        ");

		for (int i = 0; i < seat[0].length; i++) {
			System.out.printf("[%d열]", i);
		}
		System.out.println();

		for (int i = 0; i < seat.length; i++) {
			System.out.printf("[%d행] : ", i);
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("__") ? "가능" : "완료");
			}
			System.out.println();
		}
		System.out.println();
	}

	// 예매
	private void selectSeat(String[][] seat) {
		System.out.println("원하시는 좌석을 입력해주세요");
		
		while(true) { //좌석 범위를 벗어나는 것 방지
			System.out.print("행: ");
			x = Integer.parseInt(sc.nextLine());
			if(x >= 0 && x < seat.length)
				break;
			else
				System.out.println("올바른 행이 아닙니다.");
		}
		
		while(true) {	//좌석 범위를 벗어나는 것 방지
			System.out.print("열: ");
			y = Integer.parseInt(sc.nextLine());
			if(y >= 0 && y < seat[0].length)
				break;
			else
				System.out.println("올바른 열이 아닙니다.");
		}
		
		password = setPass();
		System.out.println("예약번호 : " + password);
		
		seat[x][y] = password;
	}

	// 예매번호 생성
	private String setPass() {
		int num = (int) (Math.random() * (9000)) + 1000;

		String pass = "";
		for (int i = 3; i >= 0; i--) {
			int tmp = num % 10;
			num /= 10;
			pass = pass + (tmp);
		}
		return pass;
	}

	// 에매조회
	private void checkInfo() {
		if (movie == 0) { // 1번. 예매하기를 안하고, 바로 2번인 예매조회를 눌렀을 경우,
			System.out.println("예매내역이 없습니다"); // movie의 값은 기본값인 0인 상태이기 때문에 그런경우 예매내역이 없다고 출력한다
		} else {
			System.out.println("좌석 확인을 위해 설정하신 비밀번호를 입력해주세요");
			String password_1 = sc.nextLine();
			if (password_1.equals(password)) {
				System.out.println("[예매정보]\n영화 : ");
				System.out.print(movie == 1 ? "해리포터" : "반지의제왕");
				System.out.printf("좌석: %d행 %d열\n", x, y);
			} else {
				System.out.println("비밀번호가 잘못되었습니다");
			}
		}
		System.out.println();
	}

	// 예매취소
	private void drop(String[][] seat) {
		System.out.println("예매를 취소하려면 설정하신 비밀번호를 입력해주세요");
		String password_1 = sc.nextLine();
		if (password_1.equals(password)) { // 비밀번호가 맞지 않으면
			password = null;               // 비밀번호를 null로 초기화하고
			movie = 0;                     // movie의 값을 0으로 초기화하고
			seat[x][y] = "__";             // 좌석 좌표마다의 값을 "__"로 초기화하고
			x = 0;                         // x도 선택한게 없으니 초기화하고
			y = 0;                         // y도 선택한게 없으니 초기화한다
		} else {
			System.out.println("비밀번호가 맞지 않습니다");
		}
	}

//	public void resetSeat(String[][] num) { //좌석 초기화
//		for (int i = 0; i < num[i].length; i++) {
//			for (int j = 0; j < num[j].length; j++) {
//				// 좌석을 초기화
//				num[i][j] = "__"; // __이란 문자열로 초기화
//			}
//		}
//	}
//	void rsSeat1() {
//		resetSeat(seat1);
//	}
//	void rsSeat2() {
//		resetSeat(seat2);
//	}

//	void printSeat(String[][] seat) { // 해당 영화의 좌석현황
//		for (int i = 0; i < seat.length; i++) {
//			for (int j = 0; j < seat[i].length; j++) {
//				System.out.printf("[%s]", num[i][j].equals("__") ? "좌석" : "예매");
//			}
//			System.out.println();
//		}
//	System.out.println();
//	}
//	void seat1Now() {
//		seatNow(seat1);
//	}
//	void seat2Now() {
//		seatNow(seat2);
//	}

//	public void menu() {
//		System.out.println("***영화예매 프로그램 실행***");
//		System.out.println("1 입력 후 영화 예매 실행"); // 현재 좌석 현황보여주기 원하는 자리 선택
//		System.out.println("2 입력 후 영화 예매 조회 실행");
//		System.out.println("3 입력 후 예매 취소 실행");
//		System.out.println();
//
//		int menu = 0;
//		do {
//			try {
//				menu = Integer.parseInt(sc.nextLine()); // 1 or 2 입력
//				if (menu >= 1 && menu <= 4) {
//					break; // do~while 탈출
//				} else {
//					throw new Exception("메뉴 번호 선택이 잘못 되었습니다");
//				}
//			} catch (Exception e) {
//				System.out.println("< error!!! : " + e.getMessage() + " >");
//				System.out.println("---메뉴에 없는 숫자 선택---");
//				System.out.println("1~3까지의 숫자만 입력하십시오");
//			}
//		} while (true);
//
//		// 1~2까지 중 하나를 선택했다면
//		return menu;
//	}

//	public void cinenum() {
//		String ran = Integer.toString(random.nextInt(8) + 1);
//		for (int i = 0; i < 7; i++) {
//			ran += Integer.toString(random.nextInt(9));
//			System.out.println(ran);
//		}
//	}

}
