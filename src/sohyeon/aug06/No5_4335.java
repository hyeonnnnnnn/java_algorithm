package sohyeon.aug06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * ����
���İ� �ø��� ���� ���߱� ������ �ϰ� �ִ�. ������ 1�� 10������ ���� �ϳ��� �����ϰ�, �ø��� ������ ������ ���� ����� �Ѵ�. 

�ø��� ���� ���� ������ ������ �ø��� ���� ���� ū��, ������, ��ġ�ϴ����� �����ش�.

������ �� �� ����� �� �ø��� ������ �������� �ϰ� �ִٴ� ������ �ϰ� �Ǿ���. 

��, �ø��� ���� ���Ҷ� ���� ������ �ڽ��� ������ ���� �ٲܼ��� �ִٴ� ������ �ߴ�. 

�̷� ���� ������ ���������� �˾Ƴ��� ���ؼ�, �ø��� ������ ����Ǹ鼭 �ڽ��� ��ģ ���� ������ ���� �亯�� ��� ������Ҵ�.

�ø��� ��ģ ���� ������ �亯�� �־����� ��, ������ �������� �ߴ��� �ƴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
�Է��� ���� ���� �������� �̷���� �ִ�. �� ������ �ø��� ��ģ ���� ������ �亯���� �̷���� ������, ����ؼ� �����ư��鼭 �־�����.

�ø��� ��ģ ���� 1���� ũ�ų� ����, 10���� �۰ų� ���� �ڿ����̰�, ������ �亯�� "too high", "too low", "right on" �� �ϳ��̴�.

"too high"�� �ø��� ��ģ ���� ������ ������ ������ Ŭ ��, "too low"�� ���� ��, "right on"�� ��ġ�� ���̴�.

������ �亯�� "right on"�̸�, ������ ���� ���̴�.

�Է��� ������ �ٿ��� 0�� �־�����.
--
���
������ ���ӿ� ���ؼ�, ������ �������� �� ���� �ִٸ� "Stan is dishonest"��, ���ٸ� "Stan may be honest"�� ����Ѵ�.
--
���� �Է� 1 
10
too high
3
too low
4
too high
2
right on
5
too low
7
too high
6
right on
0
���� ��� 1 
Stan is dishonest
Stan may be honest
*/

//https://umilove98.tistory.com/100
public class No5_4335 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			ArrayList<Integer> high = new ArrayList<Integer>();								// high ����Ʈ
			ArrayList<Integer> low = new ArrayList<Integer>();								// low ����Ʈ
			int result = 0;

			while (true) {
				int num = Integer.parseInt(br.readLine());
				
				if (num == 0) { 															// 0�� �ԷµǸ� ����
					return;
				}
				String answer = br.readLine();												// �亯 �о�ͼ�

				if (answer.charAt(4) == 'h') { 												// ���� ���ڰ� high�� ��� high ����Ʈ�� ����
					high.add(num);
					
				} else if (answer.charAt(4) == 'l') { 										// ���� ���ڰ� low�� ��� low ����Ʈ�� ����
					low.add(num);
					
				} else { 																	// ���� ���ڰ� right�� ��� ���� ���� �� ����
					result = num;
					break;
				}
			}
			boolean flag = true;
			
			for (int i = 0; i < high.size(); i++) {
				if (result >= high.get(i)) {
					flag = false;															// high�� ����� ��� ������ ���亸�� ũ�� ����
					break;
				}
			}
			if (flag) {
				for (int i = 0; i < low.size(); i++) { 										
					if (result <= low.get(i)) {												// low�� ����� ��� ������ ���亸�� ������ ����
						flag = false;
						break;
					}
				}
			}
			
			if (flag) {																		// ������ ���
				System.out.println("Stan may be honest");
			} else {																		// ������ ���
				System.out.println("Stan is dishonest");
			}

		}
	}

}
