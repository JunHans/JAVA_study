
public class Ex10_Statement {

	public static void main(String[] args) {
		//���
		//���ǹ� : if (3���� ����) , switch(����){case �� ....break}
		//�ݺ��� : for (�ݺ�Ƚ���� ��Ȯ) , while(����){} , do{}~while()
		//�б⹮ : break(��Ż��) , continue(�Ʒ� ���� skip)
		
		//<IF��>
		int count=0;
		if(count < 1) System.out.println("true");
		
		if(count < 1) {
			System.out.println("true");          //�ʺ����� �߰�ȣ �� ���
		}
		
		//<����ġ ��>
		char data='A';
		switch(data) {
			case 'A' : System.out.println("���ں񱳰��ƿ�");
				break;
			case 'B' : 
				break;
			default : System.out.println("������ ó��");		
		}
		
		//<for��>
		int sum = 0;
		for(int i =1; i<=100; i++) {
//			System.out.println("i : " + i);
			sum += i;
		}
		System.out.printf("1~100������ : %d \n ", sum);
		
		//1~5������ ��
		//for���� while ���� ����
		// ���� * (���۰� + ����) /2
		sum = 5* (1+5) /2;  //����������;; �츰 for�� ���� ��
		System.out.println("sum : " + sum);		
		
		
		//for���� ����ؼ� 1~10���� Ȧ���� ���� ���ϼ���
		//for(�ʱⰪ ; ���ǽ� ; ������) >> �������� �����غ�����
		//1 3 5 7 9
		//result+=i; (1,3,5)
		int result = 0;
		for(int i=1; i<=10; i+=2) { //i=i+2
			result+=i;
				//result = 0 + 1
				//result = 0 + 3
				//result = 0 + 5 ...
			System.out.println("result : " + result);
		}
		
		//for �ȿ� if���� ����ؼ� 1~1000������ ���� ���ϼ���
		int sum3= 0;
		for(int i=1; i <= 1000; i++) {
			//sum3 +=i;
			if(i % 2 == 0) {
				System.out.println(i);
				sum3+=i;
			}
		}
		System.out.println("sum3 : " + sum3);
	

	// �Ի���� (������)
	// ��ø FOR
	// �Ѱ��� ���� ���� ... �ݺ� (2 1~9 , 3 1~9)
	for(int i=2;i<=9;i++)

	// i ��� �������� ��ȿ������ ����ϱ�
		for (int j = 1; j <= 9; j++) { // j�� ������
			System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
		}
		System.out.println(); // ����
	
	//for + (�б⹮) continue , break
	//: continue(�Ʒ� ���� skip) , break(for, while �� Ż��)
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			if(i == j) { //i=2 .. j=2 , i=3 .. j=3
				break;
			}
			System.out.printf("%s","*");
		}
		System.out.println();//����
	}
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<i; j++) {
			System.out.printf("%s", "*");
		}
		System.out.println();
	}
	
	
	for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			if(i == j) { //i=2 .. j=2 , i=3 .. j=3
				continue;
			}
			System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
		}
		System.out.println();//����
	}
	for(int i=2; i<=9; i++) {
		for(int j=1; j<i; j++) { //j <=9�ڵ带 ���� >> j < 9
			System.out.printf("*");
		}
		System.out.println();			
		}
	
	//100���� 0���� ��� .. ������ --i
	for(int i =100; i>=0; i--) {
		System.out.println(i);
	}
	
	//�����ںе�
	//�Ǻ���ġ ���� ����(������ for)  �Ի���迡 �ܰ��� & ����ó����� �ܰ���
	int a =0 , b = 1 , c = 0;
	for(int i=0; i<10;);
	}

}