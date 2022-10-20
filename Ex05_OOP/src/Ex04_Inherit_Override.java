/*
Today Point
[상속관계]에서 override : 상속관계에서 자식이 부모의 함수를 [재정의]
[상속관계]에서 [자식 클래스]가 [부모 클래스]의 메소드(함수)를 재정의 하는것 (내용을 바꿈)
재정의 : 틀의 변화가 없고 (함수의 이름 , 타입)아니고 내용만 변화 {중괄호 안의 것만 수정}

문법)
1. 부모 함수 이름 동일
2. 부모 한수 PARAMETER 동일
3. 부모 함수 RETURN 타입 동일
4. 결국 { 중괄호 안의 실행 블럭 안의 코드만 변경 가능 }
 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x +"/"+this.y;
	}
}

class Point3D extends Point2{
	int z = 6; //x,y는 부모한테 이미 있음 난 z만 하면 대
	
	
	//String get3D...(){}  새로운 함수 추가해도 문제는 안됨
	//추가 ... 함수ㅡ....
	//Annotation은 Java code만으로 전달할 수 없는 부가적인 정보를 컴파일러나 개발툴로 전달할 수 있다
	//@Override 컴파일러나 개발툴에게 지금 이 함수가 재정의 되었는지 검증 해봐
	
	//Spring 은 70%가 annotation
	
	@Override  //이게 annotation
	String getPosition() {
		return this.x +"/"+ this.y +"/"+ this.z;   //이것이 버로 오버라이드 이름이 같고 내용만 바꿈 <(재정의)>
	}
}


public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());  //재정의 된 함수가 호출 됩니다
		
		
		

	}

}
