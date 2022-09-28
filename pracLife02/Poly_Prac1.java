package pracLife02;
//일단 시나리오, 골격을 만들줄아는개 제일 중요
public class Poly_Prac1 {


	private int price;
		//2차 개선 코드
		//제품이 추가 되더라도 구매행위는 계속 되어야 한다
		//하나의 이름 , 중복되는 코드 (중복코드 제거)
		//모든 제품은 Product상속 >> 부모타입의 참조변수는 자식객체의 주소를 받을 수 있다
	private int money;
	private int bonuspoint;

		
		void buy(Product n) {
			if(this.money < this.price) {
				System.out.println("그만사세요 고객님");
			}
			//실구매
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("구매한 물건은"+n.toSting());
		}
		
		void buy(Priduct n) {
			if(this.money < n.price) {
				System.out.println("그만사세여 돈없어요");
			}
			//실구매
			this.money -= n.price;
			this.bonuspoint =+ n.bonuspoint;
			System.out.println("구매하신 물건은"+n.toString());  //원래 자식타입껀 못건드리지만 재저으이 되었으므로 가능
			
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("고개님 돈 북족해요");
			}
			//실구매
			this.money -= n.price;
			this.bonuspoint += n.binusp[oint];
			System.out.println("구매하신 물건은 "+ n.toString);
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("그만사세요 고객님");
			
			}
			//실구매
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("구매하신 물건은"+ n.toStirng);
		}
		
		void Buy(Product2 n) {
			if(this.money<n.price) {
				System.out.println("고객님 그만사세요");
			}
			//실구매
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("구매하신 상품은"+ n.toString());
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
				//초기화 한다
				cart = new Product2[10];
				this.money = money;
				this.bonuspoint = bonuspoint;
			}
		////////////////////////////////////////////////////
		}
		
		void Buy(Product n) {
			if(this.money < n.price) {
				System.out.println("고객님 잔액이부족합니다"+ this.money);
				return; //함수 종료
			}
			//cart담기
			if(this.index>=10) {
				System.out.println(:고객님 그만사세요);
				return; //함스종료
			}
			cart[index++] = n; //0번째 배열부터 담김
			////////////////////////////////////////////////////////
			this.money -= n.price;
			this.bonuspoint += n.bonuspoint;
			System.out.println("구매한 물건은"+ n.toString());
			System.out.println("잔액"+ this.money);
			System.out.println("포인트"+ this.bonuspoint);
			
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
			System.out.println("구매물건 총액"+totalprice);
			System.out.println("r포인트 총액"+ toatlbonuspoint);
			System.out.println("구매 물건 목록"+ productlist);
			
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
			//초기화
			cart = new Product2[10];
			this.money = money;
			this.bocuspoint = bonuspoint;
		}
		void Buy(Product2 n) {
			if(this.money < n.price) {
				System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
				return;
		}
			
			if(index => 10) {
				System.out.println("그만사세요");
				return;
			}
			cart[index++] = n;
			
			this.money -= n.price;
			this.bonuspoint += n.bonusPoint;
			System.out.println("구매한 물건은 : " + n.toString());  //원래 자식타입껀 못건드리지만 [재정의]된 toString이라서 가능
			System.out.println("잔액"+ this.money);
			System.out.println("포인트"+ this.bonuspoint);
			
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
				System.out.println("총액"+ totalprice);
				System.out.println("총포인츠"+toatlbonuspoint);
				System.out.println("구매목록"+ productlist);
			}
			
	}
	
	
	
	
	
	void Buy(Product n) {
		if(this.money<n.price) {
			System.out.println("고객님 그만사세요");
		}
		//실구매
		this.money -= n.price;
		this.bonuspoint += n.bonuspiont;
		System.out.println("구매하신 물건은"+ n.toString);
	}

	
	void Buy(Product n) {
		if(this.money<n.price) {
			System.out.println("그만사세요");
		}
		//실구매
		this.money -= n.price;
		this.bonuspoint += n.binuspoint;
		System.out.println("구매한 물건은"+ n.toString);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
