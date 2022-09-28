package pracLife01;

public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("HelloWorld"); // String 캐릭터들이 모여있는게 스트링 '문자열'
		System.out.println('H'); // Character 글자 하나가 캐릭터 '문자'
		System.out.println("H");

		System.out.println("Hello "
				+ "World");
		
		// \n = new line 이란 뜻
		System.out.println("Hello \nWorld");
		
		// escape 원래의 임무를 일시적으로 해방시키는 것
		System.out.println("Hello \"World\""); // Hello "World" 이렇게 나타내고 싶다 역슬래쉬로 인해서 그 뒤에오는 따옴표는 문자열이 됨
		
	}

}
