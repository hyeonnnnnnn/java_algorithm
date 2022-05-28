package sohyeon.may28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
���������� �ַ� �� ����� �Բ� ���� �����̴�. �� �� 3-���������� ���� ���� �� �� �ִ� �����̴�. �� ����� ���� 3-�������� �� �ϳ��� �����Ѵ�.

3-���������̶� �� �� �հ� ���� �����̰�, 8����(�ڵڵ�,�ڵھ�,�ھյ�,�ھվ�,�յڵ�,�յھ�,�վյ�,�վվ�)�� �ִ�.

���� ������ ���� 1���� 40�� ������. �� ���� ������ ������ ������ �������� ���� ������� ���̿� ���´�. �� ���� 3-���������� ���� �� ���� ���Դ��� ����Ѵ�.

���� ���� ���� ������ ������ ����� �̱��.

���� 40�� ���� ����� �־����� ��, 3-���������� ���� �� �� ���Դ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 40���� ������ ��� �ո��� ��� �վվ��� 38�� ��Ÿ����.
--
�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� P(1 �� P �� 1000)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ������ 40�� ���� ����� �־�����. �̶�, �ո��� H��, �޸��� T�� ǥ���Ѵ�. 
--
���
�� �׽�Ʈ ���̽����� 3-���������� �� �� ��Ÿ�������� ����Ѵ�. �ڵڵ�, �ڵھ�, �ھյ�, �ھվ�, �յڵ�, �յھ�, �վյ�, �վվ� ������� �������� �����ؼ� ����Ѵ�.
--
���� �Է� 1 
4
HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
HHTTTHHTTTHTHHTHHTTHTTTHHHTHTTHTTHTTTHTH
HTHTHHHTHHHTHTHHHHTTTHTTTTTHHTTTTHTHHHHT
���� ��� 1 
0 0 0 0 0 0 0 38
38 0 0 0 0 0 0 0
4 7 6 4 7 4 5 1
6 3 4 5 3 6 5 6
*/
public class No5_2684 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());

//		String[] comp = { "HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT" };
		String str = "";
		int[][] cnt = new int[P][8];
		String[][] arr = new String[P][38];
		
		for (int i = 0; i < P; i++) {
			str = br.readLine();																		 // �� �پ� �о�ͼ�
			for (int j = 0; j < str.length() - 2; j++) {
				String s = "" + str.charAt(j) + str.charAt(j + 1) + str.charAt(j + 2);					 // ���� 3���� ���
				arr[i][j] = s;																			 // str �迭�� ����
				
//				System.out.print(arr[i][j] + " ");
				
				switch (arr[i][j]) {																	// �ش� ���������� ��ġ�� ��� ++
					case "TTT": cnt[i][0]++; break;
					case "TTH": cnt[i][1]++; break;
					case "THT": cnt[i][2]++; break;
					case "THH": cnt[i][3]++; break;
					case "HTT": cnt[i][4]++; break;
					case "HTH": cnt[i][5]++; break;
					case "HHT": cnt[i][6]++; break;
					case "HHH": cnt[i][7]++; break;
				}
			}
		}
		
		for(int i = 0; i < P; i++) {
			for(int j = 0 ; j < 8; j++) {
				System.out.print(cnt[i][j]+" ");														// ���
				
			}
			System.out.println();
		}

	}

}
