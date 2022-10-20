package kr.or.kosa;

//�����͸� ���� �� �ִ� Ŭ���� (1��)
//DTO , VO , DOMAIN �̸� (������� �θ��°� �� �ٸ�)
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


	//Object >> toString() �Լ��� �Ϲ������� ������ ���� ���� ��
	//���� ������ ���� �Ⱦ����� �ּҰ��� ����ϴ� �༮�ε�
	
	//toString ������ �ʿ��� ��� �ڵ��Ͻð� ���� �Ϲ������δ� member field ���� ����ϴ� ���·� �����
	@Override
	public String toString() {
		return "Emp [enpno=" + enpno + ", ename=" + ename + "]";
	}

	
	

}
