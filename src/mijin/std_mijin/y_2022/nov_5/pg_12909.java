package mijin.std_mijin.y_2022.nov_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class pg_12909 {

	public static void main(String[] args) throws IOException {
		int num=0;
		int cnt=0;
		int flag =0;
		int flag2=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = null;
		while(true) {
			st = new String(br.readLine());
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i)== '(' ) {
					num=1;
					if( flag ==1) {
						System.out.println("False");
						flag2=1;
						break;
					}
				}else {
					
					num=-1;
					if(cnt>1)
						flag=1;
					else
						flag=0;
				}
				cnt+=num;
				if(cnt<0) {
					System.out.println("False");
					flag2=1;
					break;
				}
		}
			if(flag2==0) 
				System.out.println("true");
			
			flag2=0;
	}//케이스
	}//메인
	}//클래스


