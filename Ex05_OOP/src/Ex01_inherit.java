/*
OOP: ��ü���� ���α׷����� Ư¡
Ư¡ 1. �������� ������(Ŭ����)�� �����ؼ� �ϳ��� ū ��ǰ�� ����� ����
Ư¡ 2. ���(�������� Ŭ�������� �̾��ִ�)
Ư¡ 3. ĸ��ȭ (����ȭ) >> private
Ư¡ 4. ������ (��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�)

���
java : child extends Base (�ƹ����� �ڻ��� ���������� �ּ��� �ƹ����� ���ų� �� ���� ��)
C# : child : Base 

����� Ư¡
1. ���߻���� �Ұ��� (���ϻ�� (������ ��Ӱ���))
2. ���ϻ��(������ ���)���� (�������� Ŭ������ ���)
3. ���߻���� ����(interface)

���
1. ������ �ǹ�? : ���뼺 
2. ���� : �ʱ� �������� ���� ��� (��������� ���� ��� ���Ե�)
3. ���뼺�� ���̷��� >> ������ ��  �ð��� ���̵�(���� ���赵 ����... �θ�,�ڽ� ����)

��Ӱ��迡���� �θ���� �޸𸮿� �ö󰣴�

GrandFather -> Father -> Child  < Heap �޸𸮿��� ��ü3��>
 */

//����ڰ�(������) ����� ��� Ŭ������ default�� Object��� Ŭ������ ���
// class Car extends Object ��� �ؼ�
//Object�� Ŭ������ ��� Ŭ������ root(�ֻ���) : ��� Ŭ������ �θ�

class Car{  // extends Object
	
}

class GrandFather extends Object{  //�������ִ� �׷����Ĵ��� Object��ӹ޴´�
	public int gmoney = 5000;
    private int pmoney = 10000;  //������ : ��Ӱ��迡���� private�� ��ӹ��� ���Ѵ� : ���������� public�Լ� ���ؼ� ���������� (Ŭ���� ���ο��� private, public �����ϴ�)
	public GrandFather() {
		System.out.println("�׷����Ĵ�");
	}
}

class Father extends GrandFather {  //�Ĵ��� �׷����Ĵ��� ��ӹ޴´�
	public int fmoney = 53000;

	public Father() {
		System.out.println("�Ĵ�");
}
}

class Child extends Father {  //���ϵ�� �Ĵ��� ��ӹ޴´�
	public int cmoney = 1000;

	public Child() {
		System.out.println("���ϵ�");
	}
}

public class Ex01_inherit {

	public static void main(String[] args) {
		Child child = new Child();  //Heap�޸𸮿� ��ü 3�� ��������� GrandFather -> Father -> Child
		                            //���������δ� ��� Object���� 4���� �ö�
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);

		Car car = new Car();
		
	}

}
