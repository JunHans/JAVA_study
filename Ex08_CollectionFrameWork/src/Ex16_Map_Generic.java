import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Set;

class QuizInfo{
	String question;
	String answer;
	String result;
	
	public QuizInfo(String question, String answer, String result) {
		super();
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

	@Override
	public String toString() {
		return "QuizInfo [문제=" + question + ", 답안=" + answer + ", 결과=" + result + "]";
	}
	
	
	
}

public class Ex16_Map_Generic {
	public static void main(String[] args) {
		
		HashMap<String, String> quiz = new HashMap<String, String>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i=0; i<quiz.size(); i++) {
			Set set = quiz.keySet();  //key 값만 받아올 수 있는 방법!!! (SEt인터페이스로 받아온다)
			Object[] obj = set.toArray();  //배열로 바꾸어줌 
			//System.out.println(obj.length);
			System.out.println("문제는 : "+ obj[i]);
			//System.out.println(quiz.keySet().toArray()[i]);
			
		}
		
		
		
		

	}

}
