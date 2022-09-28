package pracLife02;



/*
**조별 과제(인터페이스 설계하기)**

수정 이유:
브랜드로 구분한 이유가 없음

[탈것]
탈것은 최대 오일량과 현재 오일량, 타이어 개수를 가진다
자동차와 오토바이가 있다
자동차는 창문을 조절하는 기능이 있다
자동차에는 K3, K5, 제네시스가 있다
K3, K5, 오토바이는 주유가 가능하다

제네시스는 전기 충전만 가능하다 (주유 불가)

[주유소]
주유소는 차량과 오토바이에 주유한다

Vehicle(탈것)이라는 부모클래스를 만들고 최대, 최소연료량과 바퀴숫자를 파라미터에 넣었다, Vehicle(탈것)을 상속받는 Car와 Bike 자식클래스를 만들었다
Car는 바퀴가 4개로 고정이고 최대최소연료량은 자식클래스마다 다르다, 또 창문을 여닫을 수 있다(함수/기능), 또 자신을 상속받는 클래스인 k3, k5, gene 3개가 있고 각각 최대연료량과 현재연료량을 설정했다, 이중 제네시스는 전기차이다 
Bike는 탈것을 상속받고 바퀴수는 2개이다, 최대최소연료량을 설정했다
GasStation은 주유라는 목적을 가지고 있고 OilInput이라는 함수를 만들고 파라미터값으로 주유가 가능한차들로만 묶어둔 인터페이스를 데이터타입으로 넣었고, 묶어둔 클래스들이 유연하게 사용가능하다
새롭게 부모자식클래스로 묶인 인터페이스는 빈자원이기때문에 자원을 사요하기 위해 Vehicle로 다운캐스팅을 해주었고, 기능은 주유기능인 현재연료량이 최대연료량과다르면 최대로 충전시켜주는 기능을 넣었다
 
 
 Car로 묶기에는 오토바이가 포함되지 않고 오토바이로 묶을 수 는 없으니 인터페이스로 묶어준다
 
 
 FeedBack - 인터페이스를 규칙과 약속의 측면에서 사용하지 않았다 
 
 <클래스다이어그램>
 유저는 [함수 내에서] 스케쥴에 의존합니다 어디서? [함수 내에서] /
  의존 관계는 메소드내에서 그 자원을 생성하거나 파라미터로 받거나 지역변수로 스는 것을 의미한다
  (양방향)유저는 주소를 갖고있다 주소는 유저를 포함한다 , (단방향)유저는 주소를 하나 또는 여러개 가질수있습니다 유저는 어드레스를 멤버필드로 갖음(연관) 벰버필드로빠지면 연관, 멤버필드로 안빠지면 의존(함수 내에서)
  빈 마름모 부분집합.어그리게이션 (부분집합) - 학교와 학생의 관계(라이프싸이클이 다르다) 가질수도 있고 아닐 수도 있고 / 따로따로
  		부분관계는 다 new해야함
  찬 마름모 전체집합.컴포지션(전체집합) - 자동차와 엔진 관계 (라이프싸이클이 같다) 자동차가생기면 엔진도 생기고 자도차 사라지면 엔ㅈ닝도 사라짐
  		전체관계는 하나 new하면 다 만들어짐
  */
interface Oil{ //가솔린 차량
}

class Vehicle{
	int max; //최대 연료량
	int now; //현재 연료량
	int wheel; //바퀴 개수
	
	Vehicle(int max, int now, int wheel){      //vehicle생성자는 파라미터안에 이러한 값을 가지고 초기화한다
		this.max = max;                        
		this.now = now;
		this.wheel = wheel;
	}
}


class Car extends Vehicle{                     //Car는 Vehicle을 상속하고 윈도우를 선언하고 생성자 안에 super로 부모의 생성자를 호출해서 부모클래스의 함수 파라미터에 맞는 타입 값을 넣고 자식클래스 차들의 바퀴 수를 4개로 고정한다
	boolean window;									//창문은 기본적으로 닫혀있고
	
	Car(int max, int now){                      //또, 요놈만의 함수로 창문의 여닫는 기능을 넣었다
		super(max, now, 4);
		window = false; //창문이 닫혀있음
	}
	
	void winChange() { //창문 조절 기능
		this.window = !this.window;
	}
}

class K3 extends Car implements Oil{            //K3는 부모클래스 Car를 상속하고 부모클래스의 생성자를 super를 이용해서 최대현재오일량의 값을 설정해주고 목표인 주유를 위해 묶어주는 인터페이스 Oil로 부모클래스를 다시 정의해준다
	K3(){
		super(100, 70);
	}
}

class K5 extends Car implements Oil{ 			//K5는 부모클래스 Car를 상속하고 부모클래스의 함수 파라미터 타입에 맞는 값을 super로 넣어주고 목표인 주유를 위해 묶어주는 인터페이스 Oil로 부모클래스를 다시 정의해준다
	K5() {
		super(100, 40);	
	}
}

class Gene extends Car{ //제네시스 //전기           //제네시스는 전기차다 최대 충전량과 잔량을 설정해 놓았다
	Gene(){
		super(500, 20);
	}
}

class Bike extends Vehicle implements Oil{      //오토바이인 Bike클래스는 탈것 Vehicle 클래스를 상속받고 주유를 하기위해 인터페이스 Oil로 다시금 묶어주었다 
	Bike(int max, int now){                       //또한, 위에서 설정했던 바퀴 4개가 아닌 바퀴 2개로 다시 설정했다
		super(max, now, 2);
	}
}

class gasStation{                                //기름을 넣을 수 있는 함수를 만들어 놓은 클래스인 gasStation이다. 함수의 파라미터로는 주유를 위해 다시 인터페이스로 묶어준 Oil으 넣어 자식 클래스를 간섭할 수 있게 했다.
	//기름을 넣을 수 있다.
	void inputOil(Oil oil) {
		
		Vehicle vehicle = (Vehicle)oil;          //Oil은 빈자원이기 때문에 자원을 쓰기 위해 DownCasting을 해주었다
		
		if(vehicle.now != vehicle.max) {         //탈것의 현재 오일량이 최대량과 다르다면 현재량을 최대량으로 충전시켜주도록 했고
			vehicle.now = vehicle.max;
			System.out.println("가득 충전햇습니다^^ 현재 오일량 : " + vehicle.now);  //충전했다는 메시지와 현재 오일량 출력
		}else {
			System.out.println("이미 기름이 가득 차 있습니다.");                     //잔량이 최대량보다 적은 경우 외에는 이미 가득 차있다고 메세지 출력
		}
		
	}
}

public class interface_assignment {
	public static void main(String[] args) {
				
		gasStation gasStation = new gasStation();
		
		K3 k3 = new K3();
		System.out.println("k3의 현재 오일량 : " + k3.now);
		gasStation.inputOil(k3);
		System.out.println("k3의 현재 오일량 : " + k3.now);
		
		System.out.println();
		
		K5 k5 = new K5();
		System.out.println("K5의 현재 오일량 : " + k5.now);
		gasStation.inputOil(k5);
		System.out.println();
		
		Bike bike = new Bike(50, 10);
		System.out.println("오토바이의 현재 오일량 : " + bike.now);
		gasStation.inputOil(bike);
	}
}
