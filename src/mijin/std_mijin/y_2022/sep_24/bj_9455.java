package mijin.std_mijin.y_2022.sep_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/*�ڽ� �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	256 MB	2730	1970	1665	75.203%
����
m�� n���� �̷���� �׸��尡 �־�����. �Ϻ� ĭ���� �ڽ��� ��� �ִ�. ��� �ڽ��� �� �̻� ������ �� ���� �� ���� �Ʒ��� �����δٸ�, �ڽ��� �׿��� ���°� �ȴ�.

�׸� (a)�� �׸����� ũ��� 5�� 4���̰�, 7ĭ���� �ڽ��� ����ִ�. ��� �ڽ��� ����ؼ� �Ʒ��� �����̸�, �׸� (b)�� ���� ���ϰ� �ȴ�.



�ڽ��� ������ �Ÿ��� �ٴڿ� ���̱� �� ���� �̵��� ĭ�� �����̴�. ���� ���, �� ���� ������ ���� ���� �ִ� �ڽ��� ������ �Ÿ��� 2�̴�. ��� �ڽ��� �̵��� �Ÿ� (�� �ڽ��� �̵��� �Ÿ��� ��) �� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� �������� �ڽ� 7���� ������ �Ÿ��� 8�̴�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� ù° �ٿ��� m�� n�� �־�����. (1 �� m, n �� 100) ���� m�� �ٿ��� �׸����� �� ���� ������ ��Ÿ���� n���� ������ �־�����. �׸��� ù ����� ������ ����� ������� �־�����. �ڽ��� ����ִ� ĭ�� 1��, �ٸ� ĭ�� 0���� �־�����. �� ���� ���̿��� ������ �ϳ� �־�����.

���
�� �׽�Ʈ ���̽����� �Է����� �־��� �׸��忡�� ��� �ڽ��� �̵��� �Ÿ��� ����Ѵ�.

���� �Է� 1 
3
5 4
1 0 0 0
0 0 1 0
1 0 0 1
0 1 0 0
1 0 1 0
3 3
1 1 1
1 1 1
0 0 0
5 6
1 0 1 1 0 1
0 0 0 0 0 0
1 1 1 0 0 0
0 0 0 1 1 1
0 1 0 1 0 1*/
public class bj_9455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase =0;
		int cnt=0,rs=0;
		int r,c; 
		StringTokenizer st = null;
		
		tcase = Integer.parseInt(br.readLine());
		
		

		for(int cs =0;cs<tcase;cs++) {
			rs=0;//����� �ʱ�ȭ 
			st = new StringTokenizer(br.readLine()," ");
			r=Integer.parseInt(st.nextToken()); c= Integer.parseInt(st.nextToken()); //�÷� �ο� �ޱ� 
			int arr [][] = new int[r][c]; //�ӽ� �迭 ����
			//�Է¹ޱ�
			for(int a=0;a<r;a++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int b=0;b<c;b++)
					arr[a][b] =Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<c;i++) { //�÷�
				for(int j=0;j<r;j++) { //�ο�
					cnt =0;
					if(arr[j][i] ==1) {
						for(int t=j+1;t<r;t++) {
							cnt+=arr[t][i];
						}
						rs+=(r-1)-(cnt+j);
					}
					
					//System.out.println(j+" "+rs);
				}
			   // System.out.println(i+" "+rs);
			}
			System.out.println(rs);
			
		}
		
		
	}

}
