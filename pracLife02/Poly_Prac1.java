package pracLife02;
//�ϴ� �ó�����, ����� �����پƴ°� ���� �߿�
public class Poly_Prac1 {


	private int price;
		//2�� ���� �ڵ�
		//��ǰ�� �߰� �Ǵ��� ���������� ��� �Ǿ�� �Ѵ�
		//�ϳ��� �̸� , �ߺ��Ǵ� �ڵ� (�ߺ��ڵ� ����)
		//��� ��ǰ�� Product��� >> �θ�Ÿ���� ���������� �ڽİ�ü�� �ּҸ� ���� �� �ִ�
	private int money;
	private int bonuspoint;

		
		void buy(Product n) {
			if(this.money < this.price) {
				System.out.println("�׸��缼�� ����");
			}
			//�Ǳ���
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("������ ������"+n.toSting());
		}
		
		void buy(Priduct n) {
			if(this.money < n.price) {
				System.out.println("�׸��缼�� �������");
			}
			//�Ǳ���
			this.money -= n.price;
			this.bonuspoint =+ n.bonuspoint;
			System.out.println("�����Ͻ� ������"+n.toString());  //���� �ڽ�Ÿ�Բ� ���ǵ帮���� �������� �Ǿ����Ƿ� ����
			
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("���� �� �����ؿ�");
			}
			//�Ǳ���
			this.money -= n.price;
			this.bonuspoint += n.binusp[oint];
			System.out.println("�����Ͻ� ������ "+ n.toString);
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("�׸��缼�� ����");
			
			}
			//�Ǳ���
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("�����Ͻ� ������"+ n.toStirng);
		}
		
		void Buy(Product2 n) {
			if(this.money<n.price) {
				System.out.println("���� �׸��缼��");
			}
			//�Ǳ���
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("�����Ͻ� ��ǰ��"+ n.toString());
		}
		
		//////////////////////////////////////////////////////////
		class buyer2{
			int money = 5000;
			int bonuspoint;
			////////////////////////////////////////////
			Product2[] cart;
			int index = 0;
			Buyer2(){
				this(1000,0);
			}
			Buyer2(int money, int bonuspoint){
				//�ʱ�ȭ �Ѵ�
				cart = new Product2[10];
				this.money = money;
				this.bonuspoint = bonuspoint;
			}
		////////////////////////////////////////////////////
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("���� �ܾ��̺����մϴ�"+ this.money);
				return; //�Լ� ����
			}
			//cart���
			if(this.index>=10) {
				System.out.println(:���� �׸��缼��);
				return; //�Խ�����
			}
			cart[index++] = n; //0��° �迭���� ���
			////////////////////////////////////////////////////////
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("������ ������"+ n.toString());
			System.out.println("�ܾ�"+ this.money);
			System.out.println("����Ʈ"+ this.bonuspoint);
			
		}
		void summery() {
			int totalprice;
			int totalbonuspoint;
			String productlist = "";
			
			for(int i=0; i<index; i++) {
				totalprice += cart[i].price;
				totalbonuspoint += cart[i].bonuspoint;
				productlist += cart[i].toString()+"";
			}
			System.out.println("*******************");
			System.out.println("���Ź��� �Ѿ�"+totalprice);
			System.out.println("r����Ʈ �Ѿ�"+ toatlbonuspoint);
			System.out.println("���� ���� ���"+ productlist);
			
		}
	}
	
	class Buyer2{
		int money = 5000;
		int bonuspoint ;
		product[] cart;
		int index = 0;
		
		void Buyer2() {
			this(1000,0);
		}
		void Buyer2(int money, int bonuspoint) {
			//�ʱ�ȭ
			cart = new Product2[10];
			this.money = money;
			this.bocuspoint = bonuspoint;
		}
		void Buy(Product2 n) {
			if(this.money < n.price) {
				System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
				return;
		}
			
			if(index => 10) {
				System.out.println("�׸��缼��");
				return;
			}
			cart[index++] = n;
			
			this.money -= n.price;
			this.bonuspoint += n.bonusPoint;
			System.out.println("������ ������ : " + n.toString());  //���� �ڽ�Ÿ�Բ� ���ǵ帮���� [������]�� toString�̶� ����
			System.out.println("�ܾ�"+ this.money);
			System.out.println("����Ʈ"+ this.bonuspoint);
			
			void summery() {
				int totalprice;
				int totalbonuspoint;
				String productlist;
				
				for(int i=0; i<index; i++) {
					totalprice += cart[i].price;
					totalbonuspoinmt += cart[i].bonuspoint;
					productlist += cart[i].toSStirng();			
				}
		
				System.out.println("**************************");
				System.out.println("�Ѿ�"+ totalprice);
				System.out.println("��������"+toatlbonuspoint);
				System.out.println("���Ÿ��"+ productlist);
			}
			
	}
	
	
	
	
	
	void Buy(Product n) {
		if(this.money<n.price) {
			System.out.println("���� �׸��缼��");
		}
		//�Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.bonuspiont;
		System.out.println("�����Ͻ� ������"+ n.toString);
	}

	
	void Buy(Product n) {
		if(this.money<n.price) {
			System.out.println("�׸��缼��");
		}
		//�Ǳ���
		this.money -= n.price;
		this.bonuspoint += n.binuspoint;
		System.out.println("������ ������"+ n.toString);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
