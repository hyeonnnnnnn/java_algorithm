package sohyeon.sep24;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����
������ ���� ��Ģ�� ���� ������ ������� �Ѵ�.

ù ��° ���� ���� ������ �־�����.
�� ��° ���� ���� ���� �߿��� �ϳ��� �����Ѵ�.
�� ��°���� ���Ŀ� ������ ��� ���� ���� ���� ������ ���� ���� ���� �����.
���� ���, �� ��° ���� ù ��° ������ �� ��° ���� �� ���̰�, �� ��° ���� �� ��° ������ �� ��° ���� �� ���̴�.
���� ������ ���������, �� ���� ������ ������ �� �̻� ���� ������ �ʴ´�.
ù ��° ���� 100�� �־��� ��, �� ��° ���� 60�� �����Ͽ� ���� ��Ģ���� ������ ����� 7���� ���� 100, 60, 40, 20, 20 , 0, 20�� ���������. 
�׸��� �� ��° ���� 62�� �����Ͽ� ���� ��Ģ���� ������ ����� 8���� ���� 100, 62, 38, 24, 14, 10, 4, 6�� ���������. 
���� ������ �� �� �ֵ���, ù ��° ���� ������ �� ��° ���� ���� ��������� ������ ������ �ٸ� �� �ִ�.

�Է����� ù ��° ���� �־��� ��, �� ������ �����Ͽ� ���� ��Ģ���� ��������� �ִ� ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�ִ� ������ ������ ���� ���� ��, ���� �ϳ��� ���鸸 ����ϸ� �ȴ�.
--
�Է�
ù ��° ���� �־�����. �� ���� 30,000 ���� ���ų� ���� ���� �����̴�.
--
���
ù ��° �ٿ��� �Էµ� ù ��° ���� �����Ͽ� ���� ��Ģ�� ���� ���� �� �ִ� ������ �ִ� ������ ����Ѵ�.

��° �ٿ� �� �ִ� ������ ������ ���ʴ�� ����Ѵ�. �̵� �� ���̿��� ��ĭ�� �ϳ��� �д�.
--
���� �Է� 1 
100
���� ��� 1 
8
100 62 38 24 14 10 4 6
*/
public class No3_2635 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>(); 					// �ӽ� ����Ʈ
			
			tmp.add(n); 														// n�� ����Ʈ�� 1�� 
			tmp.add(i);															// i�� ����Ʈ�� 2���� ����
			
			int prev1 = n;
			int prev2 = i;

			while (true) { 														// ����� 0���� ū ���� �վ� ���ڿ��� �� ���ڸ� ���ذ��� ����Ʈ�� ����
				int temp = prev1 - prev2;
				
				if (temp >= 0) {												// temp�� 0���� Ŭ ��� ��� ����, �ƴϸ� ��
					tmp.add(temp);
					
				} else {
					break;
				}
				
				prev1 = prev2; 													// �վ� ���ڿ� �� ���ڸ� ���� ����
				prev2 = temp;
			}
			
			if (max < tmp.size()) { 											// �ִ� ������ ���ڶ�� �ش� ������ max�� �����ϰ� ����Ʈ�� ���� ������ arr�� ����
				max = tmp.size();
				arr = tmp;
			}
		}
		
		sc.close();
		
		System.out.println(max); 												// �ִ� ��
		
		for (int i = 0; i < arr.size(); i++) {									// �ִ� �� ����
			System.out.print(arr.get(i) + " ");
		}
		
	}

}