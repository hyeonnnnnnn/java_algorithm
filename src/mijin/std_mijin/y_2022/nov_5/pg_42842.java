package mijin.std_mijin.y_2022.nov_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class pg_42842 {

	public static void main(String[] args) throws IOException {
		int B,Y,C = 0,R=0; //브라운,옐로우, 컬럼, 로우
		StringTokenizer st ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st =new StringTokenizer(br.readLine());
		
		B=Integer.parseInt( st.nextToken());
		Y=Integer.parseInt( st.nextToken());
		
		for(int i=1;i<=Y;i++) {
			if(Y%i==0) {
				if( ((i+2)*(Y/i+2))-Y == B) {
					R=i+2;C=Y/i+2;
					break;
				}
			}
		}
		
		System.out.println(C+" "+R);
		
	}

}
