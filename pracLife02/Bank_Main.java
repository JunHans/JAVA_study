package pracLife02;

import java.util.ArrayList;
import java.util.List;



public class Bank_Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccount("1111", "임준한");
		bank.addAccount("2222", "뚜뚜");
		bank.addAccount("3333", "두찌");

		System.out.println(bank.getTotalAccount());  //총 계좌 수
		System.out.println(bank.getAccounts());  //계좌목록
		//위 와 아래가 똑같은 것 아닌가?? 왜 아래처럼 for문으로 돌려야하는것인지?
		//은행은 모든 계좌의 목록을 볼 수 있다.
        System.out.println("\n***모든 계좌 목록 조회***");
        List<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
		
		System.out.println(bank.getAccount("1111"));  //계좌번호로 찾기
		System.out.println(bank.findAccounts("뚜뚜"));  //이름으로 찾기
		
		
		Account dduddu = bank.getAccount("2222");
		dduddu.deposit(1000000000);
		System.out.println(dduddu);
		
		dduddu.withdraw(500);
		System.out.println(dduddu);
		
		System.out.println("n***계좌번호가 1111인 계좌의 잔고 확인하기***");
        System.out.println("뚜뚜 님의 \'1111\' 계좌 잔액 : "+ dduddu.getBalance());
		
		Account dutchi = bank.getAccount("3333");
		dutchi.deposit(300);
		System.out.println(dutchi);
		
		Account doong = bank.getAccount("1111");
		doong.deposit(100000000);
		System.out.println(doong);
		
		System.out.println("\n***계좌번호가 2222인 계좌의 거래내역 확인하기***");
        List<Transaction> ddudduTransaction = dduddu.getTransactions();
        for(int i=0; i<ddudduTransaction.size(); i++) {
        	System.out.println(ddudduTransaction.get(i));
        }
		
	}

}
