package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1268 {
	public static void main(String[] args) {
		int st ;
		Scanner s= new Scanner(System.in);
		st= s.nextInt();
		int [][] st_class =new int [st][5];
		int [][] rs_class = new int[st][st+1];
		
		
		//�迭 �ʱ�ȭ
		for(int i=0;i<st;i++) {
			for (int j=0;j<st+1;j++) {
				rs_class[i][j]=0;
			}
		}
		
		//�Է� �ޱ�
		for(int i=0;i<st;i++) {
			for (int j=0;j<5;j++) {
				st_class[i][j]=s.nextInt();
			}
		}
		
		//�г� ���� ���鼭 �л��� ���� ���� ������� rs�迭�� �ֱ�.
		for(int j=0;j<5;j++) {
			for (int i=0;i<st;i++) {
				for (int k=0;k<st;k++) {
					//�ڱ� �ڽ��̸� �н� 
					if(k==i)
						continue;
					if(st_class[i][j]==st_class[k][j])
						rs_class[i][k]++; //i�� �л���k�� �л��� ���� ���̾����� ++
				}
			}
		}
		
		//���� ���̾��� �л� �� ��
		for(int i=0;i<st;i++) {
			for(int j=0;j<st;j++) {
				if(rs_class[i][j]>0) {
					rs_class[i][st]++;
				}
			}
		}
		
		
		int max=0,p=0;
		//���
		for(int i=0;i<st;i++) {
			if(max<rs_class[i][st]) {
				max=rs_class[i][st];
				p=i+1;
			}
				
		}
		System.out.println(p);
		
	}
	
	
	
}
