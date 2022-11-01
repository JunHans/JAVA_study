import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {
	public static void main(String[] args) {
		//Set 인터페이스 : 순서보장x , 중복x
		
		
		//TreeSet
		//순서x , 중복데이터x  + 정렬 기능O !
		//검색하거나 정렬을 필요로 하는 자료구조(데이터 집합)에 사용됨
		//예 ) 로또 - 중복데이터 허락하지 않음  ...  출력때 정렬(낮은 값부터) 
		
		//특징
		//1. 이진 트리 구조 (나무 뽑아서 거꾸로 들고 보세요) : root > leaf 
		//2. 데이터를 저장할때 정렬해서 사용할 수 있다
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		
		System.out.println(hs.toString());  //정렬기능은 없음
		//[P, A, B, D, F, G, K]
		
		System.out.println("------------------------------------------");
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0 ; lotto.size() < 6 ; i++) {
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);
			System.out.println("num : " + num);
		}
		
		System.out.println(lotto.toString());
		//[14, 19, 20, 22, 25, 39]
		
		//Ex02 ~ Ex05까지는 무조건 다해야 밥값한다 비전공자는 이것만이라도 
		//비전공자는 다른거 필요없고 ArrayList 와 HashMap을 손에서 가지고 놀수 있어야한다
		
		
	}

}
