package kr.or.kosa;
//������ ���� (���� ����) >>> new �� ���� �۾�

//�̱��� ...( ��ü �ϳ��� ���� �����ϰڴ� )
//�ǵ� : �ϳ��� ��ü�� �����ϴ� ���强 �ڵ� ....

//����IP
//����������
//�̷��� �����Ҷ� ���̴� ���




public class Singleton {
	private static Singleton p; //p��� ������ �ּҸ� ������ ... new �ʿ�
	private Singleton() {
		//�����ڿ��� ������ private .. �������Լ� ȣ�� ���ϴ� ��ü���� �Ұ�  new
	} 
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();  //���� Ŭ���� ���ο��� public�� private�� ����
		}
		return p;
	}
	
}
/*
 Singleton s = new Singleton();  //����Ʈ�������� ��ȣ
 */