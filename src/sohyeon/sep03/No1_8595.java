package sohyeon.sep03;

import java.util.Scanner;

/*
 * ����
�ܾ ���ڰ� �����ִ�. �� ���ڸ� ���� �ѹ���� �Ѵ�. ���ĺ� ��/�ҹ��ڿ� ���ڷ� �̷���� �ܾ �־����� ��, ��� ���� �ѹ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�ܾ�� ���� �ѹ��� �Ʒ��� ���� ������ ���´�.

���ӵ� ���ڴ� �� ���� �ѹ��̴�.
�� ���� �ѹ� ���̿��� ���ڰ� ��� �� �� �ִ�.
���� �ѹ��� 6�ڸ��� ���� �ʴ´�.
--
�Է�
ù° �ٿ� �ܾ��� ���� n (1 �� n �� 5,000,000)�� �־�����. ��° �ٿ��� �ܾ �־�����. �ܾ�� ���ĺ� ��/�ҹ��ڿ� ����(0-9)�� �̷���� �ִ�. 
--
���
�Է����� �־��� �ܾ �����ִ� ��� ���� �ѹ��� ���� ����Ѵ�. ����, ���� �ѹ��� ���� ��쿡�� 0�� ����Ѵ�.
--
���� �Է� 1 
14
ab13c9d07jeden
���� ��� 1 
29
*/
public class No1_8595 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		char[] ch = sc.nextLine().toCharArray();						// ���� �Է¹޾Ƽ� �ϳ��� �߶� �迭��
		
		int result = 0, tmp = 0;

		for (int i = 0; i < n; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {							// ������ ��
				tmp = tmp * 10 + ch[i] - '0';
				
			} else {													// ���� �ƴ� ��
				result += tmp;
				tmp = 0;
				
			}
		}

		result += tmp;
		System.out.println(result);
		
		sc.close();
	}

}
