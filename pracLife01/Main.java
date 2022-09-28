package pracLife01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		System.out.println(A + B);
//		
//		
//		
//
//	}
//
//}



//		Scanner scan = new Scanner(System.in);
//
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//
//		System.out.println(A + B);
//		System.out.println(A - B);
//		System.out.println(A * B);
//		System.out.println(A / B);
//		System.out.println(A % B);

		
		String name = "";
		
		try (Scanner scan = new Scanner(System.in)) {
			name = scan.nextLine();
		}
		String a = "junhan";
		
		if(name == a) {
			System.out.println("??!");
		}
		
	}

}
