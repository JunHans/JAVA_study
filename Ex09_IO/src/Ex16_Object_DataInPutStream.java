import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.transform.Source;

import kr.or.kosa.UserInfo;

//UserData.txt 직렬화된 객체 2개 
//이 객체들을 read 해서 원상태로 복원(역직렬화)
public class Ex16_Object_DataInPutStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream("UserData.txt");
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);  //한 줄의 코드가 [ 역직렬화 ] 해준다
			
			//복원
			/*
			UserInfo r1 = (UserInfo)in.readObject();
			UserInfo r2 = (UserInfo)in.readObject();
			System.out.println(r1.toString());  //여자친구가 재조립했다
			System.out.println(r2.toString());  //여자친구가 재조립했다
			*/
			Object users = null;
			while((users = in.readObject()) != null) {
				System.out.println(((UserInfo)users).toString());
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		} catch (EOFException e) {
			System.out.println("끝"+ e.getMessage());
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("해당객체가 존재하지 않습니다");
		}catch (Exception e) {  //위의 예외 이외 나머지 예외는 얘가 잡음 최상위클래스라
			System.out.println("나머지 예외");
		}finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
