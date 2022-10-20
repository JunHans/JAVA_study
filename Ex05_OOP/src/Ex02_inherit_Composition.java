import java.awt.Color;
import java.awt.dnd.DragGestureEvent;

/*
실무(현업) 환경 
한개의 클래스만 사용하는 경우 X

설계도 1장으로 모든 업무구현 현실적으로 불가능 
설계도를 여러개로 나눈다 -> 문제가 발생한다 (나누는 기준, 관계설정 등)

쇼핑몰 : 결제관리, 배송관리, 판매처, 관리자관리, 회원관리, 상품관리  >> 각각의 업무에 대해 별도의 설계도를 만든다
*****기준*****
여러개의 설계도를 관계란 것을 통해서 이어주는 기준이 필요

1. 상속(is ~ a : 상속) 은(는) ~ 이다 (부모를 뒤에)       ex)고래는 포유류다
2. 포함(has ~ a : 포함) 은(는) ~ 을 가지고 있다          ex)자동차는 엔진을 가지고 있다  

예)
원은 도형이다 
원 extends 도형
삼각형은 도형이다
삼각형 extends 도형

원과 점 관계(점으로 연결된 원)
원은 점이다 X
원은 점을 가지고 있다 O
has ~ a(부품정보)
>> class 원(점이라는 부품이 member field)

경찰과 권총 관계
경찰은 권총이다 X
경찰은 권총을 가지고 있다 O
>> class 권총 {}
>>class 경찰 {권총 member field}


원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형은 분모 (공통적인 내용이 있어야 함) 공통자원을 가지고 있어야 함 : 추상화 , 일반화  (공통 : 그려진다, 색상이 있다)
원은 구체화, 특수화 (본인만이 가지는 특징)  (특징 : 반지름을 가지고 있다, 한 점을 가지고 있다)
(사람이 멀리서 보면 점이지만 가까이 다가올수록 특징이 보임)

점 : 좌표값(x,y)
원은 점을 가지고 있다
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다


class Shape{그리다 , 색상} >> 상속관계 부모 (원, 삼각형 ,사각형)
class Point{좌표값} >> 포함관계 (부품) 

구체화 , 특수화 : Circle , Triangle
*/

//추상화 , 일반화 , 공통
class Shape{
	String color="gold"; //공통속성
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		//this.x = 1;
		//this.y = 1;
		this(1,1);  //생성자를 호출하는 this
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}
//문제1)
//원을 만드세요 (원의 정의 : 원은 한점과 반지름을 가지고 있다)
//1. 원은 도형이다 (is ~ a) : shape 
//2. 원은 점을 가지고 있다(has ~a) : point >> member field
//3. 원은 반지름을 가지고 있다(특수 ,구체) : r

//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10,15) 가진다
//초기값을 설정하지 않으면 반지름과 점을 값을 입력을 받을 수 있다 (원이 만들어 질때  new )
//생성자를 ...활용 (hint)

//문제2)
/*
삼각형 클래스를 만드세요
삼각형은 3개의 점과 색상과 그리고 그리다 기능을 가지고 있다
hint) Shape , Point 제공 받아서 설계도 작성 하세요
hint) (x,y) , (x,y) , (x,y)
default 삼각형을 만들 수 있고  3개의 좌표값을 받아서 그릴 수 있다 
*/

//70점 + 10점
class Triangle extends Shape {
	Point a; //= new Point(10,20); 초기화는 여기가 아니라 생성자 안에서  //포함(부품)
	Point b;
	Point c;
	
	public Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60)); //생성자 부르는 this 기본값 설정 초기화는 여기서
	}
	
	public Triangle(Point a , Point b , Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//구체화 ,특수화
	//추가적인 기능
	void trianglePoint() {
		System.out.println("70점");
		System.out.printf("a :(%d,%d)\t",a.x , a.y);
		System.out.printf("b :(%d,%d)\t",b.x , b.y);
		System.out.printf("c :(%d,%d)\t",c.x , c.y);
		System.out.println();
	}
	
}

//100점
class Triangle2 extends Shape {
	Point[] pointarray;  //포함(부품) 포함되는 것 설정할때는 이런식으로 써라 : 선언한 클래스타입 변수
	
	
	public Triangle2() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		//this(new Point(10,20),new Point(30,40),new Point(50,60));
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
	}
	
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	//구체화 ,특수화
	//추가적인 기능
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("x :(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
	
}


class Circle extends Shape{ //상속
	Point point; //= new Point(10,15)//포함(부품)
	int r; // = 10;   //특수성
	
	
	public Circle() {
		//this.r = 10;
		//this.point = new Point(10,15);
		this(10,new Point(10,15));  //생성자 부루는 this 기본값 설정 초기화는 여기서
	}
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

public class Ex02_inherit_Composition {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.color); //상속
		System.out.println(c.point.x);  //이해 ...
		System.out.println(c.point.y);  //이해 ...
		c.draw(); //상속  //Shape의 draw를 사용할 수 있다
		
		//반지름 , 점값을 내가 입력
		//Point point = new Point(100, 200);
		//Circle c2 = new Circle(50, point);
		Circle c2 = new Circle(50, new Point(100,200));  //(int r, Point point)
		//-----------------------------------------------------------------------------------------
		
		Triangle tri = new Triangle();
		tri.trianglePoint();  //출력하는 놈
		
		Triangle tri2 = new Triangle(new Point(1,2), new Point(3,4),new Point(5,6));  //내가 직접 값 입력
		tri2.trianglePoint();  //출력하는 놈
		
		Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};  //배열로 만든거 부르기
		Triangle2 tri3 = new Triangle2(parray);  //바로위에서 선언한거 가져옴
		tri3.trianglePoint();  //출력하는 놈
		
	}

}