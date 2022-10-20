import java.awt.Color;
import java.awt.dnd.DragGestureEvent;

/*
�ǹ�(����) ȯ�� 
�Ѱ��� Ŭ������ ����ϴ� ��� X

���赵 1������ ��� �������� ���������� �Ұ��� 
���赵�� �������� ������ -> ������ �߻��Ѵ� (������ ����, ���輳�� ��)

���θ� : ��������, ��۰���, �Ǹ�ó, �����ڰ���, ȸ������, ��ǰ����  >> ������ ������ ���� ������ ���赵�� �����
*****����*****
�������� ���赵�� ����� ���� ���ؼ� �̾��ִ� ������ �ʿ�

1. ���(is ~ a : ���) ��(��) ~ �̴� (�θ� �ڿ�)       ex)���� ��������
2. ����(has ~ a : ����) ��(��) ~ �� ������ �ִ�          ex)�ڵ����� ������ ������ �ִ�  

��)
���� �����̴� 
�� extends ����
�ﰢ���� �����̴�
�ﰢ�� extends ����

���� �� ����(������ ����� ��)
���� ���̴� X
���� ���� ������ �ִ� O
has ~ a(��ǰ����)
>> class ��(���̶�� ��ǰ�� member field)

������ ���� ����
������ �����̴� X
������ ������ ������ �ִ� O
>> class ���� {}
>>class ���� {���� member field}


���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

������ �и� (�������� ������ �־�� ��) �����ڿ��� ������ �־�� �� : �߻�ȭ , �Ϲ�ȭ  (���� : �׷�����, ������ �ִ�)
���� ��üȭ, Ư��ȭ (���θ��� ������ Ư¡)  (Ư¡ : �������� ������ �ִ�, �� ���� ������ �ִ�)
(����� �ָ��� ���� �������� ������ �ٰ��ü��� Ư¡�� ����)

�� : ��ǥ��(x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ�


class Shape{�׸��� , ����} >> ��Ӱ��� �θ� (��, �ﰢ�� ,�簢��)
class Point{��ǥ��} >> ���԰��� (��ǰ) 

��üȭ , Ư��ȭ : Circle , Triangle
*/

//�߻�ȭ , �Ϲ�ȭ , ����
class Shape{
	String color="gold"; //����Ӽ�
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		//this.x = 1;
		//this.y = 1;
		this(1,1);  //�����ڸ� ȣ���ϴ� this
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}
//����1)
//���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�)
//1. ���� �����̴� (is ~ a) : shape 
//2. ���� ���� ������ �ִ�(has ~a) : point >> member field
//3. ���� �������� ������ �ִ�(Ư�� ,��ü) : r

//���� �������� �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10,15) ������
//�ʱⰪ�� �������� ������ �������� ���� ���� �Է��� ���� �� �ִ� (���� ����� ����  new )
//�����ڸ� ...Ȱ�� (hint)

//����2)
/*
�ﰢ�� Ŭ������ ���弼��
�ﰢ���� 3���� ���� ����� �׸��� �׸��� ����� ������ �ִ�
hint) Shape , Point ���� �޾Ƽ� ���赵 �ۼ� �ϼ���
hint) (x,y) , (x,y) , (x,y)
default �ﰢ���� ���� �� �ְ�  3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ� 
*/

//70�� + 10��
class Triangle extends Shape {
	Point a; //= new Point(10,20); �ʱ�ȭ�� ���Ⱑ �ƴ϶� ������ �ȿ���  //����(��ǰ)
	Point b;
	Point c;
	
	public Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60)); //������ �θ��� this �⺻�� ���� �ʱ�ȭ�� ���⼭
	}
	
	public Triangle(Point a , Point b , Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		System.out.println("70��");
		System.out.printf("a :(%d,%d)\t",a.x , a.y);
		System.out.printf("b :(%d,%d)\t",b.x , b.y);
		System.out.printf("c :(%d,%d)\t",c.x , c.y);
		System.out.println();
	}
	
}

//100��
class Triangle2 extends Shape {
	Point[] pointarray;  //����(��ǰ) ���ԵǴ� �� �����Ҷ��� �̷������� ��� : ������ Ŭ����Ÿ�� ����
	
	
	public Triangle2() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		//this(new Point(10,20),new Point(30,40),new Point(50,60));
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
	}
	
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("x :(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
	
}


class Circle extends Shape{ //���
	Point point; //= new Point(10,15)//����(��ǰ)
	int r; // = 10;   //Ư����
	
	
	public Circle() {
		//this.r = 10;
		//this.point = new Point(10,15);
		this(10,new Point(10,15));  //������ �η�� this �⺻�� ���� �ʱ�ȭ�� ���⼭
	}
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

public class Ex02_inherit_Composition {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.color); //���
		System.out.println(c.point.x);  //���� ...
		System.out.println(c.point.y);  //���� ...
		c.draw(); //���  //Shape�� draw�� ����� �� �ִ�
		
		//������ , ������ ���� �Է�
		//Point point = new Point(100, 200);
		//Circle c2 = new Circle(50, point);
		Circle c2 = new Circle(50, new Point(100,200));  //(int r, Point point)
		//-----------------------------------------------------------------------------------------
		
		Triangle tri = new Triangle();
		tri.trianglePoint();  //����ϴ� ��
		
		Triangle tri2 = new Triangle(new Point(1,2), new Point(3,4),new Point(5,6));  //���� ���� �� �Է�
		tri2.trianglePoint();  //����ϴ� ��
		
		Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};  //�迭�� ����� �θ���
		Triangle2 tri3 = new Triangle2(parray);  //�ٷ������� �����Ѱ� ������
		tri3.trianglePoint();  //����ϴ� ��
		
	}

}