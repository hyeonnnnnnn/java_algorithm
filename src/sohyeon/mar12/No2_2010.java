package sohyeon.mar12;

import java.util.Scanner;

/*
 * 문제
선영이의 집에는 콘센트를 꽂을 수 있는 플러그가 하나밖에 없다. 선영이는 많은 컴퓨터를 가지고 있는데, 컴퓨터의 전원 문제는 어떻게 해결하는 것일까?

하나의 플러그가 있고, N개의 멀티탭이 있다. 각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다. 최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?
--
입력
첫째 줄에 멀티탭의 개수 N이 주어진다. (1 ≤ N ≤ 500,000) 이어서 둘째 줄부터 N개의 줄에 걸쳐 각 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어 있는지를 나타내는 자연수가 주어진다.

이 자연수는 1,000을 넘지 않는다.
--
출력
첫째 줄에 최대로 전원에 연결될 수 있는 컴퓨터의 수를 출력한다.
--
예제 입력 1 
3
1
1
1
예제 출력 1 
1
--
예제 입력 2 
2
5
8
예제 출력 2 
12
*/
public class No2_2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			// 멀티탭 개수
		int result = 1;					// 초기 꽂을 수 있는 플러그 개수. 멀티탭 개수 1일때 1개 꽂을 수 있어야 하므로 1 
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			result += num;
			
		}
		
		result -= N;		// 전체 결과에서 멀티탭에 연결된 또 다른 멀티탭의 갯수까지 빼야 하므로 -N
		
		System.out.println(result);
		
		sc.close();
	}

}
