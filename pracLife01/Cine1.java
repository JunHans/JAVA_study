package pracLife01;

import java.util.Scanner;

class Cine1 {
	private String seat1[][];
	private String seat2[][];
	private int movie;
	private int x, y;
	private String password; // ��й�ȣ�� �ٸ������ ���� ���ڷ� �����ϸ� �ߺ��Ǵ�, ������ Ȱ���ؼ�
								// ��й�ȣ ���� �ִ°� ����(��¥����, ���� ���� ���� ���ĵ� ����)

	Scanner sc = new Scanner(System.in);

//������
	public Cine1() {
		seat1 = new String[5][5];
		seat2 = new String[6][6];
	}

	// ���� ���α׷� ���� �Լ�
	public void start() {
		System.out.println("��ȭ ���� ���α׷� ����");
		System.out.println();

		initSeat(seat1);
		initSeat(seat2);

		while (true) {
			printInfo(); //�ý��� �޴� ���
			int n = Integer.parseInt(sc.nextLine());

			switch (n) {
			case 1:
				printMovie(); //��ȭ�������
				movie = selectMovie();  //��ȭ��������

				if (movie == 1) {
					printSeat(seat1); // ��ȭ�� �¼� ���� ���
					selectSeat(seat1); // ��ȭ ����
				} else {
					printSeat(seat2); // ��ȭ�� �¼� ���� ���
					selectSeat(seat2); // ��ȭ ����
				}
				break;
			case 2:
				checkInfo(); // ���� ���� Ȯ��
				break;
			case 3: // �������
				if (movie == 1) {
					drop(seat1);
				} else if (movie == 2) {
					drop(seat2);
				} else {
					System.out.println("���ų����� �����ϴ�");
				}
				break;
			case 4: // �¼�Ȯ��
				printMovie();  //��ȭ�������

				switch (selectMovie()) {
				case 1:
					printSeat(seat1);
					break;
				case 2:
					printSeat(seat2);
					break;
				default:
					System.out.println("�߸��� ���Դϴ�");
				}
				
				break;
			case 5:
				System.out.println("���� ���α׷� ���� ����");
				System.exit(0);
				break;
			default:
				System.out.println("�߸��� �Է°��Դϴ�\n�ٽ� �Է��� �ּ���");
			}
		}
	}

	// �¼� �ʱ�ȭ
	private void initSeat(String[][] seat) {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				// �¼��� �ʱ�ȭ
				seat[i][j] = "__"; // ���ڿ��� �ʱ�ȭ
			}
		}
	}

	// �޴���
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("       [��ȭ ���� �ý���]");
		System.out.println("1. �����ϱ� 2. ������ȸ 3. �������");
		System.out.println("4. �¼�Ȯ�� 5. ���α׷� ����");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.print("��ȣ�� �������ּ��� : ");
	}
	// ��ȭ ���� ���
	private void printMovie() {
		System.out.println("-----------------------------");
		System.out.println("[��ȭ ����]");
		System.out.println("| 1. �ظ����� | 2. ���������� |");
		System.out.println("-----------------------------");
		System.out.println();
	}

	// ��ȭ���� ����
	private int selectMovie() {
		System.out.println("���ϴ� ��ȭ�� �����ϼ���");
		System.out.println();
		int m = Integer.parseInt(sc.nextLine());
		if (m != 1 && m != 2) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
			selectMovie();
		}
		return m;
	}

	// �ش� ��ȭ�� �¼���Ȳ
	void printSeat(String[][] seat) {
		System.out.printf("        ");

		for (int i = 0; i < seat[0].length; i++) {
			System.out.printf("[%d��]", i);
		}
		System.out.println();

		for (int i = 0; i < seat.length; i++) {
			System.out.printf("[%d��] : ", i);
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("__") ? "����" : "�Ϸ�");
			}
			System.out.println();
		}
		System.out.println();
	}

	// ����
	private void selectSeat(String[][] seat) {
		System.out.println("���Ͻô� �¼��� �Է����ּ���");
		
		while(true) { //�¼� ������ ����� �� ����
			System.out.print("��: ");
			x = Integer.parseInt(sc.nextLine());
			if(x >= 0 && x < seat.length)
				break;
			else
				System.out.println("�ùٸ� ���� �ƴմϴ�.");
		}
		
		while(true) {	//�¼� ������ ����� �� ����
			System.out.print("��: ");
			y = Integer.parseInt(sc.nextLine());
			if(y >= 0 && y < seat[0].length)
				break;
			else
				System.out.println("�ùٸ� ���� �ƴմϴ�.");
		}
		
		password = setPass();
		System.out.println("�����ȣ : " + password);
		
		seat[x][y] = password;
	}

	// ���Ź�ȣ ����
	private String setPass() {
		int num = (int) (Math.random() * (9000)) + 1000;

		String pass = "";
		for (int i = 3; i >= 0; i--) {
			int tmp = num % 10;
			num /= 10;
			pass = pass + (tmp);
		}
		return pass;
	}

	// ������ȸ
	private void checkInfo() {
		if (movie == 0) { // 1��. �����ϱ⸦ ���ϰ�, �ٷ� 2���� ������ȸ�� ������ ���,
			System.out.println("���ų����� �����ϴ�"); // movie�� ���� �⺻���� 0�� �����̱� ������ �׷���� ���ų����� ���ٰ� ����Ѵ�
		} else {
			System.out.println("�¼� Ȯ���� ���� �����Ͻ� ��й�ȣ�� �Է����ּ���");
			String password_1 = sc.nextLine();
			if (password_1.equals(password)) {
				System.out.println("[��������]\n��ȭ : ");
				System.out.print(movie == 1 ? "�ظ�����" : "����������");
				System.out.printf("�¼�: %d�� %d��\n", x, y);
			} else {
				System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�");
			}
		}
		System.out.println();
	}

	// �������
	private void drop(String[][] seat) {
		System.out.println("���Ÿ� ����Ϸ��� �����Ͻ� ��й�ȣ�� �Է����ּ���");
		String password_1 = sc.nextLine();
		if (password_1.equals(password)) { // ��й�ȣ�� ���� ������
			password = null;               // ��й�ȣ�� null�� �ʱ�ȭ�ϰ�
			movie = 0;                     // movie�� ���� 0���� �ʱ�ȭ�ϰ�
			seat[x][y] = "__";             // �¼� ��ǥ������ ���� "__"�� �ʱ�ȭ�ϰ�
			x = 0;                         // x�� �����Ѱ� ������ �ʱ�ȭ�ϰ�
			y = 0;                         // y�� �����Ѱ� ������ �ʱ�ȭ�Ѵ�
		} else {
			System.out.println("��й�ȣ�� ���� �ʽ��ϴ�");
		}
	}

