package sohyeon.mar05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
branchorama ������ Ư���� ��Ģ�� ������ �����մϴ�. � branchorama �ʸ��� �ϳ��� ���� ����⿡ ���� ���� �����̸�, �� �ٿ��� �������� �ֽ��ϴ�.

�����ϴ� ���� ���� ������ ���������� ���� ���� ������ ������ �Ǹ�, ������ ������ �� ������ �������� ���� �ϳ��� ���� ����⿡ �Ŵް� �˴ϴ�.

����Ե� ���� ������ ��� ���������� ���� ����(splitting factor)�� ������ ������, �� ���ڴ� �ذ� ������ ���� ���մϴ�.

�Ʒ��� ���� Brown ���� ���������� �� branchorama ������ ���񿡼����� 3�Ⱓ �ڶ� ����� �����ݴϴ�.

���ÿ��� ������ �� �ֵ���, branchorama ������ �����ϰ� �����ϴ� ������ �ֽ��ϴ�. ���� Brown ���� �� �ܿ︶�� �����ϰ� ������ �������� ������ �ĳ��ϴ�.

�Ʒ��� ������ �ĳ�  branchorama ������ ���Դϴ�

branchorama �������� ������ ũ�� ���ռ��� ����������, ���� �������� ������ ������ ������ ������ �޸��ϴ�. ���� ������ ��Ƽ�� ���� ������ ������ �ĳ��� ���� ����� �մϴ�.

Brown ���� �� ������ �� ���� ���� �������� �˰� �;��մϴ�.

�������� ������ ���� ���� �����ϱ� ������, �� ��(level) ������� splitting factor�� �� �� �ܿ￡ �ĳ� ������ ���� �̿��� Brown ������ �������� ���� �˷��ּ���.
--
�Է�
�Է��� �� ���� �ϳ��� branchorama ������ �ǹ��մϴ�.

�� ���� ������ ���� a(1 �� a �� 20)�� �����ϸ�, �� �ڷ� 2a ���� ������ ������ �ΰ� �־����ϴ�. 2a ���� ������ splitting factor�� ����ġ�� �� ������ ���� level ���� ������ ���Դϴ�.

������ �ٷ�  '0'�� �־����� �� �̻��� �Է��� �����ϴ�. '0'�� ó������ �ʽ��ϴ�.
--
���
�� ������ ���Ͽ� ������ �޷��ִ� ���� ���� �� �پ� ����ϼ���. �������� ���� signed 32-bit integer�� �ʰ����� �ʴ´ٰ� �����ص� �����ϴ�.
--
���� �Է� 1 
1 3 0
2 3 0 2 0
3 3 0 2 0 2 0
3 3 0 2 1 2 3
2 4 1 3 4
4 5 0 5 1 5 2 5 101
0
���� ��� 1 
3
6
12
7
5
489
*/

public class No1_1703 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// �� �ٷ� �о��

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());		// �о�� ���� ��ū���� ������ ���� ��ũ������
			
			int a = Integer.parseInt(st.nextToken());			 // ���� ����
			
			if (a == 0) {		// 0 �Է� �� ����
				break;
			}
			
			int result = 1;			// ó�� ���� �� 1
			
			for (int i = 0; i < a; i++) {
				
				int n = Integer.parseInt(st.nextToken());		 // ���� ������ ��
				int g = Integer.parseInt(st.nextToken());		 // ����ġ�� �� ��
				
				result = result * n - g;		// ó�� ���� �� * ������ ��  - ����ġ���� ��		
			}
			
			System.out.println(result);
			
		}
	}

}
