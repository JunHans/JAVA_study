import java.io.FileReader;
import java.io.FileWriter;

/*
문자기반의 데이터 처리 (char[])
String 클래스 : String str = "ABC"; : 내부적으로 char[] 로 저장  >> [A] [B] [C]

한글 1자, 영문 1자 >> 2Byte >> Reader, writer (추상클래스)

대상이 File 이라면
FileReader
FileWriter

 */
public class Ex05_Reader_Writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("Copy_Ex01.txt"); //파일생성 >> 파일에 같은 내용 하나 만들겠다 - 복사본
			
			int data = 0;
			while((data = fr.read()) != -1) {
				//System.out.println(data);
 				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {  //압축버전 = compress 버전 (현업에서도 압축후 배포)
 					fw.write(data);
 					// 엔터 & 탭 & 빈문자 값을 파일에 쓰지 않겠다
 					//압축파일 버전
 					//(https://jquery.com/download/)실사례 jQuery 다운로드
				}
				
			}
		} catch (Exception e) {
			
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
