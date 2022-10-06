package kr.or.kosa;
/*
 static member field : ��ü�� �����ڿ�
 static method : why : ù�� ù�ð��� �ߴ� �ڵ忡 ��Ʈ��... 
  1.��ü ���� ���� ....
  2.���� ����ؿ�
  3.���赵�� ���鶧 ����ؿ�(����� �� �ڿ��� (���) ���� ����Ѵٸ�)
  4.[�ڿ� ���� ����] -> [�� ���ϰ� ���� ���ٰ�] .. new ��ü ���� ��������? -> ���ϰ� ��  >>> static ����
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//�Ϲ��Լ�
		//new���ؼ� heap > ���
		//1. iv �����
		//2. �Ϲ��Լ��� ����ƽ �ڿ������ֳ�? - > �����޸𸮿� �ö������� ������ ���� �ִ�
		cv = 100;
		//why :static�ڿ��� ��ü ���������� memory�� �ö� ����)
	}
	static void print() {
		//static �Լ�
		//1. cv �����
		//2. static�ڿ��� �Ϲݺ��� iv������ұ�? �ȵɱ�? 
		// iv = 1000; �Ұ� (static�ڿ��� �Ϲ��ڿ����� �켱�Ѵ� , ���� �����ֱ� ������ ����ƽ�� ������������ �� �Ϲ� �ڿ��� ����)
		
		//���: static�� static�ڿ��� ������ ��ƿ�
		cv = 10000000;
	}
}

public class Ex10_Static_method {

	public static void main(String[] args) {
		StaticClass.print();  //new ���� �Լ� ��� ...
		
		System.out.println(StaticClass.cv);
		
		//�Ϲ��ڿ��� �Ϸ���(��ü ����)
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print();
		
	}

}
