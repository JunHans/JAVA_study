package pracLife03;

import java.io.Serializable;

/*
바이트 단위의 파일 처리
- FileInPutStream
- FileOutPutStream
문자단위의 파일 처리
- FileReader
- FileWriter


 */
public class IO_01 implements Serializable{
		final String isbn;
		String title;
		int price;
		
		public IO_01(String isbn, String title, int price) {
			super();
			this.isbn = isbn;
			this.title = title;
			this.price = price;
		}

		public String getIsbn() {
			return isbn;
		}

		public String getTitle() {
			return title;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "[isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
		}
		
		

	

}
