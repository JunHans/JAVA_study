package pracLife01;

public class Bank {

	public String ownername;
	public String socialBankName;
	public int balance;
	public int cash;
	public int socialCash;
	public int authorize;
	public int j;
	public int i;
	public int result = j - i;

	public void cash_Deposit(int deposit) { // �� �������� �Ա�
		if (cash >= 0) {
			if (deposit > 0) {
				cash += deposit;
				System.out.printf("�ܰ� :  [%d]", cash);
			}
		}
		System.out.println();
	}

	public void cash_Withdraw(int withdraw) { // �� �������� ���
		if (withdraw < cash & cash >= 0) {
			if (withdraw > 0) {
				cash -= withdraw;
				System.out.printf("�ܰ� :  [%d]", cash);
			}
		} else if (withdraw > cash) {
			System.out.printf("[%s]", "�ܰ� �������� ��� �Ұ�");
		}
		System.out.println();
	}

	public void social_cash_Deposit(int deposit) { // �������� �Ա�
		if (authorize == 1) {
			System.out.println("�������忡 ���ٱ����� �ֽ��ϴ�, �����ϼ���");

			if (socialCash >= 0) {
				if (deposit > 0) {
					socialCash += deposit;
					System.out.printf("�ܰ� :  [%d]", socialCash);
				}
			}
			System.out.println();
		} else if (authorize == 0) {
			System.out.println("�������忡 ���ٱ����� �����ϴ�");
		}
	}

	public void social_cash_Withdraw(int withdraw) { // �������� ���
		if (authorize == 1) {
			System.out.println("�������忡 ���ٱ����� �ֽ��ϴ�, �����ϼ���");

			if (withdraw < cash & cash >= 0) {
				if (withdraw > 0) {
					socialCash -= withdraw;
					System.out.printf("�ܰ� :  [%d]", socialCash);
				}
			} else if (withdraw > socialCash) {
				System.out.printf("[%s]", "�ܰ� �������� ��� �Ұ�");
			}
		} else if (authorize == 0) {
			System.out.println("�������忡 ���ٱ����� �����ϴ�");
		}
		System.out.println();
	}

	public void bankInfo() {
		System.out.printf("������: [%s] , �ܰ�: [%d]", ownername, cash); // �� �������� ���� ����
		System.out.println();
	}

	public void sicial_bankInfo() {
		System.out.printf("������: [%s] , �ܰ�: [%d] , ����: [%s]", socialBankName, socialCash, authorize); // �������� ���� ����

	}
}
