package mijin.std_mijin.y_2022.jun_11;

import java.util.Arrays;
import java.util.Scanner;

/*
����
���� ���񿡰� ����ܾ���� ������ �� � �ܾ ��ҹ��ڸ� �������� �ʰ� ���������� ���� �ռ����� ���߸� �縻�� �־� ������ ������شٰ� �Ͽ���.

������ �μ��� ���� ���� ���� ��� �׷��� ���� �ʾұ� ������ ��ҹ��ڸ� ���� ����� �ܾ���� �����ߴ�. ���� ���, apPle�� Bat���� �ռ����� AnT���ٴ� �ڿ� �ִ� �ܾ��.

���񿡰� ����� �����л��̴�! �������� ���񿡰� ������ �������ֵ��� ����!

�Է�
�� �׽�Ʈ���̽��� ���� n (2 �� n �� 1000) ���� �����ϸ� �־����� �ܾ��� ������ ���Ѵ�.

���� �� n���� ���̰� �ִ� 20�� �ܾ �־����� ��ҹ����� ������ ������ �� �Ȱ��� �ܾ�� �־����� �ʴ´�.

������ �Է��� 0�� �־�����.

���
�� �ٿ� �� �׽�Ʈ���̽����� ������ ���� �ռ��� �ܾ ����Ѵ�.*/


public class bj_2204 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		while(N!=0) {
			String arr[] = new String[N] ;
			
			for(int i=0;i<N;i++) {
				arr[i] = s.next();
			}
			//��ҹ��� ���о��� ���� 
			Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
			
			System.out.println(arr[0]);
		}
	}

}
