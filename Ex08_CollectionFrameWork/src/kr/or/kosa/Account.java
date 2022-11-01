package kr.or.kosa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
/*
<시나리오>
은행은 계좌를 관리한다.
은행은 계좌를 등록한다.
은행은 계좌번호로 계좌를 찾을 수 있다.
은행은 계좌의 소유자명으로 계좌를 찾을 수 있다.
은행은 모든 계좌의 목록을 볼 수 있다.
------------------------------------------------
계좌는 소유자명, 계좌번호, 잔고로 구성된다.
계좌는 입금,출금 기능과 잔고확인 기능이 있다.
계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.
*/
public class Account extends Bank{
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	
	Calendar time = Calendar.getInstance();
	
	public Account(String accountNo, String name) {  //초기화
		this.accountNo = accountNo;
		this.name = name;
		balance = 0;
		transactions = new ArrayList<Transaction>(); //집합관계때문에 여기서 어카운트를 생성할때 트랜잭션도 생성한다
	}
	public void deposit(long amount) {  //입금
		balance += amount;
		
		//캘린더 사용 심플데이트
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");  //이러한 형식으로 출력되게 하겠다
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String strDate = sdf.format(time.getTime());
		String strDate1 = sdf1.format(time.getTime());
		
		System.out.println("입금하신 금액은 :"+amount+" 이고 잔액은 : "+balance);
		//입출금은 트랜잭션에 저장
		transactions.add(new Transaction(strDate, strDate1, "입금", amount, balance));
	}
	
	public void withdraw(long amount) {  //출금
		if(balance<amount) {
			System.out.println("잔액이 부족합니다");
		}else {
			balance -= amount;
			
			//캘린더 사용 심플데이트 포맷 사용
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");  //이러한 형식으로 출력되게 하겠다
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			String strDate = sdf.format(time.getTime());
			String strDate1 = sdf1.format(time.getTime());
			
			System.out.println("출금하신 금액은 : "+ amount+ "이고 잔액은 : " +balance);
			transactions.add(new Transaction(strDate, strDate1, "출금", amount, balance));
		
		}
	}
	public long getBalance() {  //잔고 확인
		return balance;
	}
	public ArrayList<Transaction> getTransactions(){  //거래내역을 본다
		return transactions;
	}
	//getter
	public String getAccountNo() {  //getAccountNo 프라이빗접근자라 접근못하기 때문에 getter 생성
		return accountNo;
	}
	//getter
	public String getName() {  //private 접근자이기때문에 getter있어야 한다
		return name;
	}
	
	//계좌정보
	public String toString() {
		return "[계좌번호 =" + accountNo + ", 소유자 명=" + name + ", 잔액 =" + balance + "]";
	}
	
}