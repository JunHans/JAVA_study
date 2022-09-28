package pracLife02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Lotto_Read_Write {
	private int[] lotto = new int[6];
	private String s;

	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;

	Random random = new Random();
	Date currdate = new Date();
	//Write
	void write() throws IOException {
		try {
			fw = new FileWriter("C:\\KOSA_IT\\JAVA\\Labs\\Ex01_Basic/Lotto.txt");
			bw = new BufferedWriter(fw);
			for (int i = 0; i < 8; i++) {
				String s = lottoStart();
				// bw.write("로또번호 : ");
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {

		} finally {
			try {
				fw.close();
				bw.close();
			} catch (Exception e2) {

			}
		}

	}
	//Read
	void Read() throws IOException {
		try {
			fr = new FileReader("C:\\KOSA_IT\\JAVA\\Labs\\Ex01_Basic/Lotto.txt");
			br = new BufferedReader(fr);
			String line = lottoStart();
			for (int i = 0; ((line = br.readLine()) != null); i++) {
				System.out.println(line);
			}
		} catch (Exception e) {

		} finally {
			fr.close();
			br.close();
		}
	}

	// 로또번호 생성기
	public String lottoStart() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) (Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		String resultArray = Arrays.toString(lotto);
		Arrays.sort(lotto);
		resultArray = Arrays.toString(lotto);

		// 로또번호에 현재시간 출력 기능 추가
		SimpleDateFormat dateformat = new SimpleDateFormat("[yyyy년 MM월 dd일 HH:mm]");
		s = dateformat.format(currdate);

		return "로또번호 : " + resultArray + s + "\t";
	}

}
