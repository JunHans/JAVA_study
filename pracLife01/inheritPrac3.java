package pracLife01;

public class inheritPrac3 {

	public static void main(String[] args) {
		
		//���� ����� ��ü �����ϱ�
		inheritPrac2 ip2 = new inheritPrac2("ī��", "����", 3);
		
		//1���� ��ӹ��� �ʵ�
		System.out.println("Ÿ�� : " + ip2.getType());
		System.out.println("���ݵ��� : " + ip2.getABV());
		
		//2���� ��ӹ��� �ʵ�
		System.out.println("�� : "+ ip2.getFlavor());
		
		//2���� �޼ҵ�ȣ��
		ip2.flavordrink();
	}

}
