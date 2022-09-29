package kr.or.kosa.common;

//Tv 설계도 요구사항 정의
//Tv는 채널 정보를 가지고 있다 (예를 들어 1~200 값을 가질 수 있다)
//Tv는 브랜드 이름을 가지고 있다 (예를 들면 엘지 , 삼성)
//Tv는 채널 전환 기능을 가지고 있다(채널은 한 채널씩 이동 가능하다)
//->채널 증가시키는 기능 가지고 있다
//->채널 감소시키는 기능 가지고 있다
//Tv의 채널정보와 브랜드이름을 볼 수 있는(출력할 수 있는) 기능을 가지고 있다

public class Tv {
	public int channel; //default > 0
	public String brandname; // default > null
	
	public void ch_up() {
		channel++;
	}
	public void ch_Down() {
		channel--;
	}
	public void tvInfo() {
		System.out.printf("[%s] , [%d] \n", brandname , channel);
	}

	
	
}
