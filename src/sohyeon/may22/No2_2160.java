package sohyeon.may22;

import java.util.Scanner;

//https://blog.naver.com/parkhj2416/221874854821
/*
 * 문제
N(2 ≤ N ≤ 50)개의 그림이 있다. 각각의 그림은 5×7의 크기이고, 두 가지 색으로 되어 있다. 이때 두 가지의 색을 각각 ‘X’와 ‘.’으로 표현하기로 하자.

이러한 그림들이 주어졌을 때, 가장 비슷한 두 개의 그림을 찾아내는 프로그램을 작성하시오. 두 개의 그림에서 다른 칸의 개수가 가장 적을 때, 두 개의 그림이 가장 비슷하다고 하자.

예를 들어 위와 같은 두 개의 그림이 주어졌을 때, 색칠한 부분이 서로 다르게 된다. 위의 그림은 5개의 칸이 서로 다르다. 이와 같이 서로 다른 칸의 개수가 가장 작은 경우를 찾는 것이다.
--
입력
첫째 줄에 N이 주어진다. 다음 5×N개의 줄에 7개의 문자로 각각의 그림이 주어진다.
--
출력
첫째 줄에 가장 비슷한 두 그림의 번호를 출력한다. 그림의 번호는 입력되는 순서대로 1, 2, …, N이다.

번호를 출력할 때에는 작은 것을 먼저 출력한다. 입력은 항상 답이 한 가지인 경우만 주어진다.
--
예제 입력 1 
3
..X....
.XXX...
.XX....
.....X.
.X...X.
...X...
..XX...
.XX....
.XX..X.
.X...X.
XX.....
X......
XX...XX
XXXX.XX
XXX..XX
예제 출력 1 
1 2
*/
public class No2_2160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[][][] arr = new String[N][5][7];									// 3차원 배열 선언

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				String str = sc.next();
				arr[i][j] = str.split("");										// 배열에 문자 하나씩 입력

			}
		}
		
		int next = 0;
		int min = Integer.MAX_VALUE;
		int minidx1 = 0, minidx2 = 0;

		for (int i = 0; i < N - 1; i++) {
			next = i + 1;
			
			while (next != N) {
				
				int cnt = 0;
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 7; k++) {
						if (!arr[i][j][k].equals(arr[next][j][k]))				// 두 그림의 동일 좌표가 다르면 카운트 증가
							cnt++;
						
					}
				}
				
				if (min > cnt) {												// 최소값 비교하여 갱신
					min = cnt;
					minidx1 = i + 1;											// 최소 인덱스1
					minidx2 = next + 1;											// 최소 인덱스2
				}
				next++;
			}
		}
		
		System.out.println(minidx1 + " " + minidx2);
		
		sc.close();
	}

}
