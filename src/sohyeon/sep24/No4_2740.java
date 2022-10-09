package sohyeon.sep24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
N*Mũ���� ��� A�� M*Kũ���� ��� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ��� A�� ũ�� N �� M�� �־�����. ��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ������� �־�����. 

�� ���� �ٿ��� ��� B�� ũ�� M�� K�� �־�����. �̾ M���� �ٿ� ��� B�� ���� K���� ���ʴ�� �־�����. 

N�� M, �׸��� K�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.
--
���
ù° �ٺ��� N���� �ٿ� ��� A�� B�� ���� ����� ����Ѵ�. ����� �� ���Ҵ� �������� �����Ѵ�.
--
���� �Է� 1 
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
���� ��� 1 
-1 -2 6
-3 -6 12
-5 -10 18
*/
public class No4_2740 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] A = new int[N][M];

		for (int i = 0; i < N; i++) {														// A��� �Է�
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine(), " ");

		st.nextToken(); 																	// M�� - ����
		int K = Integer.parseInt(st.nextToken());

		int[][] B = new int[M][K];

		for (int i = 0; i < M; i++) {														// B��� �Է�
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < K; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// ��� ��� �� ���
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				int sum = 0;
				for (int k = 0; k < M; k++) {
					sum += A[i][k] * B[k][j];
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
