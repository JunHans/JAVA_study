
public class How_math_random {

	public static void main(String[] args) {
		
//		<100가지의 랜덤숫자를 출력해봅시다.>
//
//		자바코드입력

		for (int i = 0; i < 100; i++) {
			System.out.println(Math.random());
		}

//		   Q2. Math.random() 메소드를 이용하여 원하는 (정수)범위까지 어떻게 만들까?
//	     <Math.random() * 숫자>
//
//				   : 입력한 숫자보다 작지만 무한히 가까운 수들이 만들어집니다.

//				   예시) Math.random() * 12
//				   : 12보다 작지만 무한히 가까운 수들이 만들어 집니다.

//		
		
//		(int) Math.random() * (최댓값-최소값+1) + 최소값>
//
//		   예시) 1 ~ 12까지의 랜덤 숫자 10가지 출력
//
//		   (int) (Math.random() * (12-1+1)) + 1
//
//		   → (int) (Math.random() * 12) + 1
//
//		   자바코드입력

		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 12) + 1);
		}

//		      예시) 12 ~ 24까지의 랜덤 숫자 10가지 출력
//		      (int) (Math.random() * 13) + 12
//		      자바코드입력

		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 13) + 12);
		}
	}

}
