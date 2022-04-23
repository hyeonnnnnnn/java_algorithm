package sohyeon.apr23;

import java.io.IOException;
import java.util.Scanner;

/*
* ����
ü������ 8��8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�.

���� ���� ��ĭ (0,0)�� �Ͼ���̴�. ü������ ���°� �־����� ��, �Ͼ� ĭ ���� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٺ��� 8���� �ٿ� ü������ ���°� �־�����. ��.���� �� ĭ�̰�, ��F���� ���� ���� �ִ� ĭ�̴�.
--
���
ù° �ٿ� ������ ������ ����Ѵ�.
--
���� �Է� 1 
.F.F...F
F...F.F.
...F.F.F
F.F...F.
.F...F..
F...F.F.
.F.F.F.F
..FF..F.
���� ��� 1 
1
--
���� �Է� 2 
........
........
........
........
........
........
........
........
���� ��� 2 
0
--
���� �Է� 3 
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
���� ��� 3 
32
--
���� �Է� 4 
........
..F.....
.....F..
.....F..
........
........
.......F
.F......
���� ��� 4 
2
*/

public class No1_1100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[][] ch = new char[8][8]; 										// 8*8 ũ���� �迭 ����
		int cnt = 0;														// �� F ����

		String str = "";

		for (int i = 0; i < 8; i++) {
			str = sc.nextLine();											// �� �پ� �о�ͼ�
			
			for (int j = 0; j < 8; j++) {
				ch[i][j] = str.charAt(j);									// �� ĭ�� �ϳ��� �־���

				if ((i + j) % 2 == 0 && ch[i][j] == 'F') {					// i+j�� ���� ¦���� ��� ���. ���⿡ F ���� ��� cnt ����
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
