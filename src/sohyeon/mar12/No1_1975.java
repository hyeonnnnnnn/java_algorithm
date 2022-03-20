package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제
창영이는 심심해서 혼자 재미 없는 게임을 하나 생각해냈다.

숫자 N을 먼저 정하고, 이 숫자를 2진법, 3진법, 4진법, ..., 100만진법, 100만 1진법 등등으로 바꾸어 보면서, 마지막자리에 연속된 0의 개수를 모두 더하는 것이다.

예를 들어 N=5라면, 2진법 101, 3진법 12, 4진법 11, 5진법 10, 6진법 5, 7진법 5, ... 등과 같으므로 답은 1이 된다.

여러분이 할 일은 주어진 N에 대해서 창영이가 구한 답을 찾는 것이다.

정확히 설명하기 위해 수학식으로 쓰자면, f(N, b)를 N을 b진법으로 나타냈을 때 마지막에 따르는 연속된 0의 개수로 정의 할 때

를 구하는 것이다.
--
입력
첫 줄에 테스트 케이스의 수 T가 주어진다. 다음 T줄에 걸쳐서 N이 주어진다.

출력
각 줄에 위 수식에 대한 답을 출력한다.
--
제한
1 ≤ T ≤ 100,000
1 ≤ N ≤ 1,000
--
예제 입력 1 
2
5
10
예제 출력 1 
1
3
*/

public class No1_1975 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());			// 테스트케이스 수
		
		for(int i = 0; i < T; i++) {
			int count = 0;									// 0의 개수
			
			int N = Integer.parseInt(st.nextToken());		// 입력받는 수
			
			for(int j = 2; j <= N; j++) {					// 2부터 N까지 나눠주기
				
				int val = N;								// 나눌 수 세팅
				
				while(true) {
					if(val % j != 0) {						// 나머지가 0이 아니라면 종료
						break;
					}
					count++;								// 나머지가 0일 때 0의 개수 count
					val /= j;								// N을 j로 나누어 다시 세팅
				}
			}
			System.out.println(count);
		}
	}

}
