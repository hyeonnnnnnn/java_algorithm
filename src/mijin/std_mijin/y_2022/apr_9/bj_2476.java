package mijin.std_mijin.y_2022.apr_9;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2476 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0;
		int num[]=new int[3];
	
		int max =0;
		int i=0;
		
		n= s.nextInt();
		int sum[] = new int[n];
		
		for (i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				num[j] =s.nextInt();//주사위 3개 입력
			}
			
			if (num[0] ==num[1] && num[1] ==num[2]) {
				sum[i] = 10000 +num[0]*1000;
			}else if (num[0] != num[1] && num[1] != num[2] && num[0] != num[2]) {
				sum[i] = Math.max(Math.max(num[0], num[1]),num[2])*100;
			}else {
				if(num[0]==num[1]) {
					sum[i] = 1000 + num[0]*100;
				}else if (num[1]==num[2]) {
					sum[i] = 1000 + num[1]*100;
				}else {
					sum[i] = 1000 + num[0]*100;
				}
			}
			//System.out.println(i +" = " + sum[i]);
		}
		Arrays.sort(sum);
		
		System.out.println(sum[n-1]);

	}

}
