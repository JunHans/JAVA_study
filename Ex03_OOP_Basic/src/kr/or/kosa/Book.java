package kr.or.kosa;
/*
å�� å�̸��� ���� ������ ������ �ִ�
å�� ���ǵǸ� �ݵ�� å�̸��� å�� ���� ������ ������ �־�� �Ѵ�
å�� �̸��� ���������� Ư������� ���ؼ��� �� �� �ְ� , ���ǵ� ���Ŀ��� ������ �� ���� (å�� ����, �̸�)
å �̸��� ���� ������ ���� Ȯ�� �� �� �ִ�
 */

class Books{
	private String name;  //������ �� ���⶧���� �����̺��� ����Ѵ�
	private int price;
	
//	public Books() {  �䱸����X
//		name = "����";
//		price = 0;
//	}
	public Books(String n, int p) { //overloading constructor
		name = n;
		price = p;
	}
	public void BooksInfo() {
		System.out.println("å�̸� : "+ name + " " + "���� :"+price);
	}
	//���� getter
	//å�̸��� ���������� ���� ���ü� �ְ� �ؾ��ؼ�
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}


public class Book {
	public static void main(String[] args) {
		Books b1 = new Books("�ظ�����", 13000);
		b1.BooksInfo();
		
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		
		Books b2 = new Books("������ ����", 50000);
		b2.BooksInfo();
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
	}
}

