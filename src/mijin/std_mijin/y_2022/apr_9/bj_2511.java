package mijin.std_mijin.y_2022.apr_9;

import java.util.Scanner;

public class bj_2511 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int as =0; //��������
		int bs =0;
	
		String winner="D";//��������
		int A[] = new int[10];
		int B[] = new int[10];
		int i=0;
		//�Է�
		for(int j=0;j<10;j++)
			A[j]=s.nextInt();
		for(int j=0;j<10;j++)
			B[j]=s.nextInt();
		
		for(i=0;i<10;i++) {
			if(A[i]>B[i]) {
				winner ="A";
				as+=3;
			}
			else if(A[i]<B[i]) {
				winner ="B";
				bs+=3;
			}else {
				as+=1;
				bs+=1;
			}
		}
		
		//���
		
		System.out.println(as+" "+bs);
		System.out.println(winner);

	}

}
