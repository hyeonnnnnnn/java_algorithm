package sohyeon.apr16;

import java.io.IOException;
import java.util.Scanner;

/*
 * ����
������ ū �迭�� ������ ���� �м����� �����ִ�.

1/1	1/2	1/3	1/4	1/5	��
2/1	2/2	2/3	2/4	��	��
3/1	3/2	3/3	��	��	��
4/1	4/2	��	��	��	��
5/1	��	��	��	��	��
��	��	��	��	��	��
�̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.

X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
--
���
ù° �ٿ� �м��� ����Ѵ�.
--
���� �Է� 1 
1
���� ��� 1 
1/1
--
���� �Է� 2 
2
���� ��� 2 
1/2
--
���� �Է� 3 
3
���� ��� 3 
2/1
--
���� �Է� 4 
4
���� ��� 4 
3/1
--
���� �Է� 5 
5
���� ��� 5 
2/2
--
���� �Է� 6 
6
���� ��� 6 
1/3
--
���� �Է� 7 
7
���� ��� 7 
1/4
--
���� �Է� 8 
8
���� ��� 8 
2/3
--
���� �Է� 9 
9
���� ��� 9 
3/2
--
���� �Է� 10 
14
���� ��� 10 
2/4
*/
// https://suda-datanote.tistory.com/58
public class No3_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i;
		
		for(i = 0; i < num; i++) {
			num = num - i;
		}
		
		if(i % 2 == 1) {											// Ȧ��
			System.out.printf("%d/%d", i-(num-1), num);
			
		} else {													// ¦��
			System.out.printf("%d/%d", num, i-(num-1));
		}
		
		sc.close();
	}

}
