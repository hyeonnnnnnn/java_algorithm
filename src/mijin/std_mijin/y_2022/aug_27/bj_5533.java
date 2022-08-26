package mijin.std_mijin.y_2022.aug_27;

import java.util.Scanner;

/*����
����̿� ģ������ MT�� ���� �Ʒ� ����� ���� ����ִ� ������ �� ���̴�.

�� �÷��̾�� 1�̻� 100 ������ ������ ī�忡 ���� �����Ѵ�. �� �÷��̾�� �ڽŰ� ���� ���� �� ����� ���ٸ�, �ڽ��� �� ���� ���� ������ ��´�. ����, ���� ���� �� �ٸ� ����� �ִ� ��쿡�� ������ ���� �� ����.

����̿� ģ������ �� ������ 3�� �ߴ�. �� �÷��̾ ���� �� ���� �־����� ��, 3�� ���ӿ��� ���� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �������� �� N�� �־�����. (2 �� N �� 200) ��° �ٺ��� N�� �ٿ��� �� �÷��̾ 1��°, 2��°, 3��° ���ӿ��� �� ���� �������� ���еǾ� �־�����.

���
�� �÷��̾ 3���� ���ӿ��� ���� �� ������ �Է����� �־��� ������� ����Ѵ�.

���� �Է� 1 
5
100 99 98
100 97 92
63 89 63
99 99 99
89 97 98
���� ��� 1 
0
92
215
198
89
���� �Է� 2 
3
89 92 77
89 92 63
89 63 77
���� ��� 2 
0
63
63*/
public class bj_5533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] arr = new int[N][3]; //�Է� �ޱ� ( n���� 3�� ���� ����
		int[] score = new int[N]; //���� 
		
		for(int i=0; i<N; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			arr[i][2] = scan.nextInt();
		}
		
		for(int i=0; i<N; i++) {	// ��� �÷��̾�� ��
			for(int j=0; j<3; j++) {	 // �� �������� ��
				boolean flag = true;
				
				for(int k=0; k<N; k++) { // �� �������� ��
					if(i == k)	continue;	// �ڱ� �ڽ��� �� X
					
					if(arr[i][j] == arr[k][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag)
					score[i] += arr[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		scan.close();
	}

}
