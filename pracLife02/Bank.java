package pracLife02;

import java.util.ArrayList;
import java.util.List;

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
public class Bank {

	private List<Account> accounts; // List 인터페이스 사용
	private int totalAccount; // 전체 계좌 수

	Account acc = new Account(null, null);

	public Bank() {
		this.accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}

	// 계좌 생성
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));// 배열에 게좌번호와 이름이 입력된 값 하나 추가 (계좌번호, 이름)
		totalAccount++;
	}

	// 계좌번호로 계좌 찾기
	public Account getAccount(String accountNo) {
		System.out.println("해당 계좌번호로 검색된 계좌 정보 : ");
		Account acc = null;
		for (int i = 0; i < accounts.size(); i++) {
			if (accountNo.equals(accounts.get(i).getAccountNo())) {
				acc = accounts.get(i);
			}
		}
		return acc;
	}

	// 소유자 명으로 계좌찾기(동명이인 있을 수 있음 염두에 둠)
	public List<Account> findAccounts(String name) {
		System.out.println("해당 이름으로 검색된 계좌 정보 : ");
		ArrayList<Account> acc = new ArrayList<Account>();
		for (int i = 0; i < accounts.size(); i++) {
			if (name.equals(accounts.get(i).getName())) {
				acc.add(accounts.get(i));
			}
		}

		return acc;
	}

	// 계좌 목록을 본다
	public List<Account> getAccounts() {
		return accounts;
	}

	// 총계좌 수 보기
	public int getTotalAccount() {
		System.out.println("총 계좌 수는 : ");
		return totalAccount;
	}
}
