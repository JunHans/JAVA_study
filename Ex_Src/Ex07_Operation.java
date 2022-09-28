
public class Ex07_Operation {

	public static void main(String[] args) {
		
		//대입연산자
		// += , -= , *= , /=
		//sum = sum +1;
//		int sum=0;
//		sum+=1; // sum = sum + 1;
//		sum-=1;
//		System.out.println("sum : " + sum);

		
		//간단한 학점 계산기
		//학점 : A+ , A- , B+ , B- , ....F
		//점수 : 94점
		
		//판단기준 90점 이상인지 >> A 부여
		//판단 95점 이상 >> A+
		//아니라면 >> A-
		
		//84 일단 80점 이상이니 > B
		//판단 85 이상 >> B+
		//아니라면 >> B-
		
		//if문을 사용해서 학점 계산을 하세요
		int score=73;
		String grade=""; //A+ , A- 를 담는 변수
		System.out.println("당신의 점수는 : " + score);
		
		if (score >= 90) {
			grade = "A";
			System.out.println("당신의 학점은 : " + grade);
				if (score>=95) {
					grade+="+";
				} else {
					grade += "-";
				}
		} else if (score >= 80) {
			grade = "B";
			System.out.println("당신의 학점은 : " + grade);
				if (score>=85) {
					grade+="+";
				} else {
					grade+="-";
				}
		} else if (score >= 70){
			grade = "C";
			System.out.println("당신의 학점은 : " + grade);
				if (score>=75) {
					grade+="+";
				} else {
					grade+="-";
				}
		} else {
			grade = "F";
			System.out.println("당신의 학점은 : " + grade);
		}
		
	}

}



////////////////////////////////////////////////////////////////////
//<1번 문제>
//알파벳(A~Z) 까지 출력하는 프로그램을 작성하세요
//(for 문을 사용하세요)

//String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","S","T","U","V","W","X","Y","Z"};