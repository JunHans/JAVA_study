import java.util.Scanner;
//Scanner 클래스의 사용 예시
public class scanner_ex {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");

	}

}
