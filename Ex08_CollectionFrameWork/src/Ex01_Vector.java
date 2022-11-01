import java.util.Vector;

/*
Collection FrameWork
: [다수의 데이터]를 다루는 [표준화된 인터페이스]를 구현하고 있는 [클래스의 집합]

Collection 인터페이스가 최상위 -> 상속 List (구현클래스 :ArrayList) , Set(구현: HashSet ..)

>>ArrayList의 부모타입은 List이다 (OK) >> 다형성 
>>Collection 인터페이스는 ArrayList 부모 타입이다 (OK) >> 다형성

Map 인터페이스 (key ,value) 쌍의 배열 -> (구현클래스 : HashMap)

1. List (줄을 서시오)
순서(번호표) , 중복 허용 > 내부적으로 데이터(자료) > 배열(Array)로 관리 > [홍길동][홍길동][홍길동]
                                                         [0]   [1]   [2]
 1.1 Vector(구버전) -> 동기화를 보장한다 (멀티 스레드) -> lock(장치)보호 -> 성능은 좀 떨어짐 -> 한강 화장실
  1.2 ArrayList(신버전) -> 동기화보장(멀티 스레드) -> Lock 옵션으로(기본 Lock이 없고 필요할때 Lock걸어) -> 성능 우선 -> 한강 비빔밥 축제

기존 다수의 데이터를 다루는 방법 : Array(정적, 고정배열 : 한번 방 갯수가 정해지면 바꿀 수 없다 : 변경불가)*****
int[] arr = new int[5];
arr[0] = 100;
int[] arr2 = {10,20,30};
데이터가 많아지면 새로운 크기의 배열을 만들고 데이터를 이동시켜야 한다 (코드로 직접구현)***
Array
1. 배열의 크기가 고정 : Car[] cars = {new Car(), new Car()}; 방 두개
2. 접근 방법 (index 첨자) 방번호로 접근 : cars[0] ,,, n번째(length -1 = 마지막 방) 방 

List인터페이스를 구현하고 있는 (Vector , ArrayList)
1. 배열의 크기를 동적으로 확장 또는 축소가 가능 >> * 진실은 개발자가 코드를 안칠뿐 컴파일러가 세로운 배열 만들고 데이터를 이동시키는 것을 해줄 뿐이다 *
2. 순서를 유지 (내부적으로 Array 사용) , 중복값 허용
3. 데이터의 저장 공간 : Array 사용 
 */

public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량 : "+ v.capacity());  //10 [0]~[9]  총 용량 크기
		System.out.println("size : "+ v.size());  //0 실제 담기 용량 = 실 데이터 크기
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(10);   //Object는 다 먹는다
		
		System.out.println("size : "+ v.size());  //4
		System.out.println(v.toString());  //재정의 되어있음 =[AA, AA, AA, 10]  재정의 데이터 출력
		//편법적으로 index개념을 만들어서 마치 size처럼 사용했었음
		//Array >> length  =  Collectiom >> size  (X) 다른것
		//Collectiom >> size
		
		for(int i=0; i < v.size(); i++){
			System.out.println(v.get(i));  //get(index) 값을 return  :  정적은 이렇게 했었지 array[index]
		}
		//개선된 for문 출력
		for(Object obj : v) {
			System.out.println(obj);
		}
		//단점 : 작은 데이터 (같은 타입의 데이터) ... 굳이 가장큰 타입을 사용하는 것 불합리
		//제너릭 >> 타입을 강제 >> 추후 별도로 학습(요놈이 포인트임)
		Vector<String> v2 = new Vector<String>(); // <> 그릇의 조율가 들어감  <-> 원래는 Object라 모든거 다 들어갔었음
		v2.add("Hello");
		v2.add("World");
		v2.add("world");
		v2.add("king");
		System.out.println(v2.toString());
		for(String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");     //11개 들어갔음 ...!!
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.toString());
		System.out.println(v3.capacity());  //20개 방 -> 원래의 2배로 만듬  ------ 중요한거 아님
		
		//증명 : 그냥 쓰기면 되요 (지가 알아서 늘리고 하니 그냥 사용하면 되요)
		
	}

}
