package sohyeon.apr30;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����
������ �л��鿡�� �뷡�� ����ġ�� �ִ�. �� N���� �Ǻ��� �ְ� i��° �Ǻ��� Bi�ʷ� �̷���� �ִ�.

�л����� 0�ʺ��� 1�� �Ǻ��� ���� �뷡�ϱ� �����ߴ�. �� B1-1�ʿ� 1�� �Ǻ��� ����ġ�� �ǰ� B1�ʺ��� B1+B2-1�ʱ��� 2�� �Ǻ��� ���� �θ��� �ȴ�.

�Ǻ�	1	1	2	3	3	3
�ð�	0	1	2	3	4	5

������ T1���� TQ���� Q���� �ð��� ���� ����� �ϴ� ���ε�, Ti�� �� �뷡�ϴ� �Ǻ��� i��°�� ����ϴ� ���̴�.
--
�Է�
ù �ٿ��� �Ǻ� �� N(1 �� N �� 100)�� ������ ���� Q(1 �� Q �� 1,000)�� �־�����.

���� N���� �ٿ��� 1�� �Ǻ����� N�� �Ǻ����� �� �Ǻ��� �����ϴ� �ð�(��)�� �� �ٿ� �ϳ��� �־�����. �� �Ǻ��� �����ϴ� �ð��� 100 ������ �����̴�.

���� Q���� �ٿ��� �˰��� �ϴ� Q���� �ð�(��)�� �� �ٿ� �ϳ��� �־�����. ���� �ð� ���� ������ �־�����.
--
���
Q���� �ٿ� 1�� �������� Q�� �������� �ش� �ð�(��)�� �θ��� �Ǻ��� ��ȣ�� ����Ѵ�.
--
���� �Է� 1 
3 5
2
1
3
2
3
4
0
1
���� ��� 1 
2
3
3
1
1
*/
public class No3_1392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();													// �Ǻ� ��
		int Q = sc.nextInt();													// ���� ����

		int music[] = new int[N];
		int time[] = new int[Q];
		
		for (int i = 0; i < N; i++) {											// �Ǻ��� �����ϴ� ��
			music[i] = sc.nextInt();
			
		}

		for (int j = 0; j < Q; j++) {											// �˰��� �ϴ� �ð�
			time[j] = sc.nextInt();
			
		}

		int idx = 1;
		int I = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			list.add(idx);
			music[I]--;
			
			if (music[I] == 0) {
				I++;
				idx++;
			}

			if (I == N)
				break;
		}

		for (int i = 0; i < time.length; i++) {
			System.out.println(list.get(time[i]));
		}
		
		sc.close();
	}

}
