import java.io.IOException;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import kr.or.kosa.ExClass;

public class Ex04_Throws {

	public static void main(String[] args) {
		/*
			try {
				ExClass ex = new ExClass("Temp");
			} catch (Exception e) {    모든 예외를 얘가 다 처리하는데 아래는 무슨의미가 있나
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/
		
		/*
			try {
				ExClass ex = new ExClass("Temp");
			} catch (IOException e | NullPointerException e2) {    
				e.printStackTrace();
			} catch (Exception e) {  //상위 예외가 뒤에 나와야 함... 못잡은거 내가다 잡을게
				e.printStackTrace();
			}
		*/
		
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e) {   // | 사용도 가능함
			
			e.printStackTrace();
		}
	}

}
