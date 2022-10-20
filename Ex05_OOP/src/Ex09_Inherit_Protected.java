import kr.or.kosa.Bird;

//������ 

class Bi extends Bird{
	@Override
	public void moveFast() {
		//�������...
		super.moveFast();  //�θ� ����������
	}
}

class Ostrich extends Bird{
	//��üȭ, Ư��ȭ
	void run() {
		System.out.println("run...");
	}
	@Override
	public void moveFast() {
		run();
	}
	
}

public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();  //protected�� ���� ������ ��Ӱ��迡�� ���� ���� �Լ��� ����� ������ �ؼ� ������ ���ڴٴ� ���̱� �����̴�
		//moveFast() ��Ӱ��迡�� �����Ǹ� ���� ������ ����� ����� �� ����(����)
		
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}
}
