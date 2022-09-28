/*
 1.자바가 제공하는 기본 타입(시스템 타입 = 원시타입) >> 8가지 
 2. 8가지 기본 타입 [값을 저장]하는 타입 
 
 3. 숫자 > 정수 > (음의 정수, 0 , 양의 정수) byte (정수를 표현할 수 있는 타입) (8bit) -128 ~ 127까지의 정수    ex) byte b = 10;
                                      char 한문자를 표현하는 자료형 (영문자, 특수문자, 공백 ) 1byte
                                      		한글 1자 > 2byte
                                      		협의)char (2byte) : 한글,  영문자, 특수문자. 공백
                                      			크기에 상관없이 2byte로 표기 >> unicode >> 아스키 코드표
                                  			ex) char c = 'A'   ,   char c2 = '가' ... 한 문자를 표현함
                                      short  	(C언어 호환성)
                                      int 		(-21억~ 21억 정수 : 4byte)  ***정수의 기본 타입***
                                      long 		(8byte)
        
        > 실수(부동소수점)   >            float 		(4byte)
                                      double    (8byte) >> 정밀도가 높다 (표현되는 수 범위가 크다) ***실수의 기본 타입***                                
    논리 > 참, 거짓 > true, false        boolean	
    
    
자바에서 정수의 기본 타입은 int (4byte)
자바에서 실수의 기본 타입은 double (8byte)

 현재는 대충 ....
 정수는 int 타입 대충 쓰면 되고 .... 실수는 double 타입 쓰면 별 문제 없다 
 
 가장 많이 쓰는 데이터 : 문자열데이터 >>>  홍길동, 김유신, 안녕하세요 등
 ***문자열의 표현***   >> "" >>"홍길동" , "안녕하세요"

String name = "홍길동바보";  >>  String 클래스이다 (참조 타입) SString str = new String();
** 별도의 언급을 하기 전까지 String 을 일반 값타입처럼 사용하세요  (int, double) 처럼

기본 타입 8가ㅣ + Strong >> 9가지를 가지고 데이터 표현

자바타입
1. 값타입 : 8가지 기본 > int i = 100; int j = 200;...                    value type
2. 참조타입(주소값) : 클래스 , 배열 : 변수에 값이 저장되는 것이 아니라 주소값이 저장됨   ref type


 
 

 */
//class == 설계도 == Data Type
class Car2{  // Car2는 데이터 타입이다, Car2는 설계도이다 >> 구체화 >> 메모리에 올리는 것이 필요하다 >> 그러기에 필요한 것이 new연산자 이다.
	String color;
	int window;
	
}




public class Ex04_DataType {

