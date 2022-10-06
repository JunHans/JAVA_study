package kr.or.kosa;

/*
instance Variable >> class Car {private String color;}
>> �����Ǵ� ��ü���� �ٸ� ������ ���� �� �ִ� 

local variable >> class Car { public void move() { int speed=0; �ݵ�� �ʱ�ȭ }} �����ȿ� ���� ������ �ݵ�� �ʱ�ȭ�� ����
main �Լ� >> local variable

block variable >> class Car{ public void move() { for(int i; i<10....} ���� ����...�Ҹ�}

static variable >> �����ڿ� (��ü��), ��ü���� ������ memory �ö󰡴� �ڿ�(���� : class area, method area)

��ü ����� ������ ��� : new�� ���ؼ� �޸𸮿� �ø��� ��
static �� new ���̵� �޸𸮿� �ö�..

Ex06_Variable_Scope Ŭ���� >> ��üȭ (�޸𸮿� �ø���) >> Ex06_Variable_Scope ���� new���� �����
static �� Ư����, �޸𸮿� �׳� �ö󰡹��� �ٵ� �̸��� main�̳�? �������! �ٷ� ���ÿ� �ö� ����

 */

class Variable{
	int iv; 
//	//1. member field , instance variable
//	  2. iv ���� ��밡�� �ұ��? = ���� �޸𸮿� �ö󰥱��? VAriable�� new��ų��
//	     >> Variable v = new Variable(); heap ��ü ���� >> ��ü�ȿ� iv�� �����ȴ�
//		 Variable v = new Variable();
//	     Variable v2 = new Variable(); ���� �������
//	  3. ���� : ������ (����), �ڷḦ ���� ����
//	  3.1 ���� : ����, ���� , ��ǰ(class)
//	  - �����Ǵ� ��ü���� �ٸ� ���� �������ִ�
//	  - �׷��� �ʱ�ȭ�� �ؼ� ���� �������� �Ƥ����´�
//	  - default���� ������ �ִ� (int > 0 , double > 0.0 , char > ����'\u0000)
//	    , boolean >false , String >null , CAr>null
//	  - iv������ �������� : new��� �����ڸ� ���ؼ� heap Variable �̶� �̸��� ��ü�� ��������� ���� �ٷ� ������
	static int cv = 2000;
	/*
	 1. class variable (Ŭ���� ����), �Ϲ������δ� static variable (��ü�� �����ڿ�)
	 2. ������ : ���� ��� �� (�����Ǵ� ��� ������ �����ϴ� �ڿ�)
	    >>> �����Ǵ� ��� ��ü (heap�̶�� ������ ������ ��ü���� �����ϴ� �ڿ�)
	 3. ���ٹ�� 
	 1. class �̸�.static������ >> Variable.cv >> why? ��ü�� �����Ǳ� ���� �޸𸮿� �ö󰡴� ���ٵ� Ŭ���� �̸��� ����ؼ� �����Ѵ�
	 2. Variable v = new Variable(); v.cv
	 	Variable v2 = new Variable(); v2.cv
	 	>> v.cv == v2.cv (���� �ּҸ� �ٶ󺻴� : static���� �����ּ�)
	4. ��������
	Hello world .JAVA> Hello.class
	>java. wxw Hell ���� ����
	>JVM<OS>Memory�з� > ����(������ ������) >  class L0oader System �м�
	>Ŭ���� ����(metadata:����) >> class area(�Ѥ��� �������� ) �޸𸮿� �ø���(
													���� , � �ڿ�, ����...
	 >�� Ŭ�����ȿ� static variable, �Ǵ� static method �ִٸ�
	 >�� �γ༮�� class area(method area)������ �Ҵ��մϴ�
	 >�׷��� �� �Լ��� �̸� ���� main�̶�� ������ ��Ģ�� ���� �����մϴ�(Stack����) �ڿ� ���� .. 
	 */
	
	
	
	void method() {
		int v=0;
/*
 locla variable (�Լ��ȿ� : �������� : ������� �ݵ�� �ʱ�ȭ)
 �����ֱ�) �Լ��� ȣ��Ǹ� ������(stack �����Ǿ��ٰ� �Լ��� ������ �Ǵ� ���� ���ϵǸ� ���� �Ҹ�)
 for(int ��=0; ��<=0; ��++){
 int i >> block���� .. for���۵Ǹ� ���� ...for������ �Ҹ�
 }
 for(){
 int i >> block���� .. for���۵Ǹ� ���� ...for������ �Ҹ�
 }
 for(){
 int i >> block���� .. for���۵Ǹ� ���� ...for������ �Ҹ�
 }
 for(){
 int i >> block���� .. for���۵Ǹ� ���� ...for������ �Ҹ�
 }
 
 */
}

public static class Ex06_Variable_Scope {
	public static void main(String[] args) {
		Variable.cv = 100;
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		Variable v = new Variable();
		v.cv = 200;
		Variable v2 = new Variable();
		v2.cv = 1000;
		//���Ϲ��Ѽ� ����ϰ������
		ex06.method();
		System.out.println("v.cv : " + v.cv);
	}
	public void method() {
		System.out.println("�� �Ϲ� �Լ�");
	}
	
	
}
}
