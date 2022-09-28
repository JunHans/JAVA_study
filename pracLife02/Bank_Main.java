package pracLife02;

import java.util.ArrayList;
import java.util.List;



public class Bank_Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccount("1111", "������");
		bank.addAccount("2222", "�Ѷ�");
		bank.addAccount("3333", "����");

		System.out.println(bank.getTotalAccount());  //�� ���� ��
		System.out.println(bank.getAccounts());  //���¸��
		//�� �� �Ʒ��� �Ȱ��� �� �ƴѰ�?? �� �Ʒ�ó�� for������ �������ϴ°�����?
		//������ ��� ������ ����� �� �� �ִ�.
        System.out.println("\n***��� ���� ��� ��ȸ***");
        List<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
		
		System.out.println(bank.getAccount("1111"));  //���¹�ȣ�� ã��
		System.out.println(bank.findAccounts("�Ѷ�"));  //�̸����� ã��
		
		
		Account dduddu = bank.getAccount("2222");
		dduddu.deposit(1000000000);
		System.out.println(dduddu);
		
		dduddu.withdraw(500);
		System.out.println(dduddu);
		
		System.out.println("n***���¹�ȣ�� 1111�� ������ �ܰ� Ȯ���ϱ�***");
        System.out.println("�Ѷ� ���� \'1111\' ���� �ܾ� : "+ dduddu.getBalance());
		
		Account dutchi = bank.getAccount("3333");
		dutchi.deposit(300);
		System.out.println(dutchi);
		
		Account doong = bank.getAccount("1111");
		doong.deposit(100000000);
		System.out.println(doong);
		
		System.out.println("\n***���¹�ȣ�� 2222�� ������ �ŷ����� Ȯ���ϱ�***");
        List<Transaction> ddudduTransaction = dduddu.getTransactions();
        for(int i=0; i<ddudduTransaction.size(); i++) {
        	System.out.println(ddudduTransaction.get(i));
        }
		
	}

}
