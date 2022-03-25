package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

public class bj_2438 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N;
		N= s.nextInt();
		for (int i=1;i<=N;i++) {
			for (int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
