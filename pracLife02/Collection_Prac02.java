package pracLife02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Prac02 {
	public static void main(String[] args) {
		//Arraylist : List�������̽� ���� 
		
		ArrayList arr = new ArrayList();
		//Object Ÿ��
		arr.add("�Ѷѹ�");
		arr.add("�Ѷѹ�");
		arr.add("�Ѷѹ�");
		arr.add("�Ѷѹ�");
		arr.add("�Ѷѹ�");
		arr.add("�Ѷѹ�");
		
		System.out.println(arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println(arr.toString());
		
		//add�Լ��� ���������� �����Ͱ� ����, 
		//�ڸ��̵� ��Ű�� �Լ��� �ִ�
		arr.add(0,222); //0��° �ε����� 222�ִ´�
		System.out.println(arr.toString());
		arr.add(4, "�յչ�");
		System.out.println(arr.toString());

		//�ش� �ε��� ����
		arr.remove(0);
		System.out.println(arr.toString());
		
		//arr�̶� �迭�� 200�� ����ִ�???
		System.out.println(arr.contains(200));  // =False
		System.out.println(arr.contains("�Ѷѹ�")); //= True
		
		//������ ���� ���� - ������ �����ִ�
		arr.clear();
		System.out.println(arr.toString()); 
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());  //arr�� ����ִ�?? = True
		
		arr.add("dduddu1");
		arr.add("dduddu2");
		arr.add("dduddu3");
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		Object value = arr.remove(0); //dduddu1 ����! �׸��� �ڸ��ٲ���
		System.out.println(arr.toString());
		
		//POINT
		//�������̽� �θ� Ÿ��
		//������ ���������� .. ������ (Ȯ�强 , ������)
		List li = new ArrayList();
		//List�� �θ�� ������ �ִ� ��� ���� ���� �� �ִ�  //List�� �������̽�
		
		//ArrayList li = new ArrayList();  
		//�̷��� �ڵ� ġ�� ArrayList�� �޴´�
		
		li.add("dlawnsgks1");
		li.add("dlawnsgks2");
		li.add("dlawnsgks3");
		li.add("dlawnsgks4");
		System.out.println(li.toString());
		
		List li2 = li.subList(0, 2); //subList �Լ��� ���������� new ArrayList() ����***   (�����ؾ�)
		System.out.println(li2.toString()); 
		//(list).subList(���� �ε���, ���� �ε��� (��) ����)
		//����Ʈ �߶�!
		
		List alist = new ArrayList();		
		alist.add(14);
		alist.add(12);
		alist.add(11);
		alist.add(13);
		
		System.out.println(alist.toString());
		Collections.sort(alist);  // �ڵ����� ���������� ����
		System.out.println(alist.toString()); 
		
		//���������� ������????
		Collections.reverse(alist);  //�ڵ����� ���� ������ ����!!
		System.out.println(alist.toString());
		
		
	}

}
