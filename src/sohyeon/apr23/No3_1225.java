package sohyeon.apr23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* ����
A��B�� ����ϴ� ���ܿ��� �����̴� A��B�� ���ο� ������� �����Ϸ��� �Ѵ�.

A���� �� �ڸ��� �̰� �� B���� ���Ƿ� �� �ڸ��� �̾� ���Ѵ�.

�� ������ ��� ���� (A�� n�ڸ�, B�� m�ڸ� ����� �� ������ ������ n��m��)�� ���� ���� �����Ϸ��� �Ѵ�.

���� ��� 121��34��

1��3 + 1��4 + 2��3 + 2��4 + 1��3 + 1��4 = 28

�� �ȴ�. �̷��� �������� ���� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� A�� B�� �־�����. �־����� �� ���� ��� 10,000�ڸ��� ���� �ʴ� ���� �ƴ� �����̴�. ���� 0�� ��쿡�� 0�� �־�����, �� ���� ��� ���� 0���� �������� �ʴ´�.
--
���
ù° �ٿ� �������� ���� ����� ����Ѵ�.
--
���� �Է� 1 
123 45
���� ��� 1 
54
*/

public class No3_1225 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());		// input �� �ٷ� �о��
		
		String A = st.nextToken();										// ������ �������� A ������
		String B = st.nextToken();										// ������ �������� B ������
		
		int sum = 0;													// ���� ���
		int[] n =  new int[A.length()];
		int[] m =  new int[B.length()];
		
		for(int i = 0; i < A.length(); i++) {
			n[i] = Character.getNumericValue(A.charAt(i));				// A �� �ڸ� �и��ؼ� char->int ��ȯ
			
			for(int j = 0; j < B.length(); j++) {
				m[j] = Character.getNumericValue(B.charAt(j));			// B �� �ڸ� �и��ؼ� char->int ��ȯ
				
				sum += n[i] * m[j] ;
			}
		}
		
		System.out.println(sum);
	}

}
