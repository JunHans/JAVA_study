package pracLife01;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {

		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("�Է��� �ݾ� :");
		money = Integer.parseInt(scan.nextLine()); // ���������� �ؼ� int�ٽ� �� �ʿ� ����

		// ȭ��ż� = int(�Է��ѱݾ� / ȭ�����)

		boolean auto = true;
		while (auto) {
			num = (int) (money / unit); // �������� �Ҽ����� ����� ������ int�� ����ȯ�� ������ ���ش�(�����) �ɽ���
			System.out.printf("ȭ�����:%d, ȭ��ż�:%d \n", unit, num);

			if (unit > 1) {
				money = money - unit * num;
				if (sw == 0) {
					unit = unit / 2;
					sw = 1;
				} else {
					unit = unit / 5;
					sw = 0;
				}
			} else {
				break;
			}
		}

	}

}
