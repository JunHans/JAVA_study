package pracLife01;

class arr1 {

	public static void main(String[] args) {
		// Array => Ÿ��[] ���� = null;
		// 1�� : Ÿ��[] ���� = {��0, ��1, ��2, ��3...};
		int[] arry1 = { 0, 1, 2, 3, 4 };
		System.out.println("arry1 [0]: " + arry1[0]);
		System.out.println("arry1 [1]: " + arry1[1]);
		System.out.println("arry1 [2]: " + arry1[2]);
		System.out.println("arry1 [3]: " + arry1[3]);
		System.out.println("arry1 [4]: " + arry1[4]);

		int sum = 0;
		for (int i = 0; i < arry1.length; i++) {
			sum += arry1[i]; // �迭�� ����
		}
		System.out.println("����: " + sum);
		double avg = (double) sum / arry1.length;
		System.out.println("��հ�: " + avg);

		//1-1 �迭 ���� �̸� ������ �� �� ����� ���߿� �����Ǵ� ���
		int[] arry2;
		arry2 = new int[] {10,20,30,40,50};
		
		
		// 2�� : Ÿ��[] ���� = new Ÿ��[���� ����];  �迭 ���� �̸� ������ �� �� ����� ���߿� �����Ǵ� ���
		int[] arry3 = new int[30];
		for(int i=0; i<arry3.length; i++) {
			System.out.printf("arry3[%d]\n",arry3[i]);
			//�⺻ ������ ���δ� 0 �����Ǿ� ���� String�̸� �Ʒ�ó�� null
		}
		
		String[] arry4 = new String[10];
		for(int i=0; i<arry4.length; i++) {
			System.out.printf("arry4: [%s]\n",arry4[i]);
		}
		//�迭 ����� ���Ŀ� �迭�� ���ֱ�
		arry4[0]="0";
		arry4[1]="1";
		arry4[2]="2";
		arry4[3]="3";
		for(int i=0; i<arry4.length; i++) {
			System.out.printf("arry4: [%s]\n",arry4[i]);
		}
		
		
	}

}
