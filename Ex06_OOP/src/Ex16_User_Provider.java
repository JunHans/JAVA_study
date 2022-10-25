/*
user ����� <> provider ������

class A{}
class B{}
���� ����: A�� B�� ����մϴ�

1. ��� : A extends B
2. ���� : A��� Ŭ������ ����ʵ�� B�� ���  class A {B b;}
   2.1 �κ��� ����
   2.2 ��ü 
   
public class B{}
public class A{
	public int i; ����ʵ� �ν��Ͻ��������
	public B b;  //A�� B�� ����մϴ� (����)
	public A(){
		b = new B();  //�����ڸ� ���ؼ� �ʱ�ȭ
	}
} 
>> main �Լ�
A a = new A();  //B�� ���� �޸𸮿� ������
a.b.�ڿ�;
 
 >> ���԰���� ���� 
 >> B�� ���ڻ��� �Ұ��� >> A��� ��ü�� ��������� B�� ���� ������
 >> A a = new A(); �ؾ߸� B��ü ������
 >> A , B ���� ��� ����ü�� (��ü���� ����)
 >> �ڵ����� ���� , ��Ʈ�ϰ� CPU <-> ��Ʈ�ϰ� ���콺(���� ����)
 --------------------------------------------------------
public class B{}
public class A{
	public int i;
	public B b;  //A�� B�� ����մϴ�
	public A(){  }
	
	//method
	void m(B b){  //�Ķ���� ���� ������ ��Ȯ�ϰ� �־������ ������ > ��������
		this.b = b;
	}
}
main �Լ� ����
>> A a = new A();
>> B b = new B();
>> a.m()b;
>> ���� ����� �ƴϴ�  (�κ����� ����)
>> �б�(A)�� �л�(B) , ��Ʈ�ϰ� ���콺  (�κ����� ����)
  
  
class A{}
class B{}
���� ����: A�� B�� ����մϴ�
        

A�� B�� �����մϴ�  (���԰���)
B�� ����ʵ�� ���

 */
interface Icall{
	void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D�� Icall �������̽��� m() ������");
	}
}
class F implements Icall{

	@Override
	public void m() {
		System.out.println("F�� Icall �������̽��� m() ������");
	}
}
//�������� ���α׷��� ����� interface�� �뼼!  >>  �������̶��� �ʿ�  >>  ���� ���� ���� �������� �ȴ� (������ �ڵ�) 
// >> �����ϰ� ... >> interface�� ��Ŀ�ø��ϰ�

class C{
	void method(Icall ic) {  //Icall �� �����ϴ� ��� ��ü�� �ּҰ� �� �� �ִ�
		ic.m();
	}
	
	/*
	 Ȯ�强 ��ȯ ���� ....
	 void method(D d){}
	 void m(F f){}
	 */
}

public class Ex16_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();  //mplements Icall �߱� ������
		F f = new F();  //mplements Icall �߱⶧����
		
		c.method(d);
		c.method(f);
	}

}
