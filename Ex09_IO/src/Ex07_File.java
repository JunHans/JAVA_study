import java.io.File;

/*
[파일] [폴더]를 다루는 클래스 학습

 JAVA : 파일 (생성 ,삭제) , 폴더(생성, 삭제) 하나의 클래스 >> File
 >>a.txt 생성 , 수정, 삭제, 정보 read
 >>Temp 생성 , 수정, 삭제, 정보 read
 
C# : 파일(File) , 폴더(Directory)

경로
절대경로 : C:\\  D:\\  >> C:\\Temp\\a.txt
상대경로 : 현재 파일을 중심으로 >> ../  >>  /

 */
public class Ex07_File {

	public static void main(String[] args) {
		String path ="C:\\Temp\\file.txt";
		//String path ="data.txt";
		File f = new File(path);
		
		//File 사용 목적 : 다양한 정보 취득 .....
		System.out.println("파일 존재여부(파일, 폴더) : "+ f.exists()); 
		System.out.println("너 폴더니? :"+ f.isDirectory()); //False
		System.out.println("너 파일이니? :"+ f.isFile());  //True
		
		System.out.println("파일명 : "+ f.getName());
		System.out.println("절대경로 : "+ f.getAbsolutePath());
		//절대경로 : C:\KOSA_IT\JAVA\Labs\Ex09_IO\data.txt
		
		System.out.println("파일크기 : "+ f.length()); //파일 크기(글자수)
		System.out.println("부모경로 : "+ f.getParent());  //부모경로 : C:\Temp
		
		
	}

}
