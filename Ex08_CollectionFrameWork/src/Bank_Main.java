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

import kr.or.kosa.Account;
import kr.or.kosa.Bank;
import kr.or.kosa.Transaction;

public class Bank_Main {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		//은행은 계좌를 등록한다
		bank.addAccount("1111", "JUN1");  //(계좌번호, 이름)
		bank.addAccount("2222", "JUN2"); 
		bank.addAccount("3333", "JUN3"); 
		bank.addAccount("4444", "JUN4"); 
		bank.addAccount("5555", "JUN5"); 
		bank.addAccount("6666", "JUN6"); 
		bank.addAccount("7777", "JUN7"); 
		bank.addAccount("8888", "JUN8"); 
		
		//은행은 게좌번호로 계좌를 찾을 수 있다
		System.out.println("***계좌번호가 2222인 계좌조회***");
		Account getAccount = bank.getAccount("2222");
		System.out.println(getAccount);
		
		//은행원 계좌의 소유자명으로 계좌를 찾을 수 있다.
		System.out.println("\n***이름이 임준여덟인 사람의 계좌 조회");
		ArrayList<Account> findAccounts = bank.findAccount("임준여덟");
		for(Account a : findAccounts){
			System.out.println(a);
		}
		
		//은행은 모든 계좌의 목록을 볼 수 있다.
        System.out.println("\n***모든 계좌 목록 조회***");
        ArrayList<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
        
      //계좌는 입금, 출금 기능과 잔고 확인 기능이 있다.
        System.out.println("\n***계좌번호가 1111인 게좌에 5만원 입금***");
        Account JUN1 = bank.getAccount("1111");
        JUN1.deposit(50000);
        System.out.println(JUN1);
		
        System.out.println("\n***계좌번호가 1111인 게좌에 2만원 출금***");
        JUN1.withdraw(20000);
        System.out.println(JUN1);
		
        System.out.println("\n***계좌번호가 1111인 게좌에 5000원 출금***");
        JUN1.withdraw(5000);
        System.out.println(JUN1);
        
        System.out.println("n***계좌번호가 1111인 계좌의 잔고 확인하기***");
        System.out.println("JUN1 님의 \'1111\' 계좌 잔액 : "+ JUN1.getBalance());
        
        //계좌에서 잔액의 변화가 있을 때 마다 입출금 명세에 기록된다.
        //입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.
        System.out.println("\n***계좌번호가 1111인 계좌의 거래내역 확인하기***");
        ArrayList<Transaction> jUN1Transaction = JUN1.getTransactions();
        for(int i=0; i<jUN1Transaction.size(); i++) {
        	System.out.println(jUN1Transaction.get(i));
        }
        
        

	}

}
