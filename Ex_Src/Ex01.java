import kr.or.kosa.Emp; //���⿡ �ִ� Emp�� ���ž� ���

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		//Emp ���Ե��� ��üȭ (��ü�� ����ž�)
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
