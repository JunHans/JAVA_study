import java.util.Random;    //·¥´ýÇÑ ¼ö
import java.util.Scanner; //ÀÔ·Â ¹Þ´Â°Å

public class Aswer1Rocks {

	public static void main(String[] args) {
		
//		double random = Math.random();
//		random = (3*random+1);
//		int result = (int) random;
//		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			double random = Math.random();
			random = (3*random+1);
			int result = (int) random;
			
			System.out.println("*********************************");
			System.out.println("1. °¡À§ | 2. ¹ÙÀ§ | 3. º¸ ");
			System.out.println("*********************************");
			System.out.println("¼ÕÀ» ³»¼¼¿ä");
			int input = Integer.parseInt(sc.nextLine());
		
			System.out.println(result);
		
		
		
		if(input == 1) {
			if(result == 2) {
				System.out.println("³Í Á³¾î");
			}else if(result == 3) {
				System.out.println("³Í ÀÌ°å¾î");
			}else {
				System.out.println("ºñ°å¾î");
			} 
		}  else if(input == 2) {
			if(result == 3) {
				System.out.println("³Í Á³¾î");
			}else if(result == 1) {
				System.out.println("³Í ÀÌ°å¾î");
			}else {
				System.out.println("ºñ°å¾î");
			}
		} else if(input == 3) {
			if(result == 1) {
				System.out.println("³Í Á³¾î");
			}else if(result == 2) {
				System.out.println("³Í ÀÌ°å¾î");
			}else {
				System.out.println("ºñ°å¾î");
			}
		} else {
			System.out.println("¼ÕÀ» Á¦´ë·Î ³»ÁÖ¼¼¿ä");
		}
		}
	}

}
