//import java.lang.*;  생략되어 있다  코드 쓰지 않아도 java.lang 폴더안에 있는 자원은 그냥 사용가능

public class Ex06_Operation {

	public static void main(String[] args) {

		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // 몫
		System.out.println(result);

		// 나머지를 구하는 연산자가 따로 있다 (%)
		result = 13 % 2;
		System.out.println(result);

		// 증가 , 감소 (증가감 연산자 : ++ 1씩증가 , -- 1씩 감소)
		int i = 10;
		++i; // 전치증가
		System.out.println("전치 : " + i);
		i++; // 후치증가
		System.out.println("후치 : " + i);
		// 혼자서는 전치 , 후치의 의미가 없다

		// Today Point ( 증가감 연산자 다른 연산자와 결합되면 전치 후치가 살아난다 )
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// 현재 result2 : 10 j2 : 5
		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 6 //모든연산이 진행된 후에 후치
		result2 = i2++ + j2++;
		System.out.println("result2 : " + result2 + " i2 : " + i2 + " j2 : " + j2);
		// result2 : 11 i2 : 6 j2 : 7 //모든연산이 진행된 후에 후치

		byte b = 100;
		byte c = 1;

		// byte d = b + c;
		// Type mismatch: cannot convert from int to byte
		// 바이트더하기 바이트여도 연산을 할때는 인트방을 빌려서 쓰기 때문에 (4바이트)결과가 인트방으로 나옴
		// 번 해결 연산시 4byte 공간을 사용해서 연산하기에 int + int
		// byte d = (byte) (b + c); //손실이 나도 걍 이걸로 할래하면 이방법으로

		int d = b + c; // 결과의 타입을 조정해서 (손실 발생하지 않는다)
		System.out.println("d값 출력 : " + d);

		// Today Poimt
		/*
		 * 1.정수의 모든 연산은 [int] 타입 변환 후 처리 ex) byte + short => 컴파일러가 내부적으로 int + int char
		 * + char => 컴파일러가 내부적으로 int + int 연산처리시 정수의 연산에서 int보다 작은 타입은 int로 변횐해 연산
		 * (long은 예외) byte , char , short >> 연산시에는 > int방에 넣어서 계산 > int
		 * 
		 * char + int >> int + int int + long >> long + long 큰타입 따라감 예외적
		 * 
		 * 정수 + 실수 >> 타입의 크기와 상관없이 >>> 실수 승자
		 * 
		 */

		long ln = 10000000000L;
		float f1 = 1.2f;
		// long lnresult = ln + f1;
		// long lnresult = (long) (ln + f1); //손실발생 .2 잃어버림
		// System.out.println("lnresult : " + lnresult);
		// float lnresult = ln + f1;
		// System.out.println("lnresult : " + lnresult); //손실x

		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3
		float result5 = num2 + num3;
		System.out.println(result5);

		char c2 = '!'; // 33
		char c3 = '!'; // 33
		// c2 + c3
		int result6 = c2 + c3;
		System.out.println(result6); // 결국 4바이트 공간안에 더하기하는거니까 int로 바꾸면 되겠구나~

		// 제어문
		// 중소기업 시험문제 (구구단 출력) >> 삼각형 별찍기 >> 연습
		int sum = 0; // local variable
		for (int j = 1; j <= 100; j++) {
			// sum = sum + j;
			// sum+=j; //sum = sum + j
			if (j % 2 == 0) { // j를 2로 나눈 나머지가 0이라면 = 짝수라면
				sum += j; // 짝수의 합 (1~100)
			}
		}
		System.out.println("sum : " + sum);

		// == 연산자 (값을 비교하는 연산자)
		if (10 == 10.0f) { // 타입을 비교하는 것이 아니고 가지고있는 값을 비교하는 것
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ! 부정 연산자
		if ('A' != 65) { // 같지않니?
			System.out.println("어 같지 않아 : true");
		} else {
			System.out.println("어 같은 값이야 : false");
		}

		// 암기하자 (Today Point)
		// 연산자중에서 제어문 역할을 하는 녀석이 있다
		// 삼항연산자 조건식 ? 값 또는 연산식 : 값 또는 연산식;
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;

		// 위 코드를 if문을 사용해서 처리하라
		int result9 = 0;
		if (p == k) {
			result9 = p;
		} else {
			result9 = k;
		}

		// 진리표
		// 논리연산
		// 0 : false
		// 1 : true

		/*
		 * OR 연산 , AND 연산 00 0 0 01 1 0 10 1 0 11 1 1
		 * 
		 * DB (Oracle) SQL언어 자연어 (인간이 가장 해석하기 쉬운 언어) select * from emp where job='IT'
		 * and sal > 2000 // (그리고 둘다 참인 경우) 직종이 it이고 급여가 2000이상인 사람들만 쭉 나옴
		 * 
		 * select * from emp where job='IT' and sal > 2000 // (이거니 또는 둘중에 하나만 참이어도 만족)
		 * 직종이 it인사람들 쭉 나오고, 급여 2000이상인 삶들도 쭉 나옴
		 * 
		 * 연산자 (비트) | or연산 & and 연산
		 * 
		 * || 논리연산 (OR) && 논리연산 (AND)
		 * 
		 */
		// <비트연산>
		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x | y));

