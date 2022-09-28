package pracLife01;

public class novice_Prac {

	public static void main(String[] args) {
		int[] data = { 88, 50, 65, 80, 25, 65 };
		// 60이 넘는 데이터의 합계, 갯수, 평균을 구하기
		// 평균은 소수 첫째 자리에서 반올림해서 정수로 저장

		// 데이터의 갯수를 len에 저장
		int len = data.length;
		// 합계를 저장할 변수
		int sum = 0;
		for (int i = 0; i < len; i++) {
			// 60이상인 경우에
			if (data[i] >= 60) {
				sum = sum + data[i];
			}
		}
		System.out.println("합계: " + sum);
		System.out.println();

		int[] data1 = { 88, 50, 65, 80, 25, 65 };
		// 60이 넘는 데이터의 합계, 갯수, 평균을 구하기
		// 평균은 소수 첫째 자리에서 반올림해서 정수로 저장

		// 데이터의 갯수를 len에 저장
		int len1 = data.length;
		// 합계를 저장할 변수
		int sum1 = 0;
		// 데이터 갯수를 저장할 변수
		int cnt1 = 0;
		for (int i = 0; i < len; i++) {
			// 60 이상인 경우에
			if (data[i] >= 60) {
				sum1 = sum1 + data1[i];
				cnt1 = cnt1 + 1;
			}
		}
		System.out.println("합계:" + sum1);
		System.out.println("갯수:" + cnt1);
		System.out.println();

		int[] data2 = { 88, 50, 65, 80, 25, 65 };
		// 60이 넘는 데이터의 합꼐, 갯수, 평균을 구하기
		// 평균은 소수 첫째자리에서 반올림해서 정수로 저장

		// 데이터의 갯수를 len에 저장
		int len2 = data2.length;
		// 합계를 저장할 변수
		int sum2 = 0;
		// 데이터 갯수를 저장할 변수
		int cnt2 = 0;
		for (int i = 0; i < len2; i++) {
			if (data2[i] >= 60) {
				sum2 = sum2 + data2[i];
				cnt2 = cnt2 + 1;
			}
		}
		System.out.println("합계:" + sum2);
		System.out.println("갯수:" + cnt2);

		// 평균을 소수 첫째자리에서 반올림해서 정수로 출력
		if (cnt2 == 0) {
			System.out.println("조건에 맞는 데이터가 없습니다");
		} else {
			int avg = (int) ((double) sum2 / cnt2 + 0.5);
			System.out.println("평균:" + avg);
		}
		System.out.println();

		// 데이터의 범위를 모르는 경우
		int max = data2[0];
		int min = data2[0];

		for (int i = 0; i < len2; i++) {
			// 최대값보다 데이터가 더크면 데이터를 최대값에 대입
			if (max < data2[i]) {
				max = data2[i];
			}

			// 최소값보다 데이터가 더 작으면 데이커를 최소값에 대입
			if (min > data2[i]) {
				min = data2[i]; // min 변수에 저장된 값보다 더 작은 값이 배열에 있을 경우,
			}                   // min에 해당 값을 저장합니다.

		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println();
		
		
		
		//최대값을 가진 데이터의 인덱스를 찾기
		//최대값을 저장할 변수와 최대값의 인덱스를 저장할 변수를 생성
		//max = 0;
		//int idx = -1;
		
		//존재하는 데이터로 max를 초기화 할때는
		//인덱스도 존재하는 값으로 초기화를 해야한다
		int max1 = data2[0];
		int idx = 0;
		
		for(int i=0; i<len2; i++) {
			if(max1 < data2[i]) {
				max1 = data[i];
				//최대값이 변경될 때의 위치를 idx에 저장
				idx = i;
			}
		}
		System.out.println("최대값 " + max + "의 위치는 " + idx);
		System.out.println();
		
		
		//77에 가장 가까운 수 찾기
		//가장 가까운 수를 찾을 때에는 거리를 계산해서 거리의 최소값을 찾아야 한다
		//거리는 양수만 나와야 한다
		//실제 알고리즘에서는 거리를 제곱해서 사용한다
		//이것 때문에 분산이나 표준편차도 제곱을 한다
		
		int min1 = 1000000;  //최소값을 아주 큰 값으로 초기화
		//거리의 최소값을 저장하기 위한 변수
		int distanceMin = 1000000;
		//거리의 최소값의 위치를 저장할 인덱스
		int idx2 = -1;
		for(int i=0; i<len2; i++) {
			//거리계산
			int distance = 77-data2[i];
			//거리가 음수이면 양수로 변환
			if(distance < 0) {
				distance = -distance;
//				idx2 = i;
//				min1 = data2[i];
			}
			if(distanceMin > distance) {  // idx의 값(인덱스 위치)알기위한 코드
				//거리를 최소값에 대입
				distanceMin = distance;
				//데이터를 min에 대입
				min1 = data2[i];
				//인덱스를 idx에 대입
				idx2 = i;
			}
		}
		System.out.println("77에 가장 가까운 값 : " + min1 +" 위치는 "+ idx2);
	}

}
