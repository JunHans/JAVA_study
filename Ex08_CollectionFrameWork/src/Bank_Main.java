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

import kr.or.kosa.Account;
import kr.or.kosa.Bank;
import kr.or.kosa.Transaction;

public class Bank_Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		//������ ���¸� ����Ѵ�
		bank.addAccount("1111", "JUN1");  //(���¹�ȣ, �̸�)
		bank.addAccount("2222", "JUN2"); 
		bank.addAccount("3333", "JUN3"); 
		bank.addAccount("4444", "JUN4"); 
		bank.addAccount("5555", "JUN5"); 
		bank.addAccount("6666", "JUN6"); 
		bank.addAccount("7777", "JUN7"); 
		bank.addAccount("8888", "JUN8"); 
		
		//������ ���¹�ȣ�� ���¸� ã�� �� �ִ�
		System.out.println("***���¹�ȣ�� 2222�� ������ȸ***");
		Account getAccount = bank.getAccount("2222");
		System.out.println(getAccount);
		
		//����� ������ �����ڸ����� ���¸� ã�� �� �ִ�.
		System.out.println("\n***�̸��� ���ؿ����� ����� ���� ��ȸ");
		ArrayList<Account> findAccounts = bank.findAccount("���ؿ���");
		for(Account a : findAccounts){
			System.out.println(a);
		}
		
		//������ ��� ������ ����� �� �� �ִ�.
        System.out.println("\n***��� ���� ��� ��ȸ***");
        ArrayList<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
        
      //���´� �Ա�, ��� ��ɰ� �ܰ� Ȯ�� ����� �ִ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5���� �Ա�***");
        Account JUN1 = bank.getAccount("1111");
        JUN1.deposit(50000);
        System.out.println(JUN1);
		
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 2���� ���***");
        JUN1.withdraw(20000);
        System.out.println(JUN1);
		
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5000�� ���***");
        JUN1.withdraw(5000);
        System.out.println(JUN1);
        
        System.out.println("n***���¹�ȣ�� 1111�� ������ �ܰ� Ȯ���ϱ�***");
        System.out.println("JUN1 ���� \'1111\' ���� �ܾ� : "+ JUN1.getBalance());
        
        //���¿��� �ܾ��� ��ȭ�� ���� �� ���� ����� ���� ��ϵȴ�.
        //����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ������ �ŷ����� Ȯ���ϱ�***");
        ArrayList<Transaction> jUN1Transaction = JUN1.getTransactions();
        for(int i=0; i<jUN1Transaction.size(); i++) {
        	System.out.println(jUN1Transaction.get(i));
        }
        
        

	}

}
