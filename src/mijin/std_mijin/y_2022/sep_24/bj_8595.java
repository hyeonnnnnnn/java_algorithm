package mijin.std_mijin.y_2022.sep_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://codemasterkimc.tistory.com/384


/*
����
�ܾ ���ڰ� �����ִ�. �� ���ڸ� ���� �ѹ���� �Ѵ�. ���ĺ� ��/�ҹ��ڿ� ���ڷ� �̷���� �ܾ �־����� ��, ��� ���� �ѹ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�ܾ�� ���� �ѹ��� �Ʒ��� ���� ������ ���´�.

���ӵ� ���ڴ� �� ���� �ѹ��̴�.
�� ���� �ѹ� ���̿��� ���ڰ� ��� �� �� �ִ�.
���� �ѹ��� 6�ڸ��� ���� �ʴ´�.
�Է�
ù° �ٿ� �ܾ��� ���� n (1 �� n �� 5,000,000)�� �־�����. ��° �ٿ��� �ܾ �־�����. �ܾ�� ���ĺ� ��/�ҹ��ڿ� ����(0-9)�� �̷���� �ִ�. 

���
�Է����� �־��� �ܾ �����ִ� ��� ���� �ѹ��� ���� ����Ѵ�. ����, ���� �ѹ��� ���� ��쿡�� 0�� ����Ѵ�.

���� �Է� 1 
14
ab13c9d07jeden
���� ��� 1 
29*/

public class bj_8595 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		br.readLine();
		long sum=0;
		for(char ch :br.readLine().toCharArray()) {
			if(ch>='0' && ch<='9') {
				sb.append(ch);
			}else {
				if(sb.length()>0 && sb.length() <=6) {
					sum+=Long.parseLong(sb.toString());
				}
				sb.setLength(0);
			}
		}
		
		if(sb.length()>0 && sb.length() <=6) {
			sum+=Long.parseLong(sb.toString());
		}
		System.out.println(sum);
	}

}
