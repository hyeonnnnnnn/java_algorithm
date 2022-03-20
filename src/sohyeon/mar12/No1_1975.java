package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
â���̴� �ɽ��ؼ� ȥ�� ��� ���� ������ �ϳ� �����س´�.

���� N�� ���� ���ϰ�, �� ���ڸ� 2����, 3����, 4����, ..., 100������, 100�� 1���� ������� �ٲپ� ���鼭, �������ڸ��� ���ӵ� 0�� ������ ��� ���ϴ� ���̴�.

���� ��� N=5���, 2���� 101, 3���� 12, 4���� 11, 5���� 10, 6���� 5, 7���� 5, ... ��� �����Ƿ� ���� 1�� �ȴ�.

�������� �� ���� �־��� N�� ���ؼ� â���̰� ���� ���� ã�� ���̴�.

��Ȯ�� �����ϱ� ���� ���н����� ���ڸ�, f(N, b)�� N�� b�������� ��Ÿ���� �� �������� ������ ���ӵ� 0�� ������ ���� �� ��

�� ���ϴ� ���̴�.
--
�Է�
ù �ٿ� �׽�Ʈ ���̽��� �� T�� �־�����. ���� T�ٿ� ���ļ� N�� �־�����.

���
�� �ٿ� �� ���Ŀ� ���� ���� ����Ѵ�.
--
����
1 �� T �� 100,000
1 �� N �� 1,000
--
���� �Է� 1 
2
5
10
���� ��� 1 
1
3
*/

public class No1_1975 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());			// �׽�Ʈ���̽� ��
		
		for(int i = 0; i < T; i++) {
			int count = 0;									// 0�� ����
			
			int N = Integer.parseInt(st.nextToken());		// �Է¹޴� ��
			
			for(int j = 2; j <= N; j++) {					// 2���� N���� �����ֱ�
				
				int val = N;								// ���� �� ����
				
				while(true) {
					if(val % j != 0) {						// �������� 0�� �ƴ϶�� ����
						break;
					}
					count++;								// �������� 0�� �� 0�� ���� count
					val /= j;								// N�� j�� ������ �ٽ� ����
				}
			}
			System.out.println(count);
		}
	}

}
