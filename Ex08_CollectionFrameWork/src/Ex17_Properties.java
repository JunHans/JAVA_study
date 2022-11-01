import java.util.Properties;

/*
Map 인터페이스를 구현한 클래스
특수한 목적을 가진애가 있음 : <String><String>   (key, value)타입이 고정
그것이 바로 Properties

사용목적
1. App 전체에 사용되는 자원 관리
2. 환경변수
3. 프로그램 버전
4. 파일 경로
5. 공통변수
 */
public class Ex17_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "kosa@or.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//각각의 개발 페이지에서
		System.out.println(prop.getProperty("admin")); //value값 가져옴 -- 각각 페이지에서 매번 긴 값을 적기 힘들고, 관리자 메일주소가 바뀌면 공통페이지 것만 바꾸면 됨
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("downpath"));
		
	}

}
//ArrayList와 HashMap Generic 기반으로 할줄 알아야 <아주중요>
// Ex02 Ex03 Ex04 Ex05 Stack Ex08 무조건 다 할줄알아야 한다 예제 다쓸 수 있어야한다 (Generic 기반 코드들)
//처음하시는 분들은 Stack까지 안보고 코딩할수있을 정도로
//비전공자들은 빈종이주고 써보라고 하면 Stack 쓸 줄 알아야 한다
//전공자들은 Que까지 코딩 할 수 있게
//Ex08 
//비전공자 Ex12 TreeSet의 개념도 알아야한다 왜 그런지 구조가 어떻게 되있는건지 알아야 한다 코드를 쓸줄까진 모르더라도
//Map은 Ex14,15 Ex17 정도는 반드시 기억하고 무조건 할 줄 아셔야 한다