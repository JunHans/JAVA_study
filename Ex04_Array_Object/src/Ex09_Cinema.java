
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				//좌석을 초기화
				seat[i][j]= "__";  //문자열로 초기화
				
			}
		}
		//예매
		seat[2][1] = "임준한";
		seat[0][0] = "김유신";
		
		//예매 좌석 현황 보여주기
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "좌석":"예매");
			}
			System.out.println();
		}
		//예매 하려고 ... 그좌석이 예매가능한지 ... 예매가 되었는지 알려주어요
		int row, col;
		row= 1;
		col= 0;
		if(seat[row][col].equals("__")) {
			System.out.println("예매가능한 좌석이오");
		}else {
			System.out.println("이미 예매된 자석이오");
		}
		
		//모든 좌석 초기화 "__"
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				//좌석을 초기화
				seat[i][j]= "__";  //문자열로 초기화
				
			}
		}
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "좌석":"예매");
			}
			System.out.println();
		}

	}

}
