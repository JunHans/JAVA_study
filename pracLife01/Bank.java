package pracLife01;

public class Bank {

	public String ownername;
	public String socialBankName;
	public int balance;
	public int cash;
	public int socialCash;
	public int authorize;
	public int j;
	public int i;
	public int result = j - i;

	public void cash_Deposit(int deposit) { // 내 개인통장 입금
		if (cash >= 0) {
			if (deposit > 0) {
				cash += deposit;
				System.out.printf("잔고 :  [%d]", cash);
			}
		}
		System.out.println();
	}

	public void cash_Withdraw(int withdraw) { // 내 개인통장 출금
		if (withdraw < cash & cash >= 0) {
			if (withdraw > 0) {
				cash -= withdraw;
				System.out.printf("잔고 :  [%d]", cash);
			}
		} else if (withdraw > cash) {
			System.out.printf("[%s]", "잔고 부족으로 출금 불가");
		}
		System.out.println();
	}

	public void social_cash_Deposit(int deposit) { // 모임통장 입금
		if (authorize == 1) {
			System.out.println("모임통장에 접근권한이 있습니다, 진행하세요");

			if (socialCash >= 0) {
				if (deposit > 0) {
					socialCash += deposit;
					System.out.printf("잔고 :  [%d]", socialCash);
				}
			}
			System.out.println();
		} else if (authorize == 0) {
			System.out.println("모임통장에 접근권한이 없습니다");
		}
	}

	public void social_cash_Withdraw(int withdraw) { // 모임통장 출금
		if (authorize == 1) {
			System.out.println("모임통장에 접근권한이 있습니다, 진행하세요");

			if (withdraw < cash & cash >= 0) {
				if (withdraw > 0) {
					socialCash -= withdraw;
					System.out.printf("잔고 :  [%d]", socialCash);
				}
			} else if (withdraw > socialCash) {
				System.out.printf("[%s]", "잔고 부족으로 출금 불가");
			}
		} else if (authorize == 0) {
			System.out.println("모임통장에 접근권한이 없습니다");
		}
		System.out.println();
	}

	public void bankInfo() {
		System.out.printf("예금주: [%s] , 잔고: [%d]", ownername, cash); // 내 개인통장 현재 상태
		System.out.println();
	}

	public void sicial_bankInfo() {
		System.out.printf("예금주: [%s] , 잔고: [%d] , 권한: [%s]", socialBankName, socialCash, authorize); // 모임통장 현재 상태

	}
}
