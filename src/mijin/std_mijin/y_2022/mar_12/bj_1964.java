package mijin.std_mijin.y_2022.mar_12;

import java.util.Scanner;

public class bj_1964 {

	public static void main(String[] args) {
		long n =0;
		Scanner s = new Scanner(System.in );
		
		n= s.nextLong();
		
		//¦��   5*(1~n���� ��) - (n*(n-1) +(n-1)) //1~n ������ �� (n+1)* (n/2)
		if (n%2==0)
			System.out.println( ((3*n*n)/2 + (5*n)/2+1)%45678 );
		else
		//Ȧ�� 5*(1~n���� ��) - (n*(n-1) +(n-1))  // 1~n ������ �� (n+1)*(n/2)+(n/2+1)
			System.out.println(((n/2 * (n+1)+n/2+1)*5 - n*n +1)%45678);
		/////
		

	}

}
