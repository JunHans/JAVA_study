package kr.or.kosa;

/*
 �츮�� ī�带 ����� ȸ��
 �� ��û�� ���� ī�� 53�� ����� �Ǿ���( new ī�� ...53)
 �䱸����)
 ī��� ��ȣ�� ������ �ְ� ����� ������ �ִ�
 ī��� ũ�⸦ ������ �ִ� ũ��� ���̿� �ʺ� ������ �ִ�
 ī���� ũ��� h=50, w=20
 
 �׸��� ���۵Ǵ� ī���� ���̿� �ʺ�� ����
 
 ----------------------------------------
 �����ؼ� �� �����߾�� 
 ���ڱ� ȭ�� ���� ī�尡 ���̷��� Ŀ��?
 �ٽ� ����� �ּ���
 
 **���赵�� �������� �ʰ� 53�� ī���� ���̿� �ʺ� ������ �� �ֵ��� ���赵�� ���弼��
 *hint) ������ ī�带 ���̿� �ʺ� ������ ���ؼ� ��� ī�尡 ���� ����ǵ���
 
 ���翡�� ������ �ǽ��غ��� (����)
 */
public class Card {
	private int number;
	private String kind;

	public static int h = 50;
	public static int w = 20;

	public void makeCard(int num, String name) {
		number = num;
		kind = name;
	}

	public void cardDisplay() {
		System.out.printf("��ȣ [%d], ī���� [%s], h:%s, w:%d \n", number, kind, h, w);

	}
}
