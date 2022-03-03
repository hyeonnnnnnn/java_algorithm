package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

public class bj_1267 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N =0;
		String call =""; 
		int money;
		int Y =0;
		int M =0;
		System.out.print("ÃÑ ÅëÈ­ È½¼ö ÀÔ·Â : ");
		N= s.nextInt();
		
		int in[] = new int[N];
		for (int i=0;i<in.length;i++) {
			in[i] =s.nextInt();
			
		}
		for (int i=0;i<in.length;i++) {
			Y = Y + ( ((in[i]/30)+1) * 10);
			M = M + ( ((in[i]/60)+1) * 15) ;
		}
		
		if(Y>M) {
			call = "M";
			money =M;
		}else if(Y<M) {
			call = "Y";
			money =Y;
		}else {
			call ="Y M";
			money =Y;
		}
		
		System.out.println(call+" "+money);
	}

}
