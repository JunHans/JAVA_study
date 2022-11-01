package kr.or.kosa;
import java.util.ArrayList;
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
public class Bank{
	private ArrayList<Account> accounts;  //List �������̽� ����ϸ� ������(������ ����)  //Ÿ���� ���� accounts �迭 ����
	private int totalAccount;     //��ü ���� ��
	
	public Bank() {  //�ʱ�ȭ�� �����ڿ���  �������� ���� ��ü�� �ʱ�ȭ!!!!!!!!
		this.accounts = new ArrayList<Account>();  //Ÿ���� ���� & �����ڿ��� �ʱ�ȭ
		this.totalAccount = 0;                //�����ڿ��� �ʱ�ȭ
	}
	//���»���
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));  //�迭�� ���¹�ȣ�� �̸��� �Էµ� �� �ϳ� �߰� (���¹�ȣ, �̸�)
		totalAccount++;   //��ü ���� �� 1���� ����
		
	}
	
	//��ȣ�� ����ã��
	public Account getAccount(String accountNo) { 
		
		Account acc = null;   //ã�� ���� �־��� ����
		System.out.println("= �ش� ���¹�ȣ�� �������� =");
		for(int i=0; i<accounts.size(); i++) {  //�迭�� ��ü���¼� ��ŭ ���鼭 �´°� �ִ��� ã�ƺ���, ã������ ���¹�ȣ�� �迭�� �ε������� �����ؼ�.
			if(accountNo.equals(accounts.get(i).getAccountNo())) {  //accounts.get(i) ���ڷ� �ε��� ���� //getAccountNo()�� ������� ������ 
				acc = accounts.get(i);                              //String Ÿ�԰� ��ü�� ���ϱ� ������ �ּӹ��� ���Ѵ�, ������ ��ī��Ʈ Ŭ�������� 
				break;                                              //�̸����� �̾Ƽ� String Ÿ������ ��ȯ���־ ���ؾ߸� �Ѵ�
			}                                                       //getAccountNo �����̺������ڶ� ���ٸ��ϱ� ������ getter ����
		}
		return acc;  //�ִ� ã�� ���¹迭�� �ε���
	}
	//�̸����� ����ã��
	public ArrayList<Account> findAccount(String name) {  //Ÿ���� ����
		System.out.println("= �ش� �����ڸ��� �������� =");
		ArrayList<Account> acc = new ArrayList<Account>();  //Ÿ���� ����
		//acc��� ���ο� �����迭�� ���� get(i)�� ã�� ��ü���� �����迭�� �ְ� �װ� �����Ѵ�
		for(int i=0; i<accounts.size(); i++) {
			if(name.equals(accounts.get(i).getName())) {
				acc.add(accounts.get(i));
			}
		}
		return acc;  //���θ��� acc�� �� �ε��� ���� �̸��� ����, ���¹�ȣ�� �̸� �Ѵ� ����??
	}

	//���� ����� ����***********?
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	//�Ѱ��¼�
	public int getTotalAccount() {
		System.out.println("�Ѱ��� ������");
		return totalAccount;
	}
	
}