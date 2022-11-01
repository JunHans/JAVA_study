package kr.or.kosa;

//도서번호 도서제목 도서가격
class Book {
		String bookName;
		int bookPrice;

		public Book() {}
		
		public Book(String bookName, int bookPrice) {
			super();
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}

		@Override
		public String toString() {
			return " : [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
		}		
}
