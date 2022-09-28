package pracLife01;

public class Rect1_1 {

	public static void main(String[] args) {
		System.out.println("~<사각형 넓이 구하기>~");
		
		Rect1 rect = new Rect1();
		
		rect.name = "길쭉5이";
		rect.w = 10;
		rect.h = 19;
		
		rect.square_Info();
		
		System.out.printf("사각형의 넓이: [%d]" , rect.square_Area());
		//return 값을 가져온다
		
//		rect.square_Area();

	}

}
