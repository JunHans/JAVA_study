package pracLife02;

import java.util.Vector;

public class Collection_Prac {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("default �뷮: " + v.capacity());  //10
		System.out.println("size : "+ v.size());  //���� �����뷮 = 0
		
		v.add("������");
		v.add("������");
		v.add("������");
		v.add(7777);    //�迭 Ÿ���� Object�� �⺻���õǾ��־ � Ÿ���̵� �� ���� �� �ִ�
		
		System.out.println(v.capacity());  //10
		System.out.println(v.size());  //4
		System.out.println(v.toString());  //[������, ������, ������, 7777]
		//toString�� Vector�� �̹� ������ �Ǿ�����
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));  //v.get(i) �� �迭 ��ü�� ���� ������
		}
		//������ for��
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		//���⼭ ���!! �׷��� ���� ���� �迭�� ���ڿ��� �־� ������ ���� ���� ū Ÿ���� ����� �ʿ䰡 �ֳ�?
		//���ʸ� : Ÿ���� �Ѱ����� ������!! <>�� ����!
		Vector<String> v2 = new Vector<String>();
		v2.add("������");
		v2.add("������");
		v2.add("������");
		v2.add("������");
		v2.add("������");
		System.out.println(v2.toString());
		for(String s : v2) {
			System.out.println(s);
		}
		Vector v3 = new Vector();
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");     //11�� ���� ...!!
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.toString());
		//11���� ������ ������ ���� �þ��
		System.out.println(v3.capacity());
		//�뷮�� �ѹ��� 2�辿 �þ��!! (�� ������ �� �ø����ݾ�?)
		
		
		
	}

}
