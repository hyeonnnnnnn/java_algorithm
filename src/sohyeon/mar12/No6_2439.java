package sohyeon.mar12;

import java.util.Scanner;

/*
 * ����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
--
�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.
--
���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
--
���� �Է� 1 
5

���� ��� 1 
    *
   **
  ***
 ****
*****
*/

public class No6_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		int N = sc.nextInt();
 
		for (int i = 1; i <= N; i++) {							// N�� ����
			
			for (int j = 1; j <= N - i; j++) {					// �Է��� ������ 1 ���� ��ĭ
				System.out.print(" ");
				
			}
			
			for (int k = 0; k < i; k++) {						// �Է��� �� 
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		sc.close();
	}

}
