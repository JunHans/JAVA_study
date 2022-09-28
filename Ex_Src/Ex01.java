import kr.or.kosa.Emp; //저기에 있는 Emp를 쓸거야 명시

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		//Emp 설게도를 구체화 (객체를 만들거야)
		Emp emp = new Emp();
		emp.setEmpno(8888);
		int empno = emp.getEmpno();
		System.out.println(empno);
		
		emp.number = -100;
		System.out.println(emp.number);
		emp.setEmpno(-9999);
		System.out.println(emp.number);
	}

}
