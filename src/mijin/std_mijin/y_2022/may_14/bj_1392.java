package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1392 {
	public static void main(String[] args) {
		int tmp=0; 
		int arr[] = new int[100000];
		int in=0;
		Scanner s = new Scanner(System.in);
		int N,Q; //악보수 질문수
		N = s.nextInt();
		Q = s.nextInt();
		
		for (int i=1;i<=N;i++) {
			in = s.nextInt();
			for(int j=tmp;j<tmp+in;j++) {
				arr[j]=i;
				//System.out.println("j"+j+arr[j]);
			}
			tmp+=in;
			//System.out.println(tmp);
		}
		System.out.println();
		for(int i=0;i<Q;i++) {
			System.out.println(arr[s.nextInt()]);
		}
		
	}
}
