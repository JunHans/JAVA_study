package pracLife01;

public class Rect1 {
	public String name; // 직사각형, 정사각형 등
	public int w, h; // 사각형의 가로길이, 사각형의 세로길이
//	public int h; // 사각형의 세로길이
	public int result;

	public void square_Info() {
		System.out.printf("사각형 이름: [%s], 가로길이: [%d], 세로길이: [%d]", name, w, h);
		System.out.println();
	}

	public int square_Area() {  //사각형의 넓이

		int result = w * h;  //리턴이 보내줄 result의 값

		return result;  //리텁값에 result의 값 할당
	}

	
	
//	public void square_Area() {  //사각형의 넓이
//		if(h>w & h>0 & w>0) {  //if문으로 입력값이 0미만으로 내려가지 않게
//			result = h*w;      //result의 값 설정
//			System.out.printf("[%s]의 넓이: [%d]",name, result);
//			System.out.println();
//		}else if(h<w & h>=0 & w>=0) {   //if와 if else
//			result= h*w;
//			System.out.printf("[%s]의 넓이: [%d]",name, result);
//			System.out.println();
//		}
//	}
}
