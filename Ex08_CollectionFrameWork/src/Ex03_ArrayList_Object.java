import java.util.ArrayList;

import javax.xml.transform.Source;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		// 1. 사원한명 만드세요
		Emp emp = new Emp(1000, "김유신", "장군");
		System.out.println(emp.toString());

		// 2. 사원 두명 만드세요
		Emp[] emplist = { new Emp(100, "김", "영업"), new Emp(200, "박씨", "IT") }; //new가 있다고 해서 EMP 객체가 들어간게 아니라 EMP의 주소값이 들어가는 것 유의
		for (Emp e : emplist) {
			System.out.println(e.toString());
			System.out.println();
		}

		// 사원이 한명 더 입사했다 (300, "이씨", "IT")
		// 방 3개짜리 배열 생성 -> 이사... (이렇게 하기 싫어요ㅠ)

		// ArrayList
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100, "김씨", "영업"));
		elist.add(new Emp(200, "박씨", "IT"));
		elist.add(new Emp(300, "이씨", "IT"));

		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i).toString());
//			Emp e = (Emp)elist.get(i);
//			e.toString();
		}
		System.out.println();

		// 또 추가!
		elist.add(new Emp(400, "최씨", "관리"));

		// toString 쓰지말고 4명 사원의 사번, 이름, 직종을 출력하세요
		// Hint) for 문 안에서 getEmpno , getEname(), getJob()
		for (int i = 0; i < elist.size(); i++) {
//			System.out.println(elist.get(i));  //toString은 생략되어 있어서 이래도 나옴

			Object obj = elist.get(i);
//			obj.toString();
//			Object는 모든 타입의 부모타입 (다운 캐스팅)
			Emp e = (Emp) obj;
			System.out.println(e.getEmpno() + "." + e.getEname() + "." + e.getJob());
		}
		  
		//현업개발자 ... (Object 타입) ... 다운캐스팅 .. 자식요소 접근  ->  짜증남 매번 다운해주기
		//Object 쓰지말자 .... 대안 
		//타입을 강제 (그 타입 쓰게 하자)  하나의 타입만을 가지고 데이터를 관리하자
		//제너릭 (d객체 생성시 타입을 강제하는 방법)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
//		list2.add(emp);
		list2.add(new Emp(1,"A", "IT"));
		list2.add(new Emp(1,"A", "IT"));
		
		for(Emp e : list2) {
			System.out.println(e.getEmpno());
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).toString());
		}
		
	}

}
