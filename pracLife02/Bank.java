package pracLife02;

import java.util.ArrayList;
import java.util.List;

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
public class Bank {

	private List<Account> accounts; // List �������̽� ���
	private int totalAccount; // ��ü ���� ��

	Account acc = new Account(null, null);

	public Bank() {
		this.accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}

	// ���� ����
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));// �迭�� ���¹�ȣ�� �̸��� �Էµ� �� �ϳ� �߰� (���¹�ȣ, �̸�)
		totalAccount++;
	}

	// ���¹�ȣ�� ���� ã��
	public Account getAccount(String accountNo) {
		System.out.println("�ش� ���¹�ȣ�� �˻��� ���� ���� : ");
		Account acc = null;
		for (int i = 0; i < accounts.size(); i++) {
			if (accountNo.equals(accounts.get(i).getAccountNo())) {
				acc = accounts.get(i);
			}
		}
		return acc;
	}

	// ������ ������ ����ã��(�������� ���� �� ���� ���ο� ��)
	public List<Account> findAccounts(String name) {
		System.out.println("�ش� �̸����� �˻��� ���� ���� : ");
		ArrayList<Account> acc = new ArrayList<Account>();
		for (int i = 0; i < accounts.size(); i++) {
			if (name.equals(accounts.get(i).getName())) {
				acc.add(accounts.get(i));
			}
		}

		return acc;
	}

	// ���� ����� ����
	public List<Account> getAccounts() {
		return accounts;
	}

	// �Ѱ��� �� ����
	public int getTotalAccount() {
		System.out.println("�� ���� ���� : ");
		return totalAccount;
	}
}
