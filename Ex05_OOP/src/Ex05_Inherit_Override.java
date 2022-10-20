import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ��Լ� Test2");
	}
}
class Test3 extends Test2{
	int x= 300;  //�θ� �����ϱ�  //�̷������ ���� ������ ���� �Ʒ����� �ٲ� �ʿ����  �Ⱦ��� ���ŵ� ���� �θ�͵� ���� �ִµ� �̷��� ���Źۿ� ����
	
	//������ (����)
	@Override
	void print() {
		System.out.println("�ڽ��� �θ��� �Լ��� ������"); //������
	}
	
	void print(String str) {  // �̰� overloading
		System.out.println("���� �����ε� �Լ���");
	}
}

public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);  //�ڽ� ���� ����
		
		t3.print();
		t3.print("���� �����ε�");
		
		Emp emp = new Emp(1000, "ȫ�浿");
		System.out.println(emp);             //kr.or.kosa.Emp@cac736f  ->  Emp [enpno=1000, ename=ȫ�浿] toString�� �������ؼ�
		System.out.println(emp.toString());  //kr.or.kosa.Emp@cac736f  ->  Emp [enpno=1000, ename=ȫ�浿]
		
		//emp ����ϸ� ����� �Ϲ������� emp.toString�ϴ� �Ͱ� ����
		//toStrng()�� Object�� �ڿ� .... �ּҰ� return
		
		//toString�� ������ �ߴٸ� ����� ������ �� ���� ���
		//Emp [enpno=1000, ename=ȫ�浿]
		//Emp [enpno=1000, ename=ȫ�浿]
		
		//�ַ� �ڹ� API�� �����ϴ� ������ Ŭ������ Object Ŭ������ toString()�� ������ �ϰ� �ִ�

	}

}
