import java.util.Scanner;

import pracLife01.ifp;

public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		//�޴��� �����ְ� ����ڿ��� �����ϰ�
		//�ٸ� ���� �����Ѵٸ� �ٽ� �����ϵ��� �����ϴ� �޴�
		//while(true)���
		//do~while()���
		
		double random = Math.random();
		System.out.println(random); // 0<= random < 1
		random = Math.floor(3*random+1); //1 <= random < 4;
		System.out.println((int)random);
		
		
		boolean auto = true;
		int balance = 0;  //�ܾ�
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("*********************************");
			System.out.println("1. ���� | 2. ���� | 3. �� ");
			System.out.println("*********************************");
			
			System.out.println("�����ϼ���");
			
			int input = Integer.parseInt(sc.nextLine());
			
			//�Ǵ�
			switch(input){
			case 1 : System.out.println(random);
					 balance += Integer.parseInt(sc.nextLine());
					 break;
			case 2 : System.out.println(random);
					 balance -= Integer.parseInt(sc.nextLine());
					 break;
			case 3 : System.out.println(random);
			 		 break;
//			case 4 : System.out.println("�����մϴ�");
//					 auto =false;
//					 break;
			default : System.out.println("�ùٸ� �ָ��� ������");
			}
			
			if(auto == false) {
				break;  //�Ǵ� 
			}
			
			
			
			
			//����
			/*
			 if(opr.equals("+")) {  //POINT ���ڿ��� �񱳴� == �ƴϰ� (x) , equals (String) >> String  Ŭ����
				  result = input_1 + input_2;
				  
			  }else if(opr.equals("-")) {
				  result = input_1 - input_2;
				  
			  }else if(opr.equals("*")) {
				  result = input_1 * input_2;
				  
			  }else if(opr.equals("/")) {
				  result = input_1 / input_2;
			  }else {
				  System.out.println("�������� �ʴ� ������ �Դϴ�");
				  //key point (���⼭�� main �Լ�)
				  //return Ű���� :  [�Լ�����]�� ������  > main �Լ� Ż�� > ����
				  return ;
				 
				  //System.exit(0); //�������� ���α׷� ����
			  }
			*/
		}

	}

}
