package pracLife01;

import java.util.Scanner;

public class Prac5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력해주세요");
		
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int i = 0;
		
		int answer = 0;
		
		if(a<b){
			for(; a<=b; a++) {
				answer = answer+a;
			}
		} else if(a>b){
				for(; a>=b; b++) {
					answer = answer+b;
				}
			}
		System.out.println(answer);
		}
		
		
	}


