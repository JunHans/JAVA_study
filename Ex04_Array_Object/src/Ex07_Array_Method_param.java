class Human{
	String name;
}

class OverTest{
	//�����ε�
	int add(int i, int j) {
		return i+j;
	}
	void add(Human human) {  //Human ��ü�� �ּҰ� 
		System.out.println(human.name);
	}
	
	//1. add(new Human());
	//2. Human h = new Human();  ->  add(h);
	
	//Today Point (�迭�� Ÿ���̴�  ==  �迭�� ��ü��)
	int add(int param) {
		return param+100;
	}
	int[] add(int[] params) {  //Point   params�� int[] �迭�� [[�ּҰ�]]�� �޴´�
		//return null;  //int[] �迭�� �ּҰ��� ����
		int[] target = new int[params.length];
		for(int i = 0; i<target.length; i++) {
			target[i] = params[i] + 1;
		}
		return target;  //target�迭�� �ּҰ��� �����ϰڴ�
	}
	int[] add(int[] so , int[] so2) {
		return null;
	}
}

public class Ex07_Array_Method_param {

	public static void main(String[] args) {
		OverTest overtest = new OverTest();
		
		int[] source = {10,20,30,40,50};
		int[] ta = overtest.add(source);
		for(int value : ta) {
			System.out.println(value);
		}

	}

}
