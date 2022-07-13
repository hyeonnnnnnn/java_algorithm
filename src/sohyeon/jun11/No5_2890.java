package sohyeon.jun11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://blog.naver.com/pano1215/222643733056
/*
 * ����
����̴� ī�� ��ȸ�� �����ߴ�. ��ȸ�� �����迡 ���߰�ǰ�, ������ ����� ��ü�� �Կ��ϰ� �ִ�. ����̴� ���� ������ �������� �ǽð� ������ ����ϴ� ���α׷��� ������� �Ѵ�.

���� ������ R�� C���̴�. ��� ���� ù ��° ���ڴ� 'S'�̰� ��߼��� �ǹ��Ѵ�. ��, ������ ���ڴ� 'F'�̰� �̰��� ��¼��� �ǹ��Ѵ�. 

��ȸ�� ������ ���� �� 9���̰�, �� ���� 1���� 9���� ��ȣ�� �Ű��� �ִ�. ī���� �׻� ���� ���� �����ϴ� �� ĭ�� �����ϸ�, ī�� ��ȣ�� ǥ���Ѵ�. ���������� ���� '.'�� ��Ÿ�� �ִ�.

���� ������ ��¼����κ��� ������ �Ÿ��� �����Ѵ�. �������� ������ ����. ����, �� ���� ��¼��� ������ �Ÿ��� ���ٸ�, ���� ����̴�.
--
�Է�
ù° �ٿ� R�� C�� �־�����. ���� R�� �ٿ��� '.', 'S', 'F', '1'~'9'�� �̷���� ���� ������ �־�����. 

�� �ٿ��� �ִ� �� ���� ī�ุ �ְ�, ���� ������ �ִ� ī���� �׻� 9���̴�. (10 �� R, C �� 50)
--
���
����� �� 9���� �ؾ� �Ѵ�. i��° �ٿ��� i�� ���� ����� ����Ѵ�. (i=1~9)
--
���� �Է� 1 
10 10
S.....111F
S....222.F
S...333..F
S..444...F
S.555....F
S666.....F
S.777....F
S..888...F
S...999..F
S........F
���� ��� 1 
1
2
3
4
5
6
5
4
3
--
���� �Է� 2 
10 15
S..........222F
S.....111.....F
S...333.......F
S...555.......F
S.......444...F
S.............F
S......777....F
S..888........F
S........999..F
S...666.......F
���� ��� 2 
5
1
6
3
6
6
4
7
2
*/

public class No5_2890 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());									// R��
		int C = Integer.parseInt(st.nextToken());									// C��

		String[][] course = new String[R][C];
		
		for (int i = 0; i < R; i++) {												// ���κ� ���� �Է�
			String lane = br.readLine();
			course[i] = lane.split("");
		}

		int[] rank = new int[R];	
		for(int i=0;i<rank.length;i++)
		System.out.println(rank[i]);// ���� ���
		int num = 1;																// ���� �� ������ ����� +1�� ����(���� ���)
		
		for (int i = C - 2; i > 0; i--) {											// F -> S �������� ����
			boolean flag = true;
			
			for (int j = 0; j < R; j++) {
				//System.out.println(rank[1]);
				if (!course[j][i].equals(".") && rank[Integer.parseInt(course[j][i]) - 1] == 0) {	//  .�� ���� �� F�� ���� ����� ���̹Ƿ� 1�� && ī������ üũ
					rank[Integer.parseInt(course[j][i]) - 1] = num;
					flag = false;
				}
			}
			
			if (flag) {
				continue;
			}
			num++;																					// �������� ��� �������� ����
		}

		for (int rr : rank) {
			System.out.print(rr + " ");
		}

	}

}
