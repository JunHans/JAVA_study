package kr.or.kosa.common;


/*
��� (����) ����� ���
�Լ� (method)

 method : ���� �Ǵ� ����� �ּҴ����� ���� : �ϳ��� �Լ��� �ϳ��� ��ɸ� ���� 
 ex �Դ´�,  �ܴ�, �ȴ´� ... 
 
 Ŭ���� : field + method
 
 ex) �Ե����� : ���ӹ� : ��, ����, �̱� .... 

***method �Լ��� ȣ�⿡ ���ؼ��� ���۵ȴ�***
������ �̸��� �θ��� ������ �������� �ʴ´� ...!

			JAVA) 
			<void�� �����ص� �� ����>
			1.void , parameter(0) : void print(String str){�����ڵ�}
			2.void , parameter(x) : void [print() {�����ڵ�} >> ��¥ ()�̴ϱ�
			<return�� ����� ��>
			3. return type , parameter(0) : int print(int data) {return 100;}
			4.return type , parameter(x) : int print() {return 100;} ��¥

***void > �����ִ°� ����� > return type ���
return type >> �⺻ 8���� + String  + array , class , collection , interface
���߿��� �⺻ 8���� + String + class ������ ��������

boolean print(return true or false)
Car print() { Car c = new Car(); return c; }  //���� ��ſ��� Car����ϴ� ��ü�� �ּҸ� return �Ѵ� 
String print() ���ڿ��� ���� {return "A";}

parameter type >> void print(String �Ķ����) 
>> �⺻ 8���� Ÿ�� + SString + array , class ,collection , interface
void print(int i){}
void print(String str){}
void print(Car car) // print�Լ��� parameter CarŸ���� �ּҰ��� �޴´�




ex)
Car car = new Car();

void print(Car car(){}
print (c); //print �Լ� ȣ���� c��� ������ (�ּҰ�)

������� : ���������� ������ �־� ....
void print(int a, int b =, int c , int d){}
print(10,20)(x)
print(100,100,100)(x)
print(100,100,100,100)(o) 4������ ��
void print(Car c, String str, int i){}

 �������� ǥ��
 �ڵ� ��Ģ : �������� �͵�
 class �̸��� ù���ڴ� �빮�� : class Car , class Person
 method�� �̸��� �ܾ��� ù���� �ҹ��� �̾����� �ܾ��� ù���ڴ� �빮�� : getNumber()
 
 �����ȣ�� ������ ����� ��� ������ ������ �Ͷ�(�Լ�����)
 getEmpKistByEmpno >> Ŭ���� �̸��� ������ �뷫������ �˼� ���� ������ ����� ��� ��� �ȴ� 
 
 
 */
public class Fclass {
	public int data;
	
	//void m() >> �����Ϸ��� default void m() >> ���� ���� �������� ��� ���� 
	//�Լ��� 70%������ public
	//�Լ� 30% private : ��? �������µ� ��? -> Hint) public�� private�� ���� Ŭ���� �������� �����ϴ�
	//Ŭ���� ���ο����� ����ض� >> �̷� �뵵�� �Լ� >> �����Լ� >> �ٸ� �Լ��� �����ִ� �Լ�
	
	public void m() { //void, parameter�� ����
		//��� ����
		//main �Լ����� �����ߴ� �ڵ� �״�� ���� ...
		System.out.println("�Ϲ��Լ� : void, parameter(x)");
	}
	
	
	//void m2(int)
	public void m2(int i) { //���⼭ int i�� �ٷ� �Ķ���� Ex02_Method_Call���� �������� ���� �Է������ �����
		System.out.println("�Ϲ��Լ� : void, parameter(0)");
		System.out.println("parameter ���� Ȱ��  i������ �Լ� ���θ� ��ȿ : " + i);
	}
	
	//return type m3 (x)
	public int m3() {
		//������ ������
		return 1000; //return type�� �����ϸ� ���ݵ�� return Ű���� ��� �ʼ�**
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	//��������� �⺻����
	
	//Ȯ�� ����
	//reteun type(o) , parameter(o) ���� ���� �����ϻ�...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//�Լ��� ������
	//default int subSum(){}  ���� ���� ��
	//private int subSum(){}  ���� ������ �ȵǿ�
	// class ���ο��� �ٸ� �Լ��� �����ִ� �����Լ�
	//private �Լ� ���� ����Ѵ�
	
	private int subSum(int i) { //�ٸ� �Լ��� ȣ���ؼ� ��� ...
		return i + 100;          //������ ��� �Լ��� ������ �ִٸ� .. ���� ... ���������� ..
	}
	public void callSuvSum() {
		//�Լ��� �ٸ� �Լ��� ȣ���Ҽ� �ִ�
		int result = subSum(100);
		System.out.println("call result : " + result); 
		//callSuvSum�� subSum�� ȣ���ϰ� ���� �����ؼ� ����� ��Ÿ���µ� �װ� Ex02_Method_Call���Ͽ��� ��Ÿ��
	}
	
	private int operationMethod(int data) {
		return data * 200;
	}
	public int opSum(int data) {
		int result = operationMethod(data);
		//���
		if(result > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//Quiz
//	a �� b ���߿� ū���� return �ϴ� �Լ��� ���弼��
//	ex)�Լ� ȣ��� max(10,5) return���� 10�� ������ ��
	
	
	public int maxminimum(int i, int j) {
		//30��
		if (i > j) {
			return i;
		} else {
			return j;
		}
		
		//60�� (return�� �Ѱ���, ���߿� ���� ����)
//		int result=0;
//		if(i > j) {
//			result = i;
//		}else {
//			result = j;
//		}
//		return result;
		
		//90��
//		int maxminimum = (i>j) ? i : j;
//		return maxminimum;
		
		//100��
//		return (i>j) ? i : j;
	}
	
}
