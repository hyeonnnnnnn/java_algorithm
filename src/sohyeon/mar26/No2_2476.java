package sohyeon.mar26;
/*
 * 문제
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 

같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 

모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  

예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.

또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.

3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
--
입력
첫째 줄에는 참여하는 사람 수 N이 주어지고 그 다음 줄부터 N개의 줄에 사람들이 주사위를 던진 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
--
출력
첫째 줄에 가장 많은 상금을 받은 사람의 상금을 출력한다.

예제 입력 1 
3
3 3 6
2 2 2
6 2 5
--
예제 출력 1 
12000
*/

import java.util.Arrays;
import java.util.Scanner;

public class No2_2476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();									// 참여하는 사람 수 
		int[] sum = new int[N];									// 참여자별 상금 합계 저장할 배열
		
		for(int i = 0; i < N; i++){
			int x = sc.nextInt();								// 주사위1
			int y = sc.nextInt();								// 주사위2
			int z = sc.nextInt();								// 주사위3
			
			if(x == y && x == z && y == z) {					// 주사위 3개 모두 동일하면
				sum[i] = 10000 + x * 1000;
				
			} else if(x == y || x == z) {						// (1)주사위 2개만 동일, x 기준
				sum[i] = 1000 + x * 100;
				
			} else if(y == z) {									// (2)주사위 2개만 동일, y 기준
				sum[i] = 1000 + y * 100;
				
			} else {											// 주사위 3개 모두 다르면
				int max = Math.max(x, Math.max(y, z));			// 주사위 1, 2, 3 중 최대 구해서 합계 계산ㄴ
				sum[i] = max * 100;
			}
		}
		Arrays.sort(sum);										// 상금 합계 오름차순 정렬
		
		System.out.print(sum[N-1]+ " ");						// 상금 합계 최대값 출력

		sc.close();
	}

}
