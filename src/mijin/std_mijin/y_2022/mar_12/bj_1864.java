package mijin.std_mijin.y_2022.mar_12;

import java.util.Scanner;

public class bj_1864 {

	public static void main(String[] args) {
		String ip;
		char a ;
		int sum=0;
		Scanner s = new Scanner(System.in);
		while(true) {
			ip = s.next();
			
			if (ip.equals("#"))
				break;
			
			sum=0;
			for (int i=0;i<ip.length();i++) {
				a = ip.charAt(i);
			
				switch (a) {
				case '-':
					sum += 0 * Math.pow(8, ip.length()-(i+1)) ; //i+1은 8의 0 1 2 승 순서대로 가기 위해 
					break;
				case '\\':
					sum += 1 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '(':
					sum += 2 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '@':
					sum += 3 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '?':
					sum += 4 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '>':
					sum += 5 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '&':
					sum += 6 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '%':
					sum += 7 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				case '/':
					sum += -1 * Math.pow(8, ip.length()-(i+1)) ;
					break;
				default:
					break;
				}
			
			}
			System.out.println(sum);

		}
	}

}
