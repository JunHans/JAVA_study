package pracLife02;

abstract class CaffeinBeverage{  //�߻�Ŭ����
	
	final void prepareRcipe() {  //Tea�� Coffee�� ���鶧 �Ȱ��� prepareRcipe()�޼ҵ带 ����մϴ�. ����Ŭ�������� �� �޼ҵ带 �������̵��ؼ� �ƹ����Գ� ���Ḧ ������ ���ϵ��� final�� �����մϴ�. �ι�°�� �׹�° �ܰ�� brew�� addCondiments��� �Ϲ�ȭ�� �޼ҵ�� �ٲپ����ϴ�.
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();   //Coffee�� Tea���� �� �θ޼ҵ带 ���� �ٸ�������� ó���ϱ� ������ �߻�޼ҵ�� �����մϴ�. ����Ŭ�������� �˾Ƽ� �ϵ��� �սô�.

	void boilWater() {
		System.out.println("�� ���̴� ��");
	}
	void pourInCup(){
		System.out.println("�ſ� ����� ��");
	}
}

//Tea�� Coffee�� CaffeinBeverage�� ���
//��Ŭ���� ��� brew(), addCondiments()�� ������ �ؾ��� �θ�Ŭ���� CaffeinBeverage���� abstract�� ����
class Tea extends CaffeinBeverage{
	public void brew() {
		System.out.println("���� ������� ��");
	}
	public void addCondiments() {
		System.out.println("���� �߰��ϴ� ��");
	}
}
class Coffee extends CaffeinBeverage{
	public void brew() {
		System.out.println("���ͷ� Ŀ�Ǹ� ������� ��");
	}
	public void addCondiments() {
		System.out.println("������ ������ �߰��ϴ� ��");
	}
}




