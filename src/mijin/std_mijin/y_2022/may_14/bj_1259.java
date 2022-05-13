package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1259 {
	public static void main(String[] args) {
		int len;
		String N;
		Scanner s=  new Scanner(System.in);
		N=s.next();
		String rs="";
		while( N.charAt(0) !='0' ) {
			len = N.length();
			rs= "yes";
			for(int i=0;i<len/2;i++) {
				if(N.charAt(i) != N.charAt(len-1-i)) 
					rs= "no";
			}
			System.out.println(rs);
			N=s.next();
		}
	}
}
