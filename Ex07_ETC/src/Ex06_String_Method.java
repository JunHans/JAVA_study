import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat("wolrd");  //concat = ��ġ��
		System.out.println(concatstr);
		
		boolean bo = str.contains("e");  //e��� ���ڸ� �����ϰ� �ִ�? -> true / false
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d] = 7��
		System.out.println(str2.length());
		
		String filename="hello java workd";
		System.out.println(filename.indexOf("h"));  //h��� ������ �ε��� ���� ���
		System.out.println(filename.indexOf("java"));  // java �ܾ��� ������ġ 
		System.out.println(filename.indexOf("������"));  //�����ϱ� -1 ���
		// -1�� return ... �迭���� ���� ���ٴ� �ǹ�(-1)
		//�Ź� �缳���� ����� �ܾ� �˻� ... ���� ���ϴ� ���ڿ��� ���ԵǾ����� �ľ� ... -1�� �ƴϸ� ����ִٴ� ��
		if(filename.indexOf("wo") != -1){
			System.out.println("wo �ܾ �ϳ��� �ִ�");
		}
		System.out.println(filename.lastIndexOf("a"));  //�ڿ������� a�� ã�Ƽ� ������ a�� ��ġ
		
		//�ϱ��ϸ� ���� �Լ�   :   length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0));  //���� �ε����� �����ϸ� �� �� ������ �� �� ����
		System.out.println(result.substring(1));
		System.out.println(result.substring(1,2));  // "u"
		//endIndex -1
		System.out.println(result.substring(0,0));  //(0, -1)  �ƹ��͵� �ȳ���
		System.out.println(result.substring(0,1));  // "s" 
		
		
		//Quiz
		String filename2 = "home.jpeg";  // or h.png or aaaaa.hwp
		//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ����϶�
		String first = filename2.substring(5);
		
		int position = filename2.lastIndexOf(".");  //��Ģ (.��ġ)
		String file = filename2.substring(0, position); // 0���� . �ִ� �� ����
		
		String extention2 = filename2.substring(position+1, filename2.length());
		String extention = filename2.substring(++position);
		
		System.out.println(position);
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace
		String str3 = "ASDFADDDDDSF";
		String result3 = str3.replace("DDDDD", "������ �ݿ�");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("FA")); //�� �ڿ� FA�� �����ϴ� ���ڰ� �ִ� true false
		System.out.println(str3.equalsIgnoreCase("asDFSFASFSf"));  //��ҹ��� ���о��� ��
		
		//Today Point
		String str4="���۸�, ��Ƽ, �����, ������, ������";
		String[] namearray = str4.split(",");  //,�� �������� �ϳ��� �и��ؼ� �����ڴ�
		
		for(String s : namearray) {
			System.out.println(s);
		}
		
		String str5="���۸�, ��Ƽ, �����, ������, ������";
		String[] namearray2 = str5.split(",");  //.�� �������� �ϳ��� �и��ؼ� �����ڴ�
		
		for(String s : namearray2) {
			System.out.println("\\."+s);  //  \.�� ����ǥ�����ε� �̽��������������� ������ ���ڷ� �νĸ��ؼ� �տ� ����� ��
		}
		//https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
		//"."���� ǥ�����̴� �����Ͱ� �ƴ϶�
		
		//����ǥ���� (���ڵ��� �����ؼ� ��Ģ�� ����� : �� ��Ģ�� �����͸� ���ؼ� �´��� �Ǵ�)
		//�����ȣ : {\d3}-{\d3} >> 12-1 (false) , 123*123(false) , 111-111(true)
		
		//����ǥ����(java , javascript , Oracle , C#) ǥ��
		//�ڵ��� ������ȣ , ������ �ּ�, �̸��� �ּ� ����ǥ������ ���� >> �Է��� ������ ��ȿ�� ����
		//������ ������ ����
		
		String filename3 = "kosa.hwp";
		//���ϸ�� Ȯ���� �и�
		String[] filename33 = filename3.split("\\.");
		for(String s : filename33) {
			System.out.println(s);
		}
		
		String str6 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");  //�̷��͵��� �� �����ϰڴ�  //������ Ŭ���� StringTokenizer �̿�
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		//�ͼ���
		String strr7 = "ȫ         ��       ��";
		//���� >> �������� >> "ȫ����"
		StringTokenizer sto1 = new StringTokenizer(strr7," ");  //�̷��͵��� �� �����ϰڴ�  //������ Ŭ���� StringTokenizer �̿�
		while(sto1.hasMoreElements()) {
			System.out.print(sto1.nextToken());
		}
		
		System.out.println();
		
		String str7 = "ȫ         ��       ��";
		//���� >> �������� >> "ȫ����"
		System.out.println(str7.replace( " ", "")); //"ȫ����"
		
		String str8 = "       ȫ�浿           ";
		System.out.println(">" + str8 + "<");	
		System.out.println(">" + str8.trim() + "<");  //trim() ���鹮�� �߶�
		
		String str9 = "      ȫ   ��   ��     ";
		String result5 = str9.trim();
		String result6 = result5.replace(" ","");
		System.out.println(result6);
		//������ �ΰ�....
		
		//************�������� �Լ��� ����� ��� (method chain ���)
		System.out.println(str9.trim().replace(" ","").substring(2));  //������� ����
		
		int sum=0;
		String [] numarr = {"1","2","3"};
		for(String s : numarr) {
			sum+=Integer.parseInt(s);
		}
		System.out.println("sum:"+sum);
		
		//Quiz
		  String jumin="123456-1234567";
		   //�� �ֹι�ȣ�� ���� ���ϼ���_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);  //�����ε��� ������
			   if(numstr.equals("-")) continue;    //-������ �ѱ��
			   sum2+= Integer.parseInt(numstr);   //���� ������ �͵��� ���� ��ȯ�ؼ� ���� ��ģ��
		   } 
		   System.out.println("�ֹι�ȣ ��:" + sum2);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("�ֹι�ȣ ��2:" + sum3);
		   
		 //�� �ֹι�ȣ�� ���� ���ϼ���_3
		   String jumin4 = jumin.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));  //char�� �ٲ� �� char�� int�� �ٲ㼭 ��ġ��
		   }
		   System.out.println("�ֹι�ȣ ��4:" + sum4);
		
		
		
		
		
		
//		String[] jumin1 = jumin.split("-");
//		for(String a : jumin1) {
//			System.out.println(a);
//		}
//		
//		StringTokenizer sto3 = new StringTokenizer(jumin,"-");  //�̷��͵��� �� �����ϰڴ�  //������ Ŭ���� StringTokenizer �̿�
//		while(sto3.hasMoreElements()) {
//			System.out.println(sto3.nextToken());
//		}
//		
//		char[] arr9 = new char[jumin.length()];
//		for(int i=0; i<jumin.length(); i++) {
//			arr9[i] = jumin.charAt(i);
//		}
//		System.out.println(Arrays.toString(arr9));
//		
//		
//		
//		for(char b : arr9) {
//			sum1+=Integer.parseInt(b);
//		}
//		System.out.println("sum1 ��:"+sum1);
	}

}
