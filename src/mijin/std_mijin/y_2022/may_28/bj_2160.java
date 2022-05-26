package mijin.std_mijin.y_2022.may_28;

import java.util.Scanner;
/*����
N(2 �� N �� 50)���� �׸��� �ִ�. ������ �׸��� 5��7�� ũ���̰�, �� ���� ������ �Ǿ� �ִ�. �̶� �� ������ ���� ���� ��X���� ��.������ ǥ���ϱ�� ����. �̷��� �׸����� �־����� ��, ���� ����� �� ���� �׸��� ã�Ƴ��� ���α׷��� �ۼ��Ͻÿ�. �� ���� �׸����� �ٸ� ĭ�� ������ ���� ���� ��, �� ���� �׸��� ���� ����ϴٰ� ����.



���� ��� ���� ���� �� ���� �׸��� �־����� ��, ��ĥ�� �κ��� ���� �ٸ��� �ȴ�. ���� �׸��� 5���� ĭ�� ���� �ٸ���. �̿� ���� ���� �ٸ� ĭ�� ������ ���� ���� ��츦 ã�� ���̴�.

�Է�
ù° �ٿ� N�� �־�����. ���� 5��N���� �ٿ� 7���� ���ڷ� ������ �׸��� �־�����.

���
ù° �ٿ� ���� ����� �� �׸��� ��ȣ�� ����Ѵ�. �׸��� ��ȣ�� �ԷµǴ� ������� 1, 2, ��, N�̴�. ��ȣ�� ����� ������ ���� ���� ���� ����Ѵ�. �Է��� �׻� ���� �� ������ ��츸 �־�����.

���� �Է� 1 
3
..X....
.XXX...
.XX....
.....X.
.X...X.
...X...
..XX...
.XX....
.XX..X.
.X...X.
XX.....
X......
XX...XX
XXXX.XX
XXX..XX*/


public class bj_2160 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		String [][][] arr = new String [n][5][7];
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				String ss = s.next();
				arr[i][j] = ss.split(""); 
			}
		}
		
		int next =0; 
		int min = Integer.MAX_VALUE; //������ ���� ū ��
		int minidx1 =0, minidx2 = 0;
		
		for (int i=0;i<n-1;i++) {
			next=i+1;
			while(next!=n) {
				int cnt = 0;
				for (int j=0;j<5;j++) {
					for (int k=0;k<7;k++) {
						if(!arr[i][j][k].equals(arr[next][j][k]))
							cnt++;
					}
				}
				if(min>cnt) {
					min = cnt;
					minidx1 = i+1;
					minidx2 = next+1;
				}
				next++;
			}
		}
		System.out.println(minidx1+ " "+minidx2);
		
	}

}
