package kr.or.kosa.common;

public class Car {
	int i; // 컴파일러가 자동으로 default (같은 폴더 같은 패키지) 그냥 int니까
	//default package에 Ex_01_Main에서 i는 사용불가 (디폴트는 같은폴더에 한정)
	public int window;  //같은 폴더 같은 패키지 다른폴더 다 상관없이 다 사용한다
	private int door;  // 같은 폴더든 뭔 폴더든 접근불가 ... 너 왜만듬 이거? 쓰지도 못할거 
	
	//직접은 못하지만 간접적으로 접근할 수 있게 해줄게
	//setter, getter
	public void setDoor(int d) {
		door = d;  //write (숨겨진 자원)
	}
	public int getDoor() {
		return door; //read (숨겨진 자원)
	}
}
