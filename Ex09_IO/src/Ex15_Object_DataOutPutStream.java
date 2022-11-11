import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_Object_DataOutPutStream {
	public static void main(String[] args) {
		String filename ="UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;  //객체 통신
		
		/*
		FileOutputStream(filename,true);
		첫번째 파라미터로, 생성할 파일의 이름 문자열, File 객체, FileDescriptor 객체를 전달합니다.
		만약, append 값을 true이면,
		기존 파일이 있을 경우, 기존 파일을 열어서 그 파일에 내용을 이어붙입니다.
		그러나, append 값이 false인 경우, 기존 파일을 덮어쓰기 되므로 주의해야 합니다.
		두번째 파라미터(append)를 입력하지 않을 경우, 기본값은 false입니다.
		 */
		try {
			fos = new FileOutputStream(filename,true);
			bos = new BufferedOutputStream(fos);
			//직렬화
			out = new ObjectOutputStream(bos);  //여태까지와 다른 부분
			
			UserInfo u1 = new UserInfo("홍길동", "super", 500);
			UserInfo u2 = new UserInfo("scott", "tiger", 50);
			
			out.writeObject(u1);
			out.writeObject(u2);
			//파일에 UserInfo 객체 2개 직렬화 write
			//조사놓음
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
				System.out.println("파일생성 -> buffer -> 직렬화 -> 파일 write");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
