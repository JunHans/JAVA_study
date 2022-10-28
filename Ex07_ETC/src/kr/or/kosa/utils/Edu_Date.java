package kr.or.kosa.utils;

import java.util.Calendar;

public class Edu_Date {
	
	
	//Quiz
	//요구사항
	//2020-9-14
	//1~9 >> 01 , 02 .... 09
	//10 , 11 , 12 >> 그대로
	//월 앞에 0이 붙도록
	public static String DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH)+1) < 10) {
			month = "0" + (date.get(Calendar.MONTH)+1);
		}else {
			month = String.valueOf((date.get(Calendar.MONTH)+1));
		}
		return date.get(Calendar.YEAR) + "년" +
				month + "월" +
				date.get(Calendar.DATE) + "일";
	}
}

//남은 거
//format 함수(날짜 , 화폐)
//IO
//-> 화요일부터 프로젝트 시작(20일)
//발표 23(금) or 26일(월) 