package pracLife01;

public class novice_Prac {

	public static void main(String[] args) {
		int[] data = { 88, 50, 65, 80, 25, 65 };
		// 60�� �Ѵ� �������� �հ�, ����, ����� ���ϱ�
		// ����� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ������ ����

		// �������� ������ len�� ����
		int len = data.length;
		// �հ踦 ������ ����
		int sum = 0;
		for (int i = 0; i < len; i++) {
			// 60�̻��� ��쿡
			if (data[i] >= 60) {
				sum = sum + data[i];
			}
		}
		System.out.println("�հ�: " + sum);
		System.out.println();

		int[] data1 = { 88, 50, 65, 80, 25, 65 };
		// 60�� �Ѵ� �������� �հ�, ����, ����� ���ϱ�
		// ����� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ������ ����

		// �������� ������ len�� ����
		int len1 = data.length;
		// �հ踦 ������ ����
		int sum1 = 0;
		// ������ ������ ������ ����
		int cnt1 = 0;
		for (int i = 0; i < len; i++) {
			// 60 �̻��� ��쿡
			if (data[i] >= 60) {
				sum1 = sum1 + data1[i];
				cnt1 = cnt1 + 1;
			}
		}
		System.out.println("�հ�:" + sum1);
		System.out.println("����:" + cnt1);
		System.out.println();

		int[] data2 = { 88, 50, 65, 80, 25, 65 };
		// 60�� �Ѵ� �������� �ղ�, ����, ����� ���ϱ�
		// ����� �Ҽ� ù°�ڸ����� �ݿø��ؼ� ������ ����

		// �������� ������ len�� ����
		int len2 = data2.length;
		// �հ踦 ������ ����
		int sum2 = 0;
		// ������ ������ ������ ����
		int cnt2 = 0;
		for (int i = 0; i < len2; i++) {
			if (data2[i] >= 60) {
				sum2 = sum2 + data2[i];
				cnt2 = cnt2 + 1;
			}
		}
		System.out.println("�հ�:" + sum2);
		System.out.println("����:" + cnt2);

		// ����� �Ҽ� ù°�ڸ����� �ݿø��ؼ� ������ ���
		if (cnt2 == 0) {
			System.out.println("���ǿ� �´� �����Ͱ� �����ϴ�");
		} else {
			int avg = (int) ((double) sum2 / cnt2 + 0.5);
			System.out.println("���:" + avg);
		}
		System.out.println();

		// �������� ������ �𸣴� ���
		int max = data2[0];
		int min = data2[0];

		for (int i = 0; i < len2; i++) {
			// �ִ밪���� �����Ͱ� ��ũ�� �����͸� �ִ밪�� ����
			if (max < data2[i]) {
				max = data2[i];
			}

			// �ּҰ����� �����Ͱ� �� ������ ����Ŀ�� �ּҰ��� ����
			if (min > data2[i]) {
				min = data2[i]; // min ������ ����� ������ �� ���� ���� �迭�� ���� ���,
			}                   // min�� �ش� ���� �����մϴ�.

		}
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);
		System.out.println();
		
		
		
		//�ִ밪�� ���� �������� �ε����� ã��
		//�ִ밪�� ������ ������ �ִ밪�� �ε����� ������ ������ ����
		//max = 0;
		//int idx = -1;
		
		//�����ϴ� �����ͷ� max�� �ʱ�ȭ �Ҷ���
		//�ε����� �����ϴ� ������ �ʱ�ȭ�� �ؾ��Ѵ�
		int max1 = data2[0];
		int idx = 0;
		
		for(int i=0; i<len2; i++) {
			if(max1 < data2[i]) {
				max1 = data[i];
				//�ִ밪�� ����� ���� ��ġ�� idx�� ����
				idx = i;
			}
		}
		System.out.println("�ִ밪 " + max + "�� ��ġ�� " + idx);
		System.out.println();
		
		
		//77�� ���� ����� �� ã��
		//���� ����� ���� ã�� ������ �Ÿ��� ����ؼ� �Ÿ��� �ּҰ��� ã�ƾ� �Ѵ�
		//�Ÿ��� ����� ���;� �Ѵ�
		//���� �˰��򿡼��� �Ÿ��� �����ؼ� ����Ѵ�
		//�̰� ������ �л��̳� ǥ�������� ������ �Ѵ�
		
		int min1 = 1000000;  //�ּҰ��� ���� ū ������ �ʱ�ȭ
		//�Ÿ��� �ּҰ��� �����ϱ� ���� ����
		int distanceMin = 1000000;
		//�Ÿ��� �ּҰ��� ��ġ�� ������ �ε���
		int idx2 = -1;
		for(int i=0; i<len2; i++) {
			//�Ÿ����
			int distance = 77-data2[i];
			//�Ÿ��� �����̸� ����� ��ȯ
			if(distance < 0) {
				distance = -distance;
//				idx2 = i;
//				min1 = data2[i];
			}
			if(distanceMin > distance) {  // idx�� ��(�ε��� ��ġ)�˱����� �ڵ�
				//�Ÿ��� �ּҰ��� ����
				distanceMin = distance;
				//�����͸� min�� ����
				min1 = data2[i];
				//�ε����� idx�� ����
				idx2 = i;
			}
		}
		System.out.println("77�� ���� ����� �� : " + min1 +" ��ġ�� "+ idx2);
	}

}
