package pracLife01;

public class Rect1 {
	public String name; // ���簢��, ���簢�� ��
	public int w, h; // �簢���� ���α���, �簢���� ���α���
//	public int h; // �簢���� ���α���
	public int result;

	public void square_Info() {
		System.out.printf("�簢�� �̸�: [%s], ���α���: [%d], ���α���: [%d]", name, w, h);
		System.out.println();
	}

	public int square_Area() {  //�簢���� ����

		int result = w * h;  //������ ������ result�� ��

		return result;  //���Ӱ��� result�� �� �Ҵ�
	}

	
	
//	public void square_Area() {  //�簢���� ����
//		if(h>w & h>0 & w>0) {  //if������ �Է°��� 0�̸����� �������� �ʰ�
//			result = h*w;      //result�� �� ����
//			System.out.printf("[%s]�� ����: [%d]",name, result);
//			System.out.println();
//		}else if(h<w & h>=0 & w>=0) {   //if�� if else
//			result= h*w;
//			System.out.printf("[%s]�� ����: [%d]",name, result);
//			System.out.println();
//		}
//	}
}
