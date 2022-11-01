import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<K, V>

HashMap<String, String>
HashMap<Integer, String>
HashMap<String, Student>  :POINT:

>>put("kim", new Student());

Student st = new Student();
>>put("kim", st);

class Student{} 클래스 == 데이터 타입

 */
class Student {
	int kor;
	int math;
	int eng;
	String name;

	public Student(int kor, int math, int eng, String name) { // 마우스로 간단히~
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

class ArrayTest{
	//주의사항
	//Generic 타입으로 배열 가능
	ArrayList<String[]> al = new ArrayList<String[]>();
	
	
}



public class Ex15_Map_Generic {
	public static void main(String[] args) {

		HashMap<String, String> sts = new HashMap<String, String>(); // 키와 밸류의 타입 지정
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));

		// Map의 실무적 코드
		// 학생들의 성적 데이터
		// kim , [ 국어 , 영어, 수학 ] >> Array , Collection(ArrayList)
		// value값으로 객체 타입 많이 온다(Emp , Student class)

		// Map<String, Student> smap = new HashMap<String, Student>();


		//Today Point -- 타입으로 객체가 올 수 있다!
		HashMap<String, Student> smap = new HashMap<String, Student>();
		smap.put("hong", new Student(100, 80, 50, "홍길똥"));
		smap.put("kim", new Student(50, 30, 60, "김유신"));

		Student sd = smap.get("hong");
		System.out.println(sd.kor);
		System.out.println(sd.math);

		//...
		ArrayTest at = new ArrayTest();
		String[] strarr = {"A", "B", "C"};
		at.al.add(strarr);
		
		//Tip 1번 -- 문자열로 가공된 값을 볼 수 있다
		Set set = smap.entrySet();  // Map key, value 가공 >> key+ "=" +value
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//hong=Student@515f550a
		//kim=Student@626b2d4a

		//Tip 2번 -- key, value 분리되서 결과를 보고 싶어요
		// class Entry{Object key, Object value}
		// Map {Entry[] elements } >> Map.Entry
		for(Map.Entry m : smap.entrySet()) {
			System.out.println(m.getKey()+ "/" + ((Student)m.getValue()).name);  //다운캐스팅
		}
		
		
			
		
		
		
		
		
	}

}
