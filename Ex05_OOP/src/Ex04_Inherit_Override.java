/*
Today Point
[��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������]
[��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ� Ŭ����]�� �޼ҵ�(�Լ�)�� ������ �ϴ°� (������ �ٲ�)
������ : Ʋ�� ��ȭ�� ���� (�Լ��� �̸� , Ÿ��)�ƴϰ� ���븸 ��ȭ {�߰�ȣ ���� �͸� ����}

����)
1. �θ� �Լ� �̸� ����
2. �θ� �Ѽ� PARAMETER ����
3. �θ� �Լ� RETURN Ÿ�� ����
4. �ᱹ { �߰�ȣ ���� ���� �� ���� �ڵ常 ���� ���� }
 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x +"/"+this.y;
	}
}

class Point3D extends Point2{
	int z = 6; //x,y�� �θ����� �̹� ���� �� z�� �ϸ� ��
	
	
	//String get3D...(){}  ���ο� �Լ� �߰��ص� ������ �ȵ�
	//�߰� ... �Լ���....
	//Annotation�� Java code������ ������ �� ���� �ΰ����� ������ �����Ϸ��� �������� ������ �� �ִ�
	//@Override �����Ϸ��� ���������� ���� �� �Լ��� ������ �Ǿ����� ���� �غ�
	
	//Spring �� 70%�� annotation
	
	@Override  //�̰� annotation
	String getPosition() {
		return this.x +"/"+ this.y +"/"+ this.z;   //�̰��� ���� �������̵� �̸��� ���� ���븸 �ٲ� <(������)>
	}
}


public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());  //������ �� �Լ��� ȣ�� �˴ϴ�
		
		
		

	}

}
