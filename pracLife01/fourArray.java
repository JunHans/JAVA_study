package pracLife01;

import java.util.Random;

public class fourArray {

	public static void main(String[] args) {
		int[] array4 = new int[4];
		Random ran = new Random();

//		int num = (int) ((Math.random() * 9) + 1);  
//		System.out.println(num);

		for (int i = 0; i < array4.length; i++) {
			array4[i] = (int) ((Math.random() * 9) + 1);  //의에서 만든 num을 쓰면 모든 i에 다 같은 값이 들어간다
			for (int j = 0; j < i; j++) {
				
				if (array4[i] == array4[j]) {  //만약 둘이 같다면 i를 한번 백시킨다...
					i--;
					break;
				}
			}
		}
		for(int i = 0; i<array4.length; i++) {
			System.out.printf("[%d]", array4[i]);
		}
		

	}

}
