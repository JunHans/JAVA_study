import java.util.Arrays;
import java.util.Random;

/*
1. �ζǴ� 1~45������ ������ �߻����Ѽ� 6���� �������� �迭�� ��������
2. �迭�� ��� 6���� �迭���� �ֺ����� ������ �ȵ�(�ߺ����� ���� ���� �ڵ�)
3. �迭�� �ִ� 6���� ���� ���������� ���Ľ��Ѷ�(�ڸ��ٲ�)
4. �� ����� ����ִ� �迭�� ����ϼ���
main �ȿ��� ��� �ۼ��ص� �ǰ�
Staitc �Լ��� ����� ��� ������ ���� ����

������ Lotto.java Ŭ������ �������� ������

 */


public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		Random random = new Random();
//		int random = ((int)(Math.random()*45)+1);
		
		int[] lotto = new int[6];  //�ʱⰪ�� ���ؼ� �迭 ���� �����ϰ� ���� �Ҵ�
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ((int)(Math.random()*45)+1);  //1~45���� �����߻� >> �迭�� ���
//			System.out.println(lotto[i]);
			for(int j=0; j<i; j++) {   //i�� j���� �ϳ� �� ��
				if(lotto[i] == lotto[j]) {
					i--;
					break; //�ߺ��� ã�� �� ���ʿ��ϰ� �ٽ� �վվվռ��� �迭������ ���� �ʿ䰡 ���⋚����
					       //****** break;�� ��� �ִ����� ���� for ���� �����Ų�� ******
				}
			}//System.out.println("new : "+lotto[i]);
		}
		String resultArray = Arrays.toString(lotto);
		System.out.println("����� �ζǹ�ȣ�¿�!");
		Arrays.sort(lotto);   //�ڵ� ������ �ǹ��� �ڸ��ٲ�
		resultArray = Arrays.toString(lotto); 
		System.out.println(resultArray);

//		System.out.printf("����� �ζǹ�ȣ�¿�!" + " : " + " + lotto[i]);
	}

}
/*
 <�迭�� ������ �ٲٴ� ��>
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

