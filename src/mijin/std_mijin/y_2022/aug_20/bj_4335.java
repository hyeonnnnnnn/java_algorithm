package mijin.std_mijin.y_2022.aug_20;

import java.util.Scanner;

/*���� ���߱� �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	860	259	185	30.731%
����
���İ� �ø��� ���� ���߱� ������ �ϰ� �ִ�. ������ 1�� 10������ ���� �ϳ��� �����ϰ�, �ø��� ������ ������ ���� ����� �Ѵ�. �ø��� ���� ���� ������ ������ �ø��� ���� ���� ū��, ������, ��ġ�ϴ����� �����ش�.

������ �� �� ����� �� �ø��� ������ �������� �ϰ� �ִٴ� ������ �ϰ� �Ǿ���. ��, �ø��� ���� ���Ҷ� ���� ������ �ڽ��� ������ ���� �ٲܼ��� �ִٴ� ������ �ߴ�. �̷� ���� ������ ���������� �˾Ƴ��� ���ؼ�, �ø��� ������ ����Ǹ鼭 �ڽ��� ��ģ ���� ������ ���� �亯�� ��� ������Ҵ�.

�ø��� ��ģ ���� ������ �亯�� �־����� ��, ������ �������� �ߴ��� �ƴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �������� �̷���� �ִ�. �� ������ �ø��� ��ģ ���� ������ �亯���� �̷���� ������, ����ؼ� �����ư��鼭 �־�����.

�ø��� ��ģ ���� 1���� ũ�ų� ����, 10���� �۰ų� ���� �ڿ����̰�, ������ �亯�� "too high", "too low", "right on" �� �ϳ��̴�.

"too high"�� �ø��� ��ģ ���� ������ ������ ������ Ŭ ��, "too low"�� ���� ��, "right on"�� ��ġ�� ���̴�.

������ �亯�� "right on"�̸�, ������ ���� ���̴�.

�Է��� ������ �ٿ��� 0�� �־�����.

���
������ ���ӿ� ���ؼ�, ������ �������� �� ���� �ִٸ� "Stan is dishonest"��, ���ٸ� "Stan may be honest"�� ����Ѵ�.

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
Stan may be honest*/

public class bj_4335 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int min=0,max=10;
		int num;
		String str="",rs="may be honest";
		num =s.nextInt();
		s.nextLine();
		str=s.nextLine();
		
		while(true) {
			if(str.contains("high")) {
				if(num<=min) 
					rs="is dishonest";
				else
					max =num;
				
				num =s.nextInt();
				s.nextLine();
				str=s.nextLine();
			}
			else if(str.contains("low")) {
				if(num>=max)
					rs="is dishonest";
				else 
					min =num;
				
				num =s.nextInt();
				s.nextLine();
				str=s.nextLine();
			}
			else {
				if(!(num>min && num<max))
					rs ="is dishonest";
				
				System.out.println("Stan " +  rs);
				min=0;max=10;
				rs="may be honest";
				num=s.nextInt();
				if(num==0)
					break;
				s.nextLine();
				str=s.nextLine();
				
			}	
		}
		

	}

}
