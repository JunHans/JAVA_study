package pracLife01;

public class Rect1_1 {

	public static void main(String[] args) {
		System.out.println("~<�簢�� ���� ���ϱ�>~");
		
		Rect1 rect = new Rect1();
		
		rect.name = "����5��";
		rect.w = 10;
		rect.h = 19;
		
		rect.square_Info();
		
		System.out.printf("�簢���� ����: [%d]" , rect.square_Area());
		//return ���� �����´�
		
//		rect.square_Area();

	}

}
