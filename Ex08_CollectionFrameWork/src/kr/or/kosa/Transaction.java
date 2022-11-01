package kr.or.kosa;
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
public class Transaction extends Bank{
	private String transactionDate; //거래일
	private String transactionTime; //거래 시간
	private String kind; //구분(입금 or 출금)
	private long amount; //거래 금액
	private long balance; //잔고
	
	public Transaction(String strDate, String strDate1, String kind, long amount, long balance ) {
		this.transactionDate = strDate;
		this.transactionTime = strDate1;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[거래일자=" + transactionDate + ", 거래시간=" + transactionTime + ", 종류="
				+ kind + ", 금액=" + amount + ", 잔액=" + balance + "]";
	}
}