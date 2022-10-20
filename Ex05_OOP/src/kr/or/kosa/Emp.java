package kr.or.kosa;

//데이터를 담을 수 있는 클래스 (1건)
//DTO , VO , DOMAIN 이름 (사람마다 부르는게 좀 다름)
public class Emp {  //extends Object
	private int enpno;
	private String ename;
	
	public Emp(int enpno, String ename) {
		this.enpno = enpno;
		this.ename = ename;
	}

	public int getEnpno() {
		return enpno;
	}

	public void setEnpno(int enpno) {
		this.enpno = enpno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}


	//Object >> toString() 함수는 일반적으로 재정의 가장 많이 함
	//만약 재정의 하지 안않으면 주소값을 출력하는 녀석인데
	
	//toString 재정의 필요한 대로 코딩하시고 보통 일반적으로는 member field 정보 출력하는 형태로 사용함
	@Override
	public String toString() {
		return "Emp [enpno=" + enpno + ", ename=" + ename + "]";
	}

	
	

}
