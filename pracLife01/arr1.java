package pracLife01;

class arr1 {

	public static void main(String[] args) {
		// Array => 타입[] 변수 = null;
		// 1번 : 타입[] 변수 = {값0, 값1, 값2, 값3...};
		int[] arry1 = { 0, 1, 2, 3, 4 };
		System.out.println("arry1 [0]: " + arry1[0]);
		System.out.println("arry1 [1]: " + arry1[1]);
		System.out.println("arry1 [2]: " + arry1[2]);
		System.out.println("arry1 [3]: " + arry1[3]);
		System.out.println("arry1 [4]: " + arry1[4]);

		int sum = 0;
		for (int i = 0; i < arry1.length; i++) {
			sum += arry1[i]; // 배열의 총합
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / arry1.length;
		System.out.println("평균값: " + avg);

		//1-1 배열 변수 미리 선언한 후 값 목록이 나중에 결정되는 경우
		int[] arry2;
		arry2 = new int[] {10,20,30,40,50};
		
		
		// 2번 : 타입[] 변수 = new 타입[변수 길이];  배열 변수 미리 선언한 후 값 목록이 나중에 결정되는 경우
		int[] arry3 = new int[30];
		for(int i=0; i<arry3.length; i++) {
			System.out.printf("arry3[%d]\n",arry3[i]);
			//기본 값으로 전부다 0 지정되어 있음 String이면 아래처럼 null
		}
		
		String[] arry4 = new String[10];
		for(int i=0; i<arry4.length; i++) {
			System.out.printf("arry4: [%s]\n",arry4[i]);
		}
		//배열 선언된 이후에 배열에 값넣기
		arry4[0]="0";
		arry4[1]="1";
		arry4[2]="2";
		arry4[3]="3";
		for(int i=0; i<arry4.length; i++) {
			System.out.printf("arry4: [%s]\n",arry4[i]);
		}
		
		
	}

}
