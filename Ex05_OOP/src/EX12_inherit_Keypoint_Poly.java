/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ����� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 

[Ŭ���̾�Ʈ �䱸����] 
������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ��� ��ǰ�� ������ �ִ�
������ ������ǰ�� ��ǰ�� ������ �̸� ������ ���� �ִ�
ex) 
������ ������ǰ�� �̸��� ������ �ִ� (ex) Tv, Audio, Computer
������ ������ǰ�� �ٸ� ���������� ������ �ִ� ( Tv: 5000 , Audio: 6000)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�

�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���ؼ� �ݾ����� , ����Ʈ ������ ������ �ִ�
ex) 10���� , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰ� �Ǹ� ������ �ִ� ���� ���ǰ��ݸ�ŭ �����ϰ� ����Ʈ�� �����Ѵ�
�����ڴ� ó�� �ʱ�ݾ��� ���� �� �ִ� 

1�� ����...
�Ͽ��� �ް�...

���Ŀ���
���忡 ��ǰ 1000�� �ٸ� ��ǰ�� �߰� (���콺 , �佺Ʈ��) ��ǰ ��� POS (�ڵ� ���)
���忡 1000�� ��ǰ�� ����(Product ����ϴ� ��ǰ)
1. ���忡�� 3���� ��ǰ�� ������ �� �ִ� .... 997�� ��ǰ ������ �� �ִ� ����� ����
  >> PC�� >> ���� ����� ���� >> ���� ���� ���� >> 997�� ��ǰ������ �� �ִ� �Լ� �߰�... 
  
  >> ��ȭ�� �����ϴ� �ڵ带 ¥���Ѵ� (������)
  
  >> ��ſ� �ް��� ������ ���� ��� ����  (��ǰ�� 10000���� �߰��� ��Ȳ)
 1. �Լ��� �Ķ���͸� �θ�Ÿ��(Product)���� 
 */

class Product {  //�θ�
	int price;
	int bonusPoint;

	// public Product() {}
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product {
	KtTv() {
		super(500);
	}
	// KtTv(int price){
	// super(price);
	// }

	// �̸�
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}
	// KtTv(int price){
	// super(price);
	// }

	// �̸�
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(150);
	}
	// KtTv(int price){
	// super(price);
	// }

	// �̸�
	@Override
	public String toString() {
		return "NoteBook";
	}
}

//������
class Buyer {

	int money = 5000;
	int bonuspoint;
	int buyKtTv;

	// �����ڴ� ���������� �Ҽ� �ִ�(��� : method)
	// ���������� �ϰԵǸ� �������� �ܾ׿��� ��ǰ�� ������ ����, ����Ʈ������ ���� +)
	// **�����ڴ� ���忡 �ִ� ��� ������ǰ�� ������ �� �ִ�**
	/*
	void KtTvBuy(KtTv n) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < n.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // kttv �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonusPoint;
		System.out.println("������ ������  : " + n.toString());
	}

	void AudioBuy(Audio o) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < o.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // Audio �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= o.price;
		this.bonuspoint += o.bonusPoint;
		System.out.println("������ ������  : " + o.toString());

	}

	void NoteBookBuy(NoteBook b) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < b.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // NoteBook �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= b.price;
		this.bonuspoint += b.bonusPoint;
		System.out.println("������ ������  : " + b.toString());
	}
*/
	
	/*
	//1�� ����
	void Buy(KtTv n) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < n.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // kttv �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonusPoint;
		System.out.println("������ ������  : " + n.toString());
	}

	void Buy(Audio o) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < o.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // Audio �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= o.price;
		this.bonuspoint += o.bonusPoint;
		System.out.println("������ ������  : " + o.toString());

	}

	void Buy(NoteBook b) { // �Լ��� �Ķ���ͷ� ��ǰ ��ü���ּҸ� �޾Ƽ� (��������, ����Ʈ)
		if (this.money < b.price) {
			System.out.println("���� ����� �����մϴ�!" + this.money);
			return; // NoteBook �Լ� ����
		}
		// �Ǳ��� ����
		this.money -= b.price;
		this.bonuspoint += b.bonusPoint;
		System.out.println("������ ������  : " + b.toString());
	}
	*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//2������
		//��ǰ�� �߰� �Ǵ��� ���������� ��� �Ǿ�� �Ѵ�
		//�ϳ��� �̸� , �ߺ��Ǵ� �ڵ� (�ߺ��ڵ� ����)
		//��� ��ǰ�� Product��� >> �θ�Ÿ���� ���������� �ڽİ�ü�� �ּҸ� ���� �� �ִ�
		void Buy(Product n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
			if(this.money < n.price) {
				System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
				return; //kttvBuy �Լ� ����
			}
			//�� ��������
			this.money -= n.price;
			this.bonuspoint += n.bonusPoint;
			System.out.println("������ ������ : " + n.toString());  //���� �ڽ�Ÿ�Բ� ���ǵ帮���� [������]�� toString�̶� ����
		}
	}

	//2������ ��ŭ�� �ڵ� ���� ��ħ�� ���°� ���� 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//���� �߻�Ŭ���� �������̽� ���� -> ���� ��

public class EX12_inherit_Keypoint_Poly {
	public static void main(String[] args) {
		//�����̶�� �����ϰ� ��ǰ ����
//		KtTv kt = new KtTv();
//		System.out.println(kt.price);
//		System.out.println(kt.bonusPoint);
//		System.out.println(kt);
		
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		/*
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.NoteBookBuy(notebook);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		*/
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(notebook);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(audio);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
	}

}