		/*
		 * 십진수 -> 2진수(0,1) 8bit 256 128 64 32 16 8 4 2 1 0 0 1 1 > 10진수 3을 -> 2진수 0 1 0
		 * 1 > 10진수 5를 -> 2진수 OR 0 1 1 1 > x와y를 2진수로 바꾸고 -> 10진수 -> 4+2+1 > 7 AND 0 0 0
		 * 1 > x와y를 2진수로 바꾸고 -> 10진수 -> 1
		 */
		System.out.println("x|y : " + (x & y));

		// Today Point
		// <논리연산>
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1){ A }else{ B } ***** 거의 개발할 때 이거만 씀
		// 참 거짓 참 참 = 거짓 = B (뒤에 참이 천개 만개있어도 어차피 거짓)
		// 거짓이 나오는 순간 처리가 됨 뒤는 컴파일러가 읽지도 않음
		// if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1){ A }else{ B }
		// 참인거 하나 나오면 거기서 바로 끝

		int data = 90;
		switch (data) {
		case 100:
			System.out.println("100입네다");
			break;
		case 90:
			System.out.println("90입네다");
			break;
		case 80:
			System.out.println("80입네다");
			break;
		default:
			System.out.println("일치하는 값이 업슴네다");
		}

		// <간단한 달력 월 계산 >
		int month = 2; // 월을 데이터 제공 ....
		String res = ""; // 빈문자열 초기화
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			res = "월이 아닙니다.";
		}
		System.out.println(month + "월은 " + res + "일까지 입니다.");

		// 난수 (랜덤값 : 임의의 추출값)
		// java (사용하고자하는 다양한 자원을 미리 생성해 두었어요 >> 찾아서 >> 사용 JAVA API)
		// 도움말 (찾아서 써라) api문서
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// 원하는 자원을 찾아서 사용방법을 파악하고 처리하는게 FM >> 대부분은 구글과 네이버를 사용합니다
		// java.lang.Math 클래스 찾았어요
		// public static double random()
		// equal to 0.0 and less than 1.0. 범위의 난수르르 얻을 수 있다
		// 결과 : double 실수 return 0.0 <= random < 1.0

		// 원칙적인 방법
		// 쓰고자하는 자원이 있는 폴더를 open
		// import java.lang.* >> java 폴더안에 lang 폴더 안에 있는 모든 자원은 사용가능

		System.out.println("Math.random() : " + Math.random()); // 재수가 나쁘면 같은 값나올수도
		// 0~9
		System.out.println("Math.random() *10 : " + (Math.random() * 10));
		System.out.println("(int) (Math.random() *10) : " + (int) (Math.random() * 10));
		// 1~10
		System.out.println("((int) (Math.random() *10) + 1) : " + ((int) (Math.random() * 10) + 1));
	}
}

/*
 * 우리는 백화점 경품 시스템을 만들려고 한다 경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
 * 
 * 경품 추첨시 1000 점수가 나오면 경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 900 점수가 나오면 경품으로 NoteBook , 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 800 점수가 나오면 경품으로 냉장고 , 한우세트 , 휴지
 * 
 * 경품 추첨시 700 점수가 나오면 경품으로 한우세트 , 휴지
 * 
 * 경품 추첨시 600 점수가 나오면 경품으로 휴지
 * 
 * 그외 점수는 100 ~ 500 까지는 칫솔
 * 
 * 경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다 사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이
 * 나오게 되어 있습니다.
 * 
 * 프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
 */

//		int jumsu = ((int)(Math.random()* 10) + 1)*100;
//		  System.out.println("추첨번호 : " + jumsu);
//		  String msg="";//초기화
//		  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
//		  switch(jumsu) {
//		  	case 1000:msg+="Tv";
//		  	case 900:msg+="NoteBook ";
//		  	case 800:msg+="냉장고 ";
//		  	case 700:msg+="한우 ";
//		  	case 600:msg+="휴지 ";
//		  	     break;
//		  	default:msg+="칫솔";     
//		  }
//		  System.out.println(msg);

// switch(whrjs) 정수만 .. 아니죠
// 조건식은 "문자열"도 가능 , "문자" 가능

//		String m = "F";
//		String f = "";
//		switch(m) {
//		case "A":
//		case "B":
//		case "C":
//		case "D":
//		case "E":
//		case "F":
//		case "G": f="ok";
//			break;
//		case "H":
//		case "K": f= "no";
//			break;
//			defualt : f ="no data";
//		}
//		System.out.println("결과 : " + f);
//	}
//		
////		int jumsu = ((int)(Math.random() *10) + 1)*100;
////		ystem.out.println("추첨번호 : " + jumsu);
////		int jumsu = ((int)(Math.random()* 10) + 1)*100;
////		  System.out.println("추첨번호 : " + jumsu);
//		
//	}
//
//}
