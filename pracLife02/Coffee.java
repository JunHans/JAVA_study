package pracLife02;
 
public class Coffee{  //Ŀ�Ǹ���⸦ ���� Ŀ�� Ŭ����
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();                 //�� �ܰ躰 �޼ҵ� ����
		addSugarAndMilk();
	}
	
	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}
	public void brewCoffeeGrinds() {
		System.out.println("���ͷ� Ŀ�ǿ������ ��");
	}
	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}
	public void addSugarAndMilk() {
		System.out.println("������ ���� �߰��ϴ� ��");
	}
}

public class Tea{
	void prepareRecipe() {
		boilWater();
		brewTeaBag();
		pourInCup();                 //�� �ܰ躰 �޼ҵ� ����
		addLemon();
	}
	
	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}
	public void brewTeaBag() {
		System.out.println("�� ������� ��");
	}
	public void addLemon() {
		System.out.println("���� �߰��ϴ� ��");
	}
	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}
}
