/*
�߻� Ŭ���� �� �������̽�

�߻�Ŭ������ �������̽��� ������
1. ������ ��ü ������ �Ұ��� �ϴ� (new ������ ��� �Ұ�)
1.1 �γ��� ������ : �߻�Ŭ����(�ϼ� + �̿ϼ�) , �������̽�(��� ���� �̿ϼ�) 

2. ���
�߻�Ŭ���� extends
�������̽� implements

class Car extends Abclass{} ;
class Car implements Ia() ; 
�� �� �߻��ڿ���  ���� �ִ�  >>  extends , implements  >>  ������ ���� ����(������) 

�߻�Ŭ������ �������̽��� �ٸ���
3. �߻�Ŭ���� (�ϼ��� �ڵ� �Ϻ� ���� �ִ�) �׷��� �������̽��� ��ü�� �̿ϼ���
3.1 ��Ģ������ Ŭ������ ���� ���(������ ���) �׷��� �������̽��� �����ϰ� >> ���߱����� �����ϴ� >> ���� ������
>> �������� ����   >> �װ͵��� ��Ƹ�Ƽ� ū ��� >>  �ʹ� ū ����� ����� ��뼺�� ������
Ia , Ib , Ic
class Test entends Object implements Ia, Ib, Ic
Tip) �������̽��� �������̽������� ����� �����ϴ�(extends) >>  ����� ũ�� ���� �� �ִ�

4. �������̽� (����� ������ �������� �̿ϼ�(�߻�))  >>  JDK8(Default �� , static ��)

 
�������̽� : ���, ǥ���� ����� �� (��Ģ�� �Ծ�)
����Ʈ���� ���� �ֻ��� �ܰ� ... 
�ʱ� �����ڰ� �������̽��� ������ ���� ���� �ʴ�...
�ʱ� �����ڴ� ������� �������̽��� ����ϴ� ����� ó���ϴµ��� ������ ����
�����θ� ������ �ʴ´�  ..  ��ӿ� ���� ���Ǹ�  ..  

�ʱް������� �ü�����
1. �������̽��� [[[[ ������ ]]]] �������� ���� (�������̽��� �θ� Ÿ��) ************
2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ��� �Ѵ�(���� �θ� ������ �����ν�)
3. Java API �� ���� (�̸� �������) �������̽��� ����(�������� �ʾƵ� ) ��밡��
4. �������̽� (~able) : �����ִ� , ������ �� �ִ�
5. ��ü�� ����� (��ü�� ����)  >> [[[ ������ ]]]
**����ǥ�� >> ���� >> ������


interface
1. ���� �����긦 ������ ���� �ʴ� : ������� ���� : ��Ģ(���)�� ����� ����
 �ý��ۿ��� �̵��ϴ� ���� move��� �̸��� ����ϰ� �̵��ÿ��� ��ǥ���� �޾ƾ� �Ѵ�
 >> ���� >> void move(int x, int y); {������ �˾Ƽ�} Ŭ������ �˾Ƽ�...  >> ������ >> ����
 java API �������̽� �����ϰ� �����ϴ� Ŭ���� �̹� �� ���� 
 >> Collection(�����迭)  >>  Vector , [[[ArrayList]]] , HashSet, [[[HashMap]]]
 Collection Ŭ������ ������ �������̽��� �����ϰ� �ִ� Ŭ����  

2. ������� 
2.1 ���(final)     :  [public static final] VERSION=1;  >>  int VERSION=1;     -- <�޸𸮿� �ö󰡼� �� �ȹٲ�� ��Ƽ�� �ִ� ��>
                     ���� �ϸ� �����Ϸ��� �˾Ƽ� [public static final] �ٿ��ݴϴ�
2.2 �߻� �Լ�(method) : [public abstract] void run();  >>  void run();
                     ���� �ϸ� �����Ϸ��� �˾Ƽ� [public abstract] �ٿ��ݴϴ�
                     
interface Aa{
	int VERSION=1;  //[public static final]
	void run();    //[public abstract]
	String move(int x , int y);
}

���� 
interface Aable{}  //�ƹ� �ڿ��� ������ �ʾƵ� ��  �̰� ���������� Ŭ�������� �θ�� �ְ� ����
interface Aable{int num=10;}
interface Aable{void run();}


class Test extends Objext implements Ia, Ib, Ic {}
class Test implements Ia, Ib, Ic


 */

interface Ia{
	int AGE=100;  //���                  // [ public static final ] int AGE
	String GENDER = "��";  //��� - �빮��   // [ public static final ] String GENDER (������ �̰� ������ ǥ��)
	String print();  //�߻��Լ�            //  [ public abstract ] String print();
	void messege(String str);  //�߻��Լ�  //  [ public abstract ] void messege(String str);
}

interface Ib{
	int AGE =10;
	void info();
	String val(String s);
}


class Test2 extends Object implements Ia {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messege(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test3 extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messege(String str) {
		// TODO Auto-generated method stub
		
	}  //���� ����
	
}

public class Ex03_Interface {
	public static void main(String[] args) {

		Test2 t2 = new Test2();
		///////////////////////////////////////////////////////////////////////
		Ia ia = t2;  //Ia �������̽��� Test2�� �θ� = �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ� = ������
		///////////////////////////////////////////////////////////////////////
		
		ia.messege("������");  //�����ǵ� �ڿ�(�ڽ� �Լ�) ȣ��
		System.out.println(ia.GENDER);
		
		///////////////////////////////////////////////////////////////////////
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ib2.AGE);
		
		

	}

}
