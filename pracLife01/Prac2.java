package pracLife01;

import java.io.DataOutput;

public class Prac2 {

	public static void main(String[] args) {
		
//		for(int i=1; i<10; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
           //i가 1일때 j는 0이니 i보다 작다 점 1개 찍는다
		   //i가 2일때 j는 0이니 i보다 작다 x2 점2개
		   // .....반복하고 i는 10보다 작아야 하니 9에서 끝난다, 점9개
		
		
		
//		123456789
//		987654321
//		i가 1일때 j는 9고 j가 하나씩 줄어들며 반복될때 마지막에 i도 1 j도 1이될때 else로 점이 하나찍힌다
//		다시 올라와서 i가 2일때 j는 또 9부터 시작하고 9에서부터 줄어들다 j가 2가되는 순간부터 2,1 로 점 2개 찍힌다.
//		.......반복하고 i가 9일때 j는 처음부터 9이니 시작부터 점이 찍히거 점이 9개 찍힌다
//		for(int i=1; i<10; i++) {
//			for(int j=9; j>0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		i=0 j=0 0<9-0 "" x8
//		i=0 j=0 0<2*0+1 * 한개 찍고 (0)
//		엔터하고 다시 제일 위로
//		i=1 j=0 0<9-1 "" x7 
//		i=1 j=0 0<2*1+1 * 3개 찍고 (0,1,2)
//		....반복하고 마지막엔 
//		i=9 j=0 0<9-9 "" 안찍고
//		i=9 j=0 0<2*9+1= 19 * 19개 (0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
