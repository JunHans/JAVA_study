package pracLife01;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_1 {  //배열 시도 1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> member = new ArrayList<String>();  //배열 선언
		member.add("박예빈 : " + "1번");                        //멤버 추가
		member.add("박예슬 : " + "2번");
		member.add("김재홍 : " + "3번");
		member.add("이찬희 : " + "4번");
		member.add("임준한 : " + "5번");

		System.out.println("학생 목록");
		System.out.println(member);
		System.out.println();
		System.out.println("조회하고 싶은 학생의 번호(1~5)를 입력하세요");

		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println(member.get(0));   //해당 index 불러오기
			break;
		case 2:
			System.out.println(member.get(1));
			break;
		case 3:
			System.out.println(member.get(2));
			break;
		case 4:
			System.out.println(member.get(3));
			break;
		case 5:
			System.out.println(member.get(4));
			break;

		default:
			System.out.println("해당 순번의 학생은 없습니다 \n 1~5 중에 선택하세요");  //1~5번까지만 실행
			break;
		}

	}
}
