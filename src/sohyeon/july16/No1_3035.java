package sohyeon.july16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
����̴� ���� ��ħ ���� �Ź��� �б��� �����ͼ� �д´�. ������, ������� ���� ���� ��������, �� �̻� ��ħ �Ź��� ���� �� ���� ��Ȳ�� �̸�����. 

����̴� ��ĳ�ʸ� �̿��ؼ� ���ڸ� Ȯ���� ������ ������ �Ѵ�.

�Ź� ���� ���ڷ� �̷���� R*C ��ķ� ��Ÿ�� �� �ִ�. ���ڴ� ���ĺ��� ����, �׸��� ��ħǥ�� �̷���� �ִ�.

��ĳ�ʴ� ZR�� ZC�� �Է����� �޴´�. �̷��� �Ǹ�, ��ĳ�ʴ� 1*1ũ�⿴�� �� ���ڸ� ZR*ZCũ��� Ȯ���ؼ� ����� �ش�.

�Ź� ���� ZR, ZC�� �־����� ��, ��ĳ���� ��ĵ�� ��ģ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� R, C, ZR, ZC�� �־�����. R�� C�� 1�� 50 ������ �����̰�, ZR�� ZC�� 1�� 5 ������ �����̴�.

���� R�� �ٿ��� �Ź� ��簡 �־�����.
--
���
��ĳ�ʿ� ��ĵ�� ����� �� R*ZR�� �ٿ� ���ļ� C*ZC�� ���ھ� ����Ѵ�.
--
���� �Է� 1 
3 3 1 2
.x.
x.x
.x.
���� ��� 1 
..xx..
xx..xx
..xx..
--
���� �Է� 2 
3 3 2 1
.x.
x.x
.x.
���� ��� 2 
.x.
.x.
x.x
x.x
.x.
.x.
*/
public class No1_3035 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int ZR = Integer.parseInt(st.nextToken());
		int ZC = Integer.parseInt(st.nextToken());

		char[][] org = new char[R][C]; 												// ����
		char[][] chg = new char[R * ZR][C * ZC]; 									// Ȯ�� �� ���

		for (int i = 0; i < R; i++) {												// ���� �Է� �ޱ�
			String str = br.readLine();

			for (int j = 0; j < C; j++) {
				org[i][j] = str.charAt(j);
//				System.out.print(org[i][j]);
			}
//			System.out.println();
		}

		for (int i = 0; i < R; i++) {												// Ȯ���Ͽ� ���
			for (int k = 0; k < ZR; k++) {
				
				for (int j = 0; j < C; j++) {
					for (int l = 0; l < ZC; l++) {
						chg[k][l] = org[i][j];
						System.out.print(chg[k][l]);
					}
				}
				System.out.println();

			}
		}

	}

}
