package kr.or.kosa;
/*
 우리회사는 비행기를 주문 제작 판매하는 회사
 우리회사는 비행기를 생산하는 설계도를 만드려고 합니다
 
 요구사항
 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야한다
 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인하는 작업이 필요하다(정보 출력)
 3. 공장장은 현재까지 만들어진 비행기의 총 누적 대수를 확인할 수 있다
 
 AirPlane air101 - new AirPlane();
 air101 이름 > 대한항공
 air101 번호 > 707
 출력 확인..
 ...5대
 관리자가 누적대수를 확인할 수 있어야... 5대 제작되었습니다
 조건)생성자를 사용하지 마시오
 
 */
//class AirPlane {
//	
//	private String name;
//	private int number;
//	private static int airtotalcount; //모든 객체가 공유하는 자워니 됨 static으로
//	
//	public void makeAirPlane(int num, String name1) {
//		number = num;
//		name = name1; 
//		//airtotalcount 누적대수
//		airtotalcount++; //함수가 실행될때마
//		
//		AirDisplay();
//	}
//	private void AirDisplay() {
//		System.out.printf("번호[%d],이름[%s]\n", number, name);
//	}
//	public void airPlaneTotalCount() {
//		System.out.printf("총 비행기 제작 대수 : [%d] \n " , airtotalcount );
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
	private static int airtotalcount; //모든 객체가 공유하는 자워니 됨 static으로
	
//	public AirPlane() {}  //요구사항 : 비행기번호 , 이름 생산시 반드시 부여
	public AirPlane(int airnum, String airname) {
		this.airnum = airnum;
		this.airname = airname;
		
		//airtotalcount 누적대수
		airtotalcount++; //함수가 실행될때마다
		
	}
	
//	public void makeAirPlane(int num, String name1) {
//		number = num;
//		name = name1; 
//		//airtotalcount 누적대수
//		airtotalcount++; //함수가 실행될때마다
//		
//		AirDisplay();
//	}
	
	private void AirDisplay() {
		System.out.printf("번호[%d],이름[%s]\n", this.airnum, this.airname);
	}
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대수 : [%d] \n " , airtotalcount );
	}
}

