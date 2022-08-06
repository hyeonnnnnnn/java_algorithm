package mijin.std_mijin.y_2022.aug_6;

import java.util.Scanner;

/*MO �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	56	29	26	54.167%
����
Mirko and Slavko are playing MO (mini-go). MO is similar to ancient chinese game GO, but is simpler and it plays on (one-dimensional) table which consists of certain number of squares in the sequence.

Mirko is playing with white coins, and he plays first. Slavko is playing with black coins, and he plays second.

In the beginning of the game, all the squares on the table are empty. The players are playing one by one and in each move they put one of their coins on any empty square on the table.

If there are consequent sequence of opponent's coins between just putted coin and previously putted coin with same color, then that sequence of opponent's coins are removed from the table.

Squares on the table are denoted with numbers from 1 till P, from left to right.

Write a program which will calculate number of white and number of black coins on the table on the end of the game. 

�Է�
In the first line there are two integers P and N, separated with one space character, number of squares on the table and total number of moves of both players, 1 �� P �� 100, 1 �� N �� 1000.

In each of the next N lines, there are moves of Mirko and Slavko, from the beggining to the end of the game. 

���
In the only line of the output file you have to write number of white and number of black coins in the end of the game. That numbers must be separated with one space character. 

���� �Է� 1 
4 4
2
3
4
3
���� ��� 1 
2 1
���� �Է� 2 
5 6
1
4
5
2
3
2
���� ��� 2 
3 1
���� �Է� 3 
6 8
1
2
5
3
4
6
2
3
���� ��� 3 
2 2*/
public class bj_3227 {

	public static void main(String[] args) {
		int P,N;
		Scanner s = new Scanner(System.in);
		P= s.nextInt();
		N= s.nextInt();
		int [] arr = new int[P+1]; //������ 1�����迭
		
		//���� �ʱ�ȭ 
		for(int i=0;i<arr.length;i++) {
			arr[i] =-1;
		}
		
		int color =0;   // 0�� 1 �˵�
		int [] cnt = {0,0} ; // �� �� ����
		int pos =0;     // �Է¹��� ��ġ
		
		for(int i=0;i<N;i++) {
			color=0; //�򵹷� �ʱ�ȭ
			pos = s.nextInt();
			//  Ȧ�����ʸ� �˵��� �ٲٱ�
			if (i%2 ==1)
				color =1;
			arr[pos]=color;
			cnt[color]++;  //�ش� ���� ���� ī��Ʈ
				
			if( cnt[color] >=2  && cnt[1-color] >=1) { //�� ������ �ΰ��̻��̰� ��� ������ �Ѱ� �̻��� ��
				
				int ex =exist(pos,color,arr);  //��� ������ �ѷ��ΰ������� (���� ����)  0 ���� 1 ���� 2 ������
				if(ex!=0){ 
					if(ex ==1) { //���ʿ� ��뱸���� ������
						for(int j=1;j<pos;j++) {
							if(arr[j]==1-color) {//��� ���̸�
								arr[j] =-1;
								cnt[1-color]--; //��� ���� ����
							}
						}
								
					}else { //������
						for(int j=pos+1;j<arr.length;j++) {
							if(arr[j]==1-color) {//��� ���̸�
								arr[j] =-1;
								cnt[1-color]--; //��� ���� ����
							}
						}
					}
					
				}
			}
			
			
		}
		System.out.println(cnt[0]+" "+cnt[1]);
		
	}//(color+1)%2
	//���� ��ġ , �� ����, ���� ���� // 0 ���� 1 ���� 2 ������
	public static int exist(int pos, int cr,int []arr ) {
		int me ,you ; //��ġ �� ���� 
		
		me=0;you =0; //�ʱ�ȭ 
		//���ʺ��� �˻�
		for(int i=1;i<pos;i++) {
			if(arr[i]==cr && me ==0) 
				me =i;
			
			if(arr[i] == (cr+1)%2 && you ==0)
				you =i;
		}
		if(me!=0 && you!= 0 && you-me>0) { //�Ѵ� �����ϰ� �� ���� ���� ������(��븦 ���ΰ� ������) 
			return 1;
		}
		
		me=0;you =0; //�ʱ�ȭ
		//������ �˻�
		for(int i=arr.length-1;i>pos;i--) {
			if(arr[i]==cr && me ==0) 
				me =i;
			if(arr[i] == (cr+1)%2 && you ==0)
				you =i;
		}
		if(me!=0 && you!= 0 && you-me<0) { //�Ѵ� �����ϰ� �� ���� ���߿� ������(��븦 ���ΰ� ������) 
			return 2;
		}
		return 0;
	}

}
