package sohyeon.apr30;

import java.util.Scanner;

/*
 * ����
�����̴� ���簢�� ����� ���� ������ �ִ�. ���� 1���� �� ���� ������ ���ؼ� ��ȣ�ǰ� �ִ�. �����̴� ��� ��� ��� ���� �� �� �̻��� ������ ������ ���ڴٰ� �����ߴ�.

���� ũ��� ������ ����ִ��� �־����� ��, �� ���� ������ �ּҷ� �߰��ؾ� �����̸� ������Ű���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ���� ���� ũ�� N�� ���� ũ�� M�� �־�����. N�� M�� 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ���� ���°� �־�����. ���� ���´� .�� ��ĭ, X�� ������ �ִ� ĭ�̴�.
--
���
ù° �ٿ� �߰��ؾ� �ϴ� ������ �ּڰ��� ����Ѵ�.
--
���� �Է� 1 
4 4
....
....
....
....
���� ��� 1 
4
--
���� �Է� 2 
3 5
XX...
.XX..
...XX
���� ��� 2 
0
--
���� �Է� 3 
5 8
....XXXX
........
XX.X.XX.
........
........
���� ��� 3 
3
*/
public class No4_1236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();											// ����
		int M = sc.nextInt();											// ����
		int row = 0;													// ��
		int col = 0;													// ��
		
		char[][] map = new char[N][M];									// ����*���� ��ǥ
		
		for(int i = 0; i < map.length; i++) {
			String str = sc.next();
			
			for(int j = 0; j < map[i].length; j++) {
				map[i][j] = str.charAt(j);
				
			}
		}
		
		for(int i = 0; i < N; i++) {									// �࿡ �ʿ��� ���� ��
			boolean flag = true;
			
			for(int j = 0; j < M; j++) {
				
				if(map[i][j] == 'X') {
					
					flag = false;
					break;
				}
			}
			if(flag)
				row ++;
		}
		
		
		for(int i = 0; i < M; i++) {										// ���� �ʿ��� ���� ��
			boolean flag = true;
			
			for(int j = 0; j < N; j++) {
				
				  if(map[j][i] == 'X') {
					  flag = false;
					  break;
					  
				  }
			}
			if(flag)
				col ++;
		}
		
		System.out.println(Math.max(row, col));					// ��, �� �� �� ���� ���� �߰�
		
		sc.close();
	}

}
