package mijin.std_mijin.y_2022.jun_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
����
2���� �迭�� �־����� �� (i, j) ��ġ���� (x, y) ��ġ������ ����Ǿ� �ִ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �迭�� (i, j) ��ġ�� i�� j���� ��Ÿ����.

�Է�
ù° �ٿ� �迭�� ũ�� N, M(1 �� N, M �� 300)�� �־�����. ���� N���� �ٿ��� M���� ������ �迭�� �־�����. �迭�� ���ԵǾ� �ִ� ���� ������ 10,000���� �۰ų� ���� �����̴�. �� ���� �ٿ��� ���� ���� �κ��� ���� K(1 �� K �� 10,000)�� �־�����. ���� K���� �ٿ��� �� ���� ������ i, j, x, y�� �־�����(1 �� i �� x �� N, 1 �� j �� y �� M).

���
K���� �ٿ� ������� �迭�� ���� ����Ѵ�. �迭�� ���� 231-1���� �۰ų� ����.

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
36*/
/*���� https://dev-coco.tistory.com/m/150*/

public class bj_2167 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());
        
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int a = i - 1; a < x; a++) {
                for (int b = j - 1; b < y; b++) {
                    sum += arr[a][b];
                }
            }
            System.out.println(sum);
        }	
	}
}
