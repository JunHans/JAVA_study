package kr.or.kosa.common;

public class Coffee1 {
	/*
	 ���Ǳ�� �Ƹ޸�ī�븦 �Ǹ��Ѵ�. (�⺻ 1500��)

���Ǳ��� �Ƹ޸�ī��� �⺻ 2���� ������ �ִ�.

���� �߰��� �� �ִ�. (�ִ� 4��, 300��)

���� �� �� �ִ�. (�ּ� 1��)

���Ǳ�� �Ƹ޸�ī�븦 ��ī���� �Ƹ޸�ī��� ������ �� �ִ�.

��ī���� �Ƹ޸�ī��� �޴� �̸��� ����ȴ�.

������ �߰��ȴ�. (300��)

���Ǳ�� �޴��� ���� ������ ����Ѵ�.
	 */
//	public int data;
//	private int mimPrice;
//	
//	public String menuname = "�Ƹ޸�ī��";  //default = �Ƹ޸�ī��
//	public int price = 1500; //default = 1500
//	public int shot = 2; //default 
//	
//	public void c() {
//		System.out.println("���ǱⰡ �Ĵ� �� : �Ƹ޸�ī��");
//	}
//	public void c1() {
//		System.out.println("���� : 1500��");
//	}
//	public void c2() {
//		System.out.println("�⺻ �� : 2��");
//	}
//	private String name = "�Ƹ޸�ī��";
	
//	private int add(int i) {
//		return i + 100;
//	}
//	public void addshot() {
//		//�Լ��� �ٸ� �Լ��� ȣ���Ҽ� �ִ�
//		int result = add(100);
//		System.out.println("call result : " + result);
		
	
//	public static int addShot(int data) {
//		
//		if(data == 1) {
//			return 1799 + data;
//		} else if(data == 2) {
//			return 2098 + data;
//		}else if(data == 3) {
//			return 2397 + data;
//		}else if(data == 4) {
//			return 2696 + data;
//		} 
//		return data;
//	}
//	
	
	private String name = "�Ƹ޸�ī��";
	private int price = 1500;
	private int shot = 2;

	
	public void shotAdd() {
		if (shot <=4) {
			shot++;
			price += 300;
		} else {
		System.out.println("�� �̻� �߰��� �� �����ϴ�.");
		}
	}
	
	public void shotRemove() {
		if (shot > 1) {
			shot--;
			if (shot >= 2) {
				price -= 300;
				
			}
		} else {
			System.out.println("�� �̻� ������ �� �����ϴ�.");
		}
	}
	
	public void deCaff() {
		name = "��ī���� �Ƹ޸�ī��";
		price += 300;
	}
	
	public void print_Info() {
		System.out.printf("�޴�: %s\n����: %d��\n", name, price);
	}
	
	
}
