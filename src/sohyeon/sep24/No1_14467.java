package sohyeon.sep24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ����
���� ���� �ǳʰ� ������ ���������� ��� ������ �Ǿ� ������, �ǿܷ� �Ұ� ���� �ǳʰ� ������ ���� ������ ���� ����. 

�� ������ ������ ������ �־��� ��� ���� �� �������κ��� �Ұ� ���� �ǳʴ� ������ ���� ���� ���Ǹ� �ް� �Ǿ���.

���� �� ���� �Ұ� ���� �ǳʴ� ���� �����ϴ� ���̴�. ���� ���� ��ġ�� N�� �����ϴµ�, �� ������ ���� ��ȣ�� ���� ��ġ �ϳ������� �̷���� �ִ�. 

���� �Ҹ� 10���� ������ �����Ƿ� ���� ��ȣ�� 1 �̻� 10 ������ ������, ���� ��ġ�� ���� ���ʰ� �������� �ǹ��ϴ� 0�� 1 �� �ϳ���.

�� ���� ����� ������ �Ұ� �ּ� �� �� ���� �ǳԴ��� �˾ƺ���. �� ���� ��ȣ�� �Ұ� ��ġ�� �ٲ� ���� �� ������ ���� �ȴ�.
--
�Է�
ù �ٿ� ���� Ƚ�� N�� �־�����. N�� 100 ������ ���� �����̴�. ���� N�ٿ��� �� �ٿ� �ϳ��� ���� ����� �־�����. ���� ����� ���� ��ȣ�� ��ġ(0 �Ǵ� 1)�� �̷���� �ִ�.
--
���
ù �ٿ� �Ұ� ���� �ǳʰ� �ּ� Ƚ���� ����Ѵ�.
--
���� �Է� 1 
8
3 1
3 0
6 0
2 1
4 1
3 0
4 0
3 1
���� ��� 1 
3
*/
public class No1_14467 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());									// ����Ƚ��	
		int[][] arr = new int[11][1];
		int cnt = 0;
		
        for(int i = 1; i < 11; i++) {
            arr[i][0] = -1;															// ��� -1 �־����(�ʱ�ȭ)
        }
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());								// �� ��ȣ
			int b = Integer.parseInt(st.nextToken());								// ��ġ
			
			if(arr[a][0] == -1) {													// �̵��� ���� ��� �ش� ��ġ�� ����
                arr[a][0] = b;
            }
            else {
                if(arr[a][0] != b) {												// ���� ��ġ�� �ٸ� ���� ���� ��� �̵��� �� --> cnt++
                    cnt++;
                    arr[a][0] = b;
                }
            }
		}
		
		System.out.println(cnt);
	}

}
