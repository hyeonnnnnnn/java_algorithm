package sohyeon.feb11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://st-lab.tistory.com/86
/*
 * ����
�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�.

���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
ù° �ٿ� x, y, w, h�� �־�����.
--
ù° �ٿ� ������ ������ ����Ѵ�.
--
1 �� w, h �� 1,000
1 �� x �� w-1
1 �� y �� h-1
x, y, w, h�� ����
--
���� �Է� 1 
6 2 10 3
���� ��� 1 
1
--
���� �Է� 2 
1 1 5 5
���� ��� 2 
1
--
���� �Է� 3 
653 375 1000 1000
���� ��� 3 
347
--
���� �Է� 4 
161 181 762 375
���� ��� 4 
161
*/
public class No2_1085 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
        
		int x_min = Math.min(x, w-x);	// x�� �ּҰŸ�
		int y_min = Math.min(y, h-y);	// y�� �ּҰŸ�
        
		// x�� y�� �ּҰŸ� �� ���� ���� ��
		System.out.println(Math.min(x_min, y_min));
	}

}
