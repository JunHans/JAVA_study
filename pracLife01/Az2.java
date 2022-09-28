package pracLife01;

public class Az2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) { //6, 6 주사위 친구 조합
                if (i + j == 6) { //두 눈의 합이 6인 경우 
                    System.out.print(i +","+j + "\t"); //출력합니다.
                }
             }
        }
		
		}

	}
