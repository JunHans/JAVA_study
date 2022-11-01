package kr.or.kosa;

//Stack 구현하기 (Last in, First out)

import java.util.Scanner;

//JAVA API 제공하는 stack 직접 구현해보자
//1. stack 저장공간 (배열 Array: 고정배열 10), 저장공간은 타입이 있어야 함 (Object)
//2. 위치정보 : 저장되는 값이 있는 위치를 알아야 함(index) hint) 전자제품 매장 cart사용해서 처리
//3. 기능 : push함수 , pop함수 , boolean empty함수(비었니?) , full함수(차있니?) 
public class MyStack {

	private Object[] stackarr; // 저장소
	private int maxsize; // 최대크기
	private int top; // 배열의 인덱스 값 (위치정보)

	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1; // 베열의 시작값 0 (인덱스) -1은 출발안한거
	}
	//maxsize는 main에서 정의해야 함
	
	public boolean isEmpty() {
		return (top == -1); //true
	}
	public boolean isFull() {
		return (top == maxsize-1); //인덱스는 0부터 시작하니 마지막방이 4니까 [0][1][2][3][4]
	}
	
	public void push(Object x) {
        if(isFull()) { //조건값이 true면 실행되고 False면 else로 넘어가니까
        	System.out.println("꽉 찼습니다");
        }else {
        	//POINT
        	stackarr[++top] = x;  //전치증가해야함 처음 생길때 -1이니까 [0]번째방에 넣기위해서는 전치증가해줘야 함
            System.out.println(stackarr[top] + " Push!");
        }
    }
    public Object pop() {
    	Object value = null;  //굳이 맨위에서 선언하지 않는 이유?? = 다른함수에서는 필요하지 않은 변수니까! -> 지역변수로 함수안에서 선언하고 함수안에서만 사용
    	if(isEmpty()) {  //조건값이 true면 실행되고 False면 else로 넘어가니까
    		System.out.println("비었음");
    	}else {
    		value = stackarr[top];
            top--;
    	}
    	return value;

    }

	
	
	
		
//	Scanner sc = new Scanner(System.in);
//
//	public void push() {
//		for (int i = 0; i < stackarr.length; i++) {
//			stackarr[i] = sc.nextLine();
//		}
//		for(int i =0; i<stackarr.length; i++) {
//			System.out.println(stackarr[i]);
//	}
//
//	public void pop() {
//		for (int i = 0; i < stackarr.length; i++) {
//			i = sc.nextLine();
//		}
//	}

    
}

