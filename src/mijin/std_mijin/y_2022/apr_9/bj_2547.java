package mijin.std_mijin.y_2022.apr_9;

import java.util.Scanner;

public class bj_2547 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0;
		int t =0;
		int st=0;
		int sum=0;
		
		n=s.nextInt();
		for (int i=0;i<n;i++) {
			st= s.nextInt();
			t=0;
			for (int j=0;j<st;j++) {
				sum+=s.nextInt();
				t+=1;
			}
			System.out.println(sum%t==0?"YES":"NO");
			
			
		}

	}

}
