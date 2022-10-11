package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
��� ����
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	12539	8535	7414	69.576%
����
N*Mũ���� ��� A�� M*Kũ���� ��� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ��� A�� ũ�� N �� M�� �־�����. ��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ������� �־�����. �� ���� �ٿ��� ��� B�� ũ�� M�� K�� �־�����. �̾ M���� �ٿ� ��� B�� ���� K���� ���ʴ�� �־�����. N�� M, �׸��� K�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.

���
ù° �ٺ��� N���� �ٿ� ��� A�� B�� ���� ����� ����Ѵ�. ����� �� ���Ҵ� �������� �����Ѵ�.

���� �Է� 1 
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
���� ��� 1 
-1 -2 6
-3 -6 12
-5 -10 18
*/
public class bj_2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1���
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c =Integer.parseInt( st.nextToken());
		int r =Integer.parseInt( st.nextToken());
		int [][]arr1 = new int[c][r];
		//1�Է�
		input(arr1);
		
		//2���
		st = new StringTokenizer(br.readLine());
		c =Integer.parseInt( st.nextToken());
		r =Integer.parseInt( st.nextToken());
		int [][]arr2 = new int[c][r];
		//2�Է�
		input(arr2);
		
		int tsum =0;
		//�������
		int [][]rs = new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<rs.length;i++) { //1�� ��� ��
			for(int j=0;j<rs[0].length;j++) { //2����� ��
				tsum =0;
				for(int k=0;k<arr1[0].length;k++) { //1���࿭ �� 
					tsum+=arr1[i][k]*arr2[k][j];  //1����� 
				}
				rs[i][j] =tsum;
			}
		}
		
		print(rs);
		
		
	}
	
	public static void input(int[][]arr) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int i=0;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=Integer.parseInt( st.nextToken());
			}
		}
	}
	
	public static void print(int[][]arr) throws IOException {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
