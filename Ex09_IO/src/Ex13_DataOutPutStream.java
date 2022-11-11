import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
보조 스트림
DataOutPutStream
DataInPutStream

java 8가지 기본 타입(타입별로 write, read 할 수 있다)
단 조건 (DataOutPutStream , DataInPutStream) 2놈이 같이

만약) 
성적.txt
100, 20, 60, 88 >> 문자열 > split > 배열 > 연산하려면 숫자로 바꾼다 > ..


 */
public class Ex13_DataOutPutStream {
	public static void main(String[] args) {
		int[] score = {100,60,55,95,50};  //수학점수
		FileOutputStream fos = null;
		DataOutputStream dos = null;  //Buffered 처럼 혼자선 못논다
		
		try {
			fos = new FileOutputStream("score.txt");  //outputstream은 파일없으면 만든다
			dos = new DataOutputStream(fos);
			for(int i =0; i<score.length; i++) {
				dos.writeInt(score[i]);  //정수 형태로 그대로 write
				//조건은 read할때는  반드시 DataInPutStream 써라!
				//dos.writeUTF(null); //채팅 입력 출력
			}
		} catch (Exception e) {  //catch란 비우지말고 최소한 getMessage라도 써라
			System.out.println(e.getMessage());
		}finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		//
	}

}
