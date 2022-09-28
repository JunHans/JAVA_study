package pracLife01;

public class ifp1 {

	public static void main(String[] args) {
		
		if(false) {                  //딱 한번 제일 첫줄에 등장 가능
			System.out.println(1);
		} else if(true){             //여러번 등장 가능
			System.out.println(2);
		} else if(true){                      
			System.out.println(3);
		} else {                     //마지막줄에 딱 한번 등장 가능. 필요하지 않다면 생략 가능
			System.out.println(4);
		}                            //true가 중간에 한번이라도 나오면 그 이후 것은 실행 X -> if절 다음 것으로 넘어감

	}

}
