package pracLife01;

import java.io.DataOutput;

class arr2 {

	public static void main(String[] args) {
		//2���� �迭
		int[][]scores = new int[3][3]; // 3*3��� �迭 ����
		int[][]scores1 = new int[3][]; // ��� ���� �迭 ����
		scores1[0] =new int[2];   //0��° �ε����� 2ĭ�� ��� ����
		scores1[1] = new int[3];  //1��° �ε����� 3ĭ�� ��� ����
		// 0 1
		// 0 1 2 ���

		
		//�� ����� �̿��� 2���� �迭 ����
		//Ÿ��[][]���� = {{��1,��2},{��1,��2},{��1,��2}...};
		//�߰�ȣ ���� ������ �� �� , �� �� ����� ������ �� �� �ȴ�
		int[][] arr1 = {{1,11},{2,22},{3,33}};
		// 1 11
		// 2 22
		// 3 33 ���  3��2��
		int a =arr1[0][0]; // = 1
		int b =arr1[0][1]; // = 11
		
		int[][]arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[2];
		// 0 0
		// 0 0 0
		// 0 0

		int[][] arr3 = {{1,11},{2,22},{3,33,333}};
		for(int i = 0; i<3; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.printf("arr2[%d][%d]=[%d]\n",i,j,arr3[i][j]);
			}
		}
		String[]arr7 = new String[3];
		arr7[0] = "java";
		arr7[1] = "java";
		arr7[2] = new String("java");
		System.out.println(arr7[0] == arr7[1]);  //true
		System.out.println(arr7[0] == arr7[2]);  //false
		System.out.println(arr7[0].equals(arr7[2]));  //true equals �����ڴ� �ּҹ����� �ƴ�
													  //����ü�� ���ϱ� ����
		//�迭�� ���� ���(forȰ��)
		int[] arr8 = {1,2,3};
		int[] arr9 = new int[5];
		for(int i =0; i<arr8.length; i++) {
			arr9[i] = arr8[i];
		}
		for(int i =0; i<arr9.length; i++) {
			System.out.println(arr9[i]);
		}
		//System.arraycopy(Object src, int srcPos,Object dest, int destPos.int length);
		//                   �����迭 / �ε��� / ���迭 / �ε��� / ����
		//�迭�� �ѹ� ����Ǹ� �ٲܼ� ���⿡ ���ο� �迭���� �����ؼ� �߰��ؾ� �Ѵ�
		int[] arr10 = {1,2,3};
		int[] arr11 = new int[5];
		System.arraycopy(arr10, 0, arr11, 0, arr10.length);
		//System.arraycopy.(� �迭�� �����Ұ�����, ��𼭺��� �����Ұ���, ��迭�� �ٿ���������,�׹迭�� ��𼭺��� �ٿ�������)
		for(int i=0; i<arr11.length; i++) {
			System.out.println(arr11[i]);
		}
		
		
		// <���� for�� & ������ for��>
		//�迭�� �ִ� ���ڵ��� �ϳ��� �������ִ� for�� / �ݺ����� ����ī���ͺ����� ������ ���X
		
		//  for(Ÿ�� ���� : �迭) {
		//	  ���๮
		//   }
		int[] arr12 = {10,20,30,400,50};
		
		int sum = 0;
		for(int too : arr12) {
			sum+=too;
		}
		System.out.println("���� ���� : "+ sum);
		
	}

}
