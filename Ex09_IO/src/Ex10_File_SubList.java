import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles = 0;  //파일의 갯수
	static int totaldirs = 0;  //폴더의 갯수
	
	static void printFileList(File dir) {
		System.out.println("Full Path : "+ dir.getAbsolutePath());
		
		//코드는 자유 .. 만드는 사람마다 다르다( )
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();  //하위자원 정보를 다 얻어내는 것 .. 하나하나를 파일 객체로 보는 것
		//[0] >> a.txt  >>  각 방의 타입은 File 타입
		//[1] >> aaa폴더
		//[2] >> bbb폴더
		//[3] >> java.jpg
		for(int i=0; i<files.length; i++){
			String filename = files[i].getName(); //폴더명 또는 파일명
			if(files[i].isDirectory()) { //폴더
				filename = "[ DIR ]"+ filename;
				//POINT
				subdir.add(i); //(안에는 폴더만)WHY : 폴더인 녀석의 index값을 (i) > arraylist
				// subdir[0] = 1
				// subdir[1] = 2 ...
			}else {  //파일
				filename = filename + " / " + files[i].length()+ "byte";
			}
		}
		//폴더 갯수 확인
		int dirnum = subdir.size(); //현재 주어진 폴더의 하위폴더 갯수
		// 파일 갯수 확인
		int filenum = files.length - dirnum;
		
		//누적갯수 (하위폴더안의 자원까지 포함)
		totaldirs+= dirnum;  //총 누적된 폴더갯수 (하위의 하위까지)
		totalfiles += filenum;  //총 누적 파일갯수 (하위의 하위까지)
		
		System.out.println("[current DirNum] : "+ dirnum);
		System.out.println("[current DirNum] : "+ filenum);
		System.out.println("******************************");
		
		//POINT(하위폴더의 다시 하위폴더 정보까지)
		//[0] >> a.txt  >>  각 방의 타입은 File 타입
		//[1] >> aaa폴더  >> a-1폴더 , a-2폴더
		//[2] >> bbb폴더  >> b-1폴더 , b.txt, b-1.jpg
		//[3] >> java.jpg
		for(int i=0; i<subdir.size(); i++) {  //subdir.size() = C:\\Temp 제어 하위폴더 갯수
			int index = subdir.get(i);  //폴더의 방위치 값
			//한 줄의 코드
			printFileList(files[index]);  // 재귀호출 (내가 자신을 또 호출)
			//C:\\Temp\\aaa
		}
		
	}
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : Java [실행 파일명] [경로명]");
			System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]);  // = File f = new File(C:\\Temp);
		if(!f.exists() || !f.isDirectory()) {
			//존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지않은 디렉토리");
			System.exit(0);
		}
		
		// 이 라인까지 오면 정상적인 경로이고 폴더구나
		printFileList(f);  //재귀호출 (반복)
		//하위폴더 안까지의 폴더 갯수 , 파일 갯수 누적
		System.out.println("누적 총 파일 수 : "+ totalfiles); //얇게 인텔릭 준다
		System.out.println("누적 총 폴더 수 : "+ totaldirs);
	}

}
/*
Full Path : C:\Temp
[current DirNum] : 2
[current DirNum] : 4
******************************
Full Path : C:\Temp\aaa
[current DirNum] : 2
[current DirNum] : 1
******************************
Full Path : C:\Temp\aaa\a-1
[current DirNum] : 0
[current DirNum] : 0
******************************
Full Path : C:\Temp\aaa\a-2
[current DirNum] : 0
[current DirNum] : 0
******************************
Full Path : C:\Temp\bbb
[current DirNum] : 0
[current DirNum] : 0
******************************
누적 총 파일 수 : 5
누적 총 폴더 수 : 4
 */