import java.util.Scanner; //자바패키지 밑에 유틸패키지 아에 있는 스캐너를 사용했구나  java.util.* 유틸 아래의 모든걸 사용했구나 전자가 더 가독성이 좋음

import javax.security.sasl.SaslClient;

public class Ex08_printf_format {

	public static void main(String[] args) {
		//System.out.println();
		//C#: Console.WriteLine();
		
		System.out.println(); //출력하고 줄바꿈 해라(엔터)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("D");
		System.out.println();
		
		int num =100;
		System.out.println(num);
		System.out.println("num 값은 " + num + " 입니다");
		
		//형식 Format
		System.out.printf("num 값은 %d 입니다", num);
		System.out.println();
		System.out.printf("num 값은 [%d] 입니다 또 [%d] 도 있어요 \n", num , 12345);
		//format 형식문자
		/*
		 %d (10진수 형식의 정수)
		 %f (실수)
		 %s 문자열
		 %c 문자
		 %t tap , \n 줄바꿈
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수값 %f 입니다 \n",f);
		
		//입력받기 (cmd) 사용자가 입력한 값을  받을 수 있다
		//데이터 타입 + 변수
		Scanner sc = new Scanner(System.in);  //클래스 뒤 변수는 주소를 받는다 int,double같은 건 뒤에 8가지 타입변수  //Scanner(System.in)는 함수
//		String value = sc.nextLine();
		//입력하고 엔터를 칠때까지 대기하는 놈 (프로그램이 종료되지 않고 기다린다)입력되고 꺼짐
		//입력한 값을 문자열로 전달해주어요! (앞에 String)
//		System.out.println(value); 
		
//		int number = sc.nextInt();
//		System.out.println("number : " + number);  //InputMismatchException 입력한 값이랑 타입이 달라여 오류마지막줄 클릭하면 에러가 난 코드로 이동
		
//		float number = sc.nextFloat();
//		System.out.println("number : " + number); 실수 나타나개고 싶을 때
		
		//그럼에도 불구하고 권장사항은 : nextInt , nextFloat 보다는 nextLine 으로 read 타입을 바꾸자
		
		//Today Point
		
		//문자를 => 숫자로 (정수, 실수)
		//Integer.parseInt("11111") ->> 정수값으로 바꿔줌 ->> 11111(일일일일일 -> 만천백십일)
		//Float.parseFloat("3.14") ->> 실수값으로 바꿔줌 ->> 3.14
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("정수값 : " + number);
	}

}

