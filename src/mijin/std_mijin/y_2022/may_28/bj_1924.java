package mijin.std_mijin.y_2022.may_28;

import java.util.Scanner;

/*
����
������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1 �� x �� 12)�� y(1 �� y �� 31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.

���
ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.

���� �Է� 1 
1 1
���� ��� 1 
MON
���� �Է� 2 
3 14
���� ��� 2 
WED
���� �Է� 3 
9 2
���� ��� 3 
SUN
���� �Է� 4 
12 25
���� ��� 4 
TUE
��ó*/

public class bj_1924 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Day [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};		
		String sDay [] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int sum=0;
		int M = s.nextInt();
		int D = s.nextInt();
		
		for(int i =0;i<M;i++) {
			sum+=Day[i];
		}
		sum+=D;
		
		System.out.println( sDay[sum%7]);;
		
				
	}

}
