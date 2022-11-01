import java.util.ArrayList;

	//연습용이니까 ...
	class EmpData{
		private String name;  //default >> null
		private int[] numbers; // default >> null
		private ArrayList elist; // default >> null
		
		//초기화
		public EmpData() {
			this.name = "아무개";
			//사용자가 만든 타입 ,Array,ArrayList >> 초기화 > 메모리 (new) 
			this.numbers = new int[10];
			this.elist = new ArrayList();
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		//int[] numbers  getter , setter 만들어 보세요 (주소값을***(같은 타입의)
		public int[] getNumbers() {
			return this.numbers;
		}
		public void setNumbers(int[] numbers) {
			this.numbers = numbers;
		}
		//ArrayList elist  getter , setter
		
		//public List getElist() {
		public ArrayList getElist() {
			return this.elist;
		}
		public void setElist(ArrayList elist) {
			this.elist = elist;
		}
		
	}


	public class Ex04_ArrayList {

		public static void main(String[] args) {
			EmpData empdata = new EmpData();
			System.out.println(empdata.toString()); //EmpData@626b2d4a
			System.out.println(empdata.getElist().toString());//재정의 >> []
			
			ArrayList li = new ArrayList();
			li.add(100);
			li.add(200);
			
			empdata.setElist(li);
			System.out.println(empdata.getElist().toString()); //[100, 200]
			
			ArrayList<String> slist = new ArrayList<String>();
			slist.add("superman");
			slist.add("Hulk");
			slist.add("Captain");
			System.out.println(slist.toString()); //[superman, Hulk, Captain]
			
			ArrayList<Integer> intList = new ArrayList<Integer>(20);
			System.out.println(intList.size());  //0
			System.out.println(intList.add(100)); //true 정상적으로 처리 되었어
			System.out.println(intList.size());  //1
			
		}

	}