//	public void resetSeat(String[][] num) { //�¼� �ʱ�ȭ
//		for (int i = 0; i < num[i].length; i++) {
//			for (int j = 0; j < num[j].length; j++) {
//				// �¼��� �ʱ�ȭ
//				num[i][j] = "__"; // __�̶� ���ڿ��� �ʱ�ȭ
//			}
//		}
//	}
//	void rsSeat1() {
//		resetSeat(seat1);
//	}
//	void rsSeat2() {
//		resetSeat(seat2);
//	}

//	void printSeat(String[][] seat) { // �ش� ��ȭ�� �¼���Ȳ
//		for (int i = 0; i < seat.length; i++) {
//			for (int j = 0; j < seat[i].length; j++) {
//				System.out.printf("[%s]", num[i][j].equals("__") ? "�¼�" : "����");
//			}
//			System.out.println();
//		}
//	System.out.println();
//	}
//	void seat1Now() {
//		seatNow(seat1);
//	}
//	void seat2Now() {
//		seatNow(seat2);
//	}

//	public void menu() {
//		System.out.println("***��ȭ���� ���α׷� ����***");
//		System.out.println("1 �Է� �� ��ȭ ���� ����"); // ���� �¼� ��Ȳ�����ֱ� ���ϴ� �ڸ� ����
//		System.out.println("2 �Է� �� ��ȭ ���� ��ȸ ����");
//		System.out.println("3 �Է� �� ���� ��� ����");
//		System.out.println();
//
//		int menu = 0;
//		do {
//			try {
//				menu = Integer.parseInt(sc.nextLine()); // 1 or 2 �Է�
//				if (menu >= 1 && menu <= 4) {
//					break; // do~while Ż��
//				} else {
//					throw new Exception("�޴� ��ȣ ������ �߸� �Ǿ����ϴ�");
//				}
//			} catch (Exception e) {
//				System.out.println("< error!!! : " + e.getMessage() + " >");
//				System.out.println("---�޴��� ���� ���� ����---");
//				System.out.println("1~3������ ���ڸ� �Է��Ͻʽÿ�");
//			}
//		} while (true);
//
//		// 1~2���� �� �ϳ��� �����ߴٸ�
//		return menu;
//	}

//	public void cinenum() {
//		String ran = Integer.toString(random.nextInt(8) + 1);
//		for (int i = 0; i < 7; i++) {
//			ran += Integer.toString(random.nextInt(9));
//			System.out.println(ran);
//		}
//	}

}
