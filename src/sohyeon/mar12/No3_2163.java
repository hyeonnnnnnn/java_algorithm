package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
��ȭ�� N��M ũ���� ���ݸ��� �ϳ� ������ �ִ�. ���ݸ��� ���� �� �ִ� ����� �ϰ� ������, �� �ݿ� ���� N��M���� �������� ������ �� �ִ�.

���ݸ��� ũ�Ⱑ �ʹ� ũ�ٰ� ������ �׳�� ���ݸ��� ģ����� ���� �Ա�� �ߴ�. �̸� ���ؼ� ��ȭ�� ���ݸ��� ��� �ɰ��� �� N��M���� �������� �ɰ����� �Ѵ�.

���ݸ��� �ɰ� ������ ���ݸ� ������ �ϳ� ���, ������ ��ġ���� ���ݸ��� �ɰ���. ���ݸ��� �ɰ� ������ ���� �� �ִ� ��ġ������ �ɰ� �� �ִ�.

�̿� ���� ���ݸ��� �ɰ��� ���ݸ��� �� ���� �������� �������� �ȴ�. ���� �ٽ� �� �߿��� ���ݸ� ������ �ϳ� ���, �ɰ��� ������ �ݺ��ϸ� �ȴ�.

���ݸ��� �ɰ��ٺ��� ���ݸ��� ���� �� �ֱ� ������, ��ȭ�� �������̸� ���ݸ��� �ɰ��� Ƚ���� �ּҷ� �Ϸ� �Ѵ�.

���ݸ��� ũ�Ⱑ �־����� ��, �̸� 1��1 ũ���� ���ݸ����� �ɰ��� ���� �ּ� �ɰ��� Ƚ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �� ���� N, M(1 �� N, M �� 300)�� �־�����.
--
���
ù° �ٿ� ���� ����Ѵ�.
--
���� �Է� 1 
2 2
���� ��� 1 
3
--
���� �Է� 2 
1 1
���� ��� 2 
0
*/
public class No3_2163 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// �� �ٷ� �о�ͼ�
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());			// ������ �����ڷ� ���� �����ͼ� ����ȭ, ���ݸ� ���� N
		int M = Integer.parseInt(st.nextToken());			// ������ �����ڷ� ���� �����ͼ� ����ȭ, ���ݸ� ���� M
		
		System.out.println(N * M - 1);
		
	}

}
