package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-2936-%EC%B1%84%EC%8B%9D%EC%A3%BC%EC%9D%98%EC%9E%90-boj-java
/*
 * ����
����̴� ���� �ָ��� �������� �������.

�������� ���� �̵ �ﰢ���̰�, �� ���� ���̰� 250�̴�.

��� ����̰� �������� ���� ������ ��Ƽ����. ��Ƽ���� ���� ���л����� �԰�, DJ�� �Դ�. ��, ���� �ſ� ���ְ� �������� �־���.

������, �׵��� �������� ���� ������ �����. �� ��Ƽ�� ��Դ� ģ���� �߿� �ع��̴� ä�������ڿ��� ������ ��⸦ ���� �ʴ´�.

�ݸ鿡, ��Ⱑ ���� ��Ƽ�� ��Ƽ��� �������� �ʴ´�. ����, ����̴� �������� �� �κ����� ������� �ߴ�.

�������� ���� �׸����� ���̵��� ��ǥ ��� ���� �ִ�. �׸���, �� ������ �ﰢ���� �� ���� �ִ� ������ �̿��ؼ� �� �������� ���� ���̴�. �� ������ ���̰� ���ƾ� �Ѵ�.

�ﰢ���� �̵���ϴ� ������ �� ������ �־�����. �̶�, �ٸ� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ������ �� ������ �־�����. �� ���� �׻� �ﰢ���� �� ���� �ִ�.
--
���
ù° �ٿ� �ٸ� ������ �Ҽ��� ��° �ڸ����� ����Ѵ�. �̶�, ��° �ڸ����� �ݿø��ϸ� �ȴ�.
--
���� �Է� 1 
0 0
���� ��� 1 
125.00 125.00
--
���� �Է� 2 
230 20
���� ��� 2 
0.00 114.13
--
���� �Է� 3 
0 40
���� ��� 3 
148.81 101.19
*/
public class No2_2936 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());											// �� ��ǥ
		int b = Integer.parseInt(st.nextToken());											// �� ��ǥ
		
		// [A]
		if (a + b == 0) {
			System.out.println("125.00 125.00");
			return;
		}
		double base = 250.0 * 250.0 / 2;

		// [B]
		if (a > 0 && b > 0) {
			System.out.println(String.format(a > b ? "0.00 %.2f" : "%.2f 0.00", 250.0 - base / Math.max(a, b)));
			return;
		}

		// [C]
		if (a < 125 && b == 0) {
			double tmp = 250.0 - base / (250 - a);
			System.out.println(String.format("%.2f %.2f", tmp, 250.0 - tmp));
			return;
		}

		// [D]
		if (a == 0 && b < 125) {
			double tmp = 250.0 - base / (250 - b);
			System.out.println(String.format("%.2f %.2f", 250.0 - tmp, tmp));
			return;
		}

		// [E]
		if (b == 0) {
			System.out.println(String.format("0.00 %.2f", base / a));
			return;
		}

		// [F]
		System.out.println(String.format("%.2f 0.00", base / b));
	}

}
