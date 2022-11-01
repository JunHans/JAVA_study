package kr.or.kosa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
/*
<�ó�����>
������ ���¸� �����Ѵ�.
������ ���¸� ����Ѵ�.
������ ���¹�ȣ�� ���¸� ã�� �� �ִ�.
������ ������ �����ڸ����� ���¸� ã�� �� �ִ�.
������ ��� ������ ����� �� �� �ִ�.
------------------------------------------------
���´� �����ڸ�, ���¹�ȣ, �ܰ�� �����ȴ�.
���´� �Ա�,��� ��ɰ� �ܰ�Ȯ�� ����� �ִ�.
���¿��� �ܾ��� ��ȭ�� ���� ������ ����� ���� ��ϵȴ�.
����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.
*/
public class Account extends Bank{
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	
	Calendar time = Calendar.getInstance();
	
	public Account(String accountNo, String name) {  //�ʱ�ȭ
		this.accountNo = accountNo;
		this.name = name;
		balance = 0;
		transactions = new ArrayList<Transaction>(); //���հ��趧���� ���⼭ ��ī��Ʈ�� �����Ҷ� Ʈ����ǵ� �����Ѵ�
	}
	public void deposit(long amount) {  //�Ա�
		balance += amount;
		
		//Ķ���� ��� ���õ���Ʈ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");  //�̷��� �������� ��µǰ� �ϰڴ�
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String strDate = sdf.format(time.getTime());
		String strDate1 = sdf1.format(time.getTime());
		
		System.out.println("�Ա��Ͻ� �ݾ��� :"+amount+" �̰� �ܾ��� : "+balance);
		//������� Ʈ����ǿ� ����
		transactions.add(new Transaction(strDate, strDate1, "�Ա�", amount, balance));
	}
	
	public void withdraw(long amount) {  //���
		if(balance<amount) {
			System.out.println("�ܾ��� �����մϴ�");
		}else {
			balance -= amount;
			
			//Ķ���� ��� ���õ���Ʈ ���� ���
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");  //�̷��� �������� ��µǰ� �ϰڴ�
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			String strDate = sdf.format(time.getTime());
			String strDate1 = sdf1.format(time.getTime());
			
			System.out.println("����Ͻ� �ݾ��� : "+ amount+ "�̰� �ܾ��� : " +balance);
			transactions.add(new Transaction(strDate, strDate1, "���", amount, balance));
		
		}
	}
	public long getBalance() {  //�ܰ� Ȯ��
		return balance;
	}
	public ArrayList<Transaction> getTransactions(){  //�ŷ������� ����
		return transactions;
	}
	//getter
	public String getAccountNo() {  //getAccountNo �����̺������ڶ� ���ٸ��ϱ� ������ getter ����
		return accountNo;
	}
	//getter
	public String getName() {  //private �������̱⶧���� getter�־�� �Ѵ�
		return name;
	}
	
	//��������
	public String toString() {
		return "[���¹�ȣ =" + accountNo + ", ������ ��=" + name + ", �ܾ� =" + balance + "]";
	}
	
}