import java.awt.image.ImagingOpException;

/*
try{

}catch(Exception e){

}finally{
  -���������� ����Ǵ� ��-
}
���� ���ܰ� �߻��ϴ�, ���� �ʴ� ���������� ����Ǿ� �ϴ� ������ ������ �ִ� 

>> ����CD PC��ġ
>>1. ��ġ���� >> C:Temp >> ����
>>2. ������ ������ ��ġ
>>3. ���� ��ġ�� ��ٸ� >> C:Temp�� ������ ���� �����Ǵµ� 
>>4. ������ ��ġ >> ��������  >> ������ ���� �����ϰ� ����


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
	
	//������ ���ܴ� �ƴ�����
	//�����ڰ� �ʿ信 ���� � ��Ȳ�� ������ ��Ȳ���� �����ϰ� ���ܸ� �߻���ų�� ����
	//����� ���� ����ó�� 
	//throw new IOExeption
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			throw new ImagingOpException("install �� ������ �߻� ..."); //throw ���� ����� ���� ���ܻ��� ���� �� ���� 
		}catch(Exception e){										//-- ���� ��� if������ 2�� ������ ���ܻ�Ȳ���� ġ�ų� --����
				System.out.println("���� �߻��޽��� :" + e.getMessage());
			}finally {  
				//�������� ���� �� ���ܰ� �߻��ص� ���� / ���ܰ� �߻����� �ʾƵ�(:�����̾) ����
				//�Լ��� ���������� return ������ finally ���� ���� (����)
				//���� ������ ���� ����
				fileDelete();
			}
		
		}
		

	}


