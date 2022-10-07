
public class Ex04_Array_For {

	public static void main(String[] args) {
		/*
		Today Point
		for 문 >> 향상된 for문 , 개선된 for문
		JAVA       : for(Type 변수명 :   배열 or Collection){실행블럭}
		C#         : for(Type 변수명 in  배열 or Collection){실행블럭}
		JavaScript : for(Type 변수명 in  Collection){실행블럭}
		 */
		int[] arr = {5,6,7,8,9};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//개선된 ...
		for(int value : arr) {  //앞의 타입 int, String... 을 배열의 타입과 맞춰주는 것 주의
			System.out.println(value);
		}
		
		//<예>
		String[] strarr = {"A","B","C","D","FFFF"};
		
		for(String value : strarr) {
			System.out.println(value);
		}
		
	}

}
