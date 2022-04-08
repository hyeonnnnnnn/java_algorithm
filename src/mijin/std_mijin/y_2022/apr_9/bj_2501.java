package mijin.std_mijin.y_2022.apr_9;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2501 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int y;
		int i=0;
		int k=0;
		
		n=s.nextInt();
		y=s.nextInt();//y¹øÂ° ¼ö
		int num[]=new int [n+1];
		System.out.println("n :"+n+"y"+y);
	
		int max =n;
		for (i=1;i<max;i++) {
			if(n%i==0) {
				max =n/i;
				
				num[++k]=i;
				if( i!=n/i)
					num[++k] =n/i;
			}
		}
		Arrays.sort(num);
	
		try {
			if(num[(n-k)+y] != 0) {
				System.out.println(num[(n-k)+y]);
			}
		}
		catch(Exception e){
				System.out.println("0");
			}

	}

}
