package sohyeon.may22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 문제
N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.

이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.

예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다.

여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다.

마지막으로 2를 버리고 나면, 버린 카드들은 순서대로 1 3 2가 되고, 남는 카드는 4가 된다.

N이 주어졌을 때, 버린 카드들을 순서대로 출력하고, 마지막에 남게 되는 카드를 출력하는 프로그램을 작성하시오.
--
입력
첫째 줄에 정수 N(1 ≤ N ≤ 1,000)이 주어진다.
--
출력
첫째 줄에 버리는 카드들을 순서대로 출력한다. 제일 마지막에는 남게 되는 카드의 번호를 출력한다.
--
예제 입력 1 
7
예제 출력 1 
1 3 5 7 4 2 6
*/
public class No3_2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i);									// 큐에 하나씩 입력
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			sb.append(queue.poll()).append(" ");				// 가장 위에 있는 카드 꺼내어 sb에 구분자(공백)와 함께 붙임

			if(queue.isEmpty()) break;							// 큐가 비면 종료
			
			queue.offer(queue.poll());							// 가장 위에 있는 카드 아래로 이동
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
