package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1236 {
	public static void main(String[] args) {
		
		int N = 0,M=0;
		Scanner s = new Scanner( System.in);
		N=s.nextInt();
		M= s.nextInt();
		int col[] = new int[M];
		int flag =0;
		int c=0,r=0;
		String tmp;
		//입력받으면서 x가 나왔을 때 해당하는 열 표시 
		for(int i=0;i<N;i++) {
			flag=0;
			tmp = s.next();
			System.out.println();
			for (int j=0;j<M;j++) {
				if(tmp.charAt(j) =='X' ) {
					col[j]++;
					flag=1;
				}
			}
			
			//x가 없으면 그 행에는 한명이 필요함
			if(flag ==0)
				r++;
		}
		
		for (int i =0;i<M;i++) {
			if(col[i]==0)
				c++;
		}
		
		System.out.println(r>c?r:c);
		
	}
}
