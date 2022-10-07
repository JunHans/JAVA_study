import java.util.Arrays;
import java.util.Random;

/*
1. 로또는 1~45끼지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
2. 배열의 담긴 6개의 배열값은 주복값이 나오면 안됨(중복값에 대한 검증 코드)
3. 배열에 있는 6개의 값은 낮은순으로 정렬시켜라(자리바꿈)
4. 위 결과를 담고있는 배열을 출력하세요
main 안에서 모두 작성해도 되고
Staitc 함수로 만들어 기능 나누는 것은 가능

별도의 Lotto.java 클래스는 생성하지 마세요

 */


public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		Random random = new Random();
//		int random = ((int)(Math.random()*45)+1);
		
		int[] lotto = new int[6];  //초기값을 통해서 배열 개수 정의하고 값을 할당
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ((int)(Math.random()*45)+1);  //1~45까지 난수발생 >> 배열에 담기
//			System.out.println(lotto[i]);
			for(int j=0; j<i; j++) {   //i는 j보다 하나 전 값
				if(lotto[i] == lotto[j]) {
					i--;
					break; //중복을 찾은 후 불필요하게 다시 앞앞앞앞순번 배열값까지 비교할 필요가 없기떄문에
					       //****** break;는 어디에 있던간에 속한 for 문을 종료시킨다 ******
				}
			}//System.out.println("new : "+lotto[i]);
		}
		String resultArray = Arrays.toString(lotto);
		System.out.println("당신의 로또번호는요!");
		Arrays.sort(lotto);   //자동 정렬이 되버림 자리바꿈
		resultArray = Arrays.toString(lotto); 
		System.out.println(resultArray);

//		System.out.printf("당신의 로또번호는요!" + " : " + " + lotto[i]);
	}

}
/*
 <배열의 순서를 바꾸는 것>
for (int i = 0; i < lotarr.length; i++) {
	for(int j = 0; j < lotarr.length-i-1; j++) {
	if (lotarr[j] > lotarr[j+1]) {
		int tmp = lotarr[j+1];
		lotarr[j+1] = lotarr[j];
		lotarr[j] = tmp;
	}
	}
	
} 
 */

