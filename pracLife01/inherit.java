package pracLife01;

class Clothe {
	String color = "입을 수 있다";

	void wear() {
		System.out.println("입다");
	}
}

class Kind {
	String a;
	String b;

	public Kind() {
		// this.a = "입는다";
		// this.b ="타입";
		this("종류"); // 초기화는 생성자 호출해서 여기서 한다
	}

	public Kind(String a) {
		this.a = a;
		this.b = b;
	}
}

//상의
class Top extends Clothe {
	Kind[] kindarray; // 포함 되는것 설정

	public Top() {
		this(new Kind[] { new Kind("반팔"), new Kind("긴팔"), new Kind("자켓") });
	}

	public Top(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	// 출력
	void topClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("Top :(%s)", kind.a);
		}
	}
}

//하의
class Bottom extends Clothe {
	Kind[] kindarray; // 포함 되는것 설정

	public Bottom() {
		this(new Kind[] { new Kind("반바지"), new Kind("긴바지"), new Kind("7부바지") });
	}

	public Bottom(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	void BottomClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("Bottom :(%s)", kind.a);
		}
	}
}

//신발
class shose extends Clothe {
	Kind[] kindarray; // 포함 되는것 설정

	public shose() {
		this(new Kind[] { new Kind("운동화"), new Kind("샌들"), new Kind("구두") });
	}

	public shose(Kind[] kindarray) {
		this.kindarray = kindarray;
	}

	void shoseClothe() {
		for (Kind kind : this.kindarray) {
			System.out.printf("shose :(%s)", kind.a);
		}
	}
}

public class inherit {

	public static void main(String[] args) {

		
		
		Kind[] kindarray = new Kind[] { new Kind("반팔"), new Kind("긴팔"), new Kind("자켓") };
		Top top = new Top(kindarray);
		top.topClothe();
		System.out.println();
		
		Kind[] kindarray1 = new Kind[] { new Kind("반바지"), new Kind("긴바지"), new Kind("7부바지") };
		Bottom bottom = new Bottom(kindarray);
		bottom.BottomClothe();
		System.out.println();
		
		Kind[] kindarray2 = new Kind[] { new Kind("운동화"), new Kind("샌들"), new Kind("구두") };
		shose sh = new shose(kindarray);
		sh.shoseClothe();
	}

}
