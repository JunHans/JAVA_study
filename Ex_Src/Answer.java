
public class Answer {

	public static void main(String[] args) {
		
		//[1번 문제]
		//알파벳(A~Z) 까지 출력하는 프로그램을 작성하세요
		//(for 문을 사용하세요)
		for(char i = 'A'; i <='Z' ; i++) {
			System.out.print(i);
		}
		
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + " ");
		}		
		
		System.out.println();
		
		
		//[2번 문제]
		//1~100까지 10행 10열로 출력하는 프로그램을 작성하세요
		//(for문을 사용하세요)
		//ex)
		//1 2 3 4 5 6 7 8 9 10
		//11 12 13 .....
		//91 92 93 94 ... 100
		for(int i=1; i<=100; i++) {
			System.out.print(i+ " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}	
		
		
		//[3번 문제]
		//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요 
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) { //6, 6 주사위 친구 조합
                if (i + j == 6) { //두 눈의 합이 6인 경우 
                    System.out.print(i +","+j + "\t"); //출력합니다.   // \t 띄어쓰기
                }
             }
        }

	}

}
