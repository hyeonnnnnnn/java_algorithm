package mijin.std_mijin.y_2022.may_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import java.util.StringTokenizer;

public class bj_1252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		//BigInteger ����ȯ �ϸ鼭 10������ �ٲ��ش�.(A, 2)�� 10������ �ٲٴ� ���
		BigInteger A_binary = new BigInteger(A, 2);
		BigInteger B_binary = new BigInteger(B, 2);
		
		//�� �����(add)�� ���ؼ� ������ ����.
		BigInteger sum = A_binary.add(B_binary);
		
		//Ǯ�̹�Ŀ� ����� ��� 2������ ��ȯ
		String sum_binary = sum.toString(2);
		
		System.out.println(sum_binary);
	}
}
