
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		������ �迭 (2����) ---- ex)��ȭ�� �¼�
		[��] [��]
		��ȭ�� �¼�, ���� ��ǥ��, ���� �ٵ���, ����
		
		��ȭ�� ���� ��� ..���� ���α׷�
		 */
		int[][] score = new int[3][2];
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		//for�� (��ø for��)
		// ���� ���� : �迭�̸�.leghth >> score.lenhth >> 3
		// ���� ���� : ��Ʈ) 2���� �迭�� �׸� >> score[i].length >> ���� ���� >>Point
		//https://cafe.naver.com/kosait (����)
		
		for(int i =0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score: [%d][%d]=%d\t", i,j,score[i][j]);
			}
			System.out.println();
		}
		
		int[][]score3 = new int[][] {{11,12},{13,14},{15,16}}; //�߰�ȣ ���� �߰�ȣ �ϳ��� ��  0��,1��,2��...
		//Ŀ������
		//������ for������ �迭�� ���
		for( int[] r : score3  ) {  //���� �ּҰ�
			for( int c : r ) {  //���� �迭���� ���
				System.out.println(c);
			}
		}
	}

}