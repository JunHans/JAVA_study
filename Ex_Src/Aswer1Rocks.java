import java.util.Random;    //������ ��
import java.util.Scanner; //�Է� �޴°�

public class Aswer1Rocks {

	public static void main(String[] args) {
		
//		double random = Math.random();
//		random = (3*random+1);
//		int result = (int) random;
//		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			double random = Math.random();
			random = (3*random+1);
			int result = (int) random;
			
			System.out.println("*********************************");
			System.out.println("1. ���� | 2. ���� | 3. �� ");
			System.out.println("*********************************");
			System.out.println("���� ������");
			int input = Integer.parseInt(sc.nextLine());
		
			System.out.println(result);
		
		
		
		if(input == 1) {
			if(result == 2) {
				System.out.println("�� ����");
			}else if(result == 3) {
				System.out.println("�� �̰��");
			}else {
				System.out.println("����");
			} 
		}  else if(input == 2) {
			if(result == 3) {
				System.out.println("�� ����");
			}else if(result == 1) {
				System.out.println("�� �̰��");
			}else {
				System.out.println("����");
			}
		} else if(input == 3) {
			if(result == 1) {
				System.out.println("�� ����");
			}else if(result == 2) {
				System.out.println("�� �̰��");
			}else {
				System.out.println("����");
			}
		} else {
			System.out.println("���� ����� ���ּ���");
		}
		}
	}

}
