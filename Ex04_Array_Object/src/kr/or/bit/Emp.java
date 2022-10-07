package kr.or.bit;

//설계도
public class Emp {
	private int empno;
	private String ename;
	
	//publoc Emp() {}  //기본생성자가 없다는건 무조건 사원이름 번호ㅡㄹ 적어야해 강제로라는뜻
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

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
	
	//기능 출력
	public void empInfoPrint() {
		System.out.println(this.empno + " / " + this.ename);
	}
	
}
