package kr.or.kosa;

/*
OOP ��ü ���� ���α׷���  (�������� ������(���赵)�� ���� �����ϴ� ����)
>>> �������� ���赵�� �����ϴ� ���
1. ��� (���뼺)
2. ĸ��ȭ (����ȭ) : private ... setter , getter (���� �ҵ��� ���� �����Ҵ��� ���ؼ� ������ �����ڴ�)
3. ������ : �ϳ��� Ÿ������ ������ ��ü�� �ּҸ� ���� �� �ִ� ��


>>>method overloading(�����ε�)
1. �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
System.out.println() >>> println()�Լ� �̸��� �Ѱ�... ������� ������
1. �����ε��� ���� ���? -> �����ϴ� 
2. ���ϰ� ����϶�� ... ����¥�� �����ڸ� ��� ...(������)
3. �����ε��� ������� �ʾƵ� �������� �ʴ´� ... ���� �����ڰ� �� ������ ��

����) �Լ� �̸��� ���� parameter [����]�� [Ÿ��]�� �ٸ��� �ϸ� �����ε��̶� �Ѵ�
1. �Լ��̸��� ����
2. prameter ���� �Ǵ� Ÿ���� �޶�� �Ѵ�
3. return Ÿ���� �����ε��� �Ǵܱ����� �ƴϴ�
4. parameter �� ������ �ٸ��� ����(����)
 */

class Human {
	String name;
	int age;
}

class OverTest { // Ŭ���� ����
	int add(int i) {
		return 100 + i;
	}
	// int add(int s) { �̸� �浹

	// }
	int add(int i, int j) {
		System.out.println("�����ε� : " + i + "," + j);
		return i + j;
	}

	String add(String s) {
		System.out.println("�����ε� : " + s);
		return "Hello" + s;
	}

	String add(String s, int i) {
		return "�����ε�";
	}

	String add(int i, String s) { // ������ �ٸ��� �����ؼ� ��ǻ�ʹ� �����ε����� ������
		return "";
	}
	
	void add(Human human) {  // �̰͵� �����ε� ����  //Human Ÿ���� ��ü �ּҰ� ���;� �Ѵ�
		human.name = "ȫ�浿";
		human.age = 100;
		System.out.println(human.name+ "," + human.age);
	}
}

public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("A"); // �ڵ����� �Ķ���Ͱ� String �༮�� ȣ��
		System.out.println('a'); // �ڵ����� �Ķ���Ͱ� char �༮ ȣ��
		
		//System. �����
		//memory System sys = new System();

		System.out.
		/*
		 * System.out.println(); System.out.printlnStrig("A"); System.out.println('a');
		 * ����� �Լ��� �� �ϱ��ؼ� ����ؾ��ϴ� �� �ƴϳ� ... �̸��� �� Ʋ���ϱ�
		 */

		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200, 300);
		System.out.println(result);

	}

}
