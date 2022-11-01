import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set Interface (원 안에 들어가세요) : 순서를 보장하지 않는다 , 중복데이터를 판단못함 ,  중복을 허락하지 않음
순서가 없고 중복을 허락하지 않는 데이터 집합 
구현하는 클래스
=HashSet , TreeSet(자료구조) 

 */
public class Ex10_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		// 순서가 없는 [중복되지 않는] 데이터 집합
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("정상 :" + bo);

		bo = hs.add(1);
		System.out.println("결과 : " + bo); // 이미 원 안에는 1이라는 데이터가 존재하는구나

		// 중복허락않는 데이터집합 .... 로또 , 차량번호
		System.out.println(hs.toString()); // 재정의 되있네 [1, 100, 55]

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("H");
		hs2.add("b");
		hs2.add("b");
		System.out.println(hs2.toString()); // 중복 안됨 순서도 아무렇게나임 [A, b, c, F, H, Z]

		String[] strobj = { "A", "B", "C", "D", "B", "A" }; // 1000건 (1건씩 중복)
		HashSet<String> hs3 = new HashSet<String>();
		for (int i = 0; i < strobj.length; i++) {
			hs3.add(strobj[i]); // 중복 데이터는 add하지 않는다
		}
		System.out.println("--------------");
		System.out.println(hs3.toString());

		// Quiz
		// HashSet 사용해서 1~45까지의 난수 6개를 넣으세요
//		int[] lotto = new int[6]; // 초기값을 통해서 배열 개수 정의하고 값을 할당

//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = ((int) (Math.random() * 45) + 1); // 1~45까지 난수발생 >> 배열에 담기
//			for (int j = 0; j < i; j++) { // i는 j보다 하나 전 값
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break; // 중복을 찾은 후 불필요하게 다시 앞앞앞앞순번 배열값까지 비교할 필요가 없기떄문에
//							// ****** break;는 어디에 있던간에 속한 for 문을 종료시킨다 ******
//				}
//			}
//		}
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		for(int i=0; lotto.size() < 6; i++) {  //lotto.size() < 6  로 제한!! 중복값이 나오면 배열에 그냥 안넣어버리니까 다 같은값나오면 배열에 한개만 들어감
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
			System.out.println("i : "+ i+" num :"+num);  //중복이 나오면 안넣으니까 사이즈가 그대로임 그러면 사이즈 다 채울때까지 계속 for문 돈다
			
		}
		System.out.println(lotto.toString());  //중복값없는 데이터 출력
		
		
		//HashSet 다형성  >>  부모  >>  Set
	
		Set set2 = new HashSet(); //되도록 이렇게 쓰자 다형성 위해
		int index =0;
		while(set2.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			set2.add(num);  //add 추상함수를 HashSet이라는 클래스가 재정의 하고 있다.
		}
		System.out.println(set2.toString());
		
		
		//HashSet<String> set3 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();  //이렇게 쓰는게 더 좋다
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FF");
		
		System.out.println(set3.toString());
		
		Iterator<String> st = set3.iterator();  //이터레이터 사용
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		
		
	}

}
