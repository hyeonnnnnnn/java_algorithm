package baekjoon_std.bronze1;

import java.util.Scanner;

public class bj_1356 {

	public static void main(String[] args) {
		long N;
		Scanner s= new Scanner(System.in);
		N= s.nextLong();
		
		int len =(int)(Math.log10(N)+1); //길이
		
		for(int i=0;i<len;i++) {
			if(yjnum((long)(N/Math.pow(10, i))) ==  yjnum((long)(N%Math.pow(10, i)) ) ) {
				System.out.println("YES");
				System.exit(0);
				
			}
		}
		System.out.println("NO");

	}
	static long yjnum(long N) {
		String SN = String.valueOf(N);
		int pro = 1;
		for (int i=0;i<SN.length();i++) {
			pro *= Character.getNumericValue(SN.charAt(i)); //하나씩 문자 떼서 곱해주기
		}
		return pro;
	}

}
