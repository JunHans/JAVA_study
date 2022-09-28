import java.util.Scanner;

public class Ex11_statement {

	public static void main(String[] args) {
		//반복문 (while , do ~ while)
		int i = 10;
		while(i >= 10) {
			//반드시 개발자가
			//인위적으로 증가감을 명시!
			// i--; 여기에 있으면 결과로 9가 나옴     //증가감의 위치도 고민하자^^7
			System.out.println("i : " + i);
			i--;
		}
		//while 1~100까지 합
		int sum =0;
		int j =1;
		while(j <= 100) {  //for(int j =1; j <=100; j++)
			//j++;
			sum+=j;
			j++;
		}
		System.out.println("sum : " + sum);
		
		//while 구구단을 출력하세요
		//	for(int i=2; i<=9; i++)
		//	 for(int j=1; j <=9; j++)
		
		//while 2개
		int a = 2;
		int b = 1;
		while(a<=9) {
			b=1;
			while(b<=9) {
//				System.out.print(a+"x"+b+"="+(a*b));
				System.out.printf("[%d]*[%d]=[%d]\t", a,b,a*b);
				b++;	
			}
			System.out.println();
			a++;
		}
		System.out.printf("a:%d, b:%d \n", a, b);

		
		//
		//for(;;) {} 무한루프
		//while(true) { if(조건) break; } 무한루프 멈추는건 브레이크 뿐
		// do ~ while : 일단 한번은 강제적으로 수행하고 , 그리고 조건을 보고 판단하라
		//do {실행문 ... 값을 받아요} while(조건판단 맞으면 돌리고 아니면 바로 빠져나감)
		//메뉴구성
		//점심메뉴 선택하세요
		//1. 짜장
		//2. 짬뽕
		//계속 3번을 입력 메뉴가 다시 나오게 다시입력 받게 ...
		
		//프로그램 동작
		//당신이 원하는 메뉴번호를 선택하세요 >> do .. 선택값 받아서
		//while(input > 2) 가시 입력하세요while문이 false가 되면 구문을 종료
		
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.println("숫자 입력해 )~(0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //true가 계속 돠면 계속 do문으로 실행
		
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
	}

}
