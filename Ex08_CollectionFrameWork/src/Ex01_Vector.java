import java.util.Vector;

/*
Collection FrameWork
: [�ټ��� ������]�� �ٷ�� [ǥ��ȭ�� �������̽�]�� �����ϰ� �ִ� [Ŭ������ ����]

Collection �������̽��� �ֻ��� -> ��� List (����Ŭ���� :ArrayList) , Set(����: HashSet ..)

>>ArrayList�� �θ�Ÿ���� List�̴� (OK) >> ������ 
>>Collection �������̽��� ArrayList �θ� Ÿ���̴� (OK) >> ������

Map �������̽� (key ,value) ���� �迭 -> (����Ŭ���� : HashMap)

1. List (���� ���ÿ�)
����(��ȣǥ) , �ߺ� ��� > ���������� ������(�ڷ�) > �迭(Array)�� ���� > [ȫ�浿][ȫ�浿][ȫ�浿]
                                                         [0]   [1]   [2]
 1.1 Vector(������) -> ����ȭ�� �����Ѵ� (��Ƽ ������) -> lock(��ġ)��ȣ -> ������ �� ������ -> �Ѱ� ȭ���
  1.2 ArrayList(�Ź���) -> ����ȭ����(��Ƽ ������) -> Lock �ɼ�����(�⺻ Lock�� ���� �ʿ��Ҷ� Lock�ɾ�) -> ���� �켱 -> �Ѱ� ����� ����

���� �ټ��� �����͸� �ٷ�� ��� : Array(����, �����迭 : �ѹ� �� ������ �������� �ٲ� �� ���� : ����Ұ�)*****
int[] arr = new int[5];
arr[0] = 100;
int[] arr2 = {10,20,30};
�����Ͱ� �������� ���ο� ũ���� �迭�� ����� �����͸� �̵����Ѿ� �Ѵ� (�ڵ�� ��������)***
Array
1. �迭�� ũ�Ⱑ ���� : Car[] cars = {new Car(), new Car()}; �� �ΰ�
2. ���� ��� (index ÷��) ���ȣ�� ���� : cars[0] ,,, n��°(length -1 = ������ ��) �� 

List�������̽��� �����ϰ� �ִ� (Vector , ArrayList)
1. �迭�� ũ�⸦ �������� Ȯ�� �Ǵ� ��Ұ� ���� >> * ������ �����ڰ� �ڵ带 ��ĥ�� �����Ϸ��� ���ο� �迭 ����� �����͸� �̵���Ű�� ���� ���� ���̴� *
2. ������ ���� (���������� Array ���) , �ߺ��� ���
3. �������� ���� ���� : Array ��� 
 */

public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : "+ v.capacity());  //10 [0]~[9]  �� �뷮 ũ��
		System.out.println("size : "+ v.size());  //0 ���� ��� �뷮 = �� ������ ũ��
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(10);   //Object�� �� �Դ´�
		
		System.out.println("size : "+ v.size());  //4
		System.out.println(v.toString());  //������ �Ǿ����� =[AA, AA, AA, 10]  ������ ������ ���
		//��������� index������ ���� ��ġ sizeó�� ����߾���
		//Array >> length  =  Collectiom >> size  (X) �ٸ���
		//Collectiom >> size
		
		for(int i=0; i < v.size(); i++){
			System.out.println(v.get(i));  //get(index) ���� return  :  ������ �̷��� �߾��� array[index]
		}
		//������ for�� ���
		for(Object obj : v) {
			System.out.println(obj);
		}
		//���� : ���� ������ (���� Ÿ���� ������) ... ���� ����ū Ÿ���� ����ϴ� �� ���ո�
		//���ʸ� >> Ÿ���� ���� >> ���� ������ �н�(����� ����Ʈ��)
		Vector<String> v2 = new Vector<String>(); // <> �׸��� ������ ��  <-> ������ Object�� ���� �� ������
		v2.add("Hello");
		v2.add("World");
		v2.add("world");
		v2.add("king");
		System.out.println(v2.toString());
		for(String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");     //11�� ���� ...!!
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.toString());
		System.out.println(v3.capacity());  //20�� �� -> ������ 2��� ����  ------ �߿��Ѱ� �ƴ�
		
		//���� : �׳� ����� �ǿ� (���� �˾Ƽ� �ø��� �ϴ� �׳� ����ϸ� �ǿ�)
		
	}

}
