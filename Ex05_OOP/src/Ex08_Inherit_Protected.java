import kr.or.kosa.Pclass;

/*
��Ӱ��迡�� ������ : protected

public
private
default  (���� ����(��Ű��))
protected

protected : ��鼺(����) >> � �� default, � �� public
>> ����� ���� Ŭ���� �ȿ��� protected�� >> default�� ����
>> �ᱹ ��Ӱ��迡���� �ǹ̸� ���� >> public
 */
class Dclass{
	public int i; //Ŭ������ ����Ʈ�� ������ �ۺ� �ǹ� ����
	private int p;
	int s;  //default
	protected int k;  //default (��? �Ƚᵵ ������ ����Ʈ�� �Ƚ��)
}


class Child2 extends Pclass{  //��Ӱ���
	void method() {
		this.k = 100; //��Ӱ��� >> �ڽ��� �θ��� protectd �ڿ��� public ó�� ���
		System.out.println(this.k);
	}
}


public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k  >>   ��ü�� ����� ����ϸ� ����Ʈ�� �Ȱ���
		Child2 ch = new Child2();
		ch.method();

	}

}
