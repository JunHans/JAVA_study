package pracLife02;

import java.util.Vector;

public class Collection_Prac {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("default 용량: " + v.capacity());  //10
		System.out.println("size : "+ v.size());  //실제 담은용량 = 0
		
		v.add("임준한");
		v.add("임준한");
		v.add("임준한");
		v.add(7777);    //배열 타입이 Object로 기본세팅되어있어서 어떤 타입이든 다 넣을 수 있다
		
		System.out.println(v.capacity());  //10
		System.out.println(v.size());  //4
		System.out.println(v.toString());  //[임준한, 임준한, 임준한, 7777]
		//toString은 Vector에 이미 재정의 되어있음
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));  //v.get(i) 각 배열 객체별 값을 가져옴
		}
		//개선된 for문
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		//여기서 잠깐!! 그런데 나는 지금 배열에 문자열만 넣어 쓸껀데 굳이 가장 큰 타입을 사용할 필요가 있나?
		//제너릭 : 타입을 한가지로 강제함!! <>을 통해!
		Vector<String> v2 = new Vector<String>();
		v2.add("전민정");
		v2.add("전민정");
		v2.add("전민정");
		v2.add("전민정");
		v2.add("전민정");
		System.out.println(v2.toString());
		for(String s : v2) {
			System.out.println(s);
		}
		Vector v3 = new Vector();
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
		//11개가 들어갔지만 저절로 방이 늘어났음
		System.out.println(v3.capacity());
		//용량은 한번에 2배씩 늘어난다!! (너 어차피 또 늘릴거잖아?)
		
		
		
	}

}
