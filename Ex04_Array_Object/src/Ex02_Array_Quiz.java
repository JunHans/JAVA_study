import java.util.Iterator;

public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// 국문과 학생들의 기말고사 시험점수입니다
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max < 79
		int min = score[0]; // max < 79
		/*
		 * 제어문을 통해서 max라는 변수에 시험점수중에 최대값을 담고 min이라는 변수에 시럼점수 중 최소값을 탐으세요 출력 = max > 97,
		 * min > 54 단) for문을 한번만 사용하세요
		 */
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				System.out.println(score[i]);      //for 문은 계속 도니까 가장 마지막으로 큰 값이 score[i]의 값이고 그게 max가 된다
			}
			if (score[i] < min) {
				min = score[i];
				System.out.println(score[i]);
			}
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		int[] numbers = new int[10];
		// 10개의 방의 값을 1 ~ 10까지로 초기화 시켜라
		// for문으로 [0]=1, [9]=10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			// 0번쨰방에는 1이, 1번째방에는 2가, ~
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("******************************************");

		// 어느학생의 기발고사 시험점수 (5과목)
		int[] jumsu = { 100, 55, 90, 60, 78 };
		int sum = 0;
		float avg = 0f;

		// 1. 총과목의 수
		// 2. 과목의 합
		// 3. 과목의 평균
		// 단, 2,3문제는 하나의 for문으로 해결

		System.out.println(jumsu.length);

		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) { // 마지막 방
				avg = sum / (float) jumsu.length;
			}
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.printf("총과목수:[%d],총점:[%d],평균:[%f]", jumsu.length, sum, avg);
	}
}
