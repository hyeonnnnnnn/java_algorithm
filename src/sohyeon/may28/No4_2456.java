package sohyeon.may28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//https://garonguri.tistory.com/m/36
/*
 * ����
N���� �л����� ���� �ʵ��б� �ݿ��� �б�ȸ�� ���Ÿ� �Ϸ��� �Ѵ�. �� �� 3���� ȸ���ĺ��� ���԰�, �̵鿡 ���� ��ȣ���� N���� �л��� �������� ������� �Ͽ���.

�� ���� �ĺ��� �ĺ� 1��, �ĺ� 2��, �ĺ� 3���̶� �Ѵ�.

��� �л��� 3���� �ĺ� �߿��� ���� ��ȣ�ϴ� �ĺ����Դ� 3��, �� ��°�� ��ȣ�ϴ� �ĺ����Դ� 2��, ���� ��ȣ���� �ʴ� �ĺ����Դ� 1���� �־�� �Ѵ�.

3���� �ĺ��� ���� �� �л��� ��ȣ ������ ��� �ٸ���, 1��, 2��, 3���� ��Ȯ�� �� ���� ��Ÿ���� �Ѵ�. 

�ĺ��� ���� ������ �л���κ��� ���� �ڽ��� ��ȣ�� ������ ��� ���� ���� �ȴ�. �׷��� 3���� �ĺ� �� ���� ū ������ ���� �ĺ��� ȸ������ �����ȴ�.

��, ������ ���� ū �ĺ��� ���� ���� ��쿡�� 3���� �� ���� ���� �ĺ��� ȸ������ �����ϰ�, 3���� ���� Ƚ���� ���� ��쿡�� 2���� �� ���� ���� �ĺ��� ȸ������ �����Ѵ�.

�׷��� 3���� 2���� ���� Ƚ���� ��� �����ϸ�, 1���� ���� Ƚ���� ���� ���ۿ� ���� ȸ���� �������� ���ϰ� �ȴ�.

�������� ��ȣ�� ��ǥ�� ���� ���� �� �ĺ��� ������ ����� ��, �����ϰ� ȸ���� �����Ǵ� ��쿡�� ȸ������ ������ �ĺ��� ��ȣ(1, 2, 3 �� �� ��ȣ)�� �ְ� ������ ����ϰ�,

ȸ���� �������� ���ϴ� ��쿡�� ��ȣ 0�� �ְ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ��� ���� �л����� �� N (3 �� N �� 1,000)�� �־�����.

���� N���� �� �ٿ��� �� �л��� ������ ȸ���ĺ� 3�� ���� ��ȣ ������ �־����� ��,

ù ��° ������ �ĺ� 1���� ���� �����̰� �� ��° ������ �ĺ� 2���� ���� �����̰� �� ��° ������ �ĺ� 3���� ���� �����̴�.

�� �� ������ ���� �ٸ���, 1, 2, 3�� ��Ȯ�� �� ���� ��Ÿ����. 
--
���
�л����� ��ȣ�� ��ǥ ����κ���, ȸ���� �����ϰ� �����Ǵ� ��쿡�� ȸ������ ������ �ĺ��� ��ȣ�� �ְ� ������ ����ϰ�, �����ϰ� ������ �� ���� ��쿡�� 0�� �ְ� ������ ����Ѵ�.
--
���� �Է� 1 
6
3 1 2
2 3 1
3 1 2
1 2 3
3 1 2
1 2 3
���� ��� 1 
1 13
--
���� �Է� 2 
6
1 2 3
3 1 2
2 3 1
1 2 3
3 1 2
2 3 1
���� ��� 2 
0 12
*/
public class No4_2456 {
	static int[][] candidate;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());											// �л� ��
		candidate = new int[4][N];
		int[][] sum = new int[4][5];
		
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			candidate[1][i] = Integer.parseInt(st.nextToken()); 							// 1������
			candidate[2][i] = Integer.parseInt(st.nextToken()); 							// 2������
			candidate[3][i] = Integer.parseInt(st.nextToken()); 							// 3������

			for (int j = 0; j < 3; j++) {
				sum[j + 1][4] = j + 1; 														// �ĺ� ��ȣ�� �������
				sum[j + 1][0] += candidate[j + 1][i]; 										// �ش� �ĺ��� ��������
				sum[j + 1][((candidate[j + 1][i]) % 3) + 1]++; 								// �ĺ��� ���� ���� ����
			}
		}

		Arrays.sort(sum, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				} else {
					return o2[0] - o1[0];
				}
			}
		});

		int[] arr1 = Arrays.copyOfRange(sum[0], 1, 4);
		int[] arr2 = Arrays.copyOfRange(sum[1], 1, 4);

		for (int[] i : sum) {
			for (int in : i) {
				System.out.print(in + " ");
			}
			System.out.println();
		}

		if (sum[0][0] == sum[1][0]) {
			if (is(arr1, arr2)) {
				System.out.println(0 + " " + sum[0][0]);
			} else {
				System.out.println(sum[0][4] + " " + sum[0][0]);
			}
		} else {
			System.out.println(sum[0][4] + " " + sum[0][0]);
		}
	}

	private static boolean is(int[] a, int[] b) {
		int cnt = 0;
		for (int s = 0; s < 3; s++) {
			if (a[s] == b[s]) {
				cnt++;
			}
		}
		if (cnt == 3)
			return true;
		else
			return false;
	}

}
