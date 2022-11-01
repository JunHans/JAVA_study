import java.util.ArrayList;

import javax.xml.transform.Source;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		// 1. ����Ѹ� ���弼��
		Emp emp = new Emp(1000, "������", "�屺");
		System.out.println(emp.toString());

		// 2. ��� �θ� ���弼��
		Emp[] emplist = { new Emp(100, "��", "����"), new Emp(200, "�ھ�", "IT") }; //new�� �ִٰ� �ؼ� EMP ��ü�� ���� �ƴ϶� EMP�� �ּҰ��� ���� �� ����
		for (Emp e : emplist) {
			System.out.println(e.toString());
			System.out.println();
		}

		// ����� �Ѹ� �� �Ի��ߴ� (300, "�̾�", "IT")
		// �� 3��¥�� �迭 ���� -> �̻�... (�̷��� �ϱ� �Ⱦ���)

		// ArrayList
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100, "�达", "����"));
		elist.add(new Emp(200, "�ھ�", "IT"));
		elist.add(new Emp(300, "�̾�", "IT"));

		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i).toString());
//			Emp e = (Emp)elist.get(i);
//			e.toString();
		}
		System.out.println();

		// �� �߰�!
		elist.add(new Emp(400, "�־�", "����"));

		// toString �������� 4�� ����� ���, �̸�, ������ ����ϼ���
		// Hint) for �� �ȿ��� getEmpno , getEname(), getJob()
		for (int i = 0; i < elist.size(); i++) {
//			System.out.println(elist.get(i));  //toString�� �����Ǿ� �־ �̷��� ����

			Object obj = elist.get(i);
//			obj.toString();
//			Object�� ��� Ÿ���� �θ�Ÿ�� (�ٿ� ĳ����)
			Emp e = (Emp) obj;
			System.out.println(e.getEmpno() + "." + e.getEname() + "." + e.getJob());
		}
		  
		//���������� ... (Object Ÿ��) ... �ٿ�ĳ���� .. �ڽĿ�� ����  ->  ¥���� �Ź� �ٿ����ֱ�
		//Object �������� .... ��� 
		//Ÿ���� ���� (�� Ÿ�� ���� ����)  �ϳ��� Ÿ�Ը��� ������ �����͸� ��������
		//���ʸ� (d��ü ������ Ÿ���� �����ϴ� ���)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
//		list2.add(emp);
		list2.add(new Emp(1,"A", "IT"));
		list2.add(new Emp(1,"A", "IT"));
		
		for(Emp e : list2) {
			System.out.println(e.getEmpno());
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).toString());
		}
		
	}

}
