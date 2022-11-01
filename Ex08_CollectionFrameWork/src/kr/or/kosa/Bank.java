package kr.or.kosa;
import java.util.ArrayList;
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
public class Bank{
	private ArrayList<Account> accounts;  //List 인터페이스 사용하면 가산점(다형성 위해)  //타입을 강제 accounts 배열 생성
	private int totalAccount;     //전체 계좌 수
	
	public Bank() {  //초기화는 생성자에서  생성자의 목적 자체가 초기화!!!!!!!!
		this.accounts = new ArrayList<Account>();  //타입을 강제 & 생성자에서 초기화
		this.totalAccount = 0;                //생성자에서 초기화
	}
	//계좌생성
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));  //배열에 게좌번호와 이름이 입력된 값 하나 추가 (계좌번호, 이름)
		totalAccount++;   //전체 계좌 수 1개씩 증가
		
	}
	
	//번호로 계좌찾기
	public Account getAccount(String accountNo) { 
		
		Account acc = null;   //찾은 계좌 넣어줄 변수
		System.out.println("= 해당 계좌번호의 계좌정보 =");
		for(int i=0; i<accounts.size(); i++) {  //배열이 전체계좌수 만큼 돌면서 맞는게 있는지 찾아본다, 찾으려는 계좌번호와 배열의 인덱스별로 대조해서.
			if(accountNo.equals(accounts.get(i).getAccountNo())) {  //accounts.get(i) 인자로 인덱스 받음 //getAccountNo()를 사용하지 않으면 
				acc = accounts.get(i);                              //String 타입과 객체를 비교하기 때문에 주속밧을 비교한다, 때문에 어카운트 클래스에서 
				break;                                              //이름만을 뽑아서 String 타입으로 변환해주어서 비교해야만 한다
			}                                                       //getAccountNo 프라이빗접근자라 접근못하기 때문에 getter 생성
		}
		return acc;  //애는 찾은 계좌배열의 인덱스
	}
	//이름으로 계좌찾기
	public ArrayList<Account> findAccount(String name) {  //타입을 강제
		System.out.println("= 해당 소유자명의 계좌정보 =");
		ArrayList<Account> acc = new ArrayList<Account>();  //타입을 강제
		//acc라는 새로운 동적배열을 만들어서 get(i)로 찾은 객체들을 동적배열에 넣고 그걸 리턴한다
		for(int i=0; i<accounts.size(); i++) {
			if(name.equals(accounts.get(i).getName())) {
				acc.add(accounts.get(i));
			}
		}
		return acc;  //새로만든 acc에 각 인덱스 값은 이름만 들어가나, 계좌번호랑 이름 둘다 들어가나??
	}

	//계좌 목록을 본다***********?
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	//총계좌수
	public int getTotalAccount() {
		System.out.println("총계좌 갯수는");
		return totalAccount;
	}
	
}