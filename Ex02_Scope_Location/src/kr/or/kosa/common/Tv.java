package kr.or.kosa.common;

//Tv ���赵 �䱸���� ����
//Tv�� ä�� ������ ������ �ִ� (���� ��� 1~200 ���� ���� �� �ִ�)
//Tv�� �귣�� �̸��� ������ �ִ� (���� ��� ���� , �Ｚ)
//Tv�� ä�� ��ȯ ����� ������ �ִ�(ä���� �� ä�ξ� �̵� �����ϴ�)
//->ä�� ������Ű�� ��� ������ �ִ�
//->ä�� ���ҽ�Ű�� ��� ������ �ִ�
//Tv�� ä�������� �귣���̸��� �� �� �ִ�(����� �� �ִ�) ����� ������ �ִ�

public class Tv {
	public int channel; //default > 0
	public String brandname; // default > null
	
	public void ch_up() {
		channel++;
	}
	public void ch_Down() {
		channel--;
	}
	public void tvInfo() {
		System.out.printf("[%s] , [%d] \n", brandname , channel);
	}

	
	
}
