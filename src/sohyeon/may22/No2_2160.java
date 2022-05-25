package sohyeon.may22;

import java.util.Scanner;

//https://blog.naver.com/parkhj2416/221874854821
/*
 * ����
N(2 �� N �� 50)���� �׸��� �ִ�. ������ �׸��� 5��7�� ũ���̰�, �� ���� ������ �Ǿ� �ִ�. �̶� �� ������ ���� ���� ��X���� ��.������ ǥ���ϱ�� ����.

�̷��� �׸����� �־����� ��, ���� ����� �� ���� �׸��� ã�Ƴ��� ���α׷��� �ۼ��Ͻÿ�. �� ���� �׸����� �ٸ� ĭ�� ������ ���� ���� ��, �� ���� �׸��� ���� ����ϴٰ� ����.

���� ��� ���� ���� �� ���� �׸��� �־����� ��, ��ĥ�� �κ��� ���� �ٸ��� �ȴ�. ���� �׸��� 5���� ĭ�� ���� �ٸ���. �̿� ���� ���� �ٸ� ĭ�� ������ ���� ���� ��츦 ã�� ���̴�.
--
�Է�
ù° �ٿ� N�� �־�����. ���� 5��N���� �ٿ� 7���� ���ڷ� ������ �׸��� �־�����.
--
���
ù° �ٿ� ���� ����� �� �׸��� ��ȣ�� ����Ѵ�. �׸��� ��ȣ�� �ԷµǴ� ������� 1, 2, ��, N�̴�.

��ȣ�� ����� ������ ���� ���� ���� ����Ѵ�. �Է��� �׻� ���� �� ������ ��츸 �־�����.
--
���� �Է� 1 
3
..X....
.XXX...
.XX....
.....X.
.X...X.
...X...
..XX...
.XX....
.XX..X.
.X...X.
XX.....
X......
XX...XX
XXXX.XX
XXX..XX
���� ��� 1 
1 2
*/
public class No2_2160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[][][] arr = new String[N][5][7];									// 3���� �迭 ����

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String str = sc.next();
				arr[i][j] = str.split("");										// �迭�� ���� �ϳ��� �Է�

			}
		}
		
		int next = 0;
		int min = Integer.MAX_VALUE;
		int minidx1 = 0, minidx2 = 0;

		for (int i = 0; i < N - 1; i++) {
			next = i + 1;
			
			while (next != N) {
				
				int cnt = 0;
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 7; k++) {
						if (!arr[i][j][k].equals(arr[next][j][k]))				// �� �׸��� ���� ��ǥ�� �ٸ��� ī��Ʈ ����
							cnt++;
						
					}
				}
				
				if (min > cnt) {												// �ּҰ� ���Ͽ� ����
					min = cnt;
					minidx1 = i + 1;											// �ּ� �ε���1
					minidx2 = next + 1;											// �ּ� �ε���2
				}
				next++;
			}
		}
		
		System.out.println(minidx1 + " " + minidx2);
		
		sc.close();
	}

}
