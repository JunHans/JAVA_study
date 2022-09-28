package pracLife01;

import java.util.Arrays;
import java.util.Random;

public class arr3_Lotto {

	public static void main(String[] args) {

		Random random = new Random();
		int randomnum = ((int) (Math.random() * 45) + 1);
//		System.out.println(randomnum);  //잘 나오나 확인

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45) + 1);
//			lotto[i] = randomnum;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		String resultArray = Arrays.toString(lotto);
		System.out.println("당신의 로또번호는요!");
		Arrays.sort(lotto);   //자동 정렬이 되버림 자리바꿈
		resultArray = Arrays.toString(lotto); 
		System.out.println(resultArray);
	}

}
