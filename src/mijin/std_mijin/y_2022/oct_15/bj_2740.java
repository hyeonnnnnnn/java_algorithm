package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
행렬 곱셈
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	12539	8535	7414	69.576%
문제
N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 그 다음 줄에는 행렬 B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. N과 M, 그리고 K는 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

예제 입력 1 
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
예제 출력 1 
-1 -2 6
-3 -6 12
-5 -10 18
*/
public class bj_2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1행렬
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c =Integer.parseInt( st.nextToken());
		int r =Integer.parseInt( st.nextToken());
		int [][]arr1 = new int[c][r];
		//1입력
		input(arr1);
		
		//2행렬
		st = new StringTokenizer(br.readLine());
		c =Integer.parseInt( st.nextToken());
		r =Integer.parseInt( st.nextToken());
		int [][]arr2 = new int[c][r];
		//2입력
		input(arr2);
		
		int tsum =0;
		//정답행렬
		int [][]rs = new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<rs.length;i++) { //1번 행렬 행
			for(int j=0;j<rs[0].length;j++) { //2번행렬 열
				tsum =0;
				for(int k=0;k<arr1[0].length;k++) { //1번행열 열 
					tsum+=arr1[i][k]*arr2[k][j];  //1번행렬 
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
