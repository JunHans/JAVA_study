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

public class Transaction {

	private String transactionDate;  //�ŷ���
	private String transationTime;  //�ŷ��ð�
	private String kind;  //����(�Ա�, ��� ��)
	private long amount;  //�ŷ��ݾ�
	private long balance;  //�ܰ�


	public Transaction(String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transationTime = transationTime;
		this.kind = kind;
		this.balance = balance;
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Transaction [�ŷ�����=" + kind + ", �ŷ��ݾ�=" + amount + ", �ܰ�=" + balance + "]";
	}
	
}
