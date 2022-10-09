package sohyeon.sep24;
//https://lovelyunsh.tistory.com/32
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * ����
�Ʒ� <�׸� 1>�� ���� ���簢�� ����� ���̰� �ִ�. �� ���̴� ���ι���� ���� �������� 1������ ������ �׾��� �ִ�. 

���� ������ ������ �Ʒ��� 1������ ���ʷ� ��ȣ�� �پ� �ְ�, ���� ������ ���ʿ��� ���������� ��ȣ�� �پ� �ִ�.



<�׸� 1>

������ ���� �� ���̸� Į�� �ڸ����� �Ѵ�. ���� ������ ���� �ڸ��� ���� ������ ���� ������ ������ ������, ���� ������ ���� ���� ������ �Ʒ��� ������ �� ���� �ڸ���. 

���� ���, <�׸� 1>�� ���� ���� 10���̰� ���� ���� 8���� ���̸� 3�� ���� ����, 4�� ���� ����, �׸��� 2�� ���� ������ ���� �ڸ��� <�׸� 2>�� ���� ���� ���� ���� �������� ������ �ȴ�. 

�̶� ���� ū ���� ������ ���̴� 30���̴�.



<�׸� 2>

�Է����� ������ ���� ���� ����, �׸��� �߶���� �������� �־��� ��, ���� ū ���� ������ ���̰� �� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù�ٿ��� ������ ���ο� ������ ���̰� ���ʷ� �ڿ����� �־�����. ���ο� ������ ���̴� �ִ� 100���̴�. 

��° �ٿ��� Į�� �߶���ϴ� ������ ������ �־�����. ��° �ٺ��� ������ �ٱ��� �� �ٿ� ������ �ϳ��� �Ʒ��� ���� ������� �Էµȴ�. 

���η� �ڸ��� ������ 0�� ���� ��ȣ�� ���ʷ� �־�����, ���η� �ڸ��� ������ 1�� ���� ��ȣ�� �־�����. �ԷµǴ� �� ���� ���̿��� �� ĭ�� �ϳ��� �ִ�.
--
���
ù° �ٿ� ���� ū ���� ������ ���̸� ����Ѵ�. ��, ������ ������ ������� �ʴ´�.
--
���� �Է� 1 
10 8
3
0 3
1 4
0 2
���� ��� 1 
30
*/
public class No2_2628 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		
		col.add(Integer.parseInt(st.nextToken()));											// ����
		row.add(Integer.parseInt(st.nextToken()));											// ����
		
		int N = Integer.parseInt(br.readLine());											// �ڸ��� Ƚ��
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());										// ���� ��ǥ
			int y = Integer.parseInt(st.nextToken());										// ���� ��ǥ
			
			if(x == 0) { 																	// ����
				int index;
				
				for(index = 0; y - row.get(index) > 0 ; index++ ) {
					y -= row.get(index);
				}
				
				int temp = row.remove(index);
				row.add(index,temp-y);
				row.add(index,y);															// �� ���̿��� ��ǥ��ŭ �� ��ġ ����Ʈ�� �Է�
			}
			else { 																			// ����
				int index;
				for(index = 0  ; y - col.get(index)>0 ; index++ ) {
					y -= col.get(index);
				}
				int temp = col.remove(index);
				col.add(index,temp-y);
				col.add(index,y);															// �� ���̿��� ��ǥ��ŭ �� ��ġ ����Ʈ�� �Է�
			}
		}
		
		int max = 0;
		for(int i : col) {
			for(int j : row)
				max = Math.max(i*j, max);													// ����Ʈ�� col*row ���� �ؼ� �ִ� ����
		}
		System.out.println(max);

	}

}
