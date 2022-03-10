package sohyeon.mar05;

import java.util.Scanner;

/*
 * 문제
오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?
--
입력
첫째 줄에 N(1 ≤ N ≤ 10,000,000)이 주어진다.
--
출력
첫째 줄에 N단계에서 점의 개수를 45678로 나눈 나머지를 출력한다.
--
예제 입력 1 
3
예제 출력 1 
22
--
예제 입력 2 
1
예제 출력 2 
5
--
예제 입력 3 
19
예제 출력 3 
590 
*/

public class No3_1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();

	    int mod = 45678;					// 나눌 수
	    long dot = 7;						// 더할 점 개수. 3씩 증가시켜서 더함
		long result = 5;
		
		for(int i = 1; i < N; i++) {
			result += dot;
			dot += 3;
		}

	    System.out.println(result % mod);
	    sc.close();
	}

}
