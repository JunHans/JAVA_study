package pracLife01;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {

		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("입력할 금액 :");
		money = Integer.parseInt(scan.nextLine()); // 선언위에서 해서 int다시 쓸 필요 없음

		// 화폐매수 = int(입력한금액 / 화폐단위)

		boolean auto = true;
		while (auto) {
			num = (int) (money / unit); // 나눴을때 소수점이 생길수 있으니 int로 형변환을 강제로 해준다(명시적) 케스팅
			System.out.printf("화폐단위:%d, 화폐매수:%d \n", unit, num);

			if (unit > 1) {
				money = money - unit * num;
				if (sw == 0) {
					unit = unit / 2;
					sw = 1;
				} else {
					unit = unit / 5;
					sw = 0;
				}
			} else {
				break;
			}
		}

	}

}
