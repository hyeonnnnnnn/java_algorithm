package sohyeon.aug06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * ����
2018�⿡ ���ѹα� ��â���� ����ø����� ���ֵȴ�. �� �߿����� ��Ű�� ����ø����� �������� ���� �츮���󿡼� �αⰡ �� ���� �� ����. 

�׷��� �̹� ��â�ø��ȿ��� ���ο� ��Ű ��� ��Ģ�� ���� �Ǿ���. ���� ����� ��Ģ�� ������ ����.

��Ű ���� �� ���� ���ַ� �̷���� �ִ�. �� N���� ������ ù ��° ���ֿ� �����ϰ� ���� ��ȣ�� �ο��޴´�. 

1�� �������� N�� �������� ������� �� �� ���� Ÿ�� ��������. ���� �� �������� ������ ������ ���� ������ ������ ���̴�. 

ù ��° ���ְ� ������ �� �� ���������� ������ ������ ���� 1����� M������� �����鿡�Ը� �� ��° ���ֿ� ���� �� �ִ� �ڰ��� �־�����. 

�� ��° ���ֿ����� ù ��° ���ֿ��� �ʰ� ���� �������(M����� �����ؼ� 1�����) �� �� ���� Ÿ�� ��������. 

���� �� �������� ������ ������ ���� ������ ������ ���̴�. �� ��° ���ְ� ������ �� �� ���������� ������ ������ ���� 1��, 2�� �׸��� 3��� ���� �ݸ޴�, ���޴�, ���޴��� ���� �� ���̴�.

�̶� �޴��� ���� �������� ��ȣ�� ���ϴ� ���α׷��� �ۼ��ؾ� �Ѵ�.(���ֿ� ������ ��� �������� �� �� �������� ���ָ� �����Ѵ�. �� �� �̻��� ������ ���ÿ� ������ ���� ����.)
--
�Է�
ù ��° �ٿ��� ���� N�� M�� �־�����. (3 �� M �� N �� 100)

�� �� N���� �ٿ��� ù ��° ���ֿ��� ������ �������� �������� �� ������ ���� ������ �־�����.

�� �� M���� �ٿ��� �� ��° ���ֿ��� ������ �������� �������� �� ������ ���� ������ �־�����.
--
���
ù ��° �ٿ��� �ݸ޴��� �� ������ ��ȣ��, �� ��° �ٿ��� ���޴��� �� ������ ��ȣ��, �� ��° �ٿ��� ���޴��� �� ������ ��ȣ�� ����Ѵ�.
--
���� �Է� 1 
3 3
1
2
3
1
1
1
���� ��� 1 
1
2
3
--
���� �Է� 2 
4 3
1
1
2
2
1
2
1
���� ��� 2 
2
3
4
--
���� �Է� 3 
5 4
1
2
1
4
3
1
1
3
2
���� ��� 3 
5
3
2
*/
public class No1_3230 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> first_race = new ArrayList<Integer>();					// ù ��° ����
		ArrayList<Integer> second_race = new ArrayList<Integer>();					// �� ��° ����
		
		for(int i = 0; i < N; i++) {
			int first_score = Integer.parseInt(br.readLine());						// ù ��° ���̽� ����
			first_race.add(first_score-1, i); 										// �ε���: ����, ��: ������ȣ
			
		}
		
		/*	
		for(int i = 0; i < first_race.size(); i++) {
			System.out.println(first_race.get(i)+1 + "������_" + (i+1) + "��");
		}
		*/
		
		for(int j = M-1; j >= 0; j--) {
			int second_score = Integer.parseInt(br.readLine());						// �� ��° ���̽� ����
			second_race.add(second_score-1, first_race.get(j));						// �ε���: ����, ��: ������ȣ
			
		}
		
		System.out.println(second_race.get(0)+1);										// ��
		System.out.println(second_race.get(1)+1);										// ��
		System.out.println(second_race.get(2)+1);										// ��
	}

}
