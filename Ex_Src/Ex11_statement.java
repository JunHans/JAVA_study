import java.util.Scanner;

public class Ex11_statement {

	public static void main(String[] args) {
		//�ݺ��� (while , do ~ while)
		int i = 10;
		while(i >= 10) {
			//�ݵ�� �����ڰ�
			//���������� �������� ���!
			// i--; ���⿡ ������ ����� 9�� ����     //�������� ��ġ�� �������^^7
			System.out.println("i : " + i);
			i--;
		}
		//while 1~100���� ��
		int sum =0;
		int j =1;
		while(j <= 100) {  //for(int j =1; j <=100; j++)
			//j++;
			sum+=j;
			j++;
		}
		System.out.println("sum : " + sum);
		
		//while �������� ����ϼ���
		//	for(int i=2; i<=9; i++)
		//	 for(int j=1; j <=9; j++)
		
		//while 2��
		int a = 2;
		int b = 1;
		while(a<=9) {
			b=1;
			while(b<=9) {
//				System.out.print(a+"x"+b+"="+(a*b));
				System.out.printf("[%d]*[%d]=[%d]\t", a,b,a*b);
				b++;	
			}
			System.out.println();
			a++;
		}
		System.out.printf("a:%d, b:%d \n", a, b);

		
		//
		//for(;;) {} ���ѷ���
		//while(true) { if(����) break; } ���ѷ��� ���ߴ°� �극��ũ ��
		// do ~ while : �ϴ� �ѹ��� ���������� �����ϰ� , �׸��� ������ ���� �Ǵ��϶�
		//do {���๮ ... ���� �޾ƿ�} while(�����Ǵ� ������ ������ �ƴϸ� �ٷ� ��������)
		//�޴�����
		//���ɸ޴� �����ϼ���
		//1. ¥��
		//2. «��
		//��� 3���� �Է� �޴��� �ٽ� ������ �ٽ��Է� �ް� ...
		
		//���α׷� ����
		//����� ���ϴ� �޴���ȣ�� �����ϼ��� >> do .. ���ð� �޾Ƽ�
		//while(input > 2) ���� �Է��ϼ���while���� false�� �Ǹ� ������ ����
		
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		do {
			System.out.println("���� �Է��� )~(0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //true�� ��� �¸� ��� do������ ����
		
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
	}

}
