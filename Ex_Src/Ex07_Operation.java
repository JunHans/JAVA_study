
public class Ex07_Operation {

	public static void main(String[] args) {
		
		//���Կ�����
		// += , -= , *= , /=
		//sum = sum +1;
//		int sum=0;
//		sum+=1; // sum = sum + 1;
//		sum-=1;
//		System.out.println("sum : " + sum);

		
		//������ ���� ����
		//���� : A+ , A- , B+ , B- , ....F
		//���� : 94��
		
		//�Ǵܱ��� 90�� �̻����� >> A �ο�
		//�Ǵ� 95�� �̻� >> A+
		//�ƴ϶�� >> A-
		
		//84 �ϴ� 80�� �̻��̴� > B
		//�Ǵ� 85 �̻� >> B+
		//�ƴ϶�� >> B-
		
		//if���� ����ؼ� ���� ����� �ϼ���
		int score=73;
		String grade=""; //A+ , A- �� ��� ����
		System.out.println("����� ������ : " + score);
		
		if (score >= 90) {
			grade = "A";
			System.out.println("����� ������ : " + grade);
				if (score>=95) {
					grade+="+";
				} else {
					grade += "-";
				}
		} else if (score >= 80) {
			grade = "B";
			System.out.println("����� ������ : " + grade);
				if (score>=85) {
					grade+="+";
				} else {
					grade+="-";
				}
		} else if (score >= 70){
			grade = "C";
			System.out.println("����� ������ : " + grade);
				if (score>=75) {
					grade+="+";
				} else {
					grade+="-";
				}
		} else {
			grade = "F";
			System.out.println("����� ������ : " + grade);
		}
		
	}

}



////////////////////////////////////////////////////////////////////
//<1�� ����>
//���ĺ�(A~Z) ���� ����ϴ� ���α׷��� �ۼ��ϼ���
//(for ���� ����ϼ���)

//String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","S","T","U","V","W","X","Y","Z"};