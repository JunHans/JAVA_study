/*
���� <-> ���
��� : �ѹ� ���� [�ʱ�ȭ]�Ǹ� ����Ұ�
����ڿ� : ������ (�ֹι�ȣ , ������ ����PI , �ý��۹�ȣ(������ȣ) )
����� ���������� ��[����]

java : final int NUM = 10;
C# : const integer NUM = 10;

final Ű���� 
1. final class Car {} > Ŭ���� �տ� final�� ������ > ��ӱ��� (������ Ŭ����)
public final class Math

2. public final void print(){} >> �Լ��տ� final ������ > ��Ӱ��迡�� ������ ���� (Override ����)

 */

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI); //���� ���ٲٴ� PI
	}
}

class Vcard2{  //������ ���忡�� �̷��� ������ٴ� ���� ..���� ī�帶�� �ٸ� ������� ������ �ϰڴ�
	final String KIND;
	final int NUM;
	
	//Vcard2(){}
	
	Vcard2(String kind , int num){  // �� �ʱ�ȭ�Ϸ��� ���ڵ� ������?
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
}


public class Ex07_final {

	public static void main(String[] args) {
		Vcard vc = new Vcard();
		//vc.KIND = "aaa";  //The final field Vcard.KIND cannot be assigned = ����Ұ�
		System.out.println(vc.KIND);
		vc.method();
		
		
		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade",2);
		System.out.println(v1.toString());
		
		Vcard2 v3 = new Vcard2("spade",3);
		System.out.println(v1.toString());
		
		//v3.KIND = "aaa";
	}

}
