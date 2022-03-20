package sohyeon.mar12;

import java.util.Scanner;

/*
 * 문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
--
입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
--
출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
--
예제 입력 1 
5

예제 출력 1 
*
**
***
****
*****
*/

public class No5_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {						// N번 실행
			
			for(int j = 1; j <= i; j++) {					// 몇 개 출력할지
				System.out.print("*");	
			}
			
			System.out.println("");							// 다음 행으로
			
		}
		
		sc.close();
	}

}
