
//�ΰ��� ���赵
class Tv {
	boolean power;
	int ch;

	void power() {
		this.power = !this.power; // ��۸� - �ΰ��� ����� �ϳ��� �Լ��� ó�� ���� ���� �״�
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}

}

class Vcr { // ���� �÷��̾�
	boolean power;

	void power() {
		this.power = !this.power;
	}

	void play() {
		System.out.println("���");
	}

	void stop() {
		System.out.println("����");
	}

	void rew() {
	}

	void ff() {
	}
}

//Tv���赵
//Vcr���赵

//TvVcr �̷� ��ǰ�� ����� �;�

//class TvVcr ... 

//class TvVcr extends Tv, Vcr (x) ���߻�� ����
//������ ��ӵ� �� �̻� (power�� �̸��� ���Ƽ� �浹�� ... ���Ұ�)

// �ѳ��� ����ϰ� �ѳ��� �����ϸ� �Ѵپ��� ����
// �׷� ����� ����ϰ� ����� �����ұ�?
//���� Tv(���), Vcr(����) >> Tv ������ ���
//���� Tv(���), Vcr(����) >> Tv�� �ֱ��

//���� ����� ���� ������ �ִ��� (����)

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
		System.out.println("Tv���� : " + tv2.power);
		tv2.chUp();
		
		tv2.vcr.power();
		System.out.println("���� ���� : "+tv2.vcr.power);
		tv2.vcr.play();
	}

}
