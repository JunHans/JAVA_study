package kr.or.kosa;

/*
instance Variable >> class Car {private String color;}
>> 생성되는 객체마다 다른 색상을 가질 수 있다 

local variable >> class Car { public void move() { int speed=0; 반드시 초기화 }} 지역안에 들어가는 변수는 반드시 초기화를 하자
main 함수 >> local variable

block variable >> class Car{ public void move() { for(int i; i<10....} 제어 생성...소멸}

static variable >> 공유자원 (객체간), 객체생성 이전에 memory 올라가는 자원(영역 : class area, method area)

객체 만드는 유일한 방법 : new를 통해서 메모리에 올리는 것
static 은 new 없이도 메모리에 올라감..

Ex06_Variable_Scope 클래스 >> 구체화 (메모리에 올리기) >> Ex06_Variable_Scope 여태 new한적 없어요
static 은 특권자, 메모리에 그냥 올라가버림 근데 이름이 main이네? 실행시켜! 바로 스택에 올라가 버림

 */

class Variable{
	int iv; 
//	//1. member field , instance variable
//	  2. iv 언제 사용가능 할까요? = 언제 메모리에 올라갈까요? VAriable을 new시킬때
//	     >> Variable v = new Variable(); heap 객체 생성 >> 객체안에 iv가 생성된다
//		 Variable v = new Variable();
//	     Variable v2 = new Variable(); 따로 만들어짐
//	  3. 목적 : 데이터 (정보), 자료를 담을 목적
//	  3.1 정보 : 고유, 상태 , 부품(class)
//	  - 생성되는 객체마다 다른 값을 가질수있다
//	  - 그래서 초기화를 해서 값을 강제하지 아ㄴㅎ는다
//	  - default값을 가지고 있다 (int > 0 , double > 0.0 , char > 빈문자'\u0000)
//	    , boolean >false , String >null , CAr>null
//	  - iv변수의 생성시점 : new라는 연산자를 통해서 heap Variable 이란 이름의 객체가 만들어지고 나서 바로 생성됨
	static int cv = 2000;
	/*
	 1. class variable (클래스 변수), 일반적으로는 static variable (객체간 공유자원)
	 2. 목적은 : 정보 담는 것 (생성되는 모든 객제가 공유하는 자원)
	    >>> 생성되는 모든 객체 (heap이라는 영역에 생성된 객체들이 공유하는 자원)
	 3. 접근방법 
	 1. class 이름.static변수명 >> Variable.cv >> why? 객체가 생성되기 전에 메모리에 올라가니 접근도 클래스 이름을 사용해서 접근한다
	 2. Variable v = new Variable(); v.cv
	 	Variable v2 = new Variable(); v2.cv
	 	>> v.cv == v2.cv (같은 주소를 바라본다 : static변수 변수주소)
	4. 생성시점
	Hello world .JAVA> Hello.class
	>java. wxw Hell 엔터 실행
	>JVM<OS>Memory밀려 > 정리(영역을 나눠여) >  class L0oader System 분석
	>클래스 정보(metadata:설명) >> class area(ㅡㄷ쇙 ㅁㄱㄷㅁ ) 메모리에 올린다(
													언제 , 어떤 자원, 버전...
	 >그 클레스안에 static variable, 또는 static method 있다면
	 >그 두녀석을 class area(method area)영역에 할당합니다
	 >그런데 그 함수의 이름 만약 main이라면 정해진 규칙에 따라서 실행합니다(Stack영역) 자원 힐딩 .. 
	 */
	
	
	
	void method() {
		int v=0;
/*
 locla variable (함수안에 : 지역변수 : 사용전에 반드시 초기화)
 생명주기) 함수가 호출되며 ㄴ생성(stack 생성되었다가 함수가 끝나면 또는 강제 리턴되면 같이 소멸)
 for(int ㅑ=0; ㅑ<=0; ㅑ++){
 int i >> block변수 .. for시작되면 생성 ...for끝나면 소멸
 }
 for(){
 int i >> block변수 .. for시작되면 생성 ...for끝나면 소멸
 }
 for(){
 int i >> block변수 .. for시작되면 생성 ...for끝나면 소멸
 }
 for(){
 int i >> block변수 .. for시작되면 생성 ...for끝나면 소멸
 }
 
 */
}

public static class Ex06_Variable_Scope {
	public static void main(String[] args) {
		Variable.cv = 100;
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		Variable v = new Variable();
		v.cv = 200;
		Variable v2 = new Variable();
		v2.cv = 1000;
		//나일반한수 출력하고싶으면
		ex06.method();
		System.out.println("v.cv : " + v.cv);
	}
	public void method() {
		System.out.println("나 일반 함수");
	}
	
	
}
}
