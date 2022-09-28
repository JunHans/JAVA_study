package pracLife01;

import java.io.DataOutput;

class arr2 {

	public static void main(String[] args) {
		//2차원 배열
		int[][]scores = new int[3][3]; // 3*3모양 배열 생성
		int[][]scores1 = new int[3][]; // 계단 형태 배열 생성
		scores1[0] =new int[2];   //0번째 인덱스에 2칸의 행렬 대입
		scores1[1] = new int[3];  //1번째 인덱스에 3칸의 행렬 대입
		// 0 1
		// 0 1 2 모양

		
		//값 목록을 이용한 2차원 배열 생성
		//타입[][]변수 = {{값1,값2},{값1,값2},{값1,값2}...};
		//중괄호 블럭의 개수가 행 수 , 블럭 내 요소의 개수가 열 수 된다
		int[][] arr1 = {{1,11},{2,22},{3,33}};
		// 1 11
		// 2 22
		// 3 33 모양  3행2열
		int a =arr1[0][0]; // = 1
		int b =arr1[0][1]; // = 11
		
		int[][]arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[2];
		// 0 0
		// 0 0 0
		// 0 0

		int[][] arr3 = {{1,11},{2,22},{3,33,333}};
		for(int i = 0; i<3; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.printf("arr2[%d][%d]=[%d]\n",i,j,arr3[i][j]);
			}
		}
		String[]arr7 = new String[3];
		arr7[0] = "java";
		arr7[1] = "java";
		arr7[2] = new String("java");
		System.out.println(arr7[0] == arr7[1]);  //true
		System.out.println(arr7[0] == arr7[2]);  //false
		System.out.println(arr7[0].equals(arr7[2]));  //true equals 연산자는 주소번지가 아닌
													  //값자체를 비교하기 때문
		//배열의 복사 방법(for활용)
		int[] arr8 = {1,2,3};
		int[] arr9 = new int[5];
		for(int i =0; i<arr8.length; i++) {
			arr9[i] = arr8[i];
		}
		for(int i =0; i<arr9.length; i++) {
			System.out.println(arr9[i]);
		}
		//System.arraycopy(Object src, int srcPos,Object dest, int destPos.int length);
		//                   원본배열 / 인덱스 / 대상배열 / 인덱스 / 개수
		//배열은 한번 선언되면 바꿀수 없기에 새로운 배열으로 복사해서 추가해야 한다
		int[] arr10 = {1,2,3};
		int[] arr11 = new int[5];
		System.arraycopy(arr10, 0, arr11, 0, arr10.length);
		//System.arraycopy.(어떤 배열을 복사할것인지, 어디서부터 복사할건지, 어떤배열에 붙여넣을건지,그배열의 어디서부터 붙여넣을지)
		for(int i=0; i<arr11.length; i++) {
			System.out.println(arr11[i]);
		}
		
		
		// <향상된 for문 & 개선된 for문>
		//배열에 있는 인자들을 하나씩 실해해주는 for문 / 반복위해 루프카운터변수나 증감식 사용X
		
		//  for(타입 변수 : 배열) {
		//	  실행문
		//   }
		int[] arr12 = {10,20,30,400,50};
		
		int sum = 0;
		for(int too : arr12) {
			sum+=too;
		}
		System.out.println("값의 총합 : "+ sum);
		
	}

}
