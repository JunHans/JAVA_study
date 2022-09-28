package pracLife01;

public class star1 {

	public static void main(String[] args) {
		for(int i =1; i<7; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
//--------------------------------------------------------------		
		for(int i =1; i<7; i++) {
			for(int j=7; j>0; j--) {
				if(i<j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
//		--------------------------------------------------------------

		for(int i =0; i<4; i++) {
			for(int j=0; j<3-i; j++) {  //i0일때 0<3/1<3/2<3/3<3/ i1일때 0<2/1<2
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {  //i0일때 0<1/ 1<1/ 0<3 /1<3/2<3/3<3
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		--------------------------------------------------------------
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");  //왼쪽부터 늘어나는 공백 구현
			}
			for(int j=5; j>i; j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
