package pracLife02;
import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

//	----------------------------------------------------------------------------

			N = sc.nextInt();
			int[][] rd_N = new int[N][N]; // 바둑판의 크기 N의 입력값만큼의 배열생성

			for (int j = 0; j < N; j++) { // 그 배열만큼 행의 갯수 생성
				for (int i = 0; i < rd_N[j].length; i++) {
					rd_N[j][i] = (int) (Math.random() * 3) + 1; // 배열의 길이는 N이 결정하고 각각의 값은 1~4의 랜덤값

					if (rd_N[j][i] == 1) { // 1~4에 X Y L H의 값 대입 랜덤으로 바둑판 생성
						System.out.print("X ");   //X의 갯수를 전체행렬에서 1개로 제한해야 하는데....
					} else if (rd_N[j][i] == 2) {
						System.out.print("Y ");
					} else if (rd_N[j][i] == 3) {
						System.out.print("H ");
					} else if (rd_N[j][i] == 4) {
						System.out.print("L ");
					}

					//**

				}
				System.out.println();
			}
			System.out.println();

//			--------------------------------------------------------------------
			//X가 알을 먹을 수 있는 경우의 수 만들어야 함
			
			for (int j = 0; j < j-1; j++) {
				for (int i = 0; i < i-1; i++) {
//					if (rd_N[j][i] == 1 && rd_N[j][i - 1] == 2) { // X주변 열에(양 옆에) Y가 있을 떄
//						if (rd_N[j][i] == 1 && rd_N[j][i + 1] == 2) {
//						}
//					}
//					if (rd_N[j][i] == 1 && rd_N[j - 1][i] == 2) { //// X주변 행에(위아래) Y가 있을 떄
//						if (rd_N[j][i] == 1 && rd_N[j + 1][i] == 2) {
//						}
//					}

					if (rd_N[j][i] == 1 && rd_N[j][i - 1] == 3) { //// X주변 열에(양 옆과 그옆까지) H가 있을 떄 1개 먹을 수 있다
						if (rd_N[j][i] == 1 && rd_N[j][i - 2] == 3) {
							if (rd_N[j][i] == 1 && rd_N[j][i + 1] == 3) {
								if (rd_N[j][i] == 1 && rd_N[j][i + 2] == 3) {
									AnswerN++;
								}
							}
						}
					}
					if (rd_N[j][i] == 1 && rd_N[j - 1][i] == 3) { //// X주변 행에(위 아래와 그다음까지) H가 있을 떄 1개 먹을 수 있다
						if (rd_N[j][i] == 1 && rd_N[j - 2][i] == 3) {
							if (rd_N[j][i] == 1 && rd_N[j + 1][i] == 3) {
								if (rd_N[j][i] == 1 && rd_N[j + 2][i] == 3) {
									AnswerN++;
								}
							}
						}
					}
				}
			}
			
			System.out.println("#" + test_case + ", 먹은 알 수 :" + AnswerN);
		}
	}

	private static Object nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

//바둑판= 8 <= N <= 100
//X = 이동가능한 포
//Y = 이동이 불가능한 포
//H = 일반 알
//L = 빈칸
//X는 Y를 넘을 수 없고, 한 알을 넘어야 다른 알을 먹을 수 있다
//빈칸은 넘어간다
//난수 생성으로 입력된 N의 수만큼의 배열이 나오게 한다
//그배열의 길이는 N이고 배열 안의 각각의 값은 X,H,Y,L이 랜덤으로 나와야 한다

//포가 먹을 수 있는 알의 수 : 
//X는 Y를 넘을 수 없고, 한 알을 넘어야 다른 알을 먹을 수 있다
//빈칸은 넘어간다
//X = 이동가능한 포
//Y = 이동이 불가능한 포
