/*
String Ŭ���� (���ڿ�) 
String ������ �Լ� ... ���ڿ��� ����(�ڸ���, ��ġ�� ���) 
String >>static �Լ� + �Ϲ� �Լ� (15~20�� ���)

 */
public class Ex05_String_Class {
	public static void main(String[] args) {
	 String str ="";
	 String[] strarr = {"aaa","bbb" , "ccc"};
	 for(String s : strarr) {
		 System.out.println(s);
	 }
	 //����� :int , double  ��Ÿ�� ó�� ���

	 String st = "ȫ�浿"; //����� character �迭 - �ٵ� ���ȣ ��
	 System.out.println(st.length());  //3
	 System.out.println(st);  //ȫ�浿 == st.toString()
	 System.out.println(st.toString());  //�ּҷΰ��� �����͸� ���� �ϵ��� ����(������)
	 //Stirng Ŭ������ Object �θ�Ŭ���� toString() ��Ӱ��� ������ 
	 
	 //����
	 String sdata = new String("������");
	 System.out.println(sdata);
	 
	 String name="�����ٶ󸶹�";
	 //String ���������� char[] member filed >> [��][��][��][��][��][��] �迭�� �ּҰ�
	 //class String extends Object{ private char[] str ... @Override toString()} //������
	 
	 String str1 = "AAA";
	 String str2 = "AAA";
	 
	 //���ڿ��� ��
	 System.out.println(str1); 
	 System.out.println(str2.toString());  //toString() ������ ���ؼ� �ּҰ��� �ƴϰ� ���� ���´�
	 System.out.println(str1 == str2);
	 //==�����ڴ� ���� �� str1(�ּҰ�) , str2(�ּҰ�) 
	 //���� �ּ����� �Ǹ�
	 //�޸𸮿� ������ ���� �������� ������ [����]
	 //Point
	 System.out.println(str1.equals(str2)); //�ּҸ� ã�ư��� �� �ȿ� ����ִ� ���� ��
	 
	 //why : equals ���ڿ��� �񱳤� ...
	 String str3 = new String("BBB");
	 String str4 = new String("BBB");
	 
	 System.out.println(str3 == str4);  //false  (== ���� ������)
	 //���ڿ��� ���� �߿��ؿ�  (String ���ڿ��� equals�� ����)
	 System.out.println(str3.equals(str4));  //�ּҸ� ã�ư��� �׾ȿ� �ִ� ���� ��
	 
	 String s = "A";
	 s+="B";
	 s+="C";
	 System.out.println(s);
	 
	 s = "A";
	 
	}

}
