package sohyeon.jun11;

import java.util.Scanner;

/*
 * ����
�ֹ����� �̹� �б⿡ ���� ����� ���� �׸��� ������ �־����� ��, ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ A+~F���� �� 13���� �ִ�.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

��� ������ �� ������ ����*������ ��� ���� �ڿ�, �� �������� ������ �ȴ�.
--
�Է�
ù° �ٿ�, �����̰� �̹� �б⿡ ���� ���� ���� �־�����. ��° �ٺ��� N���� �ٿ� �� ������ �����, ����, ������ �־�����.

������� ���ĺ� �ҹ��ڿ� ����, �׸��� ���� (_)�θ� �̷���� ������, �ִ� 100�����̰�, ������ 1���� ũ�ų� ����, 3���� �۰ų� ���� �ڿ����̴�.

������ ������ ������ 13���� �� �ϳ��̴�. 
--
���
ù° �ٿ� ��� ������ �Ҽ��� ��° �ڸ����� �ݿø��ؼ� ��° �ڸ����� ����Ѵ�. (��� ������ 1.5�̸� 1.50�� ����Ѵ�.)
--
���� �Է� 1 
7
General_Physics_1 3 A+
Introduction_to_Computer_Science_and_Eng 3 B0
Reading_And_Writing 2 C0
English_1 3 C+
Analytic_Geometry_and_Calculus_1 3 B+
Fortran_Programming 3 B+
C_Language_Programming 3 A+
���� ��� 1 
3.28
*/

public class No2_2755 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();																// ���� ��
		String[][] arr = new String[n][3];
	
		double sum = 0;																		// ���� * ���� ��
		double point = 0;																	// ���� ��
		
		for(int i = 0; i < n; i++) {
			double temp = 0;																// �� ���� ����
			
			for(int j = 0; j < 3; j++) {
					arr[i][j] = sc.next();													// �����, ����, ���� �Է¹ޱ�
			}
			
			String score = arr[i][2];														// ����(����) �����ͼ�
			
			// ������ ���� ����
			if (score.charAt(0) == 'A') temp = 4; 
			if (score.charAt(0) == 'B') temp = 3; 
			if (score.charAt(0) == 'C') temp = 2; 
			if (score.charAt(0) == 'D') temp = 1;
		    if (score.charAt(1) == '+') temp += 0.3; 
		    if (score.charAt(1) == '-') temp -= 0.3;
		    
			sum += Integer.parseInt(arr[i][1]) * temp;										// ����  = ���� * ����
			point += Integer.parseInt(arr[i][1]);											// ������  += ���� 
		}

		System.out.println(String.format("%.2f", sum/point));
		sc.close();
	}
}