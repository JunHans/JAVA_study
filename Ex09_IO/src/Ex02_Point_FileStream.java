import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
Byte 데이터를 read, write할 것 >> 그 대상이 File 
FileInputStream
FileOutputStream


( 이미지 , 엑셀파일 ) read, write 

File >> 1.txt , data.txt  (데이터를 파일에 기록) 

I/O클래스 예외를 강제 .... try/catch ..

I/O 자원은 개발자가 직접적으로 자원에 해제 (여러 사용자들이 잡근해서 사용가능)
>> close() 소멸자
 */
public class Ex02_Point_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt");
			 /*
			 FileOutputStream
			 1. write 파일이 존재하지 않으면 자동 파일 생성기능 (create)
			 2. FileOutputStream("C:\\Temp\\new.txt", false);
			 	false >> overwrite 기존데이터 덮어버림
			 3. FileOutputStream("C:\\Temp\\new.txt", true);
			 	true >> append
			  */
			int data=0;
			while((data = fs.read()) != -1) {
				//System.out.println("정수 : "+ data + " : "+ (char)data);
				//문자값 (char)data
				//우리가 원하는 것은 read한 데이터를 새로운 File에 write하는 것
				fos.write(data);  //data 값을 내부적으로 read해서 new.txt >> write
 			}
		} catch (Exception e) {
			
		}finally{
			//정상적으로도 비정상적으로 프로그램이 돌아도 실행 / return을 걸어도 실행함
			//자원 해제하는 코드
			//I/O 가비지 콜렉터가 관리하지 않음
			//close() 명시적 >> 소멸자 호출
			try {
				fs.close();
				fos.close();
			} catch (Exception e2) {
				
	 		}
		}
		
		
	}

}
