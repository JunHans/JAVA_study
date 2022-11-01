import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product { // 부모
	int price;
	int bonusPoint;

	// public Product() {}
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product {
	KtTv() {
		super(500);
	}
	// KtTv(int price){
	// super(price);
	// }

	// 이름
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}
	// KtTv(int price){
	// super(price);
	// }

	// 이름
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(150);
	}
	// KtTv(int price){
	// super(price);
	// }

	// 이름
	@Override
	public String toString() {
		return "NoteBook";
	}
}

public class Ex08_Generic_Quiz {
	public static void main(String[] args) {

		// 1. Array 사용해서 tv, audio, notebook 담을 수 잇는 cart배열을 생성하고 제품을 담으세요.

		Product[] cart = { new KtTv(), new Audio(), new NoteBook() };

		for (Product a : cart) {
			System.out.println(a);
		}

		System.out.println("---------------------------------------------");

		// 2. ArryList Generic 사용해서 cart배열을 만들고 제품을 담으세요.
		// ArrayList<Product> cart1 = new ArrayList<Product>();
		List<Product> cart1 = new ArrayList<Product>();
		cart1.add(new KtTv());
		cart1.add(new Audio());
		cart1.add(new NoteBook());

		for (Product a : cart1) {
			System.out.println(a);
		}
		// 3. Emp 클래스 (kr.or.kosa)
		// ArrayList Generic 사용해서 사원 3명을 만드세요.
		List<Emp> ep = new ArrayList<Emp>();
		ep.add(new Emp(1111, "임준한", "IT"));
		ep.add(new Emp(2222, "임준둘", "서비스"));
		ep.add(new Emp(3333, "임준셋", "공장장"));

		// 3.1 사원 정보를 toStirng() 사용하지 않고 사번, 이름 , 직종을 출력하세요(개선된 for문 사용)
		for (Emp e : ep) {
			System.out.println(e); // 이렇게 말고...
		}

		for (Emp e1 : ep) {
			System.out.println(e1.getEmpno() + "/" + e1.getEname() + "/" + e1.getJob());
		}

		System.out.println("---------------------------------");

		// 3.2 위와 동일한데 일반 for문으로 사용해서 출력
		for (int i = 0; i < ep.size(); i++) {
			System.out.println(ep.get(i).getEmpno() + "/" + ep.get(i).getEname() + "/" + ep.get(i).getJob());
		}
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "김씨", 1000));
		clist.add(new CopyEmp(200, "이씨", 2000));
		clist.add(new CopyEmp(300, "박씨", 3000));

		// 1. 200사원의 급여를 6000으로 수정 - 일반 for문을 사용해서 getter, setter 사용
		for (int i = 0; i < clist.size(); i++) {
			if (clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(6000);
				System.out.println(clist.get(i).toString());
			}
		}

		// 2. 300번 사원의 이름을 박씨에서 "궁굼해씨" 수정후 그결과 출력 - 개선된for문으로

		for(CopyEmp emp : clist) {
			if(emp.getEmpno() == 300) {
				emp.setEname("궁굼해씨");
				System.out.println(emp.toString());
			}
		}
	}

}
