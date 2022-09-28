
public class Ex10_Statement {

	public static void main(String[] args) {
		//제어문
		//조건문 : if (3가지 종류) , switch(조건){case 값 ....break}
		//반복문 : for (반복횟수가 명확) , while(진위){} , do{}~while()
		//분기문 : break(블럭탈출) , continue(아래 구문 skip)
		
		//<IF문>
		int count=0;
		if(count < 1) System.out.println("true");
		
		if(count < 1) {
			System.out.println("true");          //초보들은 중괄호 블럭 써라
		}
		
		//<스위치 문>
		char data='A';
		switch(data) {
			case 'A' : System.out.println("문자비교같아요");
				break;
			case 'B' : 
				break;
			default : System.out.println("나머지 처리");		
		}
		
		//<for문>
		int sum = 0;
		for(int i =1; i<=100; i++) {
//			System.out.println("i : " + i);
			sum += i;
		}
		System.out.printf("1~100누적합 : %d \n ", sum);
		
		//1~5까지의 합
		//for문과 while 쓰지 말고
		// 개수 * (시작값 + 끝값) /2
		sum = 5* (1+5) /2;  //하지마세요;; 우린 for문 쓰면 됨
		System.out.println("sum : " + sum);		
		
		
		//for문을 사용해서 1~10까지 홀수의 합을 구하세요
		//for(초기값 ; 조건식 ; 증가감) >> 증가감을 변경해보세요
		//1 3 5 7 9
		//result+=i; (1,3,5)
		int result = 0;
		for(int i=1; i<=10; i+=2) { //i=i+2
			result+=i;
				//result = 0 + 1
				//result = 0 + 3
				//result = 0 + 5 ...
			System.out.println("result : " + result);
		}
		
		//for 안에 if문을 사용해서 1~1000까지의 합을 구하세요
		int sum3= 0;
		for(int i=1; i <= 1000; i++) {
			//sum3 +=i;
			if(i % 2 == 0) {
				System.out.println(i);
				sum3+=i;
			}
		}
		System.out.println("sum3 : " + sum3);
	

	// 입사시험 (구구단)
	// 중첩 FOR
	// 한개의 값을 고정 ... 반복 (2 1~9 , 3 1~9)
	for(int i=2;i<=9;i++)

	// i 라는 블럭변수는 유효범위가 어디일까
		for (int j = 1; j <= 9; j++) { // j도 블럭변수
			System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
		}
		System.out.println(); // 엔터
	
	//for + (분기문) continue , break
	//: continue(아래 구문 skip) , break(for, while 블럭 탈출)
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			if(i == j) { //i=2 .. j=2 , i=3 .. j=3
				break;
			}
			System.out.printf("%s","*");
		}
		System.out.println();//엔터
	}
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<i; j++) {
			System.out.printf("%s", "*");
		}
		System.out.println();
	}
	
	
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			if(i == j) { //i=2 .. j=2 , i=3 .. j=3
				continue;
			}
			System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
		}
		System.out.println();//엔터
	}
	for(int i=2; i<=9; i++) {
		for(int j=1; j<i; j++) { //j <=9코드를 변경 >> j < 9
			System.out.printf("*");
		}
		System.out.println();			
		}
	
	//100부터 0까지 출력 .. 증가감 --i
	for(int i =100; i>=0; i--) {
		System.out.println(i);
	}
	
	//전공자분들
	//피보나치 수열 공식(간단한 for)  입사시험에 단골문제 & 정보처리기사 단골문제
	int a =0 , b = 1 , c = 0;
	for(int i=0; i<10;);
	}

}