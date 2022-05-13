package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1362 {
	public static String happy =":-)";
	public static String sad =":-(";
	public static String dead ="RIP";
	
	public static void main(String[] args) {
		int sin =0;
		
		int o,w ;//적정,실제 체중
		String action;
	
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			o = s.nextInt();
			w = s.nextInt();
			sin++;
			while(true) {
				action = s.next();
				if (action.charAt(0) =='E' ) {
					w -= s.nextInt();
				}else if(action.charAt(0) =='F') {
					w+=s.nextInt();
				}else if (action.charAt(0) =='#') {
					System.out.println(sin +" "+face(o,w));
					break;
				}
				
			}
			if (action.charAt(0) =='0' ) {
				s.next();
				break;
			}
			
		}
	}
	static String face(int o,int w) {
		if(w<=0) {
			return dead;
		}else if((w>= o*0.5) && (w< o*2)) {
			return happy;
		}
		return sad;
		
	}
}
