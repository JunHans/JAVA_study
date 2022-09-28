package pracLife01;

public class Bank_01 {

	public static void main(String[] args) {
		System.out.println("나 은행");
		
		Bank bank = new Bank();
		
		bank.ownername = "임준한"; //자신의 이름
		bank.socialBankName = "Kosa 1조 모임통장"; //모임통장의 이름
		bank.authorize= 0;  //모임통장의 접근권한 여부
		
		System.out.println();
		bank.cash_Deposit(100);
		bank.cash_Deposit(100);
		bank.cash_Deposit(100);  //잔고 총 +300
		System.out.println();
		
		bank.cash_Withdraw(100);  //잔고 -100 -> 200
		bank.cash_Withdraw(500);  //잔고 부족으로 출금 불가
		System.out.println();
		
		bank.bankInfo();
		System.out.println();  //현재 개인통장 상태
		
		bank.social_cash_Deposit(1000);  //모임통장에 입금 -> 권한 없음
		System.out.println();
		
		bank.authorize= 1;  //권한 허용 설정
		bank.social_cash_Deposit(1000);  //1000 입금 -> 권한 없음
		System.out.println();
		
		bank.social_cash_Withdraw(5000);  //잔고보다 많은 금액 입력시 "잔고 부족으로 출금 불가" 출력
		System.out.println();
		
		bank.sicial_bankInfo();  //현재 모임통장 상태
	}

}
