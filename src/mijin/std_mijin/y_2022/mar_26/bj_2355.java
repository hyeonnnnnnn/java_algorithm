package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

public class bj_2355 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long A,B;
		A =s.nextLong();
		B =s.nextLong();
		long tmp=0;
		long sum=0;//합
		
		//큰걸 A로
		if(A<B) {
			tmp=A;
			A=B;
			B=tmp;
		}
		
		if(A>0 && B>0) {
			sum= gap(A,B);
		}
		else if(A>0 && B<0) {
			sum= gap(A)-gap((long)-1*B);
		}
		else if(A<0 && B<0) {
			sum= gap((long)-1*A, (long)-1*B);
		}
		System.out.println(sum);
	}
	
	public static long gap(long max,long min) {
		long result=0;
		if((max+min%2)==0) {
			result= (long)((max+min+1)*(max+min)/2);
		}else {
			result= (long)((max+min)*(max-min+1)/2);
		}
		return result;
	}
	public static long gap(long max) {
		
		return gap(max,0);
	}

}
