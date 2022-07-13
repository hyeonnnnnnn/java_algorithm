package mijin.std_mijin.y_2022.jul_16;

import java.util.Scanner;

public class bj_3023 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int R=s.nextInt(),C=s.nextInt();
		char [][]arr = new char[R][C];
		char [][] rs =new char[2*R][2*C];
		int tr,tc;
		String t;
		//입력
		for(int i=0;i<R;i++) {
			t=s.next();
			for(int j=0;j<C;j++) {
				arr[i][j]=t.charAt(j);
			}
		}
		tr=s.nextInt()-1;tc=s.nextInt()-1;
		for(int i=0;i<R;i++) {
			for (int j=0;j<C;j++) {
				rs[i][j] = arr[i][j];
			}
			for(int j=C;j<2*C;j++) {
				rs[i][j] = rs[i][2*C-j-1];
			}
		}
		
		for(int i=R;i<2*R;i++) {
			for(int j =0;j<2*C;j++) {
				rs[i][j]=rs[2*R-1-i][j];
			}
		}
		
		if(rs[tr][tc]=='#') {
			rs[tr][tc]='.';
		}else {
			rs[tr][tc]='#';
		}

		//출력
		for(int i=0;i<2*R;i++) {
			for(int j=0;j<2*C;j++) {
				System.out.print(rs[i][j]);
			}
			System.out.println();
		}
	}

}
