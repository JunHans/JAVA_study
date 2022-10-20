/*
������(��Ӱ��迡�� ����) 
������ : �������� ����(����) ������ �ִ� �ɷ� 

C#: ������ (overloading, override)
java: [��Ӽ߰�]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ������ �ִ� 
>> [�ϳ��� ��������] == [�θ�Ÿ��]
>>[�������� Ÿ��] == �θ� ��ӹ��� �ڽ�Ÿ�Ե�


������ : ���Ǽ��� >> �θ�� �ڽĿ��� ������ �ش� 
	   ���α׷� ���� >> �ڽ��� �θ𿡰� ���Ǿ��� �帰�� 
 */

class Tv2 { // �θ�(�и� : ������� >> �Ϲ�ȭ, �߻�ȭ)
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CapTv���� Ư��ȭ�ǰ� ��üȭ �ǰ� ������ ������ ������ ��

	String text;

	String captionText() {
		return this.text = "���� �ڸ� ó����...";
	}
}

	public class Ex10_inherit_Poly {

		public static void main(String[] args) {

			CapTv ct = new CapTv();
			ct.power();
			ct.chUp();
			System.out.println(ct.captionText());
			
			
			//////////////////////////////////////////
			Tv2 tv2 = ct;
			//[��Ӱ���]���� [�θ�Ÿ��]�� [�ڽ�Ÿ��]�� �ּҸ� ���� �� �ִ�.
			//��, �θ�� [ �ڽ��� �ڿ��� ���� ] �����ϴ�
			//��, �����Ǵ� ������
			
			
			System.out.println(ct.toString());  //CapTv@5e91993f
			System.out.println(tv2.toString()); //CapTv@5e91993f  ���� �ּҰ�

			//tv2.captionText()  //�ڽ��ڿ��� ���� �Ұ�!(�θ�Ÿ���� �ڿ��� ����)
			                     //��, �����Ǵ� �����ϰ� 
			
			
			
		}

	}

