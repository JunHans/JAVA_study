package kr.or.kosa;

public class Car {
//��Ģ������ (�ǹ�)
//1. ĸ��ȭ (member field)
//2.ĸ��ȭ (���������� ó��: setter, getter)
	private int window;
	private int speed;
	
	//�ʿ信 ���� (setter��) >>  write
	//(getter��)>> read
	//setter, getter��>> write, read
	public int getWindow() {
		return window;    //getter  �Լ�
	}
	public void setWindow(int data) {  // setWindow(int window){this}
		window = data;    //setter  �Լ�
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//1. IDE��� 
	//2. Lombok �̶� 
	//3. �̷� �����͸� ������ �ִ� Ŭ���� (VO, DTO, DOMAIN)  >> �츮 ���߿� MVC ���ϻ���Ұž�(�� �� ��Ʈ�ѷ�)
	
	//   Java ���̺귯���� �ݺ��Ǵ� getter, setter, toString ..
	//   ���� �ݺ� �޼��� �ۼ� �ڵ带 �ٿ��ִ� �ڵ� ���̾�Ʈ ���̺귯�� �̴�.
	//@Getter
	//@Swtter
	//�����Ϸ����� �ڵ����� setter, getter ����� �ְڴ�? ��� �ϴ� �� >> ���߿��� �� �����ϴ� ���� 
	
	
	
	//�ʿ��ϴٸ� ������ �Լ�������
	//speed�� 10�� �ø����� �����ϴ� ����� ���弼��
	//�Ϲ������� �Ʒ�ó�� ������ �Լ��� ����� ���ٴ� read�� write�� �Ѵٸ� 
	//setter, getter���ؼ� �����ϴ� ���� �Ϲ���
	//�Ʒ����� ���ͼ��ͷ� ��
	public void speedUp() {
		speed+=10;  //speed = speed + 10
	}
	public void speedDown(){
		//����
		if(speed>0) {
			speed-=10;
		}else {
			speed = 0;
		}
	}
}
