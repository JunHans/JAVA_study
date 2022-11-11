import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
IO

Stream (데이터 통로)
데이터 종류: 이미지,파일 (바이너리) <> 문자 

JAVA API
[Byte] 단위의 데이터가 IO

추상클래스
InputStream , OutputStream (재정의 원하는 추상함수)

당신이 Byte 데이터 작업을 할 떄 
[입력하고 싶으면 InputStream] 상속받는 클래스 사용하세요 : 대상

대상
1. Memory : ByteArrayOutputStream
2. File : FileInputStream ^^

당신이 Byte 데이터 작업을 할 떄 
[출력하고 싶으면 InputStream] 상속받는 클래스 사용하세요 : 대상

대상
1. Memory : ByteArrayOutputStream
2. File : FileOutputStream ^^
 */
public class Ex01_Stream {
	public static void main(String[] args) {
		//byte (-128 ~ +127) 정수 저장 타입
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc= null;  //현재 메모리 갖고있지 않음 
		
		//데이터를 read하고 ,write하는 대상 memory
		ByteArrayInputStream input = null;  //빨대 (통로) 입력
		ByteArrayOutputStream output = null;  //빨대 (통로) 출력
		
		input = new ByteArrayInputStream(inSrc); // (대상) inSrc라는 대상으로부터 데이터를 read하겠다
		output = new ByteArrayOutputStream();  //write
		
		System.out.println("outSrc before : "+ Arrays.toString(outSrc));
		
		//공식같은 로직 (암기하면 좋아요)
		int data =0;
		while((data = input.read())!= -1) {  //더 이상 read할 데이터가 없으면 -1
			//System.out.println("data : "+ data);
			//System.out.println("input.read : "+ input.read());
			//read() 함수는 내부적으로 next() 포함하고 있음 , 그래서 위에서 한번 읽고 넥스트 걸려서 밑에서는 1으 읽게됨
			//why: 1,3,5,7,9 출력?
			
			//read한 데이터를 write 
			output.write(data); //출력통로 (빨대 )안에 데이터를 갖고 있는 것 
			//write 대상이 data가 아니고 , ByteArrayOutputStream 자신의 통로에 data를 가지고 있는 것 (data를 읽어서 자기한테 저장)
		}	
		
		outSrc =output.toByteArray();  //Byte배열로 값을 전환해서 outSrc에 할당 ... (주소값)
		System.out.println("outSrc after : "+ Arrays.toString(outSrc));
		
	}

}
