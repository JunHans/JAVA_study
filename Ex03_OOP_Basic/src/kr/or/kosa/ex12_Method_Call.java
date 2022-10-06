package kr.or.kosa;

/*
 함수사용시 parameter 값을 전달, 주소 전달
 void m(int x) {}  x변수는 값을 받느다
 int y = 200;
 호출 m(y);
 y = 1000; 변경 ...
 
 call by value  값전달
 
 -----------------------------------------------
 void m2(Car) {c,color= "red";}  >>>c변수는 주소 값을 받는다
 
 Car c2 = new Car();
 호출 m2(c2);  //같은 타입의 주소값을 전달한다 (Today Point)
 
 call by ref 주소값전달
 
 */


class Data{
	int i;
}

public class ex12_Method_Call {
	static void scall(Data sdata) {  //default static
		System.out.println("함수: " + sdata.i);
		sdata.i = 111;  //OxA반지 i값을 111로 
		
	}
	
	static void vcall(int x) {  //default static
		System.out.println("before x :"+ x);
		x = 8888;
		System.out.println("after x :"+x);
	}

	public static void main(String[] args) {
		Data d = new Data(); //d의 주소값 OxA ...
		d.i = 100;
		System.out.println("d.i:" + d.i);
		
		//scall(d); //주소값 전달 (OxA번지)
		
		//System.out.println("after d.i : "+ d.i);  //111
		////////////////////////////////////////////////////
		
		vcall(d.i);; //값만 전달
		System.out.println("d.i:"+d.i);  //여전히 100 값은 변경되지 않아요

	}

}
