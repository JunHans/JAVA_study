import java.util.Scanner; //�ڹ���Ű�� �ؿ� ��ƿ��Ű�� �ƿ� �ִ� ��ĳ�ʸ� ����߱���  java.util.* ��ƿ �Ʒ��� ���� ����߱��� ���ڰ� �� �������� ����

import javax.security.sasl.SaslClient;

public class Ex08_printf_format {

	public static void main(String[] args) {
		//System.out.println();
		//C#: Console.WriteLine();
		
		System.out.println(); //����ϰ� �ٹٲ� �ض�(����)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("D");
		System.out.println();
		
		int num =100;
		System.out.println(num);
		System.out.println("num ���� " + num + " �Դϴ�");
		
		//���� Format
		System.out.printf("num ���� %d �Դϴ�", num);
		System.out.println();
		System.out.printf("num ���� [%d] �Դϴ� �� [%d] �� �־�� \n", num , 12345);
		//format ���Ĺ���
		/*
		 %d (10���� ������ ����)
		 %f (�Ǽ�)
		 %s ���ڿ�
		 %c ����
		 %t tap , \n �ٹٲ�
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f������ %f �Դϴ� \n",f);
		
		//�Է¹ޱ� (cmd) ����ڰ� �Է��� ����  ���� �� �ִ�
		//������ Ÿ�� + ����
		Scanner sc = new Scanner(System.in);  //Ŭ���� �� ������ �ּҸ� �޴´� int,double���� �� �ڿ� 8���� Ÿ�Ժ���  //Scanner(System.in)�� �Լ�
//		String value = sc.nextLine();
		//�Է��ϰ� ���͸� ĥ������ ����ϴ� �� (���α׷��� ������� �ʰ� ��ٸ���)�Էµǰ� ����
		//�Է��� ���� ���ڿ��� �������־��! (�տ� String)
//		System.out.println(value); 
		
//		int number = sc.nextInt();
//		System.out.println("number : " + number);  //InputMismatchException �Է��� ���̶� Ÿ���� �޶� ������������ Ŭ���ϸ� ������ �� �ڵ�� �̵�
		
//		float number = sc.nextFloat();
//		System.out.println("number : " + number); �Ǽ� ��Ÿ������ ���� ��
		
		//�׷����� �ұ��ϰ� ��������� : nextInt , nextFloat ���ٴ� nextLine ���� read Ÿ���� �ٲ���
		
		//Today Point
		
		//���ڸ� => ���ڷ� (����, �Ǽ�)
		//Integer.parseInt("11111") ->> ���������� �ٲ��� ->> 11111(���������� -> ��õ�����)
		//Float.parseFloat("3.14") ->> �Ǽ������� �ٲ��� ->> 3.14
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("������ : " + number);
	}

}

