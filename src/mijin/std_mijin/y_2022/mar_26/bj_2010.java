package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

/*ù° �ٿ� ��Ƽ���� ���� N�� �־�����. (1 �� N �� 500,000) 
�̾ ��° �ٺ��� N���� �ٿ� ���� �� ��Ƽ���� �� ���� �÷��׸� ���� �� �ֵ��� �Ǿ� �ִ����� ��Ÿ���� �ڿ����� �־�����.
�� �ڿ����� 1,000�� ���� �ʴ´�.*/

public class bj_2010 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N ;
		N=s.nextInt(); //��Ƽ�� ����
		int sum=0; //���� ���� �� �ִ� ����

		for(int i=0;i<N;i++) 
			sum +=s.nextInt();
	
		System.out.println(sum-(N-1));
		s.close();
	}

}
