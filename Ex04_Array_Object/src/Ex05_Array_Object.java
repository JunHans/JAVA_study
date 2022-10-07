//Ŭ���� === Ÿ�� === ���赵

// �̹��� ���� �߿�~~~~~!

class Person {
	String name;
	int age;

	// ����� ������� �� �ݵ�� �̸��� ���̸� ������ �Ϸ��� -> ������ ����
	// Person(String name, int age){this.name = name; this.age = age;}
	void print() {
		System.out.println(this.name + "." + this.age);
	}
}

public class Ex05_Array_Object {

	public static void main(String[] args) {
		int[] intarr = new int[10]; // ��Ÿ�� �迭 (8����) + String
		boolean[] booarr = new boolean[5]; // ��Ÿ�� �迭 (5���� �濡 false�� ����ִ�)

		Person p = new Person(); // �������� (p ��� ������ �ּҰ�)
		p.name = "������";
		p.age = 29;
		p.print();
		// ��� 3�� ������
		// Person p1 = new Person();
		// Person p2 = new Person();
		// Person p3 = new Person(); �� ���� Ÿ�� ������ ������ �ֳ�? �ϳ��� �������
		// int[] intarr = new int[10];
		Person[] persons = new Person[3];
		System.out.println("persons : " + persons);
		System.out.println("persons[0]" + persons[0]); // ������ ���� null�̶� ����Ʈ���� ���´�
		// ��ü�迭�� ���� ����� �濡 ��ü�� �־�δ� �۾��� �ؾ��Ѵ�
		// persons[0] person��ü�� �ּҸ� ������
		persons[0] = new Person();
		Person p2 = new Person();
		persons[1] = p2;
		persons[2] = new Person();
		System.out.println("persons[0] :" + persons[0]);
		System.out.println("persons[1] :" + persons[1]);
		System.out.println("persons[2] :" + persons[2]);

		persons[0].name = "������";
		persons[0].age = 29;
		// ��ü�迭�� ���� ����� �Ͱ� ���� ä��� �۾��� ������ *****
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name);
		}

		// ��ü �迭 3���� ������� �����
		// 1. int[] arr = new int[10];
		Person[] parray = new Person[10]; // �游 ���� new person 10�� ����
		for (int i = 0; i < parray.length; i++) {
			parray[i] = new Person();
			System.out.println("�ּҰ� : " + parray[i]);
		}
		// 2. int[] arr = new int[]{10,20,30};
		Person[] parray2 = new Person[] { new Person(), new Person(), new Person() }; // �ּҸ� ���� �־��ָ� �ȴ�

		// 3. int[] arr = {10,20,30};
		Person[] parray3 = { new Person(), new Person(), new Person() };
		
	}

}
