package pracLife01;

import java.util.Random;

public class fourArray {

	public static void main(String[] args) {
		int[] array4 = new int[4];
		Random ran = new Random();

//		int num = (int) ((Math.random() * 9) + 1);  
//		System.out.println(num);

		for (int i = 0; i < array4.length; i++) {
			array4[i] = (int) ((Math.random() * 9) + 1);  //�ǿ��� ���� num�� ���� ��� i�� �� ���� ���� ����
			for (int j = 0; j < i; j++) {
				
				if (array4[i] == array4[j]) {  //���� ���� ���ٸ� i�� �ѹ� ���Ų��...
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
