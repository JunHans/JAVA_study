import java.awt.dnd.Autoscroll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//���ʹ� ����ȭ ����(�Ѱ�ȭ���) -(����: �ڿ������� ��ȣ)
//��̸���Ʈ�� ����ȭ�����Ҽ����ְ� ���Ҽ��ִ�(�Ѱ� ����� ����) -(����: �����͸� ���������� ���� �� �ִ�)(����: �߰��� �������߰������Ǹ� ��ü�� �ٲ��(��ĭ�� �ڷ�, ������ ���))
                                                                                //�̷� �������� ���� -> LinkedList ����


//Allday Point

public class Ex02_ArrayList {
	public static void main(String[] args) {
		//ArrayList : List �������̽��� ���� (��������, �ߺ� ���)

		ArrayList arraylist = new ArrayList();
		//Object Ÿ������
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		
		for(int i=0; i< arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
			System.out.println(arraylist.toString());
		
			//add �Լ��� ���������� ������ �ֱ�
			arraylist.add(0, 222);  // **�ڸ��̵�**
			System.out.println(arraylist.toString());
			arraylist.add(4,444);
			System.out.println(arraylist.toString());
			
			//��������� ������ �߰�, ���� >> ArrayList �������� �ʾƿ� >> ������ �ִ� ������ ������ ���ƿ�
			//**�������� �������� �߰�, ���� �뵵�� ����ϸ� �������ƿ� ^^
			
			//arraylist.remove(111);
			//System.out.println(arraylist.toString());
			
			//[111, 100, 200, 300, 444]
			//ArrrayList �Լ� ����
			System.out.println(arraylist.contains(200));
			System.out.println(arraylist.contains(2000));
			
			arraylist.clear();  //������ ���� (������ �����־��)
			System.out.println(arraylist.size());  //0
			System.out.println(arraylist.isEmpty());  // true
			
			arraylist.add(101);
			arraylist.add(102);
			arraylist.add(103);
			System.out.println(arraylist.isEmpty());
			System.out.println(arraylist.size());
			Object value = arraylist.remove(0);  //101 ���� ...�ڸ��ٲ���
			System.out.println(arraylist.toString()); //[102][103]
			
			//POINT
			//�������̽� �θ� Ÿ��
			//������ ���������� .. ������ (Ȯ�强 , ������)
			List li = new ArrayList();  //���������� �θ�Ÿ���� ����ؼ��������̶� ���� ������   //List�� �θ�� ������ �ִ� ��� ���� ���� �� �ִ�  //List�� �������̽�
			//ArrayList li = new ArrayList();  ArrayList�� �޴´�
			li.add("��");
			li.add("��");
			li.add("��");
			li.add("��");
			
			List li2 = li.subList(0, 2);  //subList �Լ��� ���������� new ArrayList() ����***   (�����ؾ�)
			System.out.println(li2.toString());
			
			ArrayList alist = new ArrayList();
			alist.add(50);
			alist.add(1);
			alist.add(7);
			alist.add(40);
			alist.add(46);
			alist.add(3);
			alist.add(15);
			
			System.out.println(alist.toString());
			Collections.sort(alist);  //���������� ����  >> �ʱް����ڰ� ������Ʈ�� �̷��ڵ� ���� ����...
			System.out.println(alist.toString());  //[1, 3, 7, 15, 40, 46, 50] ������ ��
			//������ ������ ������?
			//�Լ�
			Collections.reverse(alist);
			System.out.println(alist.toString());  //[50, 46, 40, 15, 7, 3, 1] ������ ��
	}

}
