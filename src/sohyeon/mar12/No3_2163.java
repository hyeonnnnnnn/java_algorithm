package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제
정화는 N×M 크기의 초콜릿을 하나 가지고 있다. 초콜릿은 금이 가 있는 모양을 하고 있으며, 그 금에 의해 N×M개의 조각으로 나눠질 수 있다.

초콜릿의 크기가 너무 크다고 생각한 그녀는 초콜릿을 친구들과 나눠 먹기로 했다. 이를 위해서 정화는 초콜릿을 계속 쪼개서 총 N×M개의 조각으로 쪼개려고 한다.

초콜릿을 쪼갤 때에는 초콜릿 조각을 하나 들고, 적당한 위치에서 초콜릿을 쪼갠다. 초콜릿을 쪼갤 때에는 금이 가 있는 위치에서만 쪼갤 수 있다.

이와 같이 초콜릿을 쪼개면 초콜릿은 두 개의 조각으로 나눠지게 된다. 이제 다시 이 중에서 초콜릿 조각을 하나 들고, 쪼개는 과정을 반복하면 된다.

초콜릿을 쪼개다보면 초콜릿이 녹을 수 있기 때문에, 정화는 가급적이면 초콜릿을 쪼개는 횟수를 최소로 하려 한다.

초콜릿의 크기가 주어졌을 때, 이를 1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수를 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 두 정수 N, M(1 ≤ N, M ≤ 300)이 주어진다.
--
출력
첫째 줄에 답을 출력한다.
--
예제 입력 1 
2 2

예제 출력 1 
3
--
예제 입력 2 
1 1

예제 출력 2 
0
*/
public class No3_2163 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// 한 줄로 읽어와서
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());			// 공백을 구분자로 글자 가져와서 정수화, 초콜릿 길이 N
		int M = Integer.parseInt(st.nextToken());			// 공백을 구분자로 글자 가져와서 정수화, 초콜릿 길이 M
		
		System.out.println(N * M - 1);
		
	}

}
