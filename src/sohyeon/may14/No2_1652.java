package sohyeon.may14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
�� �� ���� �������ָ� �ϴ� �����̴� ������ �ϴ� �ʹ� �ǰ��ؼ� ��ó�� �ִ� �ڷ����� �ܵ����� �Ϸ�� ���� �ڱ�� �ϰ� ���� ��Ҵ�.

�ڷ����� �ܵ��� �ִ� ���� NxN�� ���簢��������� �����. �� �ȿ��� �ű� �� ���� ������ �̰����� ���� �־ �������� ���� �ڸ��� �����ϰ� �־���. 

�����̴� �� ������ ȯ�濡�� ���� �� �ִ� �ڸ��� ã�ƾ� �Ѵ�. �����̰� ���� �� �ִ� �ڸ����� ������ �ִ�. 

�ȹٷ� �����ؼ� 2ĭ �̻��� �� ĭ�� �����ϸ� �� ���� ���� �� ������ �� �����鼭 ���� �� �ִ�. ���η� ���� ���� �ְ� ���η� ���� ���� �ִ�. 

���� ���� ������ ���� �� ���� ������ �ݵ�� ���̳� ���� ��� �ȴ�. (�߰��� �������ϰ� ���� ��찡 ����.)


���� ���� ������ ���� �׸�ó�� ����ٸ�, ���η� ���� �� �ִ� �ڸ��� 5���̰�, ���η� ���� �� �ִ� �ڸ��� 4�� �̴�. 

���� ũ�� N�� ���� ������ �־����� ��, ���η� ���� �� �ִ� �ڸ��� ���η� ���� �� �ִ� �ڸ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ���� ũ�� N�� �־�����. N�� 1�̻� 100������ �����̴�. �� ���� N�ٿ� ���� N���� ���ڰ� �����µ� '.'�� �ƹ��͵� ���� ���� �ǹ��ϰ�, 'X'�� ���� �ִ� ���� �ǹ��Ѵ�.
--
���
ù° �ٿ� ���η� ���� �� �ִ� �ڸ��� ���η� ���� �� �ִ� �ڸ��� ������ ����Ѵ�.
--
���� �Է� 1 
5
....X
..XX.
.....
.XX..
X....
--
���� ��� 1 
5 4
*/

public class No2_1652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());								 // �� ũ��
		char[][] room = new char[100][100];										 // �� ���� ����
		int rowCount = 0, colCount = 0;
		String[] s = new String[N];
		
		for (int i = 0; i < N; i++) {
			s = br.readLine().split("");								 // �� �ٷ� ���� �Է��� �ϳ��� �ڸ�
			
			for (int j = 0; j < s.length; j++) {
				room[i][j] = s[j].charAt(0);
			}
			room[i][N] = 'X';													// ���� X ó��
			room[N][i] = 'X';
		}
		
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N - 1; j++) {
				// ��� ���� 2ĭ �̻� .�̰� ���� X�� ��� �� ī��Ʈ ����
				if (room[i][j] == '.' && room[i][j+1] == '.' && room[i][j+2] == 'X') colCount++;		// �� ī��Ʈ ����
				if (room[j][i] == '.' && room[j][i+1] == '.' && room[j][i+2] == 'X') rowCount++;		// �� ī��Ʈ ����
				// room[N][N]���� �����ϸ� index out of bound exception ���� room[100][100]���� �����ߴµ� ���� ī��Ʈ ������ �ƴϸ� � �� ������?
			}
		}
		
		System.out.println(colCount + " " + rowCount);
		
	}

}
