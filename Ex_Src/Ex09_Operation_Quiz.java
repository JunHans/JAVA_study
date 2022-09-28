import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		/*

		간단한 사칙 연산기 (+ , - , * , /)

		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)

		목적 : Integer.parseInt() ,  **equals() 활용**

		화면

		>입력값:숫자

		>입력값(기호): +

		>입력값:숫자 

		>연산결과 :200
		-------------

		>입력값:100

		>입력값(기호): -

		>입력값:100

		>연산결과 :0
		*/
		int one = 0;
		int two = 0;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("숫자를 입력하세요 : ");
			one = Integer.parseInt(sc.nextLine());
			
			System.out.print("부호를 입력하세요 : ");
			String three = sc.nextLine();
			
			System.out.print("다음 숫자를 입력하세요 : ");
			two = Integer.parseInt(sc.nextLine());
			
			
			if(three.equals("+")) 
				System.out.println(one + "+" + two + "=" + (one+two));
			else if(three.equals("-")) 
				System.out.println(one+"-"+two+"="+(one-two));
			else if(three.equals("*")) 
				System.out.println(one+"*"+two+"="+(one*two));
			else if(three.equals("/")) 
				System.out.println(one+"/"+two+"="+(one/two));
			
			


	}

}
////문자열의 비교는 ==을 쓰지 않는다
//자세한건 나중에)
//그래서 일단
//String atr = "+"; 이런값이 있다


