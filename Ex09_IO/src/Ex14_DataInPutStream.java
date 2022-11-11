import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInPutStream {
	public static void main(String[] args) {
		//File에 학생점수 기록
		//read 합계, 평균
		//DataOutputStream , dos.writeInt
		
		//반드시 DataInputStream으로만 읽어야 한다
		
		int sum =0;
		int score=0;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println("score int 타입 : "+ score);
				sum+=score;  //가능 정수타입이라
				//read할 자원이 없으면 IOexception 발생
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("sum 결과 : "+sum);
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
