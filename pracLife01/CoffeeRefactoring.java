package pracLife01;

import java.util.Scanner;
//bean �� ������ �����ðڽ��ϱ�? - ���������� or ��ī���� ����  bean : "espresso�� || "decaffeine��
//�����̽��� �Ͻðڽ��ϱ�, ���� ���̽��� �Ͻðڽ��ϱ�?        - �� or ���� ����  contain: "water�� || "milk�� || ����
//�÷��� �����ó���? -                             - syrup: "vanilla�� || "chocolate�� || ����
//��� : �̸� bean: , contain: , syrup : 

public class CoffeeRefactoring {
	private String bean;
	private String contain;
	private String syrup;
	private int beanNum; // ���� �޾ƿ��� ������
	private int baseNum; // ���� �޾ƿ��� ������
	private int syrupNum; // ���� �޾ƿ��� ������

	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println();

		while (true) {
			menuInfo(); // �ȳ� & �޴��� ���
			int s = Integer.parseInt(sc.nextLine()); // �޴����� ���� �Է��� ����

			switch (s) { // �Է��� ���� s ����
			case 1:
				printBean(); // Bean ���� & ���
				beanNum = chooseBean();  //�� �ڵ� �����ε� chooseBean�� ȣ��ǰ� ����� �� beanNum���� ����ȴ�
				if (beanNum == 1) { // ���������� ���� & ���
					printBase();

					baseNum = chooseBase();
					if (baseNum == 1) { // �� ���̽� ���� & ���
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						} else if (syrupNum == 2) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						}
					} else if (baseNum == 2) { // �� ���̽� ���� & ���
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						} else if (syrupNum == 2) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						}
					}
				} else if (beanNum == 2) { // ���������� ���� & ���
					printBase();

					baseNum = chooseBase();
					if (baseNum == 1) { // �� ���̽� ���� & ���
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						} else if (syrupNum == 2) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						}
					} else if (baseNum == 2) { // �� ���̽� ���� & ���
						printSyrup();

						syrupNum = chooseSyrup();
						if (syrupNum == 1) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						} else if (syrupNum == 2) { // �÷� ���� & ���
							result(beanNum, baseNum, syrupNum);// �� ��ģ ����� ���
						}
					}
				} else {
					System.out.println("Bean�� ���� �����ؾ� �մϴ�"); // ��� ��
				}
				break;

			case 2:
				System.out.println("�ý����� �����մϴ� ^^7"); // 2�� �Է��� ��� �ý������� �ڵ�
				System.exit(0);
				break;
			default:
				System.out.println("       �߸��� ���� �Է��ϼ̽��ϴ�"); // 1, 2�� �ƴ� �ٸ� ���ڸ� �Է��� ��� ��� ���
				System.out.println("          �ٽ� �Է����ּ���");
			}
		}
	}

	// �޴��� ���
	private void menuInfo() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("  ���� ���� �ý��ۿ� ���� ���� ȯ���մϴ�");
		System.out.println("        <<���� �ֹ� ����>>");
		System.out.println("         1. Bean ����");
		System.out.println("         2. ���̽� ����");
		System.out.println("         3. �÷� ���� ����");
		System.out.println("         4. �ý��� ����");
		System.out.println("  ������ ����˴ϴ�. ������ ���� �����ϼ���");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ���α׷��� �����Ͻ÷��� <1��>�� �����ֽð�");
		System.out.println(" ���α׷��� �����Ͻ÷��� <2��>�� �����ּ��� ^^7");
	}

	// Bean ���� ���
	public void printBean() {
		System.out.println();
		System.out.println("���� ����");
		System.out.println("1. ����������");
		System.out.println("2. ��ī���� (�߰��ݾ� X)");
		System.out.println();
		//chooseBean();
	}

	// Bean ����
	public int chooseBean() {
		System.out.println("���Ͻô� ���Ḧ �������ּ���");
		int b = Integer.parseInt(sc.nextLine());
		if (b != 1 && b != 2) {
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�");

		}
		return b;
	}

	// ���̽� ���
	private void printBase() {
		System.out.println();
		System.out.println("���̽� ����");
		System.out.println("1. �� ���̽�");
		System.out.println("2. ���� ���̽�");
		System.out.println();
		//chooseBase();
	}

	// ���̽� ����
	public int chooseBase() {
		System.out.println("���Ͻô� ���̽��� �������ּ���");
		int w = Integer.parseInt(sc.nextLine());
		if (w != 1 && w != 2) {
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�");
			chooseBase();
		}
		return w;
	}

	// �÷� ���
	private void printSyrup() {
		System.out.println();
		System.out.println("�÷� ����");
		System.out.println("1. ���� �÷�");
		System.out.println("2. �÷� �߰� ����");
		System.out.println();
		//chooseSyrup();
	}

	// �÷� ����
	public int chooseSyrup() {
		System.out.println("���Ͻô� �÷��� �������ּ��� (200�� �߰�)");
		int s = Integer.parseInt(sc.nextLine());
		if (s != 1 && s != 2) {
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�");
			chooseSyrup();
		}
		return s;
	}

	// �տ��� ��ƿ� ���������� �����Ͽ� �׿� �´� ��� �� ���
	public void result(int beanNum, int baseNum, int syrupNum) {
		System.out.println();
		if (beanNum == 1 && baseNum == 1 && syrupNum == 1) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� �Ƹ޸�ī�� + �����÷� �߰��Դϴ�>\n<���� : 3400��>");
		} else if (beanNum == 1 && baseNum == 1 && syrupNum == 2) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� �Ƹ޸�ī���Դϴ�>\n<���� : 3200��>");
		} else if (beanNum == 1 && baseNum == 2 && syrupNum == 1) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ī��� + �����÷��߰��Դϴ�>\n<���� : 3900��>");
		} else if (beanNum == 1 && baseNum == 2 && syrupNum == 2) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ī����Դϴ�>\n<���� : 3700��>");
		} else if (beanNum == 2 && baseNum == 1 && syrupNum == 2) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ��ī���� �Ƹ޸�ī�� + �����÷��߰��Դϴ�>\n<���� : 3400��>");
		} else if (beanNum == 2 && baseNum == 1 && syrupNum == 1) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ��ī���� �Ƹ޸�ī���Դϴ�>\n<���� : 3200��>");
		} else if (beanNum == 2 && baseNum == 2 && syrupNum == 2) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ��ī���� ī����Դϴ�>\n<���� : 3700��>");
		} else if (beanNum == 2 && baseNum == 2 && syrupNum == 1) {
			System.out.println("<¥��~~! ������ �ֹ��Ͻ� ����� ��ī���� ī��� + �÷��߰��Դϴ�>\n<���� : 3700��>");
		} else {
			System.out.println("<��? ���տ� ���� �ʴ� �ֹ��Դϴ�>");  //��� �ʿ����
		}
	}

//	public void result(int beanNum, int baseNum, int syrupNum) {
//		this.beanNum = beanNum;
//		this.baseNum = baseNum;
//		this.syrupNum = syrupNum;
//		
//		System.out.println("������ �ֹ��Ͻ� �����[%S]�Դϴ�", );
//	}

}
