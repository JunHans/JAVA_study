package kr.or.kosa.common;

public class Car {
	int i; // �����Ϸ��� �ڵ����� default (���� ���� ���� ��Ű��) �׳� int�ϱ�
	//default package�� Ex_01_Main���� i�� ���Ұ� (����Ʈ�� ���������� ����)
	public int window;  //���� ���� ���� ��Ű�� �ٸ����� �� ������� �� ����Ѵ�
	private int door;  // ���� ������ �� ������ ���ٺҰ� ... �� �ָ��� �̰�? ������ ���Ұ� 
	
	//������ �������� ���������� ������ �� �ְ� ���ٰ�
	//setter, getter
	public void setDoor(int d) {
		door = d;  //write (������ �ڿ�)
	}
	public int getDoor() {
		return door; //read (������ �ڿ�)
	}
}
