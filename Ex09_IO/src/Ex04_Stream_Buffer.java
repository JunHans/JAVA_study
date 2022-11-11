import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
File 처리(DISK) : 입력 출력은 Byte단위 (한 바이트) read, write

여러학생을 모아서 하나의 버스에 태워서 목적지 ... 놀면
버스 : buffer
1. I/O 선응 개선 (접근횟수 줄인다 , 한번에 해버리니까)
2. Line단위 (엔터) 바이트 단위가 아니라

BufferedInputStream (보조 스트림) >> 주 클래스에 의존한다 (FileInputStream , FileOutputStream)
 */


public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //파일없으면 자동생성
			bos = new BufferedOutputStream(fos);  //FileOutputStream가 버퍼 사용
			 
			for(int i=0; i<10; i++) {
				bos.write('A'); //data.txt 파일 비어있음 -> 아직 다 안차서 비어있음
			}
			bos.flush();  //이렇게 해야 data.txt에 비로소 내용이 생긴다
		
			
			
			/*
			JAVA Buffer 크기 (8kbyte : 8192byte)
			1. buffer 안에 내용이 다 채워지면 스스로 출발 (버퍼를 스스로 비우는 작업)
			2. 강제로 출발 (buffer 강제로 비우기) : flush() or close() 
			3. close(): 자원해제 >> 내부적으로 flush() 먼저 실행(호출) >> 자원해제
			
			 */
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bos.close();
				fos.close();  //내부적으로 flush() 효과를 갖는다 (포함)
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
