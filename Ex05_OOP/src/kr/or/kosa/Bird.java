package kr.or.kosa;


//������ �������(�Ϲ�, �߻�) : ���� �� �� �ִ� , ���� ������
public class Bird {
	//������
	public void fly() {
		System.out.println("flying");
	}
	
	//������ ��� : Bird [���]�ϴ� ����� moveFast�ڿ��� ���ؼ� [������]�� ������ ���ھ� -> protected
	protected void moveFast() {
		fly();
	}
}
