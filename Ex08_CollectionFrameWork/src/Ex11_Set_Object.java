import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	
	public Myclass() {}  //디폴트 컨스트럭터

	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Myclass [학번=" + id + ", 이름=" + name + "]";
	}
	
}



public class Ex11_Set_Object {

	public static void main(String[] args) {
		
		HashSet<Myclass> hset = new HashSet<Myclass>();
		
		Myclass mc1 = new Myclass(1, "Abc");
		Myclass mc2 = new Myclass(2, "Def");
		Myclass mc3 = new Myclass(3, "Asdf");
		
		Myclass mc4 = new Myclass(1, "Abc");
		
		hset.add(mc1);
		hset.add(mc1);  //주소값이 같기 때문에 안들어감
		hset.add(mc2);
		hset.add(mc3);
		hset.add(mc4);  //데이터가 같아도 주소값이 다르면 들어감
		
		
		System.out.println(hset.toString());
		
		//개선된 for문으로 출력해보자
		for(Myclass m : hset){
			System.out.println(m.toString());
		}
		
		System.out.println("---------------------------------");
		
		//이터레이터로 출력해보자
		Iterator<Myclass> itr = hset.iterator();
		while(itr.hasNext()) {
			Myclass mc= itr.next();
			System.out.println(mc.getId() + "/" + mc.getName());
		}

	}

}
