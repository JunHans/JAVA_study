package pracLife01;

import java.io.DataOutput;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class lotto_epic {
	private int[] lotto = new int[6];
	private int[] personalNum = new int[6];

	Random random = new Random();
	Scanner sc = new Scanner(System.in);

//	int ni = Integer.parseInt(sc.nextLine());

	
	
	void start() {
		while(true) {
			switch (menu()) {
			case 1: numberInput();
				break;
			case 2: numberOutput();
				break;
			case 3: System.out.println("�ζ� ���α׷� ����");
			    //return;  >> main �Լ� ����
			    System.exit(0); //���α׷� ����
			}
		}
	}
	
	
	
	
	void numberInput() { // 1�� �����ϸ� ������Է°� �迭�� �Է�
		System.out.println("����� ���� �Է�");
		numInput();
		numOutput();
		System.out.println();
//		if(ni == personalNum.length) {
//		System.out.println(personalNum[ni]);
//		}
	}

	void numberOutput() { // 2�� �����ϸ� lotto ��ȣ ����
		System.out.println("<�ζǹ�ȣ ����մϴ�>");
		lottoStart();
		numOutput();
		compareNum();
	}

	void systemExit() {
		System.out.println("�ý��� �����մϴ�");
	}

	int menu() {
		System.out.println("***�ζ� ���α׷� ����***");
		System.out.println("1 �Է� �� Enter : �������� 6�� ��ȣ �Է�");
		System.out.println("2 �Է� �� Enter : 1���ȣ �������");
		System.out.println("3 �Է� �� Enter : �ζ� ���α׷� ����");
		System.out.println();

		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); // 1 or 2 �Է�
				if (menu >= 1 && menu <= 3) {
					break; // do~while Ż��
				} else {
					throw new Exception("�޴� ��ȣ ������ �߸� �Ǿ����ϴ�");
				}
			} catch (Exception e) {
				System.out.println("< error!!! : " + e.getMessage() + " >");
				System.out.println("---�޴��� ���� ���� ����---");
				System.out.println("1~3������ ���ڸ� �Է��Ͻʽÿ�");
			}
		} while (true);

		// 1~2���� �� �ϳ��� �����ߴٸ�
		return menu;
	}

	
	void Write() {
		Date currdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy��MM��dd��HH��mm��");
		
	    String s =	dateformat.format(currdate);
		System.out.println(s);
	}
	void Read() {
		
	}
	
	public void lottoStart() {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45) + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
//			System.out.println("���: " + lotto[i]);  //Ȯ�ο�
		}
		String resultArray = Arrays.toString(lotto);
//		System.out.println("����� �ζǹ�ȣ�¿�!");
		Arrays.sort(lotto); // �ڵ� ������ �ǹ��� �ڸ��ٲ�
		resultArray = Arrays.toString(lotto);
		////////////////////
		//�ζǹ�ȣ�� ����ð� ��� ��� �߰�
		Date currdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("[yyyy�� MM�� dd�� HH:mm]");
	    String s =	dateformat.format(currdate);
		System.out.println(s);
		////////////////////
		System.out.println("�ζǹ�ȣ : "+ resultArray + s);
		
	}

	public void numInput() { // ���� �Է�
		System.out.println("<1���� 45������ ���ڸ� �Է��ϼ���>");
		for (int j = 0; j < personalNum.length; j++) {
			personalNum[j] = Integer.parseInt(sc.nextLine());
		}
	}

	public void numOutput() { // �Է��� ���� ���
		System.out.println("<���� �Է��� ��>");
		for (int j = 0; j < personalNum.length; j++) {
			System.out.print("[" + personalNum[j] + "]");
		}
		System.out.println();
	}

	public void compareNum() {
		int sum = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < personalNum.length; j++) {
				if (personalNum[j] == lotto[i]) {
					sum++;
				}
			}
			System.out.println("�Է��� ���ڿ�" + sum + "�� ��ġ�մϴ�");
			System.out.println();
		}
	}
	
	

}
