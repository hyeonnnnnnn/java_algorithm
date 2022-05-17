package sohyeon.may14;

import java.util.Scanner;

/*
 * 문제
준표와 세준이는 서로 솔루션을 토론 하면서 다른 사람이 자신들의 솔루션을 듣지 못하게 하도록 서로 메시지를 주고받을 때 메시지를 암호화 하여서 주고받았다. 

암호를 만드는 방법은 다음과 같다. 먼저 암호화 할 문자열을 1,1부터 위에서 아래 순서대로 채운다. 그리고 가장 밑의 행을 채운 후에는 오른쪽 열에서 다시 같은 과정을 반복한다.

만약에 "abcdefghijkl" 이라는 문자열을 3개의 열로 암호화 한다고 하자. 그러면 다음과 같이 표를 채울 수 있을 것이다.

a	e	i
b	f	j
c	g	k
d	h	l

그런 후에는 이제 왼쪽 → 오른쪽, 오른쪽 → 왼쪽, 왼쪽 → 오른쪽 ... 으로 읽으면서 다시 문자열을 만든다. 위의 경우에는 "aeijfbcgklhd" 가 될 것이다.

우리가 할 일은 다음과 같다. 암호화 된 문자열과 몇 개의 열로 암호화를 하였는지 주어져 있을 때 원래의 문자열을 구하는 프로그램을 작성하여라.
--
입력
열의 개수 K(1 ≤ K ≤ 20)가 주어지고 두 번째 줄에는 암호화 된 문자열(모두 영소문자)이 주어진다. (문자열의 길이는 200 이하이며 K의 배수이다.)
--
출력
첫 줄에 원래의 문자열을 출력한다..
--
예제 입력 1 
3
aeijfbcgklhd
예제 출력 1 
abcdefghijkl
*/

public class No3_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int K = sc.nextInt();											// 열의 개수
		
		sc.nextLine();													// nextInt 사용 후 개행문자 비워주기 위해 nextLine
		
		String s = sc.nextLine();										// 문자열
		int len = s.length();											// 문자열 길이
		
		for(int i = 0; i < K; i++) {
			
			for(int j = 0; j < len/K ; j++) {
				
				if(j % 2 == 0) {										// 짝수 행
					sb.append(s.charAt(j * K + i));
					
				} else if(j % 2 != 0) {									// 홀수 행
					sb.append(s.charAt(j * K + K - 1 - i));
					
				}
			}
		}
		
		sc.close();
		
		System.out.println(sb);
		
		
	}

}
