package pracLife01;

public class inherit01 {

	class Mushroom{  //����
		boolean fungus;  // �շ�����, �ƴ���
	}
//	------------------------------------------------------------------------
	class EatableMushroom extends Mushroom{ //�Ŀ����
		boolean eatable;  //���� �� �ִ���, �ƴ���
	}
	
	class YellowEgg extends EatableMushroom{  //����ް�����
		String color;  //����
	}
	
	class BrownPineCone extends EatableMushroom{  //�����ֹ�����
		int size;  //�����ֹ�� ������ ũ��
	}
//	------------------------------------------------------------------------
	class MediMushroom extends Mushroom{  //������
		boolean medi;  //������ ���̴���, �ƴ���
	}
	
	class Cordyceps extends MediMushroom{  //��������
		boolean lifeinbug;  //������ ���ַ� �����, �ƴ���
	}
	
	class Reishi extends MediMushroom{  //��������
		boolean polish;  //������ ����
	}
//	------------------------------------------------------------------------
	class PoisonMushroom{  //������
		boolean poison;  //�� ���� ����
	}
	
	class PoisonFireCoral extends PoisonMushroom{  //�����罿�Թ���
		boolean cure;  //�ص����� ����
	}
	
	class Clown extends PoisonMushroom{  //�˱������
		boolean contain_tricothecene;   //Ʈ�����׽��� �����Ǿ� �ִ���
	}

}
