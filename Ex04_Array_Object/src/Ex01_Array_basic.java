import java.util.Arrays;

/*
�迭�� ��ü�� (Array)
1. new�� ���� ����
2. ��ü�ϱ� Heap �޸� ��� (�����ڿ�)
3. �ٸ� ���� = �����迭(�����迭) : ������ �ѹ� �����ϸ� (ũ�Ⱑ ��������) ���� �Ұ�  <= �ݴ� =>  collection(����) 
4. �ڷᱸ�� (�˰���) �� ���� �������� �н� 
 */


public class Ex01_Array_basic {

	public static void main(String[] args) {
		//���� Ÿ���� ���� �������� �����ؼ� �����͸� ó���ϼ���
		int s;
		int s1;
		int s2;
		
		int a, a1, a2;
		//....
		//�迭
		int[] score = new int[4];
		//Ÿ��[] ������ = new ����
		//intŸ���� �� 4�� ���� ... heap ���ӵ� ������ >> ���̸�(index(÷��): [0][1][2]....)
		System.out.println(score[0]);
		score[0]=101;
		score[1]=20;
		score[2]=300;
		score[3]=500;
		//score[4]=111;
		//(����) java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 41
		//���� ������ �׻� index ������ 1�� ũ�� (n-1 �� ���� ������ index)
		
		System.out.println(score[3]);
		
		//Array �迭 ���� ���� ���( for�� )
		for(int i = 0; i < 4; i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		
		for(int i=0; i < score.length; i++) {  //�̰� �ϱ�... �迭�� ���� score.length
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		//Tip  Arrays.toString(score)1 ���������� (�Ƿ��� ����)
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);  //[101, 20, 300, 500]
		
		//Tip  : sort ��а� ���� ������32
		Arrays.sort(score);   //�ڵ� ������ �ǹ��� �ڸ��ٲ�
		resultArray = Arrays.toString(score); 
		System.out.println(resultArray);  // [20, 101, 300, 500] 
	
		//���� �˰��� (�ּ� ��������)
		
		//Today Point
		//�迭 ���� 3���� (�ϱ�)
		int[] arr = new int[5];  // �⺻
		int[] arr2 = new int[]{100, 200, 300};  //�ʱⰪ�� ���ؼ� �迭 ���� �����ϰ� ���� �Ҵ�
		int[] arr3 = {11, 22, 33};  //�����Ϸ����� �ڵ����� new �κ��� ��Ź ... (0)  --> "���� ���� ���� ���"
		//Tip) javascript : let cararr = [1,2,3,4];
		
		//���
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//�迭�� ��ü�� (new ... heap �޸𸮿��� �ε�)
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4);  //�ּҰ� ��� : [I@6a5fc7f7
		
		int[] arr5 = arr4;  //���� �ּ� 
		System.out.println(arr4 == arr5);  //true
		
		//�迭�� Ÿ���� : 8���� �⺻ + String + Ŭ����(Ÿ���̴ϱ�)
		String[] atrarr = new String[] {"��","��","��"};
		for(int i = 0; i<atrarr.length; i++) {
			System.out.println(atrarr[i]);
		}
		
		char[] carr = new char[5];
		float[] farr = new float[4];
		
		/*
		class Car {}
		 */
		//Car[] cararr = new Car[5];
	}

}
