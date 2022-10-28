import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자
//                   2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리

//입력값 : 123456-1234567 

//static 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력
public class String_Total_Quiz {

	Scanner sc = new Scanner(System.in);
	static String input; // 주민번호 입력
	public static char gender; // 뒷번호 첫자리 성별 판단
	public static String gender1;
	public int inputlength;

	public void start() {
		System.out.println();
	
		while (true) {
			menuInfo(); // 메뉴판 출력
			in();// 주민등록번호 입력창
			inputlength = length();
			
			if (inputlength == 14) {
				gender = input.charAt(7);
				int gendercon = Character.getNumericValue(gender); // char을 int로 변환 -> 재할당
				if (gendercon >= 1 && gendercon <= 4) {
					if (gendercon == 1 || gendercon == 3) {
						gender1 = "남자";
						System.out.printf("당신의 성별은 [%s]입니다", gender1);
						System.exit(0);  //맞는 답이 나왔으니 시스템 종료
					} else if (gendercon == 2 || gendercon == 4) {
						gender1 = "여자";
						System.out.printf("당신의 성별은 [%s]입니다", gender1);
						System.exit(0);  //맞는 답이 나왔으니 시스템 종료
					} else {
						System.out.println("성별이 없습니다");
					}
				} else {
					System.out.println("뒷자리 첫번재 번호가 잘못되었습니다");
				}
			} else {
				System.out.println("주민등록번호에 '-'가 빠졌거나\n길이가 잘못되었습니다");
			}
			

		}
	}

	// 메뉴판
	private void menuInfo() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("주민등록 번호를 입력해주세요");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}

	// 입력창
	public void in() {
		System.out.println("입력 : ");
		input = sc.nextLine();
	}
	//입력된 주민등록번호 길이 판별
	public static int length() {
		int k = input.length();
		return k;
	}
}
