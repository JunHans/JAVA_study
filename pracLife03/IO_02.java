package pracLife03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class IO_02 {

	Scanner sc = new Scanner(System.in);
	HashMap<String, IO_01> bookdic = new HashMap<String, IO_01>();

	public void run() {
		while (true) {
			selectmenu();

			switch (Integer.parseInt(sc.nextLine())) {
			case 1: addBook();
				break;
			
			case 2: save();

				break;
			case 3: load();

				break;

			default:
				break;
			}
		}
	}
	
	void addBook() {
		String isbn;

		System.out.print("추가할 도서 ISBN:");

		isbn = sc.nextLine();

		if (bookdic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN입니다.");
			return;
		}

		String title;
		int price;
		System.out.print("도서 제목:");
		title = sc.nextLine();
		System.out.print("가격:");
		price = sc.nextInt();
		sc.nextLine();

		IO_01 book = new IO_01(isbn, title, price);
		bookdic.put(isbn, book);

		System.out.println(book.toString() + " 생성하였습니다.");
	}
	
	
	public void selectmenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1 : 책 추가 \t 2.저장 3. 불러오기");
	}
	
	//저장
	public void save() {
		File file = new File("book.txt"); //저장 될 파일의 이름
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);//객체outputstream
			
			oos.writeObject(bookdic); //bookdic 안에 (isbn,new Book) (isbn,new Book).....
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다!");
			e.printStackTrace();
			//좀 더 상세한 에러를 출력하고 싶다면 printStackTrace사용해서 
			//현재함수나 메서드명을 출력할 수 있다
		}
		System.out.println("도서가 저장되었습니다");
	}
	
	//저장 된 것 불러오기
	public void load() {
		File file = new File("book.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			bookdic = (HashMap)ois.readObject(); //해시맵 형태로 다운캐스팅
			
			Set<String> set = bookdic.keySet(); //set은 key들의 모음 
			
			for(String number : set){
				String isbn = bookdic.get(number).getIsbn();
				String title = bookdic.get(number).getTitle();
				int price = bookdic.get(number).getPrice();
				
				System.out.printf("[%s]\t[%s]\t[%d]\n", isbn , title, price);
			}
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			System.out.println("불러오기 실패하였습니다");
			e.getStackTrace();
		}
	}
}
