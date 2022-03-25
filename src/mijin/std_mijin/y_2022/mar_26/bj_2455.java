package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

public class bj_2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N;
		N= s.nextInt();
		
		for (int i=1;i<=N;i++) {
			for (int j=N;j>i;j--)
				System.out.print(" ");
			for (int s1=0;s1<i;s1++)
				System.out.print("*");
			System.out.println();
		}

	}

}
