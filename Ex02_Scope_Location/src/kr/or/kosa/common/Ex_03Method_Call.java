package kr.or.kosa.common;

public class Ex_03Method_Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv lgtv = new Tv();  //new�� ���ؼ� Heap�� ������� �� �ȿ� ch , �귣����� ���� �̸� ä�� �� �Լ����� ���� �װ͵��� ���� ���� ���⼭ �귣�� ������ ������ ������, �װ� ����
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
