import java.awt.dnd.Autoscroll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//벡터는 동기화 보장(한강화장실) -(장점: 자원에대한 보호)
//어레이리스트는 동기화보장할수도있고 안할수있다(한강 비빔밥 축제) -(장점: 데이터를 순차적으로 넣을 수 있다)(단점: 중간의 데이터추가삭제되면 전체가 바뀐다(한칸씩 뒤로, 앞으로 등등))
                                                                                //이런 단점보완 위해 -> LinkedList 생김


//Allday Point

public class Ex02_ArrayList {
	public static void main(String[] args) {
		//ArrayList : List 인터페이스를 구현 (순서보장, 중복 허용)

		ArrayList arraylist = new ArrayList();
		//Object 타입으로
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		
		for(int i=0; i< arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
			System.out.println(arraylist.toString());
		
			//add 함수는 순차적으로 데이터 넣기
			arraylist.add(0, 222);  // **자리이동**
			System.out.println(arraylist.toString());
			arraylist.add(4,444);
			System.out.println(arraylist.toString());
			
			//비순차적인 데이터 추가, 삭제 >> ArrayList 적합하지 않아요 >> 순서가 있는 데이터 집합이 좋아요
			//**순차적인 데이터의 추가, 삭제 용도로 사용하면 아주좋아요 ^^
			
			//arraylist.remove(111);
			//System.out.println(arraylist.toString());
			
			//[111, 100, 200, 300, 444]
			//ArrrayList 함수 공부
			System.out.println(arraylist.contains(200));
			System.out.println(arraylist.contains(2000));
			
			arraylist.clear();  //데이터 삭제 (공간은 남아있어요)
			System.out.println(arraylist.size());  //0
			System.out.println(arraylist.isEmpty());  // true
			
			arraylist.add(101);
			arraylist.add(102);
			arraylist.add(103);
			System.out.println(arraylist.isEmpty());
			System.out.println(arraylist.size());
			Object value = arraylist.remove(0);  //101 삭제 ...자리바꿔짐
			System.out.println(arraylist.toString()); //[102][103]
			
			//POINT
			//인터페이스 부모 타입
			//개발자 습관적으로 .. 다형성 (확장성 , 유연성)
			List li = new ArrayList();  //습관적으로 부모타입을 사용해서다형성이란 것을 익히자   //List를 부모로 가지고 있는 모든 것을 받을 수 있다  //List는 인터페이스
			//ArrayList li = new ArrayList();  ArrayList만 받는다
			li.add("가");
			li.add("나");
			li.add("다");
			li.add("라");
			
			List li2 = li.subList(0, 2);  //subList 함수는 내부적으로 new ArrayList() 생성***   (이해해야)
			System.out.println(li2.toString());
			
			ArrayList alist = new ArrayList();
			alist.add(50);
			alist.add(1);
			alist.add(7);
			alist.add(40);
			alist.add(46);
			alist.add(3);
			alist.add(15);
			
			System.out.println(alist.toString());
			Collections.sort(alist);  //내부적으로 정렬  >> 초급개발자가 프로젝트시 이런코드 쓰면 감점...
			System.out.println(alist.toString());  //[1, 3, 7, 15, 40, 46, 50] 낮은값 순
			//높은값 순으로 정렬은?
			//함수
			Collections.reverse(alist);
			System.out.println(alist.toString());  //[50, 46, 40, 15, 7, 3, 1] 높은값 순
	}

}
