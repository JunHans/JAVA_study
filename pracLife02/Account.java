package pracLife02;
/*
<시나리오>
은행은 계좌를 관리한다.
은행은 계좌를 등록한다.
은행은 계좌번호로 계좌를 찾을 수 있다.
은행은 계좌의 소유자명으로 계좌를 찾을 수 있다.
은행은 모든 계좌의 목록을 볼 수 있다.
계좌는 소유자명, 계좌번호, 잔고로 구성된다.
계좌는 입금,출금 기능과 잔고확인 기능이 있다.
계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.
*/

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String accountNo; // 게좌 번호
	private String name; // 소유자 명
	private long balance; //잔고
	private List<Transaction> transactions;  // 거래내역 (0개 이상)

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}

	public void deposit(long amount) { // 입금
		balance += amount;
		System.out.println("추가금액 : "+ amount+ "잔고: "+ balance);
		transactions.add(new Transaction("입금",amount, balance));
	}

	public void withdraw(long amount) { // 출금
		if (balance < amount) {
			System.out.println("잔액이 부족하여 출금이 불가능합니다");
		} else {
			balance -= amount;
			System.out.println("출금금액 : "+ amount+ "잔고: "+ balance);
			transactions.add(new Transaction("출금",amount, balance));
		}
	}

	public long getBalance() { // 잔고 확인
		System.out.println("남은 잔고: " + balance);
		return balance;
	}

	public List<Transaction> geTransactions() { // 거래내역을 본다
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

	//계좌 정보
		@Override
		public String toString() {
			return "Account [계좌번호=" + accountNo + ", 소유주명=" + name + ", 잔고=" + balance + ", 거래내역="
					+ transactions + "]";
		}
}
