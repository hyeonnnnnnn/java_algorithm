package sohyeon.mar05;

import java.util.Scanner;

/*
 * ����
�������� �� ���� �Ʒ� �׸��� ���� ���� ��� ������. N�ܰ迡�� ���� ������ ��� �� ���ϱ�?
--
�Է�
ù° �ٿ� N(1 �� N �� 10,000,000)�� �־�����.
--
���
ù° �ٿ� N�ܰ迡�� ���� ������ 45678�� ���� �������� ����Ѵ�.
--
���� �Է� 1 
3
���� ��� 1 
22
--
���� �Է� 2 
1
���� ��� 2 
5
--
���� �Է� 3 
19
���� ��� 3 
590 
*/

public class No3_1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();

	    int mod = 45678;					// ���� ��
	    long dot = 7;						// ���� �� ����. 3�� �������Ѽ� ����
		long result = 5;
		
		for(int i = 1; i < N; i++) {
			result += dot;
			dot += 3;
		}

	    System.out.println(result % mod);
	    sc.close();
	}

}
