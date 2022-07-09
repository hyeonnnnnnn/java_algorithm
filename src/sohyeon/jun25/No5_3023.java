package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
������ �������� �̹����� ����ϴ� ī���� �� ���� ��� �ڽ��� �������� ī���̴�.

�����̴� ī�� �� �� ��ü�� ���������� �ʰ�, ���� �� 1/4�� �������Ѵ�. �� ���� ��Ī���� ������ ���� �����, �ٽ� ��Ī���Ѽ� �Ʒ� �κ��� ��� �����.

�̷��� ��Ī���Ѽ� ��ü�� ������ �� ���Ŀ���, �����ϴµ� ����ϱ� ���� �ǵ��� ������ �ִ´�. ������ ���� '#'�̾�� �ϴ� ĭ�� '.'�� �ٲٰų� '.'�̾�� �ϴ� ĭ�� '#'�� �ٲٴ� ���̴�.

���� ���� �����ΰ� ������ ��ġ�� �־����� ��, ī�� �� �� ��ü �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Ʒ� �׸��� �������� ī���� �����̴�. (ȸ�� ĭ�� �����̴�)

###.##.###
##########
.########.
..######..
####.#####
##########
..######..
.########.
##########
###.##.###	#.#..#.#
#.####.#
#.####.#
........
.#.##.#.
.#.##.#.
........
#.####.#
#.####.#
#.#.##.#	.#.##.##
#.#..#.#
........
..#..#..
..#..#..
........
#.#..#.#
##.##.##

--
�Է�
ù° �ٿ� ���� �� �κ��� ���� ���� R�� ���� ���� C�� �־�����. (1 �� R, C �� 50)

���� R�� �ٿ��� C���� ���� '.' �Ǵ� '#'�� �־�����.

������ �ٿ��� ������ ��ġ A�� B�� �־�����. (1 �� A �� 2R, 1 �� B �� 2C)
--
���
ī�� �� �� ��ü �������� �� 2R�� �ٿ� ���ļ� ����Ѵ�. �� ���� 2C���� ���ڷ� �̷���� �־�� �Ѵ�.
--
���� �Է� 1 
2 2
#.
.#
3 3
���� ��� 1 
#..#
.##.
.#..
#..#
--
���� �Է� 2 
3 3
###
###
###
1 4
���� ��� 2 
###.##
######
######
######
######
######
--
���� �Է� 3 
5 4
#.#.
#.##
#.##
....
.#.#
10 5
���� ��� 3 
#.#..#.#
#.####.#
#.####.#
........
.#.##.#.
.#.##.#.
........
#.####.#
#.####.#
#.#.##.#
*/
public class No5_3023 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());											// ��
		int C = Integer.parseInt(st.nextToken());											// ��
		
		char[][] ch = new char[2*R][2*C];
		
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < C; j++) {
				ch[i][j] = str.charAt(j);													// ���� �� ������ ����
			}
		}
		
		for(int i = 0; i < R; i++){															// �¿�����ؼ� ����
            for(int j = 0; j < C; j++){
            	ch[i][2 * C - 1 - j] = ch[i][j];
            }
        }
		
        for(int i = 0; i < R; i++){															// ���Ϲ����ؼ� ����
            for(int j = 0; j < 2 * C; j++){
            	ch[2 * R - 1 - i][j] = ch[i][j];
            }
        }
        
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());											// ���� �� ��ġ
        int c = Integer.parseInt(st.nextToken());											// ���� �� ��ġ
        
        // �迭�� ��ǥ�� ���߱� ���� ���� -1
        r = r-1;
        c = c-1;
        
        if(ch[r][c] == '#') {																// �ش� ��ǥ ���� #�� ��� .����
        	ch[r][c] = '.';
        } else {																			// �ش� ��ǥ ���� .�� ��� #����
        	ch[r][c] = '#';
        }
        
        for(int i = 0 ; i < 2*R; i++) {
        	for(int j = 0; j < 2*C; j++) {
        		System.out.print(ch[i][j]);
        	}
        	System.out.println();
        }
	}

}
