import kr.or.kosa.common.Fclass;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		
		//Fclass ���� ... �ٲ㸻�ϸ� �޸��� �÷��� �Ѵ� ... ��ü ����
		Fclass fclass = new Fclass();
		
		fclass.m();  //ȣ���ߴ� = ���� �̸��� �ҷ� �־���� Call
		fclass.m2(100);
		
		int result = fclass.m3(); //1000�̶�� ���� ���� �غ񸣸� �ϴ� �� int result =
		System.out.println("m3�Լ� ȣ��� �������� �� : " + result);
		int result2 = fclass.m4(555);
		System.out.println("m4�Լ� ȣ��� �������� �� : " + result2);
		
		result2 = fclass.sum(100, 200, 300);
		System.out.println("sum�Լ� ȣ��� �������� �� : " + result2);
		
		fclass.callSuvSum();
		
		result2 = fclass.opSum(-10);
		System.out.println("opSum�Լ� ȣ��� �������� �� : " + result2);
		
		
		//Quiz
//		int result3 = fclass.maxminimum(5, 10);
		result2 = fclass.maxminimum(50, 10);  //���Ҵ��� ���ִ� ���̱� ������ result2�� ����
		System.out.println("�� ū �� : " + result2);
		//System.out.println("�� ū �� : " + fclass.maxminimum(5, 10));
	}

}
