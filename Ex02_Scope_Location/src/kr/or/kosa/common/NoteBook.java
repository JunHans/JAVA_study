package kr.or.kosa.common;

import javax.xml.stream.XMLEventFactory;

public class NoteBook {
	//��Ʈ���� ���콺�� ������ �ִ�
	//���콺 >> ��, ��ư2��, ��ǥ��,,,,,
	// = ��ǰ���� ... (����, Ÿ�̾�)
	//���콺�� ���赵(Ŭ����)������ ��

	//��Ʈ�ϰ� ���콺���� ������ ��ǰ�ε�
	//public Mouse mouse = new Mouse();  //Mouse��� Ÿ���� Ŭ����, >> �������� >> �ּҰ��� ������ ��
	//��Ʈ���� ���콺�� �ʿ信 ���� ����Ҽ� �ֵ��� �Ϸ���?
	
	
	
	
	public String color;

	// ��ü���� ���(ĸ��ȭ, ����ȭ : ���������� ���� �����ϰ� ���� ���� �����ϱ� ����)
	// year������ ���̳ʽ��� ������ ��Ź... ����ų �� ����
	// �ٸ���� �� �Ͼ �� ���ƹ����ž� >> ���Ұ� >> ���������� ��� ���� .... >> ������(method)�� ���ؼ�
	// read,write
	// ���� >> �����ڰ� ���� ���ؼ� ���� �ϰڴ�
	// public int year;
	private int year;

	
	
	
	public void setYear(int data) { //�����Ҵ��� ���� : �������ϴ´�� ������ �� �ִ�
		if(data < 0) {
			year = 1999;
		}else {
			year = data;
		}
	}
	public int getYear() { // ���������� year member field ���� return
		return year;
	}

	// ��� ĸ��ȭ (read, write �Լ�) >> ǥ��ȭ >> getYear, setYear >> setter, getter

	/*
	 * //year write�Լ� public void writeYear(int data) { //�����Ҵ��� ���� : �������ϴ´�� ������ ��
	 * �ִ� if(data < 0) { year = 1999; }else { year = data; } } // year read �Լ�
	 * public int readYear() { //���������� year member field ���� return return year; }
	 */
	public int number;
	
	//��Ʈ���� �ʿ信 ���� ���콺�� ���� �� �ִ�. �����ٴ� ���� ����� �ǹ�
	//���´ٴ� �ǹ� : ������ ��ü�� �ּҸ� ���´�
	public void handle(Mouse m) {
		//
		m.x = 100;
		m.y =200;
	}
	
}
