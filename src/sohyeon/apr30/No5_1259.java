package sohyeon.apr30;

import java.util.Scanner;

/*
 * ����
� �ܾ �ڿ������� �о �Ȱ��ٸ� �� �ܾ �Ӹ�����̶�� �Ѵ�. 'radar', 'sees'�� �Ӹ�����̴�.

���� �Ӹ�������� ����� �� �ִ�. ���� ���ڵ��� �ڿ������� �о ���ٸ� �� ���� �Ӹ���Ҽ���. 121, 12421 ���� �Ӹ���Ҽ���.

123, 1231�� �ڿ������� ������ �ٸ��Ƿ� �Ӹ���Ҽ��� �ƴϴ�.

���� 10�� �Ӹ���Ҽ��� �ƴѵ�, �տ� ���ǹ��� 0�� �� �� �ִٸ� 010�� �Ǿ� �Ӹ���Ҽ��� ����� ���� ������, Ư���� �̹� ���������� ���ǹ��� 0�� �տ� �� �� ���ٰ� ����.
--
�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� ������, �� �ٸ��� 1 �̻� 99999 ������ ������ �־�����. �Է��� ������ �ٿ��� 0�� �־�����, �� ���� ������ ���Ե��� �ʴ´�.
--
���
�� �ٸ��� �־��� ���� �Ӹ���Ҽ��� 'yes', �ƴϸ� 'no'�� ����Ѵ�.
--
���� �Է� 1 
121
1231
12421
0
���� ��� 1 
yes
no
yes
*/
public class No5_1259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();

			if (n == 0) {																// 0 �Է� �� ����
				break;

			} else {
				int cnt = 0;
				String str = Integer.toString(n);
				
				for (int i = 0; i < str.length() / 2; i++) {							// ������ ���ݸ�ŭ ����
					if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {			// ���� ���ڰ� ��ġ�ϸ� cnt ����
						cnt++;
						
					}
				}
				if (cnt == str.length() / 2) {											// cnt�� ���� ���� ũ��� �����ϸ� yes
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}

		sc.close();
	}

}
