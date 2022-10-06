package kr.or.kosa;
/*
������ �Լ�(constructor)
1. �Լ�(Ư���� ����)
2. ����(member field �ʱ�ȭ) >> static{}  , {�ʱ��� ��}

3. �Ϲ��Լ��� �ٸ���
3.1 �Լ��� �̸��� �����Ǿ� ����(class�� �̸��� ����)
3.2 return Ÿ���� ����� (��ü ������ ���ÿ� ȣ��) (return�� ���� ����� ����)
3.3 ������� >> new �� ���ؼ� ��ü ���� >> heap ���� ���� >> member field �ڸ� ���� >> �ڵ����� ������ �Լ� ȣ��
3.4 return Ÿ��(x) >> void >> public void(����) Ŭ���� �̸� >> public Ŭ���� �̸�(){} 

4. why �� ���� : [�����Ǵ� ��ü]���� [����������] member field ���� [�ʱ�ȭ] �� �� �ִ�

class Car {String color;}
>> ���赵�� ������� �ڵ����� ������ �ϰ� ���� �� �˾Ƽ� �� 

A) �� ������ �Ķ��� �� ����ſ��� ...  �׷��� ó������ �Ķ������� ������ �ּ���
class Car {String color="blue"}

B) ���� �� ������ ���� �˾Ƽ� �����ҰԿ�
class Car{String color;}
Car car = new Car();
car.color="gold";
����)
�ڵ����� ������ �������� �ʰ� ��� ...
null �̶� ���� (���� ����)

>>> ������ ���鋚 ������ ���Ĥ����� �Է��ϰ� �� �� �ִ� ��� ...
>>> �Լ�... , {  }  (�������� ���ų� �Ǵ� �Է°��� �������� ���ؿ�)

5. ������ �Լ� (... overloading��� ���� ����)

6. ������ �����ε��� ���ؼ� �پ��� ������� ������ �� �־�� ��

****************�����ڸ� ���� ���� �߿��� ������ ������ member field �ʱ�ȭ***********

 */
//���࿡ �� ������? ��ؾߵǳ� �׷��� ������ �ִ°� ��ξƴϳ�, �������µ� ������ ��� �ﳪ
//���Ƽ����� �����ϰ� �־��� ��������鵵 �ô� ���ո��Ѱ� �ƴϳ�

class Car1{
	String carname="����";
	//����� ���� Car ���赵�� ���鶧...
	//�����Ϸ��� �˾Ƽ� �Լ��� ���� ....
	//������ �Լ�
	//public Car(){} �ڵ����� ���� .... 
	
	//�����ڰ� ���� �����Ѵٸ� 
	public Car1() {  //�ڵ� ȣ��
		System.out.println("�⺻������ ȣ��^^");
		carname = "������";
	}
}

class Car4{
	String carname;
	//�����Ǿ� �ִ�
	//public Car4(){}������ ����
}

class Car2{
	String carname;  //null����
	public Car2() {  //default constructor �ʱ�ȭ
		carname="����";
	}
}

class Car3 {  //�������� �ǵ� : �� �⺻ �ڵ��� �̸� ���� ,,,,  �ڵ��� �̸� �־ �����ص� �� 
	String carname;
	public Car3() {
		carname="�⺻�̸�";
	}
	//overloading���ؼ�
	public Car3(String name) {  // ���� POINT
		carname = name;
	}
}

//�ڵ����� �̸��� ������ �ڵ����� ����� �� �� ����ϰ� ��.... ���赵

class Car5 {  //�������� �ǵ� : �� �⺻ �ڵ��� �̸� ���� ,,,,  �ڵ��� �̸� �־ �����ص� �� 
	String carname;
	//overloading���ؼ�
	public Car5(String name) {  // ���� POINT
		carname = name;
	}
}
//�� �ڵ�� public Car5(){} �������� �ʾҾ�� ... �������� �ʾƵ� �����Ϸ��� �ڵ����� �Ѵٸ鼭��
//���������� �����ڰ� �����ε� �� �����ڸ� �Ѱ��� ����ٸ� �����Ϸ��� �ڵ����� default �����ڸ� ������ �ʾƿ�



public class Ex15_Constructor {

	public static void main(String[] args) {
		Car1 car = new Car1();  //new Car() ��ȣ�� �Լ��� ��ȣ  //default constructor
		System.out.println(car.carname);
		
		
		Car3 car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("mycar");
		System.out.println(car4.carname);

	}

}
