package sohyeon.july23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
���� ���簡 �����Ƽ� ���� �ϱ⵵ ������ �Ѵ�. �׷��� �Ϸ��� ���� ������� ���Ӹ��� ������� �ϴµ� ���� ��Ģ�� �������.

�Ϸ��� ���� �ּ� �ϳ� �̻��� �ܾ �����ϴµ� �� �ܾ���� ��Ȯ�� ��ĭ�� �������� ������ �ȴ�. 

���Ӹ��� ���鶧�� �� �ܾ��� �ձ��ڸ� ���� ��������µ� ������ �ܾ���� ������� �ܾ���̹Ƿ� �����Ѵ�.

'i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili'.

������ �� �ܾ���� �Ϸ��� ���� �� �տ� �ð�� �ſ� �߿��ϴٰ� �ǴܵǾ� �����ϸ� �ȵǰ� ���Ӹ��� �����Ͽ��� �Ѵ�.

���Ӹ��� ����⵵ �������� ���� ���� ���Ӹ��� ������ִ� ���α׷��� �ۼ��϶�.

��, ���Ӹ��� ��� �빮�ڷθ� �̷�����ִ�.
--
�Է�
�Է��� �����ϰ� �� �ٸ� �־����� �Ϸ��� ���� ���ԵǾ� �ִ�.

������ ���ĺ� �ҹ��ڿ� �������θ� �̷���� �ִ�.

������ �ִ���̴� 100�̴�.
--
���
������� ���Ӹ��� ����϶�.
--
���� �Է� 1 
micro soft
���� ��� 1 
MS
--
���� �Է� 2 
biti ali i ne biti
���� ��� 2 
BNB
--
���� �Է� 3 
ali ja sam i jucer jeo
���� ��� 3 
AJSJJ
*/
public class No1_3181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		sb.append(st.nextToken().toUpperCase().charAt(0));							// ù ���ڸ� �빮�ڷ� �ٲ�
		
		while(st.hasMoreTokens()) {
			String str = st.nextToken();											// ���� ���ڸ� �޾ƿͼ� �Ʒ� ���ڿ� �ش��� ��� pass
			if(str.equals("i")) continue;
			if(str.equals("pa")) continue;
			if(str.equals("te")) continue;
			if(str.equals("ni")) continue;
			if(str.equals("niti")) continue;
			if(str.equals("a")) continue;
			if(str.equals("ali")) continue;
			if(str.equals("nego")) continue;
			if(str.equals("no")) continue;
			if(str.equals("ili")) continue;
			sb.append(str.toUpperCase().charAt(0));									// �Ʒ� ���ڿ� �ش����� ���� ��� �빮�ڷ� �ٲ㼭 ����
		}
		
		System.out.println(sb);
		
	}

}
