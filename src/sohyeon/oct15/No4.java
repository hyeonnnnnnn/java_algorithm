package sohyeon.oct15;

import java.util.Scanner;

/* ���� ����
 * Leo�� ī���� �緯 ���ٰ� �Ʒ� �׸��� ���� �߾ӿ��� ��������� ĥ���� �ְ� �׵θ� 1���� �������� ĥ���� �ִ� ���� ��� ī���� �ý��ϴ�.

carpet.png

Leo�� ������ ���ƿͼ� �Ʊ� �� ī���� ������� �������� ��ĥ�� ������ ������ ���������, ��ü ī���� ũ��� ������� ���߽��ϴ�.

Leo�� �� ī�꿡�� ���� ������ �� brown, ����� ������ �� yellow�� �Ű������� �־��� �� ī���� ����, ���� ũ�⸦ ������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
--
���ѻ���
���� ������ �� brown�� 8 �̻� 5,000 ������ �ڿ����Դϴ�.
����� ������ �� yellow�� 1 �̻� 2,000,000 ������ �ڿ����Դϴ�.
ī���� ���� ���̴� ���� ���̿� ���ų�, ���� ���̺��� ��ϴ�.
--
����� ��
brown	yellow	return
10	2	[4, 3]
8	1	[3, 3]
24	24	[8, 6]
--
��ó

�� ���� - 2020�� 2�� 3�� �׽�Ʈ���̽��� �߰��Ǿ����ϴ�.
�� ���� - 2020�� 5�� 11�� �����ټ��� ����Ͽ� �������� ��������� �����Ͽ����ϴ�.
*/
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int brown = sc.nextInt();
		int yellow = sc.nextInt();
		
		int[] answer = new int[2];
		
		int area = brown + yellow;					// ��ü ���� ����
		
		for(int i = 1; i <= area; i++) {
			int row = i;							// ����
			int col = area / row;					// ����
			
			if(row > col) {
				continue;
				
			}
			
			if((row-2) * (col-2) == yellow) {
				answer[0] = col;
				answer[1] = row;
			}
		}
		sc.close();
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
