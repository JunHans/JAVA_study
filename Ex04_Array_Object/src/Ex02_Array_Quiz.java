import java.util.Iterator;

public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// ������ �л����� �⸻��� ���������Դϴ�
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max < 79
		int min = score[0]; // max < 79
		/*
		 * ����� ���ؼ� max��� ������ ���������߿� �ִ밪�� ��� min�̶�� ������ �÷����� �� �ּҰ��� Ž������ ��� = max > 97,
		 * min > 54 ��) for���� �ѹ��� ����ϼ���
		 */
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				System.out.println(score[i]);      //for ���� ��� ���ϱ� ���� ���������� ū ���� score[i]�� ���̰� �װ� max�� �ȴ�
			}
			if (score[i] < min) {
				min = score[i];
				System.out.println(score[i]);
			}
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		int[] numbers = new int[10];
		// 10���� ���� ���� 1 ~ 10������ �ʱ�ȭ ���Ѷ�
		// for������ [0]=1, [9]=10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			// 0�����濡�� 1��, 1��°�濡�� 2��, ~
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("******************************************");

		// ����л��� ��߰�� �������� (5����)
		int[] jumsu = { 100, 55, 90, 60, 78 };
		int sum = 0;
		float avg = 0f;

		// 1. �Ѱ����� ��
		// 2. ������ ��
		// 3. ������ ���
		// ��, 2,3������ �ϳ��� for������ �ذ�

		System.out.println(jumsu.length);

		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) { // ������ ��
				avg = sum / (float) jumsu.length;
			}
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.printf("�Ѱ����:[%d],����:[%d],���:[%f]", jumsu.length, sum, avg);
	}
}
