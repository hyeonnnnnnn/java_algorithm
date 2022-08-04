package sohyeon.july23;

import java.util.Scanner;

/*
 * ����
7:00���� 19:00���� ��ȭ ����� 1�п� 10���̴�.

19:00���� 7:00���� ��ȭ ����� 1�п� 5���̴�.

����̰� ��ȭ�� �� �ð��� ��ȭ �ð��� ��� �־����� ��, ��ȭ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ����̰� �� ��ȭ�� �� N�� �־�����. (1 �� N �� 100)

���� N�� �ٿ��� ����̰� �� ��ȭ�� ���� ������ HH:MM DD�� ���� �������� �־�����.

HH:MM�� ��ȭ�� �� �ð��̸�, DD�� ��ȭ �ð��̴�. DD�� �ִ� 60�̸�, MM�� DD���̿��� ������ �ϳ� �־�����.

���� �ó� ���� ���ڸ� ���ڶ��, �տ� 0�� �ϳ� �־�����.

�ð��� 00:00���� 23:59�����̴�.
--
���
�� ��ȭ ����� ����Ѵ�.
--
���� �Է� 1 
2
11:02 11
15:30 01
���� ��� 1 
120
--
���� �Է� 2 
3
20:05 12
06:45 30
13:08 15
���� ��� 2 
435
--
���� �Է� 3 
5
00:00 05
06:47 35
11:30 18
18:33 60
23:59 22
���� ��� 3 
1035
*/
public class No2_3226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();												// ��ȭ ��
		sc.nextLine();
		
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			String[] str = sc.nextLine().split(":| ");						// ��ȭ ���� �޾ƿͼ� ������ �������� �߶���
			
			int HH = Integer.parseInt(str[0]);								// ��ȭ ���� ��
			int MM = Integer.parseInt(str[1]);								// ��ȭ ���� ��
			int DD = Integer.parseInt(str[2]);								// ��ȭ ���� ��ȭ�ð�
			
			int end_hour = HH;												// ��ȭ����ð�
			int end_minute = MM + DD;										// ��ȭ�����
//			System.out.println(HH);
//			System.out.println(MM);
//			System.out.println(DD);
			
			if(end_minute >= 60) end_hour += 1; end_minute -= 60;			// ��ȭ����� 60 �̻� �� ��ȭ����ð�+1, ��ȭ�����-60
			if(end_hour >= 24) end_hour -= 24;								// ��ȭ����ð� 24 �̻� �� ��ȭ����ð�-24
			
//			System.out.println(end_hour);
//			System.out.println(end_minute);
			
			if(7 <= HH && HH <= 18 && 7 <= end_hour && end_hour <= 18) {
				// ��ȭ���۽ð��� ��ȭ����ð��� 7�� ~ 18�ö��: �д� 10��
				result += DD * 10;
				
			} else if (0 <= HH && HH <= 6 && 0 <= end_hour && end_hour <= 6){
				// ��ȭ���۽ð��� ��ȭ����ð��� 0�� ~ 6�ö��: �д� 5��
				result += DD * 5;
				
			} else if (19 <= HH && HH <= 23 && 19 <= end_hour && end_hour <= 23){
				// ��ȭ���۽ð��� ��ȭ����ð��� 19�� ~ 23�ö��: �д� 5��
				result += DD * 5;
				
			} else if (HH == 18 && end_hour == 19) {
				// ��ȭ���۽ð� 18��, ��ȭ����ð� 19�ö��: �д� 10�� ������ �д� 5�� ���� ����Ͽ� ����
				result += 10 * (60 - MM) + 5 * end_minute;
				
			} else if (HH == 6 && end_hour == 7) {
				// ��ȭ���۽ð� 6��, ��ȭ����ð� 7�ö��: �д� 10�� ������ �д� 5�� ���� ����Ͽ� ����
				result += 5 * (60 - MM) + 10 * end_minute;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
