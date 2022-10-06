package kr.or.kosa;

public class Emp {

	//member field (instance variable)
	private int empno;
	private String ename;
	private String jop;
	private int sal;
	
	
	//setter, getter ,,ethod (read, write) 기능
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJop() {
		return jop;
	}
	public void setJop(String jop) {
		this.jop = jop;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	//method (기능)
	public void empDataPrint() {
		System.out.println("사원데이터 출력");
		//method (main함수)
		//함수안에 있는 변수는 지역변수,, 접근자을 붙이지 않아요(처음 하시느느분)
		//클래스 식구만 앞에 붙인다
		int data =0;
		int input =0;
		//for(int i .)
	}
	

	

}
