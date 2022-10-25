/*
�߻� Ŭ���� 
>> �̿ϼ� Ŭ����(�̿ϼ� ���赵)
1. �ϼ��� �ڵ� + �̿ϼ��� �ڵ� 
2. �ϼ��� (�Լ�) = ������� �ִ� �Լ� + �̿ϼ� (�Լ�) = ������� ���� �Լ� >> public void run();
���� �Լ� = public void run(){}
3. �ϼ��� Ŭ���� (new ����)  -  �̿ϼ� Ŭ���� (������ ��ü ���� �Ұ�)

������ ���忡�� 
>> �ǵ�? �̿ϼ��� �ָ����? >>  �ݵ�� �������ض�  >>  ������ ������ �������� (���� ���ϴϱ�) �����ڵ��� ���θ� ���� ����


 */
class Car{
	void run() {}  //������ ���  : ������� ������ �ϼ��� �ڵ�
}
class Hcar extends Car{
	//����
	@Override
	void run() { System.out.println("������");}
}
//Car�������� run()�� �������ؼ� ������ �ٲپ��	
//�׷��� ������ ����� Hcar����� ����� �ǹ������� �ƴ�
//�� �ڵ�� �������� ����

abstract class Abclass{  //Ŭ���� �ȿ� �ּ� 1�� �̻��� �߻��Լ��� ���� Ŭ����
	//�ϼ��� �ڵ�
	int position;
	void run() {
		position++;
	}
	
	//�̿ϼ� �ڵ� �߰� (�߻��Լ� : �̿ϼ� �Լ�)
	abstract void stop();  //����� X  >> ������ ����(Override ����)
}

class Child extends Abclass{

	@Override
	void stop() {  //������� ����� ������ ��(������)
		this.position = 0;
		System.out.println("stop:"+this.position);
	}
	
}
	
	
public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();

//		Child2 ch2 = new Child2();
//		ch2.stop();
		//////////////////////////////////////////////////////
		Abclass ab = ch;  //������ 
		//��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ�� ��ü���� �ּ� ���� �� �ִ� = '������'
		//��, �θ�� �ڽ��� �͸� �� �� �ִ�
		//��, ������ �� ���� �� �� �ִ�
		ab.run();   //�θ� �ڱⲨ�� ��� ����
		ab.stop();  //�ڽ��Լ��� ȣ��(����) ... ������ �Ǿ ��밡�� �̿ϼ��Լ��� �θ��ڱⲫ ������ ����
	}

}
