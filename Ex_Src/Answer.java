
public class Answer {

	public static void main(String[] args) {
		
		//[1�� ����]
		//���ĺ�(A~Z) ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		//(for ���� ����ϼ���)
		for(char i = 'A'; i <='Z' ; i++) {
			System.out.print(i);
		}
		
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + " ");
		}		
		
		System.out.println();
		
		
		//[2�� ����]
		//1~100���� 10�� 10���� ����ϴ� ���α׷��� �ۼ��ϼ���
		//(for���� ����ϼ���)
		//ex)
		//1 2 3 4 5 6 7 8 9 10
		//11 12 13 .....
		//91 92 93 94 ... 100
		for(int i=1; i<=100; i++) {
			System.out.print(i+ " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}	
		
		
		//[3�� ����]
		//�ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ��� 
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) { //6, 6 �ֻ��� ģ�� ����
                if (i + j == 6) { //�� ���� ���� 6�� ��� 
                    System.out.print(i +","+j + "\t"); //����մϴ�.   // \t ����
                }
             }
        }

	}

}
