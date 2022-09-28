package pracLife02;

import java.util.Scanner;

public class Collection_Exercise_02 {
	public static void main(String[] args) {

		int[] arr1 = { 5, 3, 18, 7, 5, 19 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		// 버블정렬
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 1; j < arr1.length - i; j++) {
//				if (arr1[j] < arr1[j - 1]) {
//					int tmp = 0;
//					tmp = arr1[j];
//					arr1[j] = arr1[j - 1];
//					arr1[j - 1] = tmp;
//				}
//			}
//		}
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		System.out.println("--------------------");

		int max = 0;
		int maxNo = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			if (arr1[i] < arr1[i + 1]) {
				maxNo = i + 1;
				max = arr1[i + 1];
			}
		}
		System.out.println("최댓값 인덱스: " + maxNo);
		System.out.println("최댓값: " + max);

		// 문제) 5개 정수를 입력받은 후 차례로 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
//		int[] arr2 = new int[5];
//
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (int a : arr2) {
//			System.out.print(a);
//		}

		//  문제) 10개의 문자를 입력받아 3번쨰,5번쨰,마지막 입력받은 문자를 이어서 출력하는 프로그램
//		int[] arr3 = new int[10];
//		
//		for(int i=0; i<arr3.length; i++) {
//			arr3[i] = sc.nextInt();
//		}
//		System.out.println(arr3[2]+" "+arr3[4]+" "+arr3[arr3.length-1]);

		
		// 문제) 최대 100까지 배열 입력받음 0이입력되면 입력 그만받고 짝수번쨰 인덱스만 출력
//		int[] arr4 = new int[100];
//		int cnt =0;
//		for (int i = 0; i < arr4.length; i++) {
//			arr4[i] = sc.nextInt();
//			if (arr4[i] == 0) {
//				break;
//			}
//			cnt++;
//
//		}
//		for (int i = 1; i < cnt; i += 2) {
//			System.out.println(arr4[i]);
//		}
		
		//문제) 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0이 입력되면 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램 작성

		int[] arr5 = new int[100];
		int cnt1 = 0;
		
		for(int i=0; i<arr5.length; i++) {
			arr5[i] = sc.nextInt();
			if(arr5[i] == 0) {
				break;
			}
			cnt1++;
		}
		for(int i = cnt1-1; i>=0; i--) {
			System.out.println(arr5[i]);
		}
		
		
	}

}
