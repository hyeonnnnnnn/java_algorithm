package sohyeon.aug20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://hunucho.tistory.com/entry/Baekjoon-4732-%EC%A1%B0%EC%98%AE%EA%B9%80-JAVA
/*
 * ����
���� ������ ����� 12������ �̷���� �ִ�.

A A# B C C# D D# E F F# G G#

�� 12���� ������ �ݺ��ȴ�. G#���� �������� A�̴�.

�� ���� ������ ���� ���� �����̴�. #�� "����"��� ������, ���� ���� �����ٴ� ���̴�. "A#"�� A�� ���� ���� ���̶�� ���̴�.

�÷��� ���� �����ٴ� ���̴�. �� ���������� 'b'�� ǥ���Ѵ�.

#�� b�� �̿��Ѵٸ�, ���� ���� ���� ���� �̸����� �θ� �� �ִ�. A#�� Bb�� ���� ���̴�. B#�� C�� ������, Fb�� E�� ����.

���ű��� ���� �߿��� �� �� �ϳ��̴�. ���ű��̶� � ���� ��� ���� ������ ���� ������ŭ �ø��ų� ���ߴ� �۾��̴�. 

���ű� �۾��� ���� ��, ��� ������ ���� ���� ����(���� ����)�� �۾��� �ϱ� ���� ���ƾ� �Ѵ�.

� ���� �־����� ��, ���ű��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� ù° �ٿ��� � ���� ���� ������ �־�����. 

���� ���� �ϳ� �Ǵ� �� �̻��� �������� ���еǾ� �ִ�. ���� �ٿ��� ���ű��ؾ� �ϴ� ���� �־�����. �� ���� ����� ��� �� ����ŭ ���� �Űܾ� �ϰ�, ������ ��� �Ʒ��� �Űܾ� �Ѵ�.

�Է��� ������ �ٿ��� "***"�� �־�����.
--
���
�� �׽�Ʈ ���̽��� ���ؼ�, ���ű��� ����� ����Ѵ�. ����ϴ� ���� ���� ���� �����ִ� 12�� ���� �����ִ� ���̾�� �Ѵ�.
--
���� �Է� 1 
C# E Db G#
1
D E# D A
-1
***
--
���� ��� 1 
D F D A
C# E C# G#
*/
public class No1_4732 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] scale = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
		int move = 0;
		
		while (st.countTokens() > 3) {
			move = Integer.parseInt(br.readLine());										// ���ű� ��ġ (+/-)
			int index = 0;
			
			while (st.countTokens() > 0) {
				String s = st.nextToken();
				
				switch (s) {															// ���� ���� �ε��� �ο�
				case "A":
					index = 0;
					break;
				case "A#":
				case "Bb":
					index = 1;
					break;
				case "B":
				case "Cb":
					index = 2;
					break;
				case "B#":
				case "C":
					index = 3;
					break;
				case "C#":
				case "Db":
					index = 4;
					break;
				case "D":
					index = 5;
					break;
				case "D#":
				case "Eb":
					index = 6;
					break;
				case "E":
				case "Fb":
					index = 7;
					break;
				case "E#":
				case "F":
					index = 8;
					break;
				case "F#":
				case "Gb":
					index = 9;
					break;
				case "G":
					index = 10;
					break;
				case "G#":
				case "Ab":
					index = 11;
					break;
				}
				if (index + move < 0)
					index += 12;
				System.out.print(scale[(index + move) % 12] + " ");
			}
			System.out.println();
			st = new StringTokenizer(br.readLine());
		}
	}

}
