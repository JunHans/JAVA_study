import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ����
//                   2,4 ���� ��� ��� ... �ϴ� ����
//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�

//�Է°� : 123456-1234567 

//static 
//1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false 
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���
public class String_Total_Quiz {

	Scanner sc = new Scanner(System.in);
	static String input; // �ֹι�ȣ �Է�
	public static char gender; // �޹�ȣ ù�ڸ� ���� �Ǵ�
	public static String gender1;
	public int inputlength;

	public void start() {
		System.out.println();
	
		while (true) {
			menuInfo(); // �޴��� ���
			in();// �ֹε�Ϲ�ȣ �Է�â
			inputlength = length();
			
			if (inputlength == 14) {
				gender = input.charAt(7);
				int gendercon = Character.getNumericValue(gender); // char�� int�� ��ȯ -> ���Ҵ�
				if (gendercon >= 1 && gendercon <= 4) {
					if (gendercon == 1 || gendercon == 3) {
						gender1 = "����";
						System.out.printf("����� ������ [%s]�Դϴ�", gender1);
						System.exit(0);  //�´� ���� �������� �ý��� ����
					} else if (gendercon == 2 || gendercon == 4) {
						gender1 = "����";
						System.out.printf("����� ������ [%s]�Դϴ�", gender1);
						System.exit(0);  //�´� ���� �������� �ý��� ����
					} else {
						System.out.println("������ �����ϴ�");
					}
				} else {
					System.out.println("���ڸ� ù���� ��ȣ�� �߸��Ǿ����ϴ�");
				}
			} else {
				System.out.println("�ֹε�Ϲ�ȣ�� '-'�� �����ų�\n���̰� �߸��Ǿ����ϴ�");
			}
			

		}
	}

	// �޴���
	private void menuInfo() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("�ֹε�� ��ȣ�� �Է����ּ���");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}

	// �Է�â
	public void in() {
		System.out.println("�Է� : ");
		input = sc.nextLine();
	}
	//�Էµ� �ֹε�Ϲ�ȣ ���� �Ǻ�
	public static int length() {
		int k = input.length();
		return k;
	}
}
