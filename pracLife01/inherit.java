package pracLife01;

class Clothe {
	String color = "���� �� �ִ�";

	void wear() {
		System.out.println("�Դ�");
	}
}

class Kind {
	String a;
	String b;

	public Kind() {
		// this.a = "�Դ´�";
		// this.b ="Ÿ��";
		this("����"); // �ʱ�ȭ�� ������ ȣ���ؼ� ���⼭ �Ѵ�
	}

	public Kind(String a) {
		this.a = a;
		this.b = b;
	}
}

//����
class Top extends Clothe {
	Kind[] kindarray; // ���� �Ǵ°� ����

	public Top() {
		this(new Kind[] { new Kind("����"), new Kind("����"), new Kind("����") });
	}

	public Top(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	// ���
	void topClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("Top :(%s)", kind.a);
		}
	}
}

//����
class Bottom extends Clothe {
	Kind[] kindarray; // ���� �Ǵ°� ����

	public Bottom() {
		this(new Kind[] { new Kind("�ݹ���"), new Kind("�����"), new Kind("7�ι���") });
	}

	public Bottom(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	void BottomClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("Bottom :(%s)", kind.a);
		}
	}
}

//�Ź�
class shose extends Clothe {
	Kind[] kindarray; // ���� �Ǵ°� ����

	public shose() {
		this(new Kind[] { new Kind("�ȭ"), new Kind("����"), new Kind("����") });
	}

	public shose(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	void shoseClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("shose :(%s)", kind.a);
		}
	}
}

public class inherit {

	public static void main(String[] args) {

		
		
		Kind[] kindarray = new Kind[] { new Kind("����"), new Kind("����"), new Kind("����") };
		Top top = new Top(kindarray);
		top.topClothe();
		System.out.println();
		
		Kind[] kindarray1 = new Kind[] { new Kind("�ݹ���"), new Kind("�����"), new Kind("7�ι���") };
		Bottom bottom = new Bottom(kindarray);
		bottom.BottomClothe();
		System.out.println();
		
		Kind[] kindarray2 = new Kind[] { new Kind("�ȭ"), new Kind("����"), new Kind("����") };
		shose sh = new shose(kindarray);
		sh.shoseClothe();
	}

}
