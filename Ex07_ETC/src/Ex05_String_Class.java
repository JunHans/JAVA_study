/*
String 클래스 (문자열) 
String 수많은 함수 ... 문자열을 조작(자르고, 합치고 등등) 
String >>static 함수 + 일반 함수 (15~20개 사용)

 */
public class Ex05_String_Class {
	public static void main(String[] args) {
	 String str ="";
	 String[] strarr = {"aaa","bbb" , "ccc"};
	 for(String s : strarr) {
		 System.out.println(s);
	 }
	 //사용방법 :int , double  값타입 처럼 사용

	 String st = "홍길동"; //사실은 character 배열 - 근데 몰랃호 됨
	 System.out.println(st.length());  //3
	 System.out.println(st);  //홍길동 == st.toString()
	 System.out.println(st.toString());  //주소로가서 데이터를 리턴 하도록 설계(재정의)
	 //Stirng 클래스는 Object 부모클래스 toString() 상속관계 재정의 
	 
	 //정식
	 String sdata = new String("김유신");
	 System.out.println(sdata);
	 
	 String name="가나다라마바";
	 //String 내부적으로 char[] member filed >> [가][나][가][라][마][바] 배열의 주소값
	 //class String extends Object{ private char[] str ... @Override toString()} //재정의
	 
	 String str1 = "AAA";
	 String str2 = "AAA";
	 
	 //문자열의 비교
	 System.out.println(str1); 
	 System.out.println(str2.toString());  //toString() 재정의 의해서 주소값이 아니고 값이 나온다
	 System.out.println(str1 == str2);
	 //==연산자는 값을 비교 str1(주소값) , str2(주소값) 
	 //같은 주소임이 판명남
	 //메모리에 실제로 같은 문지열이 있으면 [재사용]
	 //Point
	 System.out.println(str1.equals(str2)); //주소를 찾아가서 그 안에 들어있는 값을 비교
	 
	 //why : equals 문자열의 비교ㅕ ...
	 String str3 = new String("BBB");
	 String str4 = new String("BBB");
	 
	 System.out.println(str3 == str4);  //false  (== 쓰지 마세요)
	 //문자열은 값이 중요해요  (String 문자열은 equals를 쓰자)
	 System.out.println(str3.equals(str4));  //주소를 찾아가서 그안에 있는 값을 비교
	 
	 String s = "A";
	 s+="B";
	 s+="C";
	 System.out.println(s);
	 
	 s = "A";
	 
	}

}
