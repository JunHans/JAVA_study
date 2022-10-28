/*
오류
1. 에러(error)      : 네트워크 장애 , 메모리 Full , 하드웨어 >> 개발자가 코드적으로 해결 불가능 
2. 예외(exception)  : (개발자의 코드 실수로 발생) >> 문제 코드 찾아서 >> 코드를 수정 >> 배포
                    >> 프로그램 컴파일 시 가 아니라 실행시 오류 ... 이유 알수 없어요(아무리 테스트열심히 해도 실행 안될 수 있음) 
                    >> 이런 문제가 발생하면 (exception) 프로그램 강제 종료 (웹 경우 500번 에러)
                    >> 문제가 발생하더라도, 
3. 예외 처리 >> 예외가 발생에 대한 코드 수정하는 것이 아니고 >> 일반 임시방편으로 >> 문제가 생기더라도
		  >> 프로그램이 안정적으로 종료되도록 처리 >> 결국에는 예외처리를 통해서 문제가 생긴 부분을 찾고 
		  >> 다시 코드 수정 >> 배포
		  
try{
	>>문제가ㅣ 의심되는 코드
	>>문제가 발생(exception)
}catch(Exception e){
	>>문제가 발생한 예외 부분을 파악 ...
	>>처리 (코드를 수정하는 것이 아니고, 보고하는 것)
	>> 1. 관리자에게 email 
	>> 2. 로그파일에 기록 (장애 발생 기록) 
	>> 3. 강제로 프로그램 종료 막는다(일단은) 
	>>결국 이 모든 것은 개발자가 연락을 받고 수정하는 것이 답.... 
}finally{
	>>문제가 발생하던 발생하지 않던 강제적으로 실행해야 될 코드
	>> DB작업 문제 (특정자원에 종료) 강제 
}
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		
		System.out.println(0/0);  //java.lang.ArithmeticException: / by zero
		//프로그램이 강제 종료
		//main end 구문은 화면에 출력되지 않아요...
		System.out.println("main end");
		*/
//		-------------------------------------------------------------------
		System.out.println("main start");
		
		try {
			System.out.println(0/0);
			//연산예외가 발생 ... try{}catch{} 처리하면 프로그램이 강제로 종료 되지는 않는다
			
			//Exception 클래스 사용 (예외 클래스의 최상위 부모 클래스)
			//e 라고 하는 변수는 무엇을 받는 것일까?
			//Exception e  >>  Exception 객체의 주소값을 받음
			
			//ArithmeticException 문제가 발생
			//컴파일러애 의해서  ArithmeticException 객체가 생성되고 
			//그 객체에게 문제가 되는 메시지 , 코드 전달하면 ... 
		}catch(Exception e) {   //부모타입의 변수는 자식타입의 주소값을 받을 수 있다
			//어떤 문제인지를 파악하고 그 정보를 전달
			//관리자에게 전달하거나 email보내거나 log write하거나...
			System.out.println(e.getMessage());
		}
		
		System.out.println("main end");

	}

}
