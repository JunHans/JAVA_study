package kr.or.kosa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookManager1 {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Book> bookDic = new HashMap<String, Book>();

	String bookName;
	int bookPrice;

	public void start() {
		while (true) {
			selecMenu();
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("추가할 도서의 도서번호, 이름, 가격을 입력해주세요");
				bookPlus();
				break;

			case 2:
				System.out.println("삭제할 도서의 도서번호를 입력하세요");
				bookRemove();
				break;
			case 3:
				System.out.println("검색할 도서의 도서번호를 입력하세요");
				bookSearch();
				break;
			case 4:
				System.out.println("도서목록을 불러옵니다");
				bookList();
				break;
			case 5:
				System.out.println("도서번호(ISBN) 목록을 불러옵니다");
				bookNoList();
				break;
			case 0:
				bookExit();

			default:
				System.out.println("메뉴에 있는 번호만 입력하세요");
			}
		}
	}

	public void selecMenu() {
		System.out.println("메뉴선택");
		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");

	}

	void bookPlus() {
		String bookNo;
		System.out.println("추가할 도서 번호 :");
		bookNo = sc.nextLine();
		if (bookDic.containsKey(bookNo)) {
			System.out.println("이미 있는 번호입니다");
		} else {
			System.out.println("책의 이름을 입력하세요");
			// bookName = sc.nextLine();
			bookName = sc.nextLine();
			System.out.println("책의 가격을 입력하세요");
			// bookPrice = sc.nextInt();
			bookPrice = Integer.parseInt(sc.nextLine());

			bookDic.put(bookNo, new Book(bookName, bookPrice));
			// Book book = new Book();
			System.out.println(bookDic.get(bookNo));
		}
	}

	void bookRemove() {
		String bookNo;
		System.out.println("삭제할 도서번호 :");
		bookNo = sc.nextLine();
		if (bookDic.containsKey(bookNo)) {
			bookDic.remove(bookNo);
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("없는 도서번호입니다");
		}
	}

	void bookSearch() {
		String bookNo;
		System.out.println("검색할 도서번호 :");
		bookNo = sc.nextLine();
		if (bookDic.containsKey(bookNo)) {
			System.out.println("검색결과" + bookDic.get(bookNo));
		}
	}

	void bookList() {
		for (int i = 0; i < bookDic.size(); i++) {
			for (Map.Entry m : bookDic.entrySet()) {
				System.out.println("도서번호(ISBN) : " + m.getKey() + ((Book) m.getValue()));
			}
		}
	}

	void bookNoList() {
		System.out.println("도서 수 : " + bookDic.size());
		System.out.println("도서번호(ISBN) 목록 :" + bookDic.keySet());

	}

	void bookExit() {
		System.exit(0);
	}
}
