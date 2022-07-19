package sohyeon.july16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://blog.naver.com/whiteflower_/221600084530
/*
 * ����
�츮�� �ڵ������� �˶��ð踦 ������ ���� �ð��� ���� ��Ÿ���� 4���� ���ڸ� �Է��ϱ� ���� Ű���带 ����Ѵ�. 

���� ���, �츮�� 12:30���� �˶��� �����Ϸ��� �Ѵٸ� 1,2,3,0�� �Է��ϸ� �ǰ� 9��30�� ���� ���� �� �տ� 0�� �ٿ� 0,9,3,0�� ������ �ȴ�.

�׷��� �� ��, ���� �˶��ð踦 ���ߴٰ� �ð��� �߸� �Է��ߴµ� ȭ�鿡 ��Ÿ���� �ð��� 24�� ���� ��������� ���� �˰Եƴ�. 

���������� �� ���� 60���� ���� �������� ȭ�鿡 ��Ÿ���� ����� �˰Եƴ�. ���� ��� 66:79�� �ð��� �߸� �Է��߾ ������ ȭ�鿡�� 18:19�� ��Ÿ���ٴ� ���̴�.

���� �ſ� �������� ���ϴ� �˶��ð��� ���ߴµ� �ּ����� ��¸� �ϰ�ʹ�. 

�׷��� �����е��� ���� ��� �ϸ� �ּ����� ����� �鿩�� ���ϴ� �ð����� �˶��� ���� �� ������ �˾Ƴ��� ���α׷��� ������ �Ѵ�.

Ű����� ���� ���� ����� Ű a���� Ű b�� �̵��� �� �ʿ��� ����� ������ ����.

effort(a,b) = |xa-xb|+|ya-yb|

���⼭ (xa, ya) �� (xb, yb)�� Űa, b�� ��ǥ�� ��Ÿ����.

��ü ����� ���� ù ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ���, �� ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ���, 

�� ��° Ű���� �� ��° Ű�� �̵��ϴµ� �ʿ��� ����� �� ���� ������ ���ǵȴ�.

���� ��� 22:45�� �Է��ϴµ� �ʿ��� ��ü ����� ���� effort(2,2)+effort(2,4)+effort(4,5)=0+2+1=3. �̴�.

���� ���� ���� ������� ���� ���� �ð��� ����϶�.
--
�Է�
�Է��� ù ��° �ٿ��� HH:MM �������� �����ϰ� ���� �ð��� �־�����. ���� �ð��̳� ���� �� �ڸ������ �����ϴ� 0�� �پ�� �Ѵ�.

�����ϰ� ���� �ð��� 00:00~23:59 �� �ϳ��̴�.
--
���
����� ù ��° �ٿ��� HH:MM �������� ���� ����Ѵ�. �� �ڸ��� ����� �����ϴ� 0�� �ٿ��� �Ѵ�.
--
���� �Է� 1 
14:19
���� ��� 1 
14:79
--
���� �Է� 2 
00:11
���� ��� 2 
24:11
--
���� �Է� 3 
12:34
���� ��� 3 
12:34
*/
class Pos {
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class No3_3154 {

	static Pos list[] = new Pos[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		String answer = "";
		int min = 999;
		int HH = Integer.parseInt(st.nextToken()); 									// �ð�
		int MM = Integer.parseInt(st.nextToken()); 									// ��

		list[1] = new Pos(0, 0);
		list[2] = new Pos(0, 1);
		list[3] = new Pos(0, 2);
		list[4] = new Pos(1, 0);
		list[5] = new Pos(1, 1);
		list[6] = new Pos(1, 2);
		list[7] = new Pos(2, 0);
		list[8] = new Pos(2, 1);
		list[9] = new Pos(2, 2);
		list[0] = new Pos(3, 1);

		for (int i = 0; i < 5; i++) {
			int NHH = HH + (24 * i);
			
			for (int j = 0; j < 2; j++) {
				int NMM = MM + (60 * j);
				if (NHH >= 100 || NMM >= 100)
					continue;
				String H = "", M = "";
				
				if (min > effort(NHH, NMM)) {
					min = effort(NHH, NMM);
					
					if (NHH < 10)													// ���ڰ� ���ڸ��� �� 0 �߰�
						H = "0" + NHH;
					else
						H = NHH + "";
					if (NMM < 10)													// ���ڰ� ���ڸ��� �� 0 �߰�
						M = "0" + NMM;
					else
						M = NMM + "";
					answer = (H + ":" + M);
				}
				//System.out.println(NHH + " " + NMM + " " + effort(NHH, NMM));
			}
		}

		System.out.println(answer);

	}

	public static int effort(int HH, int MM) {											// effort ���ϴ� �Լ�
		int Hfirst = HH / 10;
		int Hlast = HH % 10;
		int Mfirst = MM / 10;
		int Mlast = MM % 10;

		return Math.abs(list[Hfirst].x - list[Hlast].x) + Math.abs(list[Hfirst].y - list[Hlast].y)
				+ Math.abs(list[Mfirst].x - list[Hlast].x) + Math.abs(list[Mfirst].y - list[Hlast].y)
				+ Math.abs(list[Mlast].x - list[Mfirst].x) + Math.abs(list[Mlast].y - list[Mfirst].y);


	}

}
