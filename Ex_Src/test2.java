
		
		import java.util.Scanner;

		public class test2 {

			public static void main(String[] args) {

				boolean auto = true;
				
				Scanner sc = new Scanner(System.in);
				
				while (true) {
					System.out.println("**********************************");
					System.out.println("1. ���� | 2. ���� | 3. �� | 4. ���� ����");
					System.out.println("**********************************");
					
					System.out.println("�����ϼ���");
					int input = Integer.parseInt(sc.nextLine());
					
					double random = Math.random();
					random = (3*random+1);

					int result = (int) random;
				
					String st1 = "";
					if (result == 1) { st1 = "����"; }
					else if (result == 2) { st1 = "����"; }
					else if (result == 3) { st1 = "��"; }
					
					if (input<=3 &&
							(input ==1 && result ==2) ||
							(input ==2 && result ==3) ||
							(input ==3 && result ==1)
							) {System.out.println("�����ϴ�");}
					else if (input<=3 &&
							(input ==3 && result ==2) ||
							(input ==2 && result ==1) ||
							(input ==1 && result ==3)
							) {System.out.println("�̰���ϴ�");}
					else if (input<=3 && (input==result)) {System.out.println("�����ϴ�");}
					else if (input==4) {auto = false;}
					else {System.out.println("�ٽ� �����ϼ���"); continue;}
					
					if (auto == false) {
						System.out.println("������ �����մϴ�");
						break;
					}
					
					if (auto == true)
					{ System.out.println("��ǻ���� ���: " + st1); }
				}
	}
}
