package mijin.std_mijin.y_2022.sep_3;

import java.util.HashSet;
import java.util.Scanner;
//��ó **  https://to-the-universe.tistory.com/5

/*
����
����� �濡 �ɷ��ִ� �ð�� �Ϻ��� �� ����̴�. �ð迡�� ��ħ�� ��ħ�� ���� �߽��� �������� ���ư��� �ִ�. ��ħ�� �ø� ��Ÿ����, ��ħ�� ���� ��Ÿ����. �ð迡�� 60���� ������ ������ ���� ǥ�õǾ� �ִ�. ���ݰ� ���� ������ �Ÿ��� ��� ����.

��ħ�� 1�п� �� ���� ���� �������� �̵��Ѵ�. ��ħ�� 12�п� �� ���� ���� �������� �̵��Ѵ�. ��, 1�ð��� ������ �ټ� ������ �̵��ϰ� �ȴ�. �� �ð�� �ó� ���� �ٲ�� ���� ��� ���� �������� �̵��Ѵ�. ��, ��ħ�� ��ħ�� �׻� ������ ����Ű�� ������, �� ���̸� ����Ű�� ���� ����.

������ ��ħ�� ��ħ�� ���ÿ� ���� �� ������ ����ų ���̴�. ��, 0�ÿ� 0���� ��Ÿ����. 12�ð� �Ǵ� 720���� ������, ��ħ�� ��ħ�� �ٽ� ���� ��ġ�� ���� �ȴ�. �̷��� �������� ����ؼ� �ݺ��ȴ�. 

�����غ���, ��ħ�� �������� �� ��ħ�� �������� ���� �� �ִ�. ������, ��ħ�� �������ٸ� �׻� ��ħ�� �������� ���̴�.

����̴� ���ϸ� �ſ� �����Ѵ�. ����, �ð踦 �� ������ ��ħ�� ��ħ�� �̷�� ������ ����ؼ� ���̿� ������´�. �̷��� �� ���� �����ٺ��� ���̿��� ��û���� ���� ������ ������ �־���. ���̸� ���캸�� ����̴� � ������ �ݺ��ؼ� �����µ�, � ������ ���� ������ �ʴ´ٴ� ����� �˰� �Ǿ���. ���� ���, 3�ÿ� 9���� �� ��ħ�� ��ħ�� �̷�� ������ 90���̴�. ������, 65���� �̷�� �ð��� ����.

����̴� ��ħ�� ��ħ�� �̷�� ������ A�� �Ǵ� ��찡 �ִ��� �������� �˻��غ����� �Ѵ�.

0���� ũ�ų� ����, 180���� �۰ų� ���� ���� A�� �־����� ��, ������� �ð谡 ���� A�� �̷�� �ð��� �ִ��� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� ���̰�, ���� A�� �Է����� �־�����. (0 �� A �� 180)

���
�� �׽�Ʈ ���̽��� ���ؼ�, ������� �ð��� ��ħ�� ��ħ�� �̷�� ������ A���� �Ǵ� ��찡 �ִٸ� Y��, �ƴϸ� N�� ����Ѵ�.

���� �Է� 1 
90
65
66
67
128
0
180
���� ��� 1 
Y
N
Y
N
N
Y
Y*/
public class bj_5675 {

	public static void main(String[] args) {
		int c =6; //6���� ������
		int A;
		int m=0,h=0;
		Scanner s = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//����� �� ��� ���
		for(int i=1;i<=24;i++) {
			for(int j=1;j<=60;j++) {
				m=(m+6)%360;
				if(m%72 ==0)
					h = (h+6)%360;
				hs.add(Math.min((h-m)%360,360-((h-m)%360)));
			}
			
		}
		while(true) {
			A =s.nextInt();
			if(hs.contains(A)) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
			
		}
		
		
	}

}