package kr.or.kosa.common;

public class Ex04_Modifier {
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.setYear(2222);  //���� ���̳ʽ� ���� �� �ִ´�
		int year = notebook.getYear();
		System.out.println("year : "+ year);
	
	
//	notebook.number = -100;
//	notebook.mouse.x = 5;
//	notebook.mouse.y =4 ;
		
		Mouse mouse = new Mouse();  //���콺�� �޸𸮿� Heap �޸𸮿�
		notebook.handle(mouse);
		System.out.println(mouse.x + " : " + mouse.y);
	}	
}
//�����Ҵ��� ���� ���� �Ҵ��� ��� �ϴ°