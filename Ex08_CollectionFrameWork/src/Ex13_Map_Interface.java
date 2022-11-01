import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
(key , value) 쌍의 구조를 갖는 배열
ex) 지역번호(02, 서울) , (031, 경기)
조건)
key 중복 (x) >> (Set과 비슷)
value 중복 (O) >> (List와 비슷)

Generic 지원 

Map 인터페이스 구현하는 클래스
구버전 : HashTable (동기화) : 한강 화장실(lock) 자원보호
신버전 : HashMap   (동기화를 강제하지 않는다) 성능고려 함(Thread 학습....)******

동기화(보호)
 */


public class Ex13_Map_Interface {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");  //id , password
		map.put("Scott", "1004");
		map.put("Superman", "1007");  //아이디 , 패스워드 느낌 아이디는 다르지만 패스워드는 같아도 되는
		
		System.out.println(map.containsKey("tiger"));  //대소문자 구별한다 -> (False)
		//key제공 > value > get()
		System.out.println(map.containsKey("Scott"));
		System.out.println(map.containsValue("1004"));  //백개있든 천개있든 중복 상관없이 있으면 -> (True)

		System.out.println(map.get("Tiger"));  // 1004
		//key를 제공하면 value값을 알 수 있다 >> map.get(key)
		System.out.println(map.get("hong")); //없는 key는 return null;
		
		
		map.put("Tiger", "1008"); //value replace : 바꿔버림
		System.out.println(map.get("Tiger"));  // 1008 (바뀌었다)
		System.out.println(map.size()); // 3
		
		System.out.println(map.toString());  //재정의가 되어있음
		// {Superman=1007, Tiger=1008, Scott=1004}
		
		Object value = map.remove("Superman");
		System.out.println("삭제된 value : " + value);
		System.out.println(map.toString());  // {Tiger=1008, Scott=1004}
		
		//응용 (이해)
		Set set = map.keySet();  //이거 이해해야함! (Set 인터페이스를 구현하는 객체를 생성해서 주소리턴) : map출력방법
		//순서(x) , 중복(x)
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collection clist = map.values();  //value는 중복데이터 있어서 순서가 있는 데이터 집합으로 관리 그거의 부모가 Collection
		System.out.println(clist.toString());
		
		
	}
	

}
