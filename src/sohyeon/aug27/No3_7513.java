package sohyeon.aug27;

import java.util.Scanner;

/*����
�رԴ� �غ����� �������� �����迡 �˸������ؼ� ���α׷��� ��ȸ�� �����Ϸ��� �Ѵ�. ��ȸ�� �غ��ϴ� ��, ��� ���̽��Ͽ��� Poke�� �����ϴ��� ���� ��û�� �������� ���ߴ�.

��ȸ�� �����ϴ� ������� ��� ���̵�� ��й�ȣ�� �̿��� �ý��ۿ� �α����ؾ� �Ѵ�. ���� ��û�� �������� �ʾұ� ������, ��� ������� ���̵�� "userN" �����̴�. 

��й�ȣ�� ������� ������ �� ���� ������ �Ѵ�. �����ϰų� ������ ���� ��쿡�� ��ȸ ���߿� �ٸ� ����� ���̵�� �α����� �� �� �ֱ� �����̴�.

��й�ȣ�� ������ �̿��� �����, �Է��ϱⰡ �ణ ����� �� �ִ�. ����, �������� �ܾ� N���� ã�� ȭ�鿡 ��� ����, �Է��ؾ� �ϴ� �ܾ� ������ �˷��ִ� ����� ����ϱ�� �ߴ�.

�ܾ��� ��ϰ� �� �������� ������ �־����� ��, ��� ����� ��й�ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ְ�, ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����.

�� �׽�Ʈ ���̽��� ù° �ٿ��� �ܾ��� ���� 1 �� m �� 50�� �־�����. ���� m�� �ٿ��� �ܾ �� �ٿ� �ϳ��� �־�����. 

�� �ܾ��� ���̴� �ִ� 5�����̰�, ������ �������� �ʴ´�. ���� �ٿ��� �������� �� 1 �� n �� 200�� �־�����, ���� n�� �ٿ��� �� �������� ��й�ȣ ������ �־�����. 

��й�ȣ ������ ���� 1 �� k �� 10 �� �����ϸ�, ��й�ȣ�� �̷�� �ִ� �ܾ��� �����̴�. ���� k�� ���ڴ� �ܾ��� �ε����� ��Ÿ����, ������� �ش��ϴ� �ܾ ������ ���ڿ��� ��й�ȣ�̴�.
--
���
�� �׽�Ʈ ���̽����� ù° �ٿ��� "Scenario #i:"�� ����ϰ�, ���� �ٺ��� ������� �� �������� ��й�ȣ�� ����Ѵ�.

�׽�Ʈ ���̽� ���̿� �� ���� ����Ѵ�.
--
���� �Է� 1 
2
4
an
bar
doh
mu
2
4 0 0 0 0
2 3 1
2
a
r
1
10 0 1 1 1 1 1 1 1 1 1
���� ��� 1 
Scenario #1:
anananan
mubar

Scenario #2:
arrrrrrrrr
*/
public class No3_7513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();															// �׽�Ʈ���̽� ����
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {													// �׽�Ʈ���̽� ���� ��ŭ ����
			int m = sc.nextInt();														// �ܾ� ����
			sc.nextLine();
			
			String[] str = new String[m];												// ��й�ȣ �ܾ�
			
			for(int j = 0; j < m; j++) {
				str[j] = sc.nextLine();													// ��й�ȣ �ܾ� ����
				
			}
			
			int n = sc.nextInt();														// ������ ��
			
			for(int v = 0; v < n; v++) {												// ������ �� ��ŭ ����
				int k = sc.nextInt();													// ��й�ȣ �ܾ� ����
				
				for(int c = 0; c < k; c++) {											// ��й�ȣ �ܾ� �迭 ��ġ(l)�� �ش��ϴ� �ܾ� �� k�� �ݺ� append
					int l = sc.nextInt();
//					System.out.println(str[l]);
					sb.append(str[l]);
				}
				sb.append("\n");														// ������ ������ ���� ���๮�� ���� append
			}
			
			System.out.println("Scenario #" + (i+1) + ":");
			System.out.print(sb);
			sb.setLength(0);															// stringbuilder �ʱ�ȭ
		}
		
		sc.close();
	}

}