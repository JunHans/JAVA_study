package pracLife02;
/*
<�ó�����>
������ ���¸� �����Ѵ�.
������ ���¸� ����Ѵ�.
������ ���¹�ȣ�� ���¸� ã�� �� �ִ�.
������ ������ �����ڸ����� ���¸� ã�� �� �ִ�.
������ ��� ������ ����� �� �� �ִ�.
���´� �����ڸ�, ���¹�ȣ, �ܰ�� �����ȴ�.
���´� �Ա�,��� ��ɰ� �ܰ�Ȯ�� ����� �ִ�.
���¿��� �ܾ��� ��ȭ�� ���� ������ ����� ���� ��ϵȴ�.
����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.
*/

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String accountNo; // ���� ��ȣ
	private String name; // ������ ��
	private long balance; //�ܰ�
	private List<Transaction> transactions;  // �ŷ����� (0�� �̻�)

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}

	public void deposit(long amount) { // �Ա�
		balance += amount;
		System.out.println("�߰��ݾ� : "+ amount+ "�ܰ�: "+ balance);
		transactions.add(new Transaction("�Ա�",amount, balance));
	}

	public void withdraw(long amount) { // ���
		if (balance < amount) {
			System.out.println("�ܾ��� �����Ͽ� ����� �Ұ����մϴ�");
		} else {
			balance -= amount;
			System.out.println("��ݱݾ� : "+ amount+ "�ܰ�: "+ balance);
			transactions.add(new Transaction("���",amount, balance));
		}
	}

	public long getBalance() { // �ܰ� Ȯ��
		System.out.println("���� �ܰ�: " + balance);
		return balance;
	}

	public List<Transaction> geTransactions() { // �ŷ������� ����
		return transactions;
	}

	
	
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	//���� ����
		@Override
		public String toString() {
			return "Account [���¹�ȣ=" + accountNo + ", �����ָ�=" + name + ", �ܰ�=" + balance + ", �ŷ�����="
					+ transactions + "]";
		}
}
