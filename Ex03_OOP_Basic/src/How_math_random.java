
public class How_math_random {

	public static void main(String[] args) {
		
//		<100������ �������ڸ� ����غ��ô�.>
//
//		�ڹ��ڵ��Է�

		for (int i = 0; i < 100; i++) {
			System.out.println(Math.random());
		}

//		   Q2. Math.random() �޼ҵ带 �̿��Ͽ� ���ϴ� (����)�������� ��� �����?
//	     <Math.random() * ����>
//
//				   : �Է��� ���ں��� ������ ������ ����� ������ ��������ϴ�.

//				   ����) Math.random() * 12
//				   : 12���� ������ ������ ����� ������ ����� ���ϴ�.

//		
		
//		(int) Math.random() * (�ִ�-�ּҰ�+1) + �ּҰ�>
//
//		   ����) 1 ~ 12������ ���� ���� 10���� ���
//
//		   (int) (Math.random() * (12-1+1)) + 1
//
//		   �� (int) (Math.random() * 12) + 1
//
//		   �ڹ��ڵ��Է�

		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 12) + 1);
		}

//		      ����) 12 ~ 24������ ���� ���� 10���� ���
//		      (int) (Math.random() * 13) + 12
//		      �ڹ��ڵ��Է�

		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 13) + 12);
		}
	}

}
