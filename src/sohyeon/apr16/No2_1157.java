package sohyeon.apr16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
--
�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
--
���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
--
���� �Է� 1 
Mississipi
���� ��� 1 
?
--
���� �Է� 2 
zZa
���� ��� 2 
Z
--
���� �Է� 3 
z
���� ��� 3 
Z
--
���� �Է� 4 
baaa
���� ��� 4 
A
*/

// https://comain.tistory.com/m/189
/*
���� 1���� Mississipi. �빮�ڷ� �ٲٸ� MISSISSIPI
ó���� M�� ���ָ� ISSISSIPI�� �ǰ� �� ������ ���̴� 1�̱⶧���� M�� ������ 1���̴�.
���� �ߺ������� �ִ��� 0���̰� �̹��� 1���̱� ������ ���ڿ� ������ M�� �����Ѵ�.
���� 0�ε��� ���� I�� ���ָ� SSSSP���ȴ�. �� ������ ���̴� 4�̴� I�� ������ 4���̴�.
���� �ߺ������� �ִ��� 1���̴� �̹��� 4���̱� ������ ���ڿ� ������ I�� �����Ѵ�. �׷��ԵǸ� ���� ���ڿ� ������ ���� I�̴�.
�׸��� ���� 0�ε��� ���� S�� ����� P�� ���´�. �� ������ ���̴� 4�̴� S�� ������ 4���̴�.
�׷� ���� �ִ񰪰� ������ ���ڿ� ������ S�� ���Ѵ�. �׷��� ���ڿ� ������ ���� PS�� �ȴ�.
*/
public class No2_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();					// ���ĺ� �ߺ� ������ �ִ��� ������ ����
		int max = 0;												// �ߺ������� �ִ��� ���ĺ��� ������ ����
		String result = "";
		
		while(true) {												// ���ѷ���(���ĺ��� ������ 26���̱⶧���� 26�� �ݺ��ϴ� �ݺ����� ���� �ȴ�.)
			String index = String.valueOf(str.charAt(0));			// ���� ���ڿ��� 0 �ε��� ���� ����
			int size = str.length();								// ���� ���ڿ��� ���̸� ����
			
			str = str.replace(String.valueOf(str.charAt(0)), "");	// 0�ε��� ���� ���ڿ����� ����
			
			int newsize = str.length();								// ������ ���� ���ڿ��� ����
			
			if(max == (size - newsize)) {							// �� ������ ���� �ߺ�����
				result += index;									// �ߺ������� �ִ񰪰� ������ result�� ���ĺ��� ���Ѵ�.
				
			}

			if(max < (size - newsize)) {							// �ߺ������� �ִ񰪺��� ũ�� �ִ񰪿� �ߺ������� �����ϰ�, result�� ���ĺ��� ����							
				max = (size - newsize);
				result = index;
				
			}

			if(str.equals("")) break;								// ���ڿ��� ��ԵǸ� ���ѷ��� ����
		}
		
		if(result.length() == 1) {									// result�� ���ĺ��� 1���̸� result ���
			System.out.println(result);
			
		} else {													// �ƴϸ� ? ���
			System.out.println("?");
			
		}
	}
	


}
