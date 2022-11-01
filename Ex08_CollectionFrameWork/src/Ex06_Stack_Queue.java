import java.util.Stack;

public class Ex06_Stack_Queue {
	public static void main(String[] args) {
		//JAVA API 제공하는 클래스
		// Collection 
		
		//Stack 자료구조 가지는 클레ㅐ스 제공받아여
		Stack s = new Stack();  //LIFO
		s.push("A");  //넣을 때는 push
		s.push("B");
		s.push("C"); 
		
		System.out.println(s.empty());
		
		
//		s.pop(); //뺴낼때는 pop
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		//java.util.EmptyStackException
		//System.out.println(s.pop());
		
		System.out.println(s.empty());
	
		
		
	
	}
	
	

}
