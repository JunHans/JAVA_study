package kr.or.kosa;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		//ī�� 53�� ����
		//�޸�(heap�޸�)
		
//		Card c = new Card();
//		c.makeCard(1, "heart");
//		c.cardDisplay();
//		
//		Card c1 = new Card();
//		c.makeCard(2, "heart");
//		c.cardDisplay();
//		
//		Card c2 = new Card();
//		c.makeCard(3, "heart");
//		c.cardDisplay();
		
		//���赵�� �������� �ʰ�
		//������ ī�� ũ�⸦ �����ϸ� ��� ī�尡 ����

		Card c = new Card();
		c.makeCard(1, "heart");
		c.cardDisplay();
		c.h=100;
		c.w=10;
		c.cardDisplay();
		
		Card c1 = new Card();
		c1.makeCard(2, "heart");
		c1.cardDisplay();
		c1.h=200;
		c1.w=20;
		c1.cardDisplay();
		c.cardDisplay();
		
		Card c2 = new Card();
		c2.makeCard(3, "heart");
		c2.cardDisplay();
	}

}
