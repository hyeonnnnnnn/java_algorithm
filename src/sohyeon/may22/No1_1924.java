package sohyeon.may22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/*
 * ����
������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1 �� x �� 12)�� y(1 �� y �� 31)�� �־�����.

����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
--
���
ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
--
���� �Է� 1 
1 1
���� ��� 1 
MON
--
���� �Է� 2 
3 14
���� ��� 2 
WED
--
���� �Է� 3 
9 2
���� ��� 3 
SUN
--
���� �Է� 4 
12 25
���� ��� 4 
TUE

*/
public class No1_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();										// ��
		int y = sc.nextInt();										// ��
		
        LocalDate date = LocalDate.of(2007, x, y);
        
//        System.out.println(date);									// 2007-x-y ���� ���
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();					// ���� ���� ���ϱ�
        
//        int dayOfWeekNumber = dayOfWeek.getValue();				// ���� ���� ���        
//        System.out.println(dayOfWeekNumber);
        
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
        
		sc.close();
	}

}
