import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		/*

		������ ��Ģ ����� (+ , - , * , /)

		�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)

		���� : Integer.parseInt() ,  **equals() Ȱ��**

		ȭ��

		>�Է°�:����

		>�Է°�(��ȣ): +

		>�Է°�:���� 

		>������ :200
		-------------

		>�Է°�:100

		>�Է°�(��ȣ): -

		>�Է°�:100

		>������ :0
		*/
		int one = 0;
		int two = 0;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("���ڸ� �Է��ϼ��� : ");
			one = Integer.parseInt(sc.nextLine());
			
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			String three = sc.nextLine();
			
			System.out.print("���� ���ڸ� �Է��ϼ��� : ");
			two = Integer.parseInt(sc.nextLine());
			
			
			if(three.equals("+")) 
				System.out.println(one + "+" + two + "=" + (one+two));
			else if(three.equals("-")) 
				System.out.println(one+"-"+two+"="+(one-two));
			else if(three.equals("*")) 
				System.out.println(one+"*"+two+"="+(one*two));
			else if(three.equals("/")) 
				System.out.println(one+"/"+two+"="+(one/two));
			
			


	}

}
////���ڿ��� �񱳴� ==�� ���� �ʴ´�
//�ڼ��Ѱ� ���߿�)
//�׷��� �ϴ�
//String atr = "+"; �̷����� �ִ�


