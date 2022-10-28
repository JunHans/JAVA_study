import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat("wolrd");  //concat = 합치다
		System.out.println(concatstr);
		
		boolean bo = str.contains("e");  //e라는 글자를 포함하고 있니? -> true / false
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d] = 7개
		System.out.println(str2.length());
		
		String filename="hello java workd";
		System.out.println(filename.indexOf("h"));  //h라는 문자의 인덱스 정보 출력
		System.out.println(filename.indexOf("java"));  // java 단어의 시작위치 
		System.out.println(filename.indexOf("개폭망"));  //없으니까 -1 출력
		// -1을 return ... 배열에서 값이 없다는 의미(-1)
		//신문 사설에서 원라는 단어 검색 ... 내가 원하는 문자열이 포함되었는지 파악 ... -1이 아니면 들어있다는 것
		if(filename.indexOf("wo") != -1){
			System.out.println("wo 단어가 하나라도 있다");
		}
		System.out.println(filename.lastIndexOf("a"));  //뒤에서부터 a를 찾아서 마지막 a의 위치
		
		//암기하면 좋을 함수   :   length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0));  //시작 인덱스를 제공하면 그 뒤 나오는 것 다 나옴
		System.out.println(result.substring(1));
		System.out.println(result.substring(1,2));  // "u"
		//endIndex -1
		System.out.println(result.substring(0,0));  //(0, -1)  아무것도 안나옴
		System.out.println(result.substring(0,1));  // "s" 
		
		
		//Quiz
		String filename2 = "home.jpeg";  // or h.png or aaaaa.hwp
		//여기서 파일명과 확장자를 분리해서 출력하라
		String first = filename2.substring(5);
		
		int position = filename2.lastIndexOf(".");  //규칙 (.위치)
		String file = filename2.substring(0, position); // 0부터 . 있는 곳 까지
		
		String extention2 = filename2.substring(position+1, filename2.length());
		String extention = filename2.substring(++position);
		
		System.out.println(position);
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace
		String str3 = "ASDFADDDDDSF";
		String result3 = str3.replace("DDDDD", "오늘은 금욜");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("FA")); //너 뒤에 FA로 시작하는 문자가 있니 true false
		System.out.println(str3.equalsIgnoreCase("asDFSFASFSf"));  //대소문자 구분없이 비교
		
		//Today Point
		String str4="수퍼맨, 팬티, 노랑색, 우하하, 우하하";
		String[] namearray = str4.split(",");  //,를 기준으로 하나씩 분리해서 나누겠다
		
		for(String s : namearray) {
			System.out.println(s);
		}
		
		String str5="수퍼맨, 팬티, 노랑색, 우하하, 우하하";
		String[] namearray2 = str5.split(",");  //.를 기준으로 하나씩 분리해서 나누겠다
		
		for(String s : namearray2) {
			System.out.println("\\."+s);  //  \.이 정규표현식인데 이스케이프시퀀스가 없으면 문자로 인식못해서 앞에 써줘야 함
		}
		//https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		//"."정규 표현식이다 데이터가 아니라
		
		//정규표현식 (문자들을 조합해서 규칙을 만들고 : 그 규칙과 데이터를 비교해서 맞는지 판단)
		//우편번호 : {\d3}-{\d3} >> 12-1 (false) , 123*123(false) , 111-111(true)
		
		//정규표현식(java , javascript , Oracle , C#) 표준
		//핸드폰 차량번호 , 도메인 주소, 이메일 주소 정규표현으로 구현 >> 입력한 데이터 유효성 검증
		//다음주 과제로 제출
		
		String filename3 = "kosa.hwp";
		//파일명과 확장자 분리
		String[] filename33 = filename3.split("\\.");
		for(String s : filename33) {
			System.out.println(s);
		}
		
		String str6 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");  //이런것들을 다 제외하겠다  //별도의 클래스 StringTokenizer 이용
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//넌센스
		String strr7 = "홍         준       한";
		//저장 >> 공백제거 >> "홍준한"
		StringTokenizer sto1 = new StringTokenizer(strr7," ");  //이런것들을 다 제외하겠다  //별도의 클래스 StringTokenizer 이용
		while(sto1.hasMoreElements()) {
			System.out.print(sto1.nextToken());
		}
		
		System.out.println();
		
		String str7 = "홍         준       한";
		//저장 >> 공백제거 >> "홍준한"
		System.out.println(str7.replace( " ", "")); //"홍준한"
		
		String str8 = "       홍길동           ";
		System.out.println(">" + str8 + "<");	
		System.out.println(">" + str8.trim() + "<");  //trim() 공백문자 잘라냄
		
		String str9 = "      홍   길   동     ";
		String result5 = str9.trim();
		String result6 = result5.replace(" ","");
		System.out.println(result6);
		//무식한 인간....
		
		//************여러개의 함수를 사용할 경우 (method chain 기법)
		System.out.println(str9.trim().replace(" ","").substring(2));  //순서대로 실행
		
		int sum=0;
		String [] numarr = {"1","2","3"};
		for(String s : numarr) {
			sum+=Integer.parseInt(s);
		}
		System.out.println("sum:"+sum);
		
		//Quiz
		  String jumin="123456-1234567";
		   //위 주민번호의 합을 구하세요_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);  //ㄷ따로따로 나누고
			   if(numstr.equals("-")) continue;    //-나오면 넘기고
			   sum2+= Integer.parseInt(numstr);   //나눈 각각의 것들을 수로 변환해서 전부 합친다
		   } 
		   System.out.println("주민번호 합:" + sum2);
		   
		 //위 주민번호의 합을 구하세요_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("주민번호 합2:" + sum3);
		   
		 //위 주민번호의 합을 구하세요_3
		   String jumin4 = jumin.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));  //char로 바꾼 뒤 char을 int로 바꿔서 합치기
		   }
		   System.out.println("주민번호 합4:" + sum4);
		
		
		
		
		
		
//		String[] jumin1 = jumin.split("-");
//		for(String a : jumin1) {
//			System.out.println(a);
//		}
//		
//		StringTokenizer sto3 = new StringTokenizer(jumin,"-");  //이런것들을 다 제외하겠다  //별도의 클래스 StringTokenizer 이용
//		while(sto3.hasMoreElements()) {
//			System.out.println(sto3.nextToken());
//		}
//		
//		char[] arr9 = new char[jumin.length()];
//		for(int i=0; i<jumin.length(); i++) {
//			arr9[i] = jumin.charAt(i);
//		}
//		System.out.println(Arrays.toString(arr9));
//		
//		
//		
//		for(char b : arr9) {
//			sum1+=Integer.parseInt(b);
//		}
//		System.out.println("sum1 합:"+sum1);
	}

}