	public static void main(String[] args) {
		
		String str ="홍길동";  //문자열 대아터ㅗ를 담을 수 있는 타입
		int age = 100; 
		
		Car2 c; //C는 main 함수 안에 있는 지역변수
//		System.out.println(c); // 지역변수를 초기화 하지 않으면 실행이 불가능해여
		//C라는 변수의 초기화는  >> 주소값을 가지게 하는 것 >> new라는 연산자를 통해서 메모리를 할당하고 주소를 갖는것
		c = new Car2();
		System.out.println("C의 주소값 출력 : " + c); //Car2@626b2d4a
		
		//선언과 초기화
		Car2 c2 = new Car2();
		c2.window = 100;
		c2.color = "gold";
		
		
		int i = 10; //두가지 방법중 이것을 선호하라
		
		int j;
		j =20;
		
		
		int k  = 100;
		k = j;  //POINT  (값 할당 -> j변수가 가지는 값을 k에게 할당한다)
		System.out.println("k : " + k); //20
		k = 300;
		System.out.println("k : " + k); 
		System.out.println("j 값은 변함 없다 : " + j);
		
		//int p , q , g; //좋아하지 않아요 이런방식
		//이런 경우는 Array : int[] arr = new int [3];
		
		//int (-21억 ~ 21억)
//		int p = 100000000;
//		int p2 = 10000000000; 
		//p2가 정수(int) .... 당근 안되겠지 예상 ...
		//The literal 10000000000 of type int is out of range 
		//개발자가 직접 입력한 값 (있는 그대로) 정수 값은 int그릇에 담아서 처리
		//난 4byt로 너의 값을 담고 있는데 니가 큰 값을 입력하면 나는 담을 수 없어 ... 
		//1. 해결방법
		long l = 10000000000l;   //리터값을 long 담아서 할당
		long l2 = 100; //100 리터값은 int 그릇안에 .... 
		//작은 타입 값을 큰 타입에 넣는것은 문제가 안된다 ...
		
		//int p2 = 10000000000;
		//int p2 = 10000000000l;  
		//Type mismatch: cannot convert from long to int
		
		int p2 = (int)  10000000000000l; //캐스팅 >> 타입변환
		System.out.println(p2); //1316134912
		//정상적인 해결방법이 아니다 ...  버려지는 값이 나온다 (쓰레기 값)
		
		
		int p3 = (int) 1000l; //캐스팅을 통해서 타입 일치
		System.out.println(p3);
		
		
		
		//char 2byte 정수값
		//한 문자를 표현하기 위해 만든 자료형
		//영문자, 특수문자, 공백, 한글  한문자로 ... 표준화 ...
		//문자열 (문자의 집합) : "홍길동"     String name = "홍길동" 
		//문자   (한 문자) : 'A' , '홍'    char ch = '홍'
		
		char single ='가';
		System.out.println(single);
//		char s = 'AB';  에외 컴파일도 안되요
		
		//char 정수 타입
		//char 문자를 저장하지만 내부적으로 정수값을 가지고 있다
		//정수값은 아스키 코드표를 기반으로 하고 있다
		//정수 호환 가능 ...
		int intch= 'A';  //int intch= (int)'A';
		//내부적으로 자동 형변환이 일어나서 .... = 암시적 (묵시적)
		System.out.println("intch : " + intch);
		
		char ch2 = 'a'; //대문자A는 65 소문자a는 97 아스키코드로 외워둘 것
		System.out.println(ch2);
		int intch2 = (int)ch2;  //내부적으로 형변환 처리가 되지만 ... casting 직접 처리해도 된다
		System.out.println(intch2);
		
		int intch3 =65;
		char ch3 = (char)intch3; // 2바이트 안에 4바이트가 들어가니 안된다   (char)intch3; 앞에 (char)을 써서 강제로 처리
		System.out.println(ch3);
		
		//속지말자  (할당에 있어서 값을 보지말고 그 값을 담고 있는 TYPE을 보자)
		//명시적 형변환 , 암시적 형변환
		//강제적, 명시적 형변환은 개발자의 몫이다
		//key point : 형변환시 손실 데이터 고민
		//위에서 했던 것처럼 .....    char ch3 = (char)intch3; 손실 안나지만
		//큰 것을 작은것으로 강제적으로 형변환 할때는 (데이터 손실) 꾸겨 넣었을 때 데이터가 손실 될 수 있다.
		
		
		
		/*
		 Today point
		 1. 할당에서 변수가 가지고 있는 값을 보지 말고 변수의 타입을 보자
		 2. 변수의 타입 크기를 확인하자
		 3. 큰타입에는 작은 타입을 값을 넣을 수 있다
		 **4. 만약애 작은 타입에 큰타입을 넣고 싶다면 강제로 (casting)
		      책임을 여러분이 지는 것....
		 **char << int 강제로 char << (char)int 재수가 좋으면 데이터손실이 없지만 재수없으면 데이터 손실이 날 수 있다
		 int << char 이경우는 걱정X 내부적으로 컴파일러가 친절하게 int << (int)char 처리합니다
		 */
		
		
		//String 문자열을 담을 수 있는 타입
		//쓰는방법 : int , double 처럼 쓰세요
		String name = "hello World";
		System.out.println(name);
		
		String name2 = name + "방가방가";
		System.out.println(name2);
		//syso ctrl+space
		
		// + 산술 , 결합 연산 다한다
		//TIp) Oracle 데이터 베이스 (언어)경우  >  + 는 산술연산만 한다 , || 결합연산자 (ex '안녕' || '방가')
		
		//Tip) Javva에서의 특수문자 처리
		//이스케이프 문자 : 특정문자 앞에 \ 입력하면 됨
//		char sing= ''';  문제발생
		char sing ='\'';  // \통해서 ' 이 데이터 임을 표현
		System.out.println(sing);
		
		//Quiz : 홍"길"동 이라는 문자를 표현하고 싶어요         <이스케이프 시퀀스 문자 활용>
		String name3 = "홍\"길\"동";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result); //100010
		
		System.out.println("100" + 100);
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100 + "100"));
		System.out.println(100 + "100" + 100);
//		100100
//		100100
//		200100
//		100100100
//		100100100
		
		//Quiz C:\Temp 문자열을 String 변수에 담아서 화면에 출력하세요
		String path = "C:\\Temp";  // \t >> tab    \n >> new line
		System.out.println(path);
		
		//싷수형 (부동소수점)
		//float 4byte
		//double 8byte  //실수 리터럴은 기본 타입이 double
		
//		float f = 3.14;  //Type mismatch: cannot convert from double to float
//		float f = (float)3.14; //데이터 손실 가져올 수 있다 
//		float f = 3.14f; //데이터 손실 가져올 수 있다
		
		double f = 3.14; //현명한 선택 (담을 그릇을 크게)
		
		float f2 = 1.123456789f; //플롯타입에 담고싶으면 무조건 접미사 f, F 붙여라
		//대략적으로 7자리 소수 표현 가능
		//반올림 default
		System.out.println("f2 : " + f2);
//		f2 : 1.1234568
		
		double d = 1.123456789123456789;
		//대략적으로 16자리 소수 표현 가능
		//반올림 default
		System.out.println("d : " + d);
		//d : 1.1234567891234568
		
		System.out.println((byte)128); //-128
		//byte 타입 : -128 ~ 127 정수 표현 가능 / 128은 표현할 수 없는 값
		//넘치면 다시 돌아감
		
		byte q = ((byte)129);
		System.out.println((byte)129); //-127
				
		//정수와 실수 같이 있을 때
		double d2 = 100;  //더블타입8바이트 인트타입4바이트 -> 가능
		System.out.println(d2);  //100.0
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
//		int result2 = (int) (d3 + i5); //서로다른 타입을 합치면 큰타입을 쫒아감 ... 이방법은 데이터손실을 가져올 수 있음
		double result2 = d3 + i5;  //데이터 손실은 가져오지 않는다
		System.out.println(result2);
		//Today point
		//1. 큰타입 + 작은타입 = 큰타입 쫒아간다
		//2. 타입간 변화  >> 변수가 가지는 값을 보지말고 변수의 타입을 보고 판단하자
		//3. 명시적 형변환시 손실데이터 고민
		
		int i6 = 100;
		byte b2 = (byte)i6; //강제적 형변환
		
		byte b3 = 20;
		int i7 = b3; // 컴파일러가 내부적으로 형변환 한다 .... 그러나 엄밀히 따지자면 int i7 = (int)b3; 이 맞다
		
	}

}
