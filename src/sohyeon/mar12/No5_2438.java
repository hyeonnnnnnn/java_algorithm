package sohyeon.mar12;

import java.util.Scanner;

/*
 * ����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
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

public class No5_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {						// N�� ����
			
			for(int j = 1; j <= i; j++) {					// �� �� �������
				System.out.print("*");	
			}
			
			System.out.println("");							// ���� ������
			
		}
		
		sc.close();
	}

}
