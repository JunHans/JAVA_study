
//두개의 설계도
class Tv {
	boolean power;
	int ch;

	void power() {
		this.power = !this.power; // 토글링 - 두개의 기능을 하나의 함수로 처리 전원 껏다 켰다
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}

}

class Vcr { // 비디오 플레이어
	boolean power;

	void power() {
		this.power = !this.power;
	}

	void play() {
		System.out.println("재생");
	}

	void stop() {
		System.out.println("정지");
	}

	void rew() {
	}

	void ff() {
	}
}

//Tv설계도
//Vcr설계도

//TvVcr 이런 제품을 만들고 싶어

//class TvVcr ... 

//class TvVcr extends Tv, Vcr (x) 다중상속 금지
//계층적 상속도 좀 이상 (power가 이름이 같아서 충돌남 ... 사용불가)

// 한놈은 상속하고 한놈은 포함하면 둘다쓰기 가능
// 그럼 어떤놈을 상속하고 어떤놈을 포함할까?
//기준 Tv(상속), Vcr(포함) >> Tv 더많이 사용
//기준 Tv(상속), Vcr(포함) >> Tv가 주기능

//메인 기능을 누가 가지고 있느냐 (비중)

class TvVcr2 extends Tv {
	Vcr vcr;

	public TvVcr2() {
		vcr = new Vcr();
	}
}
	class TvVcr {
		Tv t;
		Vcr v;

		public TvVcr() {
			this.t = new Tv();
			this.v = new Vcr();
		}
	}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr tv = new TvVcr();
		tv.t.power();
		tv.v.power();

		System.out.println(tv.t.power);
		///////////////////////////////////////////

		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("Tv전원 : " + tv2.power);
		tv2.chUp();
		
		tv2.vcr.power();
		System.out.println("비디오 전원 : "+tv2.vcr.power);
		tv2.vcr.play();
	}

}
