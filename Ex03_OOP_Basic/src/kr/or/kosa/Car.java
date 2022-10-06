package kr.or.kosa;

public class Car {
//원칙적으로 (실무)
//1. 캡슐화 (member field)
//2.캡슐화 (간접적으로 처리: setter, getter)
	private int window;
	private int speed;
	
	//필요에 따라서 (setter만) >>  write
	//(getter만)>> read
	//setter, getter만>> write, read
	public int getWindow() {
		return window;    //getter  함수
	}
	public void setWindow(int data) {  // setWindow(int window){this}
		window = data;    //setter  함수
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//1. IDE사용 
	//2. Lombok 이란 
	//3. 이런 데이터를 담을수 있는 클래스 (VO, DTO, DOMAIN)  >> 우리 나중엔 MVC 패턴사용할거야(모델 뷰 컨트롤러)
	
	//   Java 라이브러리로 반복되는 getter, setter, toString ..
	//   등의 반복 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리 이다.
	//@Getter
	//@Swtter
	//컴파일러에게 자동으로 setter, getter 만들어 주겠니? 라고 하는 것 >> 나중에는 다 생략하는 구나 
	
	
	
	//필요하다면 별도의 함수를생성
	//speed를 10씩 올리더나 감소하는 기능을 만드세요
	//일반적으로 아래처럼 별도의 함수를 만들기 보다는 read와 write만 한다면 
	//setter, getter통해서 제어하는 것이 일반적
	//아래쓴게 게터세터로 들어가
	public void speedUp() {
		speed+=10;  //speed = speed + 10
	}
	public void speedDown(){
		//조건
		if(speed>0) {
			speed-=10;
		}else {
			speed = 0;
		}
	}
}
