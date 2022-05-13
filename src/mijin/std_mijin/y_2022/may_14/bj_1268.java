package mijin.std_mijin.y_2022.may_14;

import java.util.Scanner;

public class bj_1268 {
	public static void main(String[] args) {
		int st ;
		Scanner s= new Scanner(System.in);
		st= s.nextInt();
		int [][] st_class =new int [st][5];
		int [][] rs_class = new int[st][st+1];
		
		
		//배열 초기화
		for(int i=0;i<st;i++) {
			for (int j=0;j<st+1;j++) {
				rs_class[i][j]=0;
			}
		}
		
		//입력 받기
		for(int i=0;i<st;i++) {
			for (int j=0;j<5;j++) {
				st_class[i][j]=s.nextInt();
			}
		}
		
		//학년 별로 돌면서 학생당 같은 반이 몇명인지 rs배열에 넣기.
		for(int j=0;j<5;j++) {
			for (int i=0;i<st;i++) {
				for (int k=0;k<st;k++) {
					//자기 자신이면 패스 
					if(k==i)
						continue;
					if(st_class[i][j]==st_class[k][j])
						rs_class[i][k]++; //i번 학생이k번 학생과 같은 반이었으면 ++
				}
			}
		}
		
		//같은 반이었던 학생 수 합
		for(int i=0;i<st;i++) {
			for(int j=0;j<st;j++) {
				if(rs_class[i][j]>0) {
					rs_class[i][st]++;
				}
			}
		}
		
		
		int max=0,p=0;
		//출력
		for(int i=0;i<st;i++) {
			if(max<rs_class[i][st]) {
				max=rs_class[i][st];
				p=i+1;
			}
				
		}
		System.out.println(p);
		
	}
	
	
	
}
