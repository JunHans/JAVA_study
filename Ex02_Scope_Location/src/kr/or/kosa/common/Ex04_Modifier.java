package kr.or.kosa.common;

public class Ex04_Modifier {
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.setYear(2222);  //절대 마이너스 값은 못 넣는다
		int year = notebook.getYear();
		System.out.println("year : "+ year);
	
	
//	notebook.number = -100;
//	notebook.mouse.x = 5;
//	notebook.mouse.y =4 ;
		
		Mouse mouse = new Mouse();  //마우스가 메모리에 Heap 메모리에
		notebook.handle(mouse);
		System.out.println(mouse.x + " : " + mouse.y);
	}	
}
//직접할당을 막고 간접 할당을 허게 하는것