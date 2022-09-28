package pracLife02;

interface Figure {  //인터페이스 선언
	void draw();
}

class Circle implements Figure {  //써클이 인터페이스를 받고 인터페이스의 추상함수를 재정의
	@Override
	public void draw() {
		System.out.println("Circle의 draw 메소드");
	}
}

class Rectangle implements Figure {  //렉탱글이 인터페이스를 받고 인터페이스의 추상함수를 재정의
	@Override
	public void draw() {
		System.out.println("Rectangle의 draw 메소드");
	}
}

class Square implements Figure {  //스퀘어가 인터페이스를 받고 인터페이스의 추상함수를 재정의
	@Override
	public void draw() {
		System.out.println("Square의 draw 메소드");
	}
}

//객체가 늘어나면 클래스마다 재정의 해줘야되서 클래스가 많아지는 단점이 존재

class FigureFactory {  //객체생성을 담당 및 처리하는 클래스
	public Figure getFigure(String figureType) {   
		if (figureType == null) {
			return null;
		}
		if (figureType.equalsIgnoreCase("CIRCLE")) {  
			return new Circle();                      
		} else if (figureType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (figureType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}

public class Factory_pattern {
	public static void main(String[] args) {
		FigureFactory figureFactory = new FigureFactory();
		
		Figure fig1 = figureFactory.getFigure("CIRCLE");  //들어오는 인자에 따라서 자식클래스의 인스턴스를 반환
		fig1.draw();                                      //대소문자 구분없이 문자열 비교하고 일치하면 true반환
		// Circle의 draw 메소드 호출                           //인터페이스의 draw함수를 부르는데, 재정의 되어서 Circle의 재정의된 함수를 불러온다

		Figure fig2 = figureFactory.getFigure("RECTANGLE");

		// Rectangle의 draw 메소드 호출
		fig2.draw();

		Figure fig3 = figureFactory.getFigure("SQUARE");

		// Square의 draw 메소드 호출
		fig3.draw();
	}
}
