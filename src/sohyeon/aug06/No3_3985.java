package sohyeon.aug06;

import java.util.Scanner;

/*
 * ����
�α� Ƽ�� ���α׷� "���� �丮�� �ΰ�?"�� �� ������ �����Ѵ�. �̹� ������ ��׽��Ͽ� ����� ���� ������ ����� ���� ��ǥ�� �����Ѵ�.

ù ��° ���Ǽҵ忡 �⿬�ϴ� �丮��� ������ �丮�� �����̰�, ���� L������ �� ����ũ�� ���� ���̴�.

����� �� �ð����� �����ؼ� ����ũ�� �������, ���� ��Ʃ����� ��û�� N������ ����ũ�� ������ �ַ��� �Ѵ�.

����̴� �� ����ũ�� ���ļ� 1���� ������ �߶� ���Ҵ�. ���� ���� ������ 1��, ������ ������ L�� �����̴�. 

��û���� 1������ N������ ��ȣ�� �Ű��� �ִ�. �� ��û���� ���̿� �ڽ��� ���ϴ� ������ ��� ����. �̶�, �� �� P�� K�� ��� ����, P�� �������� K�� ������ ���Ѵٴ� ���̴�.

���α׷��� ������ ��â���� 1�� ��û���� ���̺��� ������� ���ļ� �ش��ϴ� ������ �� ����� ��ȣ�� ���� ���̴�. 

�̶�, �̹� ��ȣ�� �����ִ� ������ ��ȣ�� ���� ���ϰ� �Ѿ��. �̷� ����� �̿��ؼ� ��û������ ������ �ִٺ���, �ڽ��� ���� ���ߴ� ������ ���� ���ϴ� ��찡 ���� �� �ִ�.

�Ʒ� �׸��� �� ������ ������ ��Ÿ�� ���̴�.



���� ���� ����ũ ������ ���� ������ ����� ��û���� ��ȣ�� ������ ���� ���� ����ũ ������ �޴� ��û���� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �� ����ũ�� ���� L (1 �� L �� 1000)�� �־�����. ��° �ٿ��� ��û���� �� N (1 �� N �� 1000)�� �־�����. 

���� N�� �ٿ��� �� ��û�� i�� ���̿� ��� �� Pi�� Ki�� �־�����. (1 �� Pi �� Ki �� L, i = 1..N)
--
���
ù° �ٿ� ���� ���� ������ ���� ������ ����ϰ� �ִ� ��û���� ��ȣ�� ����Ѵ�.

��° �ٿ� ������ ���� ���� ������ ���� ��û���� ��ȣ�� ����Ѵ�.

���� ���� ������ �޵��� ����Ǵ� ��û���� ���� ���� ��쿡�� ��ȣ�� ���� ����� ����Ѵ�.
--
���� �Է� 1 
10
3
2 4
7 8
6 9
���� ��� 1 
3
1
--
���� �Է� 2 
10
3
1 3
5 7
8 9
���� ��� 2 
1
1
--
���� �Է� 3 
10
5
1 1
1 2
1 3
1 4
7 8
���� ��� 3 
4
5
*/
public class No3_3985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();													// ������ũ ����
		int N = sc.nextInt();													// ��û�� ��
		
		int num1 = 0;															// ���� ���� ������ ���� ������ ����ϰ� �ִ� ��û��
		int num2 = 0;															// ������ ���� ���� ������ ���� ��û��
		int max = 0;															// �ִ� ���� ��
		
		int maxSum = Integer.MIN_VALUE;
		int cake[] = new int[L];												// ������ũ
		
		for (int i = 0; i < N; i++) {
			int P = sc.nextInt();												// P�� ����
			int K = sc.nextInt();												// K�� ����
			int sum = 0;														// ���� ��
			
			// ����
			if ((K - P) > max) {
				max = (K - P);													// �ִ�� ���� �� �ִ� ���� ���� ��
				num1 = i + 1;													// ���� ���� ������ ���� ������ ����Ǵ� ��û��
			}
			
			// ����
			for (int j = P - 1; j < K; j++) {
				if (cake[j] == 0) {												// ��������� ���� ��û�� ��ȣ �־��ֱ�
					cake[j] = (i + 1);
					sum++;														// ��û���� ������ �ִ� ���� ���� ��++
				} 
			}
			if (sum > maxSum) {													// ���� ���� �� ���ؼ�
				num2 = (i + 1);													// ���� ���� ���� ���� ������ �ִ� ��û��
				maxSum = sum;
			}
		}
		sc.close();
		
		System.out.println(num1);
		System.out.println(num2);
	}

}