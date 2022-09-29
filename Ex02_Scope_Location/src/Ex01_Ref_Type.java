import kr.or.kosa.common.Person;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		//kr.or.kosa 안에 있는 Person이라는 설계도를 가지고 구체화 시킬 거야
		//메모리에 올려서 사람을 만들거야
		
		Person man = new Person();
		System.out.println(man.name); //null
		System.out.println(man.age); //0
		System.out.println(man.power); //false
		
		Person man2 = new Person();
		man2.name = "아무개";
		man2.age = 100;
		man2.power = true;
		man2.personPrint();

	}

}
