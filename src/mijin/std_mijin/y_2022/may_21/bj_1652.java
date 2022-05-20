package baekjoon_std.bronze1;


/*
 * 첫째 줄에 방의 크기 N이 주어진다. N은 1이상 100이하의 정수이다. 그 다음 N줄에 걸쳐 N개의 문자가 들어오는데 '.'은 아무것도 없는 곳을 의미하고, 'X'는 짐이 있는 곳을 의미한다.
 * 
 * 
 * 
 * 
 * 5
....X
..XX.
.....
.XX..
X....
 * */
import java.util.Scanner;

public class bj_1652 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); 
		int c =0; //누울자리 누적
		int col[]= new int[N];
		int colt[]= new int[N];
		int row[]= new int[N];
		int cc=0,rr=0; //합산
		
		//초기화
		for(int i=0;i<N;i++) {
			col[i]=0;
			row[i]=0;
			colt[i] =0;
		}
		
		String tmp;
		for(int i=0;i<N;i++) { //행
			tmp =s.next();
			for(int j=0;j<N;j++) { //열
				
				if(tmp.charAt(j) =='.') {
					c++;
					colt[j]++; //이 열이 .이면 ++
				}else {
					c=0;
					colt[j]=0;
				}
				//이 행에 두개이상 연속이면 ++
				if(c>=2) {
					row[i]++; //i 행엔 누울자리가 있다
				}
				//이 열에 두개 이상 연속이면 ++
				if(colt[j]>1)
					col[j]++;
			}
		}
		//누울자리가 있는 행,열 개수 구하기 
		for(int i=0;i<N;i++) {
			if(col[i] >0) {
				cc++;
			}
			if(row[i] >0) {
				rr++;
			}
		}
		
	
		System.out.println(rr+" "+ cc);

	}

}
