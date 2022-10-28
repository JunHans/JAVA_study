import java.io.IOException;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import kr.or.kosa.ExClass;

public class Ex04_Throws {

	public static void main(String[] args) {
		/*
			try {
				ExClass ex = new ExClass("Temp");
			} catch (Exception e) {    ��� ���ܸ� �갡 �� ó���ϴµ� �Ʒ��� �����ǹ̰� �ֳ�
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
			} catch (Exception e) {  //���� ���ܰ� �ڿ� ���;� ��... �������� ������ ������
				e.printStackTrace();
			}
		*/
		
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e) {   // | ��뵵 ������
			
			e.printStackTrace();
		}
	}

}
