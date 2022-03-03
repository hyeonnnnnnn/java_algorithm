package mijin.std_mijin.y_2022.feb_11;

import java.util.Scanner;

public class bj_1212 {
	public static void main(String[] args) {
		//https://blog.naver.com/parkhj2416/221913266413
		//Âü°í
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String [] st;
		st = s.split("");
		
		StringBuffer sb = new StringBuffer();
		
		for (int i=0;i<s.length();i++) {
			int num = Integer.parseInt(st[i]);
			if(i!=0 && num <=1)
				sb.append("00");
			else if (i!=0 &&(num==2 || num ==3))
				sb.append("0");
			sb.append(Integer.toBinaryString(num));
		}
		System.out.println(sb);
	}
}
