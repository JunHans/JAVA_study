import java.awt.image.ImagingOpException;

/*
try{

}catch(Exception e){

}finally{
  -강제적으로 실행되는 블럭-
}
나는 예외가 발생하던, 하지 않던 강제적으로 실행되야 하는 구문을 가지고 있다 

>> 게임CD PC설치
>>1. 설치파일 >> C:Temp >> 복사
>>2. 복사한 파일을 설치
>>3. 정상 설치가 됬다면 >> C:Temp에 복사한 파일 삭제되는데 
>>4. 비정상 설치 >> 강제종료  >> 복사한 파일 삭제하고 싶음


 */
public class Ex03_fianally {
	
	static void copyFiles() {
		System.out.println("copyFiles");
	}

	static void startInstall() {
		System.out.println("startInstall");
	}
	
	static void fileDelete() {
		System.out.println("file delete");
	}
	
	//실제로 예외는 아니지만
	//개발자가 필요에 따라서 어떤 상황을 예외적 상황으로 정의하고 예외를 발생시킬수 있음
	//사용자 정의 예외처리 
	//throw new IOExeption
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			throw new ImagingOpException("install 중 문제가 발생 ..."); //throw 내가 만들고 싶은 예외사항 만들 수 있음 
		}catch(Exception e){										//-- 예를 들어 if문에서 2번 누르면 예외상황으로 치거나 --내맴
				System.out.println("예외 발생메시지 :" + e.getMessage());
			}finally {  
				//강제적인 실행 블럭 예외가 발생해도 실행 / 예외가 발생하지 않아도(:정상이어도) 실행
				//함수의 강제종료인 return 만나도 finally 강제 실행 (먼저)
				//아주 강력한 강제 실행
				fileDelete();
			}
		
		}
		

	}


