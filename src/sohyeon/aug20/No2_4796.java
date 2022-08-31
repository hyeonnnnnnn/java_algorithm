package sohyeon.aug20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
��갡 �谭���� ������� �Բ� ķ���� ������. ������, ķ���忡�� ������ ���� ����� ���� �־���.

ķ������ �����ϴ� 20�� �� 10�ϵ��ȸ� ����� �� �ֽ��ϴ�.

�����̴� ���� �� 28�� �ް��� �����ߴ�. �̹� �ް� �Ⱓ ���� �����̴� ķ������ ��ĥ���� ����� �� ������?

�����̴� ���� �� �Ϲ�ȭ�ؼ� ������ Ǯ���� �Ѵ�. 

ķ������ �����ϴ� P�� ��, L�ϵ��ȸ� ����� �� �ִ�. �����̴� ���� �� V��¥�� �ް��� �����ߴ�. �����̰� ķ������ �ִ� ��ĥ���� ����� �� ������? (1 < L < P < V)
--
�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, L, P, V�� ������� �����ϰ� �ִ�. 

��� �Է� ������ int�����̴�. ������ �ٿ��� 0�� 3�� �־�����.
--
���
�� �׽�Ʈ ���̽��� ���ؼ�, �����̰� ķ������ �ִ� ��ĥ���� ����� �� �ִ��� ���� ���ó�� ����Ѵ�.
--
���� �Է� 1 
5 8 20
5 8 17
0 0 0
--
���� ��� 1 
Case 1: 14
Case 2: 11
*/
public class No2_4796 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = 1;													// case ��ȣ
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if (L == 0 && P == 0 && V == 0) {						// 0�� 3�� �־��� ��� ����
				break;
			}
			
			int total = L * (V / P) + Math.min(L, V % P);
			
			sb.append("Case " + num + ": " + total + "\n");
			num++;
		}
		
		System.out.print(sb);
	}

}
