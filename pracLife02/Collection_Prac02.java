package pracLife02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Prac02 {
	public static void main(String[] args) {
		//Arraylist : List인터페이스 구현 
		
		ArrayList arr = new ArrayList();
		//Object 타입
		arr.add("뚜뚜미");
		arr.add("뚜뚜미");
		arr.add("뚜뚜미");
		arr.add("뚜뚜미");
		arr.add("뚜뚜미");
		arr.add("뚜뚜미");
		
		System.out.println(arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println(arr.toString());
		
		//add함수는 순차적으로 데이터가 들어가고, 
		//자리이동 시키는 함수가 있다
		arr.add(0,222); //0번째 인덱스에 222넣는다
		System.out.println(arr.toString());
		arr.add(4, "둥둥미");
		System.out.println(arr.toString());

		//해당 인덱스 삭제
		arr.remove(0);
		System.out.println(arr.toString());
		
		//arr이란 배열에 200이 들어있니???
		System.out.println(arr.contains(200));  // =False
		System.out.println(arr.contains("뚜뚜미")); //= True
		
		//데이터 전부 삭제 - 공간은 남아있다
		arr.clear();
		System.out.println(arr.toString()); 
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());  //arr이 비어있니?? = True
		
		arr.add("dduddu1");
		arr.add("dduddu2");
		arr.add("dduddu3");
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		Object value = arr.remove(0); //dduddu1 삭제! 그리고 자리바꿔짐
		System.out.println(arr.toString());
		
		//POINT
		//인터페이스 부모 타입
		//개발자 습관적으로 .. 다형성 (확장성 , 유연성)
		List li = new ArrayList();
		//List를 부모로 가지고 있는 모든 것을 받을 수 있다  //List는 인터페이스
		
		//ArrayList li = new ArrayList();  
		//이렇게 코드 치면 ArrayList만 받는다
		
		li.add("dlawnsgks1");
		li.add("dlawnsgks2");
		li.add("dlawnsgks3");
		li.add("dlawnsgks4");
		System.out.println(li.toString());
		
		List li2 = li.subList(0, 2); //subList 함수는 내부적으로 new ArrayList() 생성***   (이해해야)
		System.out.println(li2.toString()); 
		//(list).subList(시작 인덱스, 종료 인덱스 (전) 까지)
		//리스트 잘라냄!
		
		List alist = new ArrayList();		
		alist.add(14);
		alist.add(12);
		alist.add(11);
		alist.add(13);
		
		System.out.println(alist.toString());
		Collections.sort(alist);  // 자동으로 작은수부터 정렬
		System.out.println(alist.toString()); 
		
		//높은수부터 정렬은????
		Collections.reverse(alist);  //자동으로 높은 수부터 정렬!!
		System.out.println(alist.toString());
		
		
	}

}
