package sohyeon.may28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * ����
���� ���񿡰� ����ܾ���� ������ �� � �ܾ ��ҹ��ڸ� �������� �ʰ� ���������� ���� �ռ����� ���߸� �縻�� �־� ������ ������شٰ� �Ͽ���.

������ �μ��� ���� ���� ���� ��� �׷��� ���� �ʾұ� ������ ��ҹ��ڸ� ���� ����� �ܾ���� �����ߴ�. ���� ���, apPle�� Bat���� �ռ����� AnT���ٴ� �ڿ� �ִ� �ܾ��.

���񿡰� ����� �����л��̴�! �������� ���񿡰� ������ �������ֵ��� ����!
--
�Է�
�� �׽�Ʈ���̽��� ���� n (2 �� n �� 1000) ���� �����ϸ� �־����� �ܾ��� ������ ���Ѵ�.

���� �� n���� ���̰� �ִ� 20�� �ܾ �־����� ��ҹ����� ������ ������ �� �Ȱ��� �ܾ�� �־����� �ʴ´�.

������ �Է��� 0�� �־�����.
--
���
�� �ٿ� �� �׽�Ʈ���̽����� ������ ���� �ռ��� �ܾ ����Ѵ�.
--
���� �Է� 1 
3
Cat
fat
bAt
4
call
ball
All
Hall
0
���� ��� 1 
bAt
All
*/
public class No1_2204 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());								// �ܾ� ����
			
			if(n == 0) break;														// 0 �Է� �� ����
			
			String[] str = new String[n];											// �ܾ� ������ �迭 ����
			
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine(); 
			}
			
			Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);						// ��ҹ��� ���� ���� ����
			
			System.out.println(str[0]);												// ���� ù��°�� ���ĵ� �ܾ� ���
		}
		
	}

}
