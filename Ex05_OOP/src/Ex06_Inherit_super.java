/*
this : ��ü�ڽ��� ����Ű�� this(this.empno, this.ename)
this : �����ڸ� ȣ���ϴ� this(100 , red) 


��Ӱ���
�θ� , �ڽ�

super(���� �ڽ��� �θ��� ���� �ּҰ�) : ��Ӱ��迡���� �θ� �����Ҽ� �ִ� ������ ���(super �θ�ü�� �ּҰ�)

1. super >> ��Ӱ��迡�� �θ��ڿ��� ����
2. super >> ��Ӱ��迡�� �θ��� �����ڸ� ȣ��(���������)

Tip)
C# : base()
java : super()
 */


class Base {
	String basename;

	Base() {
		System.out.println("Base �⺻ ������ �Լ�");
	}

	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}

	void method() {
		System.out.println("�θ� method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {

		System.out.println("Derived �⺻ ������ �Լ�");
	}

	Derived(String dname) {

		// super �θ��� �����ڸ� ȣ���Ҽ� �ִ� super
		super(dname); // �θ� ������ ȣ��

		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method() {
		System.out.println("�θ��ڿ� ������");
	}
	//����� �θ�� �׸����� -> (�ڿ��� �׸�����)
	//������ ��� ... super
	void pmethod() {
		super.method();  //�θ� �޼ҵ�
		//�����ǵ� ���¿��� �θ� �ڿ��� �θ� �� �Ҵ� ������ ��� : super
		
	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("ȫ�浿"); // �θ� ���� �޸� �ö󰡰� ���� �ڽ� �ö󰡰�
		d.method();  //�ڽ��� �����Ǹ� ���� ������ �θ��ڿ�
		
		d.pmethod();
	}

}
