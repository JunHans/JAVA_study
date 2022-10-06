package kr.or.kosa;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		//카드 53장 제작
		//메모리(heap메모리)
		
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
		
		//설계도를 변경하지 않고
		//한장의 카드 크기를 변경하면 모든 카드가 변경

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
