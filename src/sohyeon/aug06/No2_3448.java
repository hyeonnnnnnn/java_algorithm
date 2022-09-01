package sohyeon.aug06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
�����̴� ���ο� �̹��� ���� �ν� ���α׷��� �������. �� ���α׷��� ���̿� ���� �ִ� ���ڸ� ��ĵ�� ��, �ؽ�Ʈ ���Ϸ� �����Ѵ�. 

�����̴� ���� ���� ������ ���α׷��� ���������, ���α׷��� �ŷڵ��� 100%�� �ƴϸ�, � ���ڴ� �ν����� ���ߴ�. 

�ᱹ �����̴� 100%�� �ƴ϶�� ������ �Ǹ��Ͽ���, �������� �������� �Ǿ���.

�������� ���������� �����̸� ����ؼ�, �����̰� ���� �̹��� ���� �ν� ���α׷��� �νķ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�νķ��� �ν��� ������ ���� R, ��ü ������ ���� A��� ���� ��, R/A�̴�. �ٹٲ� ���ڴ� ���ڷ� ���� �ʴ´�.
--
�Է�
�Է��� N���� �׽�Ʈ ���̽��� �����Ǿ� �ִ�. ù° �ٿ� �׽�Ʈ ���̽��� ���� N�� �־�����. 

�� �׽�Ʈ ���̽��� ��� �� ���̰�, �ν����� ���� ���ڴ� '#'�� ǥ���Ѵ�. 

�� �׽�Ʈ ���̽��� �������� �� ���� �� ĭ�� �ִ�. �� ���� 100���ڸ� ���� �ʰ�, ���� ���� 200���� ���� �ʴ´�.
--
���
�� �׽�Ʈ ���̽��� ���ؼ� �νķ��� ����� �� ������ ���� ����Ѵ�. �� ���� "Efficiency ratio is X%."�� ���� ���·� ����ؾ� �Ѵ�. 

X�� �νķ��� �ۼ�Ʈ�� ǥ���� ���̰�, �Ҽ��� ���ڸ� �̻��� ��쿡�� ��° �ڸ����� �ݿø��ؼ� ����Ѵ�. ��, �ݿø� ����� �����̸� ���� �κи� ����Ѵ�.
--
���� �Է� 1 
3
Pr#nt ex##tly one##ine for#eac# te#t c#se.

None.

The i#put consists of
N test ca#es. The number
of th#m (N) is given on
the first #ine
of the#input#file.

���� ��� 1 
Efficiency ratio is 78.6%.
Efficiency ratio is 100%.
Efficiency ratio is 94%.
*/
public class No2_3448 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());									// �׽�Ʈ���̽� ��
		int R = 0;																	// �ν��� ���� ��
		int A = 0;		// ��ü ���� ��
		String tmp="";
		double result = 0;
		
		for(int i = 0; i < N; i++) {
		//	sb.append(br.readLine().replaceAll(System.getProperty("line.separator"), ""));			// ���� ���ֱ� ���� replace
			while(true) { //���� �� �Է�
				tmp =br.readLine();
				if(tmp.isEmpty())
					break;
				sb.append(tmp);			// ���� ���ֱ� ���� replace
			}
			
			
			R=0;
			A = sb.length();

			for(int j = 0; j < sb.length(); j++) {
				if(sb.charAt(j) == '#') R++;
			}
			
			result = (double)R / A * 100;
			System.out.println();
			System.out.println("test "+R+" "+A);
			System.out.println("Efficiency ratio is " + String.format("%.1f", 100-result) + "%.");
			sb.delete(0, sb.length());
			
		}
		/*
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '#') R++;
		}
		
		A = sb.length();
		
//		System.out.println("R "+R);
//		System.out.println("A "+A);
		
		double result = (double)R / A * 100;
		
//		System.out.println("result "+String.format("%.1f", 100-result));
		
		System.out.println("Efficiency ratio is " + String.format("%.1f", 100-result) + "%.");
		*/
	}

}
