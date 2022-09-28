package pracLife01;

public class ifp2 {

	public static void main(String[] args) {
		
		String id = args[0];
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
//switch문과 if문은 서로 대체가 가능함
// && = and     엠퍼센드 둘중에 하나라도 트루가 아니면 펄스가 된다
// || = or             둘중에 하나라도 트루면 실행 됨