package mijin.std_mijin.y_2022.nov_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pg_12911 {
//https://school.programmers.co.kr/learn/courses/30/lessons/12911
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		n= Integer.parseInt(br.readLine());
		String st;
		st = bny(n).replace("0", "");
		for(int i=n+1;i<999999999;i++) {
			if(st.equals(bny(i).replace("0", ""))) {
				System.out.println(i);
				break;
			}
		}
		

	}
	public static String bny(int num) {
		String ans="";
		while(num>0) {
			ans =(num%2) +ans;
			num/=2;
		}
		return ans;
	}
}
