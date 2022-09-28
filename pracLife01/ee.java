package pracLife01;

import java.util.Scanner;

public class ee {

	public static void main(String[] args) {
		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요: ");
		money = Integer.parseInt(scan.nextLine());
	    
	    while(true) {
	    	num = (int)(money/unit);
	    	System.out.printf("%d %d개 \n", unit, num);
		    if(unit > 1) {
		    	money = money - unit*num;
		    	   if(sw == 0) {
		    		   unit = unit/2;
		    		   sw = 1;
		    	   } else {
		    		   unit = unit/5;
		    		   sw = 0;
		    	   }
		    } else {
		        break;
		    }    
	    }
	}
}