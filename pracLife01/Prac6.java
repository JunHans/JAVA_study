package pracLife01;

import java.util.Scanner;

public class Prac6 {

	public static void main(String[] args) {
//		�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
//		ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
//		A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
//		A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
//		A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
		
		
//		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		

		if(A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
