package kr.or.kosa;
/*
 �츮ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ��
 �츮ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�
 
 �䱸����
 1. ����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ��Ѵ�
 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ���ϴ� �۾��� �ʿ��ϴ�(���� ���)
 3. �������� ������� ������� ������� �� ���� ����� Ȯ���� �� �ִ�
 
 AirPlane air101 - new AirPlane();
 air101 �̸� > �����װ�
 air101 ��ȣ > 707
 ��� Ȯ��..
 ...5��
 �����ڰ� ��������� Ȯ���� �� �־��... 5�� ���۵Ǿ����ϴ�
 ����)�����ڸ� ������� ���ÿ�
 
 */
//class AirPlane {
//	
//	private String name;
//	private int number;
//	private static int airtotalcount; //��� ��ü�� �����ϴ� �ڿ��� �� static����
//	
//	public void makeAirPlane(int num, String name1) {
//		number = num;
//		name = name1; 
//		//airtotalcount �������
//		airtotalcount++; //�Լ��� ����ɶ���
//		
//		AirDisplay();
//	}
//	private void AirDisplay() {
//		System.out.printf("��ȣ[%d],�̸�[%s]\n", number, name);
//	}
//	public void airPlaneTotalCount() {
//		System.out.printf("�� ����� ���� ��� : [%d] \n " , airtotalcount );
//	}
	
//	private String name = 0;
//	private int number = 0;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(int data) {  
//		name = data;   
//	}
//	public int getNumber() {
//		return number;
//	}

class AirPlane {
	
	private String airname;
	private int airnum;
	private static int airtotalcount; //��� ��ü�� �����ϴ� �ڿ��� �� static����
	
//	public AirPlane() {}  //�䱸���� : ������ȣ , �̸� ����� �ݵ�� �ο�
	public AirPlane(int airnum, String airname) {
		this.airnum = airnum;
		this.airname = airname;
		
		//airtotalcount �������
		airtotalcount++; //�Լ��� ����ɶ�����
		
	}
	
//	public void makeAirPlane(int num, String name1) {
//		number = num;
//		name = name1; 
//		//airtotalcount �������
//		airtotalcount++; //�Լ��� ����ɶ�����
//		
//		AirDisplay();
//	}
	
	private void AirDisplay() {
		System.out.printf("��ȣ[%d],�̸�[%s]\n", this.airnum, this.airname);
	}
	public void airPlaneTotalCount() {
		System.out.printf("�� ����� ���� ��� : [%d] \n " , airtotalcount );
	}
}

