package kr.or.kosa;

//static ������ ��ü���� ���� ���� ������ �Ұž߸� �������� ����
//instance ������ ��ü���� �ٸ� ���� ������ �Ұž߸� �������� ����

//�� �κ����� ���ؼ� �ʱ�ȭ�� �ϴ� ���

class InitTest {
	static int cv = 10;
	static int cv2;
	int iv = 9;

	// 3���� ��� ����Ʈ ���� �ʱ�ȭ�� ���� �ʾƵ� �ǿ�
	
	static{
		//static �ڿ��� �ʱ�ȭ ��
		//���� ���� : static int cv = 10; , static int cv2; �� �γ༮�� �ö󰡰� �� ���� �����
		cv = 1111;
		cv2 = cv + 2222; //���۵� ���� ǥ���� ���� 
	}
	

	{
		// �ʱ��� ��(member field �ʱ�ȭ)
		// ��ü�� �����ǰ� ���� int iv�� �޸𸮿� �ö󰡰� ���� �ٷ� ȣ���{��}
		// �������� �ڵ尡 ���� if(iv> 10) iv = 100;
		System.out.println("�ʱ��� ��");
		// iv = 2222;
		if (iv > 10) iv = 1000;
		
		cv = 100;  //�ʱ�ȭ  >> ��ü�� new�� ���� ������ ... �ʱ�ȭ�� ����ȵǿ� Static�� ���ؼ�, ����ƽ�� ���ϸ����ö󰡰� new �� ����Ǿ��
	}
}

public class Ex09_Static_init {

	public static void main(String[] args) {
		//InitTest t = new InitTest();
		//System.out.println(t.iv);
		
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
								// static�� �ö󰡰� �ٷ� ���� ,static�ʱ��ں��� ����ǰ� ����Ʈ ���� ���۵� ������ �ٲ��
								// static�ʱ��ں��� �� ���̰� �׳� �ʱ��� ���� ���� �Ⱦ��δ� (�� ���� ���̴� ��������� �ϴ� �� �־)
	}

}
