package pracLife01;

import java.io.DataOutput;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class lotto_epic {
	private int[] lotto = new int[6];
	private int[] personalNum = new int[6];

	Random random = new Random();
	Scanner sc = new Scanner(System.in);

//	int ni = Integer.parseInt(sc.nextLine());

	
	
	void start() {
		while(true) {
			switch (menu()) {
			case 1: numberInput();
				break;
			case 2: numberOutput();
				break;
			case 3: System.out.println("로또 프로그램 종료");
			    //return;  >> main 함수 종료
			    System.exit(0); //프로그램 종료
			}
		}
	}
	
	
	
	
	void numberInput() { // 1번 선택하면 사용자입력값 배열에 입력
		System.out.println("사용자 숫자 입력");
		numInput();
		numOutput();
		System.out.println();
//		if(ni == personalNum.length) {
//		System.out.println(personalNum[ni]);
//		}
	}

	void numberOutput() { // 2번 선태하면 lotto 번호 생성
		System.out.println("<로또번호 출력합니다>");
		lottoStart();
		numOutput();
		compareNum();
	}

	void systemExit() {
		System.out.println("시스템 종료합니다");
	}

	int menu() {
		System.out.println("***로또 프로그램 실행***");
		System.out.println("1 입력 후 Enter : 수동으로 6개 번호 입력");
		System.out.println("2 입력 후 Enter : 1등번호 랜덤출력");
		System.out.println("3 입력 후 Enter : 로또 프로그램 종료");
		System.out.println();

		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); // 1 or 2 입력
				if (menu >= 1 && menu <= 3) {
					break; // do~while 탈출
				} else {
					throw new Exception("메뉴 번호 선택이 잘못 되었습니다");
				}
			} catch (Exception e) {
				System.out.println("< error!!! : " + e.getMessage() + " >");
				System.out.println("---메뉴에 없는 숫자 선택---");
				System.out.println("1~3까지의 숫자만 입력하십시오");
			}
		} while (true);

		// 1~2까지 중 하나를 선택했다면
		return menu;
	}

	
	void Write() {
		Date currdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
		
	    String s =	dateformat.format(currdate);
		System.out.println(s);
	}
	void Read() {
		
	}
	
	public void lottoStart() {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
//			System.out.println("출력: " + lotto[i]);  //확인용
		}
		String resultArray = Arrays.toString(lotto);
//		System.out.println("당신의 로또번호는요!");
		Arrays.sort(lotto); // 자동 정렬이 되버림 자리바꿈
		resultArray = Arrays.toString(lotto);
		////////////////////
		//로또번호에 현재시간 출력 기능 추가
		Date currdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("[yyyy년 MM월 dd일 HH:mm]");
	    String s =	dateformat.format(currdate);
		System.out.println(s);
		////////////////////
		System.out.println("로또번호 : "+ resultArray + s);
		
	}

	public void numInput() { // 숫자 입력
		System.out.println("<1부터 45까지의 숫자를 입력하세요>");
		for (int j = 0; j < personalNum.length; j++) {
			personalNum[j] = Integer.parseInt(sc.nextLine());
		}
	}

	public void numOutput() { // 입력한 숫자 출력
		System.out.println("<내가 입력한 수>");
		for (int j = 0; j < personalNum.length; j++) {
			System.out.print("[" + personalNum[j] + "]");
		}
		System.out.println();
	}

	public void compareNum() {
		int sum = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < personalNum.length; j++) {
				if (personalNum[j] == lotto[i]) {
					sum++;
				}
			}
			System.out.println("입력한 숫자와" + sum + "개 일치합니다");
			System.out.println();
		}
	}
	
	

}
