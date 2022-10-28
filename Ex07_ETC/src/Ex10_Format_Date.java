import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/kosait/361


public class Ex10_Format_Date {
	public static void main(String[] args) {
		Date currdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date : " + currdate);
		//Thu Sep 15 09:19:07 KST 2022  날짜형식
		
		System.out.println("cal : " + cal); //문자열의 조합
		//java.util.GregorianCalendar[time=1663201147867,areFieldsSet=true

		System.out.println("cal getTime() 함수 : " + cal.getTime());
		//Thu Sep 15 09:20:58 KST 2022
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println("------------");
	    String s =	dateformat.format(currdate);
		String s2 = dateformat.format(cal.getTime());
		System.out.println(s);
		System.out.println(s2);
		
		//사이트 어떤 정보를 입력
		//문자열 >> 날짜 형식으로
		//"202209150925"
		String StringDate = "202209150925";  //형식에 문제 없다면
		Date stringdate = null; //초기화 (지역변수)
		try {
			stringdate = dateformat.parse(StringDate);
			//parse 만든 설계자 (문제 발생 고민) throws ... 사용자는 예외처리 ...
			
			//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
			long datelong = stringdate.getTime();
			System.out.println(datelong);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println(stringdate);
		}
		System.out.println();
		
	}

}