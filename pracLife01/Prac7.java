package pracLife01;

public class Prac7 {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int c = 0;

		for (b = 1; b <= a; b++) {
			if (b % 3 == 0) {
				System.out.print(" " + "짝");
			} else {
				System.out.print(" " + b);
			}
		}
			
//			while(tmp > 0){
//			    나머지 = tmp % 10
//			    if(나머지 == 3) System.out.println(”짝”)
//			    else System.out.println(나머지)
//			}
//			나머지를 구하는 연산으로 풀게 될 경우 15같은 수도 짝 소리가 나게 됩니다.
//			그래서 이러한 경우 15에서 1과 5로 구분하는 일이 필요합니다.
//			while문 안에 나머지 연산을 같이 사용하시면 구분할 수 있습니다.
//			이런 코드를 for문 안에서 돌려야 제대로된 값을 나오게 할 수 있을것같습니다.
//			[박예슬 조 왈]
		

	}
}
