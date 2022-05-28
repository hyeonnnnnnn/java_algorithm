package sohyeon.may28;

import java.util.Scanner;

/*
 * ����
2���� �迭�� �־����� �� (i, j) ��ġ���� (x, y) ��ġ������ ����Ǿ� �ִ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �迭�� (i, j) ��ġ�� i�� j���� ��Ÿ����.
--
�Է�
ù° �ٿ� �迭�� ũ�� N, M(1 �� N, M �� 300)�� �־�����. ���� N���� �ٿ��� M���� ������ �迭�� �־�����.

�迭�� ���ԵǾ� �ִ� ���� ������ 10,000���� �۰ų� ���� �����̴�. �� ���� �ٿ��� ���� ���� �κ��� ���� K(1 �� K �� 10,000)�� �־�����.

���� K���� �ٿ��� �� ���� ������ i, j, x, y�� �־�����(1 �� i �� x �� N, 1 �� j �� y �� M).
--
���
K���� �ٿ� ������� �迭�� ���� ����Ѵ�. �迭�� ���� 231-1���� �۰ų� ����.
--
���� �Է� 1 
2 3
1 2 4
8 16 32
3
1 1 2 3
1 2 1 2
1 3 2 3
���� ��� 1 
63
2
36
*/
public class No2_2167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();													// �迭�� ũ��
		int M = sc.nextInt();													// �迭�� ũ��
		int[][] arr = new int[N+1][M+1];										// �Է°� ������ �迭 ����
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();													// �� ���� ����
		
		for(int m = 0; m < K; m++) {
			int sum = 0;
			int x1 = sc.nextInt();												// (i,j) (x,y) ��ǥ �Է¹޾Ƽ�
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int i = x1; i <= x2; i++) {
				for(int j = y1; j <= y2; j++) {
					sum += arr[i][j];											// (i,j)~(x,y) ���� ��
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}

}
