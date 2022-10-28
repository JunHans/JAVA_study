package kr.or.kosa.utils;

import java.time.Year;
import java.util.Calendar;

//설계도
//날짜를 적용하는 [함수]는 많이 사용되요 .... 편하게 쓰고 싶어요
// ==> [ Static ] ... 이름 [ overloading ]

public class Edu_String {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" +
						(date.get(Calendar.MONTH)+1) + "월" +
						date.get(Calendar.DATE) + "일";
	}

	public static String DateString(Calendar date , String opr) {
		return date.get(Calendar.YEAR) + opr +
				(date.get(Calendar.MONTH)+1) + opr +
				date.get(Calendar.DATE) + "";
		}
}
