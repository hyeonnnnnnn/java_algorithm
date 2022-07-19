package sohyeon.july16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * ����
������ ��� �������� ���� 6������ Ű��� �ִ�. �״� �Ϸ翡 �� ���� �������� ���ִ� ���� �ش�.

������ ���� ��Ź�� �ɾƼ� �Ļ縦 �Ѵ�. ������ �������� ������ �پ�� ������ �� �� �ڽ��� ���ʰ� ������ �ɾҴ� ������ �Ծ��� ���� ����ϰ� �ִ�. 

��, ��ɵ� ���� ������, �� ��ŭ�� ���� �߰��Ͽ� �Ļ縦 �ϱ⸦ ���Ѵ�.

���� ���, ������ 1������ 6������ �������� ���� 3, 2, 7, 1, 5, 4��ŭ ���� �־��ٸ�, 2�� ������ ù �� ���� �� 2���� ���ʰ� ������ ������ ���� �� 15(3+7+5)��ŭ�� ���� 17��ŭ �ޱ⸦ ���Ѵ�.

������ ���� ��� �������� �̷� ������ �䱸�� ��� ����ַ��� �Ѵ�. ���� ������ ���� �ż��� ��ᰡ N��ŭ ��޵ȴ�. ����� ��������� �Ϸ��̱� ������, ���� ���� ��� ����Ѵ�.

ù �� �������� �Ծ��� ���� �־����� ��, ������ 6������ �������� �䱸�� ����� �� ���� �Ǵ� ���� �� ��° ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

--
�Է�
�Է��� T���� �׽�Ʈ �����ͷ� �����ȴ�. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 

�� �׽�Ʈ �����ʹ� �� �ٷ� �����Ǿ� �ְ�, ù° �ٿ��� �Ϸ翡 ��޵Ǵ� ����� �� N (1<=N<=500,000,000)�� �־�����. 

�� ���� �ٿ��� 1, 2, 3, 4, 5, 6�� ������ ù �� �Ծ��� �Ļ��� ���� �� ĭ�� ���̿� �ΰ� ���ʴ�� �־�����. 

ù° ���� �� ������ �Դ� ����� ���� 100������ �ڿ����̴�.
--
���
�� �׽�Ʈ �����Ϳ� ����, 6���� ������ �䱸�� ��� ����� �� ���� �Ǵ� ���� �� ��° ������ ����Ѵ�.
--
���� �Է� 1 
2
21
1 2 3 4 5 6
21
1 2 3 4 5 7
���� ��� 1 
2
1
*/
public class No2_3060 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long T = Long.parseLong(st.nextToken());										// �Է� ������ ��
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			long N = Long.parseLong(st.nextToken()); 									// ��� ��
			long[] pig = new long[7];
			long sum = 0;																// ��ü ��� ��
			int cnt = 1;																// �ϼ�

			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; j <= 6; j++) {
				pig[j] = Long.parseLong(st.nextToken());								// �� ���� ��� ��
				sum += pig[j];															// �Ϸ� ��ü ��� ��
			}

			while (sum <= N) {
				sum *= 4;
				cnt++;
			}

			bw.write(cnt + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
