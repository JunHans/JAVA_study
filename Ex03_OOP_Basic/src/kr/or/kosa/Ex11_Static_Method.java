package kr.or.kosa;

public class Ex11_Static_Method {

	public void method() {  //heap �޸𸮿� �÷��� ��밡��
		System.out.println("�� �Ϲ� �Լ���");
		
		public static void smethod() {
			System.out.println("�� ����ƽ �Լ���");
		}
	}

	public static void main(String[] args) {
		// smethod ��밡��? -> ����!
		Ex11_Static_Method ex11 = new Ex11_Static_Method();
		// ex11 �������� (�ּҸ� ������ ����)�� static ����, �Ϲ� ���� ����
		ex11.method();

	}

}
