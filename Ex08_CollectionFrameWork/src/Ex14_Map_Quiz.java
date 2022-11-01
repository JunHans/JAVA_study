import java.util.HashMap;
import java.util.Scanner;

public class Ex14_Map_Quiz {
	public static void main(String[] args) {
		/*
		 * Map 사용 구현하는 데이터 집합 지역번호 , 우편번호 , 회원가입(id , pwd) 정보
		 */
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("Scott", "tiger");
		loginmap.put("lee", "kim1004");

		// id 와 password 받으세요
		// id 는 공백 제거하고 소문자 변환시키세요 (String 함수)
		// pw 는 공백 제거
		/*
		 * id(o) , pwd(o) >> 회원님 방가방가 출력하세요 while탈출 1 id(o) , pwd(x) >> 아이디 , 비밀번호 확인해
		 * 주세요 출력, 다시 입력 받게 ... 2
		 * 
		 * id(x) , pwd(o) >> 아이디 재입력하세요 출력 아이디 비밀번호 다시입력 3 id(x) , pwd(x) >> 아이디 재입력하세요
		 * 출력 아이디 비밀번호 다시입력 3가지 논리를 if문을 통해서 제어하십시오
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id, pwd  입력해 주세요");

			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();

			System.out.println("PWD");
			String pwd = sc.nextLine().trim();

			if (!loginmap.containsKey(id)) {   //이게 중요! 
				// id(x)
				System.out.println("id 맞지 않습니다 ... 재입력 하세요");
			} else {
				// id(0)
				if (loginmap.get(id).equals(pwd)) { // get(id)가 value를 불러오고 value는 페스워드이기때문에 내가 입력한 패스워드와 value를 비교하는 것
					System.out.println("회원님 방가방가 ^^");
					break;
				} else {
					System.out.println("비밀번호 확인하세요");
				}
			}
		}

	}

}
