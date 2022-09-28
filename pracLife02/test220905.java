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
			int[][] rd_N = new int[N][N]; // �ٵ����� ũ�� N�� �Է°���ŭ�� �迭����

			for (int j = 0; j < N; j++) { // �� �迭��ŭ ���� ���� ����
				for (int i = 0; i < rd_N[j].length; i++) {
					rd_N[j][i] = (int) (Math.random() * 3) + 1; // �迭�� ���̴� N�� �����ϰ� ������ ���� 1~4�� ������

					if (rd_N[j][i] == 1) { // 1~4�� X Y L H�� �� ���� �������� �ٵ��� ����
						System.out.print("X ");   //X�� ������ ��ü��Ŀ��� 1���� �����ؾ� �ϴµ�....
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
			//X�� ���� ���� �� �ִ� ����� �� ������ ��
			
			for (int j = 0; j < j-1; j++) {
				for (int i = 0; i < i-1; i++) {
//					if (rd_N[j][i] == 1 && rd_N[j][i - 1] == 2) { // X�ֺ� ����(�� ����) Y�� ���� ��
//						if (rd_N[j][i] == 1 && rd_N[j][i + 1] == 2) {
//						}
//					}
//					if (rd_N[j][i] == 1 && rd_N[j - 1][i] == 2) { //// X�ֺ� �࿡(���Ʒ�) Y�� ���� ��
//						if (rd_N[j][i] == 1 && rd_N[j + 1][i] == 2) {
//						}
//					}

					if (rd_N[j][i] == 1 && rd_N[j][i - 1] == 3) { //// X�ֺ� ����(�� ���� �׿�����) H�� ���� �� 1�� ���� �� �ִ�
						if (rd_N[j][i] == 1 && rd_N[j][i - 2] == 3) {
							if (rd_N[j][i] == 1 && rd_N[j][i + 1] == 3) {
								if (rd_N[j][i] == 1 && rd_N[j][i + 2] == 3) {
									AnswerN++;
								}
							}
						}
					}
					if (rd_N[j][i] == 1 && rd_N[j - 1][i] == 3) { //// X�ֺ� �࿡(�� �Ʒ��� �״�������) H�� ���� �� 1�� ���� �� �ִ�
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
			
			System.out.println("#" + test_case + ", ���� �� �� :" + AnswerN);
		}
	}

	private static Object nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

//�ٵ���= 8 <= N <= 100
//X = �̵������� ��
//Y = �̵��� �Ұ����� ��
//H = �Ϲ� ��
//L = ��ĭ
//X�� Y�� ���� �� ����, �� ���� �Ѿ�� �ٸ� ���� ���� �� �ִ�
//��ĭ�� �Ѿ��
//���� �������� �Էµ� N�� ����ŭ�� �迭�� ������ �Ѵ�
//�׹迭�� ���̴� N�̰� �迭 ���� ������ ���� X,H,Y,L�� �������� ���;� �Ѵ�

//���� ���� �� �ִ� ���� �� : 
//X�� Y�� ���� �� ����, �� ���� �Ѿ�� �ٸ� ���� ���� �� �ִ�
//��ĭ�� �Ѿ��
//X = �̵������� ��
//Y = �̵��� �Ұ����� ��
