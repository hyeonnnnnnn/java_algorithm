package sohyeon.may14;

import java.util.Scanner;

/*
 * ����
��ǥ�� �����̴� ���� �ַ���� ��� �ϸ鼭 �ٸ� ����� �ڽŵ��� �ַ���� ���� ���ϰ� �ϵ��� ���� �޽����� �ְ���� �� �޽����� ��ȣȭ �Ͽ��� �ְ�޾Ҵ�. 

��ȣ�� ����� ����� ������ ����. ���� ��ȣȭ �� ���ڿ��� 1,1���� ������ �Ʒ� ������� ä���. �׸��� ���� ���� ���� ä�� �Ŀ��� ������ ������ �ٽ� ���� ������ �ݺ��Ѵ�.

���࿡ "abcdefghijkl" �̶�� ���ڿ��� 3���� ���� ��ȣȭ �Ѵٰ� ����. �׷��� ������ ���� ǥ�� ä�� �� ���� ���̴�.

a	e	i
b	f	j
c	g	k
d	h	l

�׷� �Ŀ��� ���� ���� �� ������, ������ �� ����, ���� �� ������ ... ���� �����鼭 �ٽ� ���ڿ��� �����. ���� ��쿡�� "aeijfbcgklhd" �� �� ���̴�.

�츮�� �� ���� ������ ����. ��ȣȭ �� ���ڿ��� �� ���� ���� ��ȣȭ�� �Ͽ����� �־��� ���� �� ������ ���ڿ��� ���ϴ� ���α׷��� �ۼ��Ͽ���.
--
�Է�
���� ���� K(1 �� K �� 20)�� �־����� �� ��° �ٿ��� ��ȣȭ �� ���ڿ�(��� ���ҹ���)�� �־�����. (���ڿ��� ���̴� 200 �����̸� K�� ����̴�.)
--
���
ù �ٿ� ������ ���ڿ��� ����Ѵ�..
--
���� �Է� 1 
3
aeijfbcgklhd
���� ��� 1 
abcdefghijkl
*/

public class No3_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int K = sc.nextInt();											// ���� ����
		
		sc.nextLine();													// nextInt ��� �� ���๮�� ����ֱ� ���� nextLine
		
		String s = sc.nextLine();										// ���ڿ�
		int len = s.length();											// ���ڿ� ����
		
		for(int i = 0; i < K; i++) {
			
			for(int j = 0; j < len/K ; j++) {
				
				if(j % 2 == 0) {										// ¦�� ��
					sb.append(s.charAt(j * K + i));
					
				} else if(j % 2 != 0) {									// Ȧ�� ��
					sb.append(s.charAt(j * K + K - 1 - i));
					
				}
			}
		}
		
		sc.close();
		
		System.out.println(sb);
		
		
	}

}
