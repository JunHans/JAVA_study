package kr.or.kosa.common;

/*
 * class == ���赵 == ������ Ÿ��
 ���赵�� ���� �ɰ����� >> ��üȭ���Ѿ� �Ѵ�(�޸𸮿� �ø��� ����) >> �ø� ���� ��ü��� �Ѵ�
 ��üȭ �Ȱ� : ��ü , �ν��Ͻ�
 
 ���赵 : feild(����, ����, ��ǰ) + method(���) + constrctor(������ �Լ�)
 
 public class Ex_01 Basic{
 	public static void main(String[] args{
 		����ȿ��� �ڵ� ����
 		main �̸��� ���� �Լ��� ����
 		String name="�ʱ�ȭ";     local variable > ������ ���� ���� > �Լ��� ȣ��¸� ���� > �Լ� ����Ǹ� ���� �Ҹ� 
 		int age = 0;
 		}
	}
	
	
 */	
public class Person {

		public String name;  // default (�ڵ�) �� = null
		public int age;// default (�ڵ�) 0
		public boolean power;  // default (�ڵ�) false (��ǻ�ʹ� ������)
		//���
		//������ ����ϴ� ���
		public void personPrint() {
			System.out.printf("�̸��� %s ���̴� %d �Ŀ��� %s",name,age,power);
		}
		
	    // member field >> instance variable >> ��ü����
		// 1. member variable �ʱ�ȭ ���� �ʾƵ� �ȴ� >> why? >> �ƹ��͵� ���� �ʾҴٸ� default ���� �ְڴ�
		// �ʱ�ȭ : ������ ó������ ���� �Ҵ� �޴°�
		// ���� : �� name member field �ʱ�ȭ �ϰ� �������� �����ұ��? > 
		// �ʿ��ϴٸ� ��� �ʱ�ȭ�� �� �� �ִ� : public int age=100;
		// Today Point : why �ʱ�ȭ ���ұ�? ... 
		// **** �����Ǵ� ��ü(���) ���� , [�ٸ��̸��� ���� �� �ִ�] ****
		// Person memver dield ����� ����� ���鶧 ���� ���� ������ �Ұ� �ƴϾ�! ���� �ʱ�ȭ�� ���ʿ� ����
		
		// main(){
//			Person ���� =new Person(); ��� �Ѹ� �����
//			����.name = "������";
//			����.age = 100;
//			����.power = true;
//			
//			Person ���� =new Person(); ��� 2��
//			����.name = "������";
//			����.age = 20;
//			����.power = false;
		
//			Person �ΰ� = new Person();
		


}
