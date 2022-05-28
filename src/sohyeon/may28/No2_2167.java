package sohyeon.may28;

import java.util.Scanner;

/*
 * 문제
2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.
--
입력
첫째 줄에 배열의 크기 N, M(1 ≤ N, M ≤ 300)이 주어진다. 다음 N개의 줄에는 M개의 정수로 배열이 주어진다.

배열에 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다. 그 다음 줄에는 합을 구할 부분의 개수 K(1 ≤ K ≤ 10,000)가 주어진다.

다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(1 ≤ i ≤ x ≤ N, 1 ≤ j ≤ y ≤ M).
--
출력
K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 231-1보다 작거나 같다.
--
예제 입력 1 
2 3
1 2 4
8 16 32
3
1 1 2 3
1 2 1 2
1 3 2 3
예제 출력 1 
63
2
36
*/
public class No2_2167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();													// 배열의 크기
		int M = sc.nextInt();													// 배열의 크기
		int[][] arr = new int[N+1][M+1];										// 입력값 저장할 배열 선언
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();													// 합 구할 개수
		
		for(int m = 0; m < K; m++) {
			int sum = 0;
			int x1 = sc.nextInt();												// (i,j) (x,y) 좌표 입력받아서
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int i = x1; i <= x2; i++) {
				for(int j = y1; j <= y2; j++) {
					sum += arr[i][j];											// (i,j)~(x,y) 누적 합
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}

}
