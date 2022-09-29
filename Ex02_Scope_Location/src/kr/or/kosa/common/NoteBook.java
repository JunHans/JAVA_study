package kr.or.kosa.common;

import javax.xml.stream.XMLEventFactory;

public class NoteBook {
	//노트북은 마우스를 가지고 있다
	//마우스 >> 휠, 버튼2개, 좌표값,,,,,
	// = 부품정보 ... (엔진, 타이어)
	//마우스도 설계도(클래스)만들어야 함

	//노트북과 마우스느느 별개의 상품인데
	//public Mouse mouse = new Mouse();  //Mouse라는 타입은 클래스, >> 참조변수 >> 주소값을 가져야 함
	//노트북이 마우스를 필요에 따라서 사용할수 있도록 하려면?
	
	
	
	
	public String color;

	// 객체지향 언어(캡술화, 은닉화 : 직접적으로 값을 변경하고 쓰는 것을 방지하기 위해)
	// year변수에 마이너스값 넣지마 부탁... 안지킬 수 있음
	// 다른사람 못 믿어서 다 막아버릴거야 >> 사용불가 >> 간접적으로 사용 가능 .... >> 누군가(method)를 통해서
	// read,write
	// 간접 >> 개발자가 논리를 통해서 제어 하겠다
	// public int year;
	private int year;

	
	
	
	public void setYear(int data) { //간접할당의 장점 : 내가원하는대로 강제할 수 있다
		if(data < 0) {
			year = 1999;
		}else {
			year = data;
		}
	}
	public int getYear() { // 간접적으로 year member field 값을 return
		return year;
	}

	// 약속 캡슐화 (read, write 함수) >> 표준화 >> getYear, setYear >> setter, getter

	/*
	 * //year write함수 public void writeYear(int data) { //간접할당의 장점 : 내가원하는대로 강제할 수
	 * 있다 if(data < 0) { year = 1999; }else { year = data; } } // year read 함수
	 * public int readYear() { //간접적으로 year member field 값을 return return year; }
	 */
	public int number;
	
	//노트북은 필요에 따라서 마우스를 가질 수 있다. 가진다는 것은 기능의 의미
	//갖는다는 의미 : 생성된 객체의 주소를 갖는다
	public void handle(Mouse m) {
		//
		m.x = 100;
		m.y =200;
	}
	
}
