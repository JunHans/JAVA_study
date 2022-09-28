import java.util.Scanner;

import pracLife01.ifp;

public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		//메뉴를 보여주고 사용자에게 선택하게
		//다른 것을 선택한다면 다시 선택하도록 강제하는 메뉴
		//while(true)방법
		//do~while()방법
		
		double random = Math.random();
		System.out.println(random); // 0<= random < 1
		random = Math.floor(3*random+1); //1 <= random < 4;
		System.out.println((int)random);
		
		
		boolean auto = true;
		int balance = 0;  //잔액
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("*********************************");
			System.out.println("1. 가위 | 2. 바위 | 3. 보 ");
			System.out.println("*********************************");
			
			System.out.println("선택하세요");
			
			int input = Integer.parseInt(sc.nextLine());
			
			//판단
			switch(input){
			case 1 : System.out.println(random);
					 balance += Integer.parseInt(sc.nextLine());
					 break;
			case 2 : System.out.println(random);
					 balance -= Integer.parseInt(sc.nextLine());
					 break;
			case 3 : System.out.println(random);
			 		 break;
//			case 4 : System.out.println("종료합니다");
//					 auto =false;
//					 break;
			default : System.out.println("올바른 주먹을 내세요");
			}
			
			if(auto == false) {
				break;  //또는 
			}
			
			
			
			
			//참고
			/*
			 if(opr.equals("+")) {  //POINT 문자열의 비교는 == 아니고 (x) , equals (String) >> String  클래스
				  result = input_1 + input_2;
				  
			  }else if(opr.equals("-")) {
				  result = input_1 - input_2;
				  
			  }else if(opr.equals("*")) {
				  result = input_1 * input_2;
				  
			  }else if(opr.equals("/")) {
				  result = input_1 / input_2;
			  }else {
				  System.out.println("지원하지 않는 연산자 입니다");
				  //key point (여기서는 main 함수)
				  //return 키워드 :  [함수단위]의 종결자  > main 함수 탈출 > 종료
				  return ;
				 
				  //System.exit(0); //강제적인 프로그램 종료
			  }
			*/
		}

	}

}
