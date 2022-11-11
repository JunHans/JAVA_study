import java.io.File;
import java.text.SimpleDateFormat;

public class Ex09_File_Dir_Format {

	public static void main(String[] args) {
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			File file = files[i];
			
			String name = file.getName();
			
			System.out.println(files[i]);  //폴더명 or 파일명
			SimpleDateFormat dt = new SimpleDateFormat("yyyy=MM=dd HH-mma");
			String attribute="";
			String size ="";
			
			if(files[i].isDirectory()) {  //폴더니 질문
				attribute = "< DIR >";
			}else {  //다 파일(1.jpg, data.txt ...)
				size = file.length() + "byte";
				attribute = file.canRead()   ? "R" :"";
				attribute += file.canWrite() ? "W" :"";
				attribute += file.isHidden() ? "H" :"";
				
			}
			System.out.printf("%s %3s %10s %s \n", 
							  dt.format(file.lastModified()),
							  attribute,
							  size,
							  name);
		}
/*
<DOS 창>

C:\Users>..cd
'..cd'은(는) 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는
배치 파일이 아닙니다.

C:\Users>cd..

C:\>cd Temp

C:\Temp>dir
 C 드라이브의 볼륨에는 이름이 없습니다.
 볼륨 일련 번호: 424E-C9BC

 C:\Temp 디렉터리

2022-09-15  오후 04:55    <DIR>          .
2022-09-15  오전 11:10                 5 a.txt
2022-09-15  오후 04:55    <DIR>          aaa
2022-09-15  오후 04:55    <DIR>          bbb
2022-09-15  오후 04:29                 0 file.txt
2022-09-15  오전 11:27                 5 new.txt
2022-09-15  오전 11:49           280,368 potter.jpg
               4개 파일             280,378 바이트
               3개 디렉터리  35,275,145,216 바이트 남음

C:\Temp>
 */
		
	}

}
