import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//��� 3���� ���弼��
		//�� Array ���
		//�������
		//1000, ȫ�浿
		//2000, ������
		//3000, ������
		//�� ����ð� ����� �̸��� ����ϼ���
		
		
		//1�� ���
		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(1000,"ȫ�浿");
		emplist[1] = new Emp(2000,"������");
		emplist[2] = new Emp(3000,"������");
		
		for(int i = 0 ; i < emplist.length ;i++) {
			emplist[i].empInfoPrint();
		}
		
		//2�� ���
		Emp[] emplist2 = new Emp[] {
				                    new Emp(1000,"ȫ�浿"),
				                    new Emp(2000,"������"),
				                    new Emp(3000,"������")
				                    };
		
		//3�� ���  - �ʺ��ڵ��� 3������ �Ͻñ�
		Emp[] emplist3 = {new Emp(1000,"ȫ�浿"),new Emp(2000,"������"),new Emp(3000,"������")};
		//������ for������ ���
		for(Emp e : emplist3 ) {
			e.empInfoPrint();
		}
	}

}