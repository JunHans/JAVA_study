package pracLife01;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_1 {  //�迭 �õ� 1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> member = new ArrayList<String>();  //�迭 ����
		member.add("�ڿ��� : " + "1��");                        //��� �߰�
		member.add("�ڿ��� : " + "2��");
		member.add("����ȫ : " + "3��");
		member.add("������ : " + "4��");
		member.add("������ : " + "5��");

		System.out.println("�л� ���");
		System.out.println(member);
		System.out.println();
		System.out.println("��ȸ�ϰ� ���� �л��� ��ȣ(1~5)�� �Է��ϼ���");

		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println(member.get(0));   //�ش� index �ҷ�����
			break;
		case 2:
			System.out.println(member.get(1));
			break;
		case 3:
			System.out.println(member.get(2));
			break;
		case 4:
			System.out.println(member.get(3));
			break;
		case 5:
			System.out.println(member.get(4));
			break;

		default:
			System.out.println("�ش� ������ �л��� �����ϴ� \n 1~5 �߿� �����ϼ���");  //1~5�������� ����
			break;
		}

	}
}
