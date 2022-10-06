package kr.or.kosa;
/*
책은 책이름과 가격 정보를 가지고 있다
책이 출판되면 반드시 책이름과 책의 가격 정보를 가지고 있어야 한다
책의 이름과 가격정보는 특정기능을 통해서만 볼 수 있고 , 출판된 이후에는 수정할 수 없다 (책의 가격, 이름)
책 이름과 가격 정보는 각각 확인 할 수 있다
 */

class Books{
	private String name;  //수정할 수 없기때문에 프라이빗을 써야한다
	private int price;
	
//	public Books() {  요구사항X
//		name = "미정";
//		price = 0;
//	}
	public Books(String n, int p) { //overloading constructor
		name = n;
		price = p;
	}
	public void BooksInfo() {
		System.out.println("책이름 : "+ name + " " + "가격 :"+price);
	}
	//각각 getter
	//책이름과 가격정보를 각각 나올수 있게 해야해서
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}


public class Book {
	public static void main(String[] args) {
		Books b1 = new Books("해리포터", 13000);
		b1.BooksInfo();
		
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		
		Books b2 = new Books("반지의 제왕", 50000);
		b2.BooksInfo();
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
	}
}

