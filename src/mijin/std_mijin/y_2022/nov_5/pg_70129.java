package mijin.std_mijin.y_2022.nov_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pg_70129 {
	//https://school.programmers.co.kr/learn/courses/30/lessons/70129
	public static void main(String[] args) throws IOException {
		
		String st; //입력1
		String st2;
		int len =0;
		int zerocnt=0,turncnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st= br.readLine();
		
		while(!st.equals("1")) {
			
			st2 =st.replaceAll("0", "");
			zerocnt+=st.length() -st2.length(); //제거된 0 개수 더하기 
			st = bny(st2.length());
			turncnt++;
			
		
		}
		System.out.println( turncnt + " "+ zerocnt);
		
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
