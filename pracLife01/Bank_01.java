package pracLife01;

public class Bank_01 {

	public static void main(String[] args) {
		System.out.println("�� ����");
		
		Bank bank = new Bank();
		
		bank.ownername = "������"; //�ڽ��� �̸�
		bank.socialBankName = "Kosa 1�� ��������"; //���������� �̸�
		bank.authorize= 0;  //���������� ���ٱ��� ����
		
		System.out.println();
		bank.cash_Deposit(100);
		bank.cash_Deposit(100);
		bank.cash_Deposit(100);  //�ܰ� �� +300
		System.out.println();
		
		bank.cash_Withdraw(100);  //�ܰ� -100 -> 200
		bank.cash_Withdraw(500);  //�ܰ� �������� ��� �Ұ�
		System.out.println();
		
		bank.bankInfo();
		System.out.println();  //���� �������� ����
		
		bank.social_cash_Deposit(1000);  //�������忡 �Ա� -> ���� ����
		System.out.println();
		
		bank.authorize= 1;  //���� ��� ����
		bank.social_cash_Deposit(1000);  //1000 �Ա� -> ���� ����
		System.out.println();
		
		bank.social_cash_Withdraw(5000);  //�ܰ��� ���� �ݾ� �Է½� "�ܰ� �������� ��� �Ұ�" ���
		System.out.println();
		
		bank.sicial_bankInfo();  //���� �������� ����
	}

}
