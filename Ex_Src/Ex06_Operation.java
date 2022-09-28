//import java.lang.*;  �����Ǿ� �ִ�  �ڵ� ���� �ʾƵ� java.lang �����ȿ� �ִ� �ڿ��� �׳� ��밡��

public class Ex06_Operation {

	public static void main(String[] args) {

		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // ��
		System.out.println(result);

		// �������� ���ϴ� �����ڰ� ���� �ִ� (%)
		result = 13 % 2;
		System.out.println(result);

		// ���� , ���� (������ ������ : ++ 1������ , -- 1�� ����)
		int i = 10;
		++i; // ��ġ����
		System.out.println("��ġ : " + i);
		i++; // ��ġ����
		System.out.println("��ġ : " + i);
		// ȥ�ڼ��� ��ġ , ��ġ�� �ǹ̰� ����

		// Today Point ( ������ ������ �ٸ� �����ڿ� ���յǸ� ��ġ ��ġ�� ��Ƴ��� )
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// ���� result2 : 10 j2 : 5
		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 6 //��翬���� ����� �Ŀ� ��ġ
		result2 = i2++ + j2++;
		System.out.println("result2 : " + result2 + " i2 : " + i2 + " j2 : " + j2);
		// result2 : 11 i2 : 6 j2 : 7 //��翬���� ����� �Ŀ� ��ġ

		byte b = 100;
		byte c = 1;

		// byte d = b + c;
		// Type mismatch: cannot convert from int to byte
		// ����Ʈ���ϱ� ����Ʈ���� ������ �Ҷ��� ��Ʈ���� ������ ���� ������ (4����Ʈ)����� ��Ʈ������ ����
		// �� �ذ� ����� 4byte ������ ����ؼ� �����ϱ⿡ int + int
		// byte d = (byte) (b + c); //�ս��� ���� �� �̰ɷ� �ҷ��ϸ� �̹������

		int d = b + c; // ����� Ÿ���� �����ؼ� (�ս� �߻����� �ʴ´�)
		System.out.println("d�� ��� : " + d);

		// Today Poimt
		/*
		 * 1.������ ��� ������ [int] Ÿ�� ��ȯ �� ó�� ex) byte + short => �����Ϸ��� ���������� int + int char
		 * + char => �����Ϸ��� ���������� int + int ����ó���� ������ ���꿡�� int���� ���� Ÿ���� int�� ��Ⱥ�� ����
		 * (long�� ����) byte , char , short >> ����ÿ��� > int�濡 �־ ��� > int
		 * 
		 * char + int >> int + int int + long >> long + long ūŸ�� ���� ������
		 * 
		 * ���� + �Ǽ� >> Ÿ���� ũ��� ������� >>> �Ǽ� ����
		 * 
		 */

		long ln = 10000000000L;
		float f1 = 1.2f;
		// long lnresult = ln + f1;
		// long lnresult = (long) (ln + f1); //�սǹ߻� .2 �Ҿ����
		// System.out.println("lnresult : " + lnresult);
		// float lnresult = ln + f1;
		// System.out.println("lnresult : " + lnresult); //�ս�x

		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3
		float result5 = num2 + num3;
		System.out.println(result5);

		char c2 = '!'; // 33
		char c3 = '!'; // 33
		// c2 + c3
		int result6 = c2 + c3;
		System.out.println(result6); // �ᱹ 4����Ʈ �����ȿ� ���ϱ��ϴ°Ŵϱ� int�� �ٲٸ� �ǰڱ���~

		// ���
		// �߼ұ�� ���蹮�� (������ ���) >> �ﰢ�� ����� >> ����
		int sum = 0; // local variable
		for (int j = 1; j <= 100; j++) {
			// sum = sum + j;
			// sum+=j; //sum = sum + j
			if (j % 2 == 0) { // j�� 2�� ���� �������� 0�̶�� = ¦�����
				sum += j; // ¦���� �� (1~100)
			}
		}
		System.out.println("sum : " + sum);

		// == ������ (���� ���ϴ� ������)
		if (10 == 10.0f) { // Ÿ���� ���ϴ� ���� �ƴϰ� �������ִ� ���� ���ϴ� ��
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ! ���� ������
		if ('A' != 65) { // �����ʴ�?
			System.out.println("�� ���� �ʾ� : true");
		} else {
			System.out.println("�� ���� ���̾� : false");
		}

		// �ϱ����� (Today Point)
		// �������߿��� ��� ������ �ϴ� �༮�� �ִ�
		// ���׿����� ���ǽ� ? �� �Ǵ� ����� : �� �Ǵ� �����;
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;

		// �� �ڵ带 if���� ����ؼ� ó���϶�
		int result9 = 0;
		if (p == k) {
			result9 = p;
		} else {
			result9 = k;
		}

		// ����ǥ
		// ������
		// 0 : false
		// 1 : true

		/*
		 * OR ���� , AND ���� 00 0 0 01 1 0 10 1 0 11 1 1
		 * 
		 * DB (Oracle) SQL��� �ڿ��� (�ΰ��� ���� �ؼ��ϱ� ���� ���) select * from emp where job='IT'
		 * and sal > 2000 // (�׸��� �Ѵ� ���� ���) ������ it�̰� �޿��� 2000�̻��� ����鸸 �� ����
		 * 
		 * select * from emp where job='IT' and sal > 2000 // (�̰Ŵ� �Ǵ� ���߿� �ϳ��� ���̾ ����)
		 * ������ it�λ���� �� ������, �޿� 2000�̻��� ��鵵 �� ����
		 * 
		 * ������ (��Ʈ) | or���� & and ����
		 * 
		 * || ������ (OR) && ������ (AND)
		 * 
		 */
		// <��Ʈ����>
		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x | y));

		/*
		 * ������ -> 2����(0,1) 8bit 256 128 64 32 16 8 4 2 1 0 0 1 1 > 10���� 3�� -> 2���� 0 1 0
		 * 1 > 10���� 5�� -> 2���� OR 0 1 1 1 > x��y�� 2������ �ٲٰ� -> 10���� -> 4+2+1 > 7 AND 0 0 0
		 * 1 > x��y�� 2������ �ٲٰ� -> 10���� -> 1
		 */
		System.out.println("x|y : " + (x & y));

		// Today Point
		// <������>
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1){ A }else{ B } ***** ���� ������ �� �̰Ÿ� ��
		// �� ���� �� �� = ���� = B (�ڿ� ���� õ�� �����־ ������ ����)
		// ������ ������ ���� ó���� �� �ڴ� �����Ϸ��� ������ ����
		// if(10 > 0 or -1 > 1 or 100 > 2 or 1 > -1){ A }else{ B }
		// ���ΰ� �ϳ� ������ �ű⼭ �ٷ� ��

		int data = 90;
		switch (data) {
		case 100:
			System.out.println("100�Գ״�");
			break;
		case 90:
			System.out.println("90�Գ״�");
			break;
		case 80:
			System.out.println("80�Գ״�");
			break;
		default:
			System.out.println("��ġ�ϴ� ���� �����״�");
		}

		// <������ �޷� �� ��� >
		int month = 2; // ���� ������ ���� ....
		String res = ""; // ���ڿ� �ʱ�ȭ
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			res = "���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");

		// ���� (������ : ������ ���Ⱚ)
		// java (����ϰ����ϴ� �پ��� �ڿ��� �̸� ������ �ξ���� >> ã�Ƽ� >> ��� JAVA API)
		// ���� (ã�Ƽ� ���) api����
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// ���ϴ� �ڿ��� ã�Ƽ� ������� �ľ��ϰ� ó���ϴ°� FM >> ��κ��� ���۰� ���̹��� ����մϴ�
		// java.lang.Math Ŭ���� ã�Ҿ��
		// public static double random()
		// equal to 0.0 and less than 1.0. ������ �������� ���� �� �ִ�
		// ��� : double �Ǽ� return 0.0 <= random < 1.0

		// ��Ģ���� ���
		// �������ϴ� �ڿ��� �ִ� ������ open
		// import java.lang.* >> java �����ȿ� lang ���� �ȿ� �ִ� ��� �ڿ��� ��밡��

		System.out.println("Math.random() : " + Math.random()); // ����� ���ڸ� ���� �����ü���
		// 0~9
		System.out.println("Math.random() *10 : " + (Math.random() * 10));
		System.out.println("(int) (Math.random() *10) : " + (int) (Math.random() * 10));
		// 1~10
		System.out.println("((int) (Math.random() *10) + 1) : " + ((int) (Math.random() * 10) + 1));
	}
}

/*
 * �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ� ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
 * 
 * ��ǰ ��÷�� 1000 ������ ������ ��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 900 ������ ������ ��ǰ���� NoteBook , ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 800 ������ ������ ��ǰ���� ����� , �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 700 ������ ������ ��ǰ���� �ѿ켼Ʈ , ����
 * 
 * ��ǰ ��÷�� 600 ������ ������ ��ǰ���� ����
 * 
 * �׿� ������ 100 ~ 500 ������ ĩ��
 * 
 * ��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ� ����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ����
 * ������ �Ǿ� �ֽ��ϴ�.
 * 
 * ���α׷��� �ѹ� �����ϸ� �� �� �������� ������ �� �������� ���ؼ� ��ǰ�� ����ϸ� �ǿ�
 */

//		int jumsu = ((int)(Math.random()* 10) + 1)*100;
//		  System.out.println("��÷��ȣ : " + jumsu);
//		  String msg="";//�ʱ�ȭ
//		  msg+= "������ ������ :" + jumsu + " �̰� ��ǰ�� : ";
//		  switch(jumsu) {
//		  	case 1000:msg+="Tv";
//		  	case 900:msg+="NoteBook ";
//		  	case 800:msg+="����� ";
//		  	case 700:msg+="�ѿ� ";
//		  	case 600:msg+="���� ";
//		  	     break;
//		  	default:msg+="ĩ��";     
//		  }
//		  System.out.println(msg);

// switch(whrjs) ������ .. �ƴ���
// ���ǽ��� "���ڿ�"�� ���� , "����" ����

//		String m = "F";
//		String f = "";
//		switch(m) {
//		case "A":
//		case "B":
//		case "C":
//		case "D":
//		case "E":
//		case "F":
//		case "G": f="ok";
//			break;
//		case "H":
//		case "K": f= "no";
//			break;
//			defualt : f ="no data";
//		}
//		System.out.println("��� : " + f);
//	}
//		
////		int jumsu = ((int)(Math.random() *10) + 1)*100;
////		ystem.out.println("��÷��ȣ : " + jumsu);
////		int jumsu = ((int)(Math.random()* 10) + 1)*100;
////		  System.out.println("��÷��ȣ : " + jumsu);
//		
//	}
//
//}
