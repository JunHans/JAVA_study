package kr.or.kosa.common;

public class Ex_03Method_Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv lgtv = new Tv();  //new를 통해서 Heap에 만들어짐 그 안에 ch , 브랜드네임 생김 이름 채널 등 함수들이 생김 그것들이 여기 들어옴 여기서 브랜드 네임을 엘지로 정해줌, 그게 나옴
		lgtv.brandname = "LG";
		
		lgtv.tvInfo();
			lgtv.ch_up();
			lgtv.ch_up();
			lgtv.ch_up();
		lgtv.tvInfo();
			lgtv.ch_Down();
		lgtv.tvInfo();
			
		Tv sstv = new Tv();
		sstv.brandname = "samsung";
		
		sstv.tvInfo();
		sstv.ch_up();
		sstv.ch_up();
		sstv.ch_up();
		sstv.tvInfo();
			
	}

}
