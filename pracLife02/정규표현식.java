package pracLife02;

import java.util.regex.Pattern;
/*
-기본 정규식 단위-
^ = 문자열의 시작
$ = 문자열의 끝
. = 임의의 한 문자
* = 문자가 0번이상 발생
+ = 문자가 1번이상 발생
? = 문자가 0번 혹은 1번 발생
[] = 문자의 집합 범위를 나타냄
		[0-9] : 숫자(0부터 9까지)
		[a-z] : 알파벳(a부터 z까지)
		앞에 ^가 나타나면 not을 의미
{} = 횟수 또는 범위를 의미
() = 소괄호 안의 문자를 하나로 인식
| = or조건
\ = 확장 문자의 시작
\b = 단어의 경계
\B = 단어가 아닌 것의 경계
\A = 입력의 시작부분
\G = 이전 매치의 끝?
\Z = 입력의 끝이지만 종결자가 있는 경우
\z = 입력의 끝
\s = 공백문자
\S = 공백문자가 아닌 나머지 문자
\w = 알파벳이나 숫자
\W = 알파벳이나 숫자를 제외한 문자
\d = [0-9]와 동일
\D = 숫자를 제외한 모든 문자
*/
public class 정규표현식 {

	public static void main(String[] args) {
		//1번
		String pattern = "^[a-zA-Z]*$";   //영어만 썼는지 확인하는 정규식
        String value = "Onlymatterislifematter";  //입력(영어 or 한글 or 숫자)
        /*
        ^도입부를 의미
        [] a부터 z까지, 대문자A부터 Z까지
        *0~무한대
        $마지막 부분을 의미
         = 시작부터 끝까지 대소문자 영어로 작성된 문자열이어야만 true값 출력
         */
        boolean regex = Pattern.matches(pattern, value);  //matches()함수로 파라미터로(정규표현식, 검증 대상 문자열)
        System.out.println(regex);  //True , False 값 출력
        
        //2번
        String pattern1 = "^[0-9]*$";  //숫자만 쓰도록 만든 정규식
        String value1 = "12345";       //값 입력
        //^시작부분을 의미
        //[0~9] 0~9까지의 숫자를 허용
        //* 0부터 무한대 
        // $마지막 부분을 의미
        boolean regex1 = Pattern.matches(pattern1, value1);
        System.out.println(regex1);
                
        //3번
        String pattern2 = "\\d{2}([0]\\d|[1][0-2])([0][1-9]|[1-2]\\d|[3][0-1])[-]*[1-4]\\d{6}";  //주민등록번호 정규식
        String value2 = "940715-1234561";       //값 입력
        /*
        \d : 0부터 9까지의 숫자 의미
        {2} : 글자수 2개로 제한      \d{2} -> 어떤 숫자가 와도 괜찮다
        ([0]\\d|[1][0-2]): 셋째자리는 [0]이고 넷째자리는 어떤수든 좋고 | 셋째자리가 [1]이고 넷째는 0,1,2중 하나가 들어간다 (|로 인해서 두가지 식 둘다 포함한다(둘 중 하나))
        ([0][1-9]|[1-2]\\d|[3][0-1]) : 다섯째자리가[0]이면 6째자리에 1~9숫자 자리하고 | 다섯째가 1이나 2일때 아무숫자나 와도 좋다 | 다섯째 자리가 3이면 0이나 1이 들어간다
        [-]* : - 부호가 들어가야 하고 -는 없을수도있고 있을수도 있다
        [1-4]\\d{6} : 뒷열 첫째자리는 1~4의 수가 들어갈수 있다, 나머지수는 암거나 수 들어가고 뒷열첫자리수 제외한 자릿수는 6개 제한이다
         */
        boolean regex2 = Pattern.matches(pattern2, value2);  //matches()함수로 파라미터로(정규표현식, 검증 대상 문자열)
        System.out.println(regex2);  //True , False 값 출력
        
        //4번
        String pattern3 = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";  //이메일 정규식
        String value3 = "ii001887@gmail.com";
        /*
        ^ : 문자열의 시작
		[a-zA-Z0-9] : 영문자(대소문)또는 숫자
		+ : 위의 “영문자(대소문)또는 숫자”가 한번 이상 발생
		@
		[a-zA-Z0-9]+ : 영문자(대소문)또는 숫자가 한번 이상 발생
		\\. : .(Dot)을 표현
		[a-z]+ : 영어 소문자가 한번 이상 발생
		$ : 문자열의 끝
         */
        boolean regex3 = Pattern.matches(pattern3, value3);  //matches()함수로 파라미터로(정규표현식, 검증 대상 문자열)
        System.out.println(regex3);  //True , False 값 출력
        
        //5번
        String pattern4 = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$";  //휴대폰 번호 정규식
        String value4 = "01057371887";
        // ^: 문자열 시작
        // ^01([0|1|6|7|8|9]): 01로 시작하고 (0, 1, 6, 7, 8, 9)중 하나의 문자
        // -? : 하이픈(-)은 있을 수도 없을 수도 (0이거나 1개거나)
        // ([0-9]{3,4}): 0~9 범위의 숫자가 3개 혹은 4개
        // -? : 하이픈(-)은 있을 수도 없을 수도 (0이거나 1개거나)
        // ([0-9]{4}): 0~9 범위의 숫자가 4개 (/d가 들어가도 됨)
        // $: 문자열 종료
        boolean regex4 = Pattern.matches(pattern4, value4);  //matches()함수로 파라미터로(정규표현식, 검증 대상 문자열)
        System.out.println(regex4);  //True , False 값 출력
        
        
        //6번
        String pattern5 = "[0-6][0-3]\\d{3}";  //우편 번호 정규식
        String value5 = "21154";
        // [0-6]: 0~6 범위의 숫자 하나
        // [0-3]: 0~3 범위의 숫자 하나
        // \d{3}: 0~9 범위의 숫자 3개
        boolean regex5 = Pattern.matches(pattern5, value5);  //matches()함수로 파라미터로(정규표현식, 검증 대상 문자열)
        System.out.println(regex5);  //True , False 값 출력
	
	
	}
}