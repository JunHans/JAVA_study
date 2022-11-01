import kr.or.kosa.MyStack;

public class Ex07_MyStrack_Main {

	public static void main(String[] args) {

		MyStack stack = new MyStack(5); //5 size

		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
