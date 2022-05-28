package sohyeon.may28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 문제
꿍은 도비에게 영어단어들을 제시한 후 어떤 단어가 대소문자를 구분하지 않고 사전순으로 가장 앞서는지 맞추면 양말을 주어 자유를 얻게해준다고 하였다.

하지만 인성이 좋지 않은 꿍은 사실 그러고 싶지 않았기 때문에 대소문자를 마구 섞어가며 단어들을 제시했다. 예를 들어, apPle은 Bat보다 앞서지만 AnT보다는 뒤에 있는 단어다.

도비에게 희망은 여러분뿐이다! 여러분이 도비에게 자유를 선물해주도록 하자!
--
입력
각 테스트케이스는 정수 n (2 ≤ n ≤ 1000) 으로 시작하며 주어지는 단어의 개수를 뜻한다.

다음 각 n줄은 길이가 최대 20인 단어가 주어지며 대소문자의 구분을 없앴을 때 똑같은 단어는 주어지지 않는다.

마지막 입력은 0이 주어진다.
--
출력
각 줄에 각 테스트케이스에서 사전상 가장 앞서는 단어를 출력한다.
--
예제 입력 1 
3
Cat
fat
bAt
4
call
ball
All
Hall
0
예제 출력 1 
bAt
All
*/
public class No1_2204 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());								// 단어 개수
			
			if(n == 0) break;														// 0 입력 시 종료
			
			String[] str = new String[n];											// 단어 저장할 배열 선언
			
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine(); 
			}
			
			Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);						// 대소문자 구분 없이 정렬
			
			System.out.println(str[0]);												// 가장 첫번째로 정렬된 단어 출력
		}
		
	}

}
