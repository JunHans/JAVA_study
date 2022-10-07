import java.util.Arrays;

/*
배열은 객체다 (Array)
1. new를 통해 생성
2. 객체니까 Heap 메모리 사용 (관리자원)
3. 다른 말로 = 고정배열(정적배열) : 베열을 한번 선언하면 (크기가 정해지면) 변경 불가  <= 반대 =>  collection(동적) 
4. 자료구조 (알고리즘) 의 가장 기초적인 학습 
 */


public class Ex01_Array_basic {

	public static void main(String[] args) {
		//같은 타입의 변수 여러개를 선언해서 데이터를 처리하세요
		int s;
		int s1;
		int s2;
		
		int a, a1, a2;
		//....
		//배열
		int[] score = new int[4];
		//타입[] 변수명 = new 길이
		//int타입의 방 4개 생성 ... heap 연속된 공간에 >> 방이름(index(첨자): [0][1][2]....)
		System.out.println(score[0]);
		score[0]=101;
		score[1]=20;
		score[2]=300;
		score[3]=500;
		//score[4]=111;
		//(예외) java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 41
		//방의 개수는 항상 index 값보다 1이 크다 (n-1 한 것이 마지막 index)
		
		System.out.println(score[3]);
		
		//Array 배열 궁합 좋은 제어문( for문 )
		for(int i = 0; i < 4; i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		
		for(int i=0; i < score.length; i++) {  //이건 암기... 배열의 갯수 score.length
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		//Tip  Arrays.toString(score)1 쓰지마세요 (실력이 감소)
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);  //[101, 20, 300, 500]
		
		//Tip  : sort 당분간 쓰지 마세요32
		Arrays.sort(score);   //자동 정렬이 되버림 자리바꿈
		resultArray = Arrays.toString(score); 
		System.out.println(resultArray);  // [20, 101, 300, 500] 
	
		//정렬 알고리즘 (최소 버블정렬)
		
		//Today Point
		//배열 생성 3가지 (암기)
		int[] arr = new int[5];  // 기본
		int[] arr2 = new int[]{100, 200, 300};  //초기값을 통해서 배열 개수 정의하고 값을 할당
		int[] arr3 = {11, 22, 33};  //컴파일러에게 자동으로 new 부분을 부탁 ... (0)  --> "가장 많이 쓰는 방법"
		//Tip) javascript : let cararr = [1,2,3,4];
		
		//출력
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//배열은 객체다 (new ... heap 메모리에서 로드)
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4);  //주소값 출력 : [I@6a5fc7f7
		
		int[] arr5 = arr4;  //같은 주소 
		System.out.println(arr4 == arr5);  //true
		
		//배열의 타입은 : 8가지 기본 + String + 클래스(타입이니까)
		String[] atrarr = new String[] {"가","나","다"};
		for(int i = 0; i<atrarr.length; i++) {
			System.out.println(atrarr[i]);
		}
		
		char[] carr = new char[5];
		float[] farr = new float[4];
		
		/*
		class Car {}
		 */
		//Car[] cararr = new Car[5];
	}

}
