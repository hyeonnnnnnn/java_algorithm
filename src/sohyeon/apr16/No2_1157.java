package sohyeon.apr16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
--
입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
--
출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
--
예제 입력 1 
Mississipi
예제 출력 1 
?
--
예제 입력 2 
zZa
예제 출력 2 
Z
--
예제 입력 3 
z
예제 출력 3 
Z
--
예제 입력 4 
baaa
예제 출력 4 
A
*/

// https://comain.tistory.com/m/189
/*
예제 1번의 Mississipi. 대문자로 바꾸면 MISSISSIPI
처음의 M을 없애면 ISSISSIPI가 되고 두 길이의 차이는 1이기때문에 M의 개수는 1개이다.
이전 중복개수의 최댓값은 0개이고 이번에 1개이기 때문에 문자열 변수에 M을 저장한다.
다음 0인덱스 값인 I를 없애면 SSSSP가된다. 두 길이의 차이는 4이니 I의 개수는 4개이다.
이전 중복개수의 최댓값은 1개이니 이번에 4개이기 때문에 문자열 변수에 I를 저장한다. 그렇게되면 현재 문자열 변수의 값은 I이다.
그리고 다음 0인덱스 값인 S를 지우면 P가 남는다. 두 길이의 차이는 4이니 S의 개수는 4개이다.
그럼 이전 최댓값과 같으니 문자열 변수에 S를 더한다. 그러면 문자열 변수의 값은 PS가 된다.
*/
public class No2_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();					// 알파벳 중복 개수의 최댓값을 저장할 변수
		int max = 0;												// 중복개수가 최댓값인 알파벳을 저장할 변수
		String result = "";
		
		while(true) {												// 무한루프(알파벳의 개수는 26개이기때문에 26번 반복하는 반복문을 만들어도 된다.)
			String index = String.valueOf(str.charAt(0));			// 현재 문자열의 0 인덱스 값을 저장
			int size = str.length();								// 현재 문자열의 길이를 저장
			
			str = str.replace(String.valueOf(str.charAt(0)), "");	// 0인덱스 값을 문자열에서 제외
			
			int newsize = str.length();								// 제외한 후의 문자열의 길이
			
			if(max == (size - newsize)) {							// 두 길이의 차가 중복개수
				result += index;									// 중복개수가 최댓값과 같으면 result에 알파벳을 더한다.
				
			}

			if(max < (size - newsize)) {							// 중복개수가 최댓값보다 크면 최댓값에 중복개수를 저장하고, result에 알파벳을 저장							
				max = (size - newsize);
				result = index;
				
			}

			if(str.equals("")) break;								// 문자열이 비게되면 무한루프 종료
		}
		
		if(result.length() == 1) {									// result에 알파벳이 1개이면 result 출력
			System.out.println(result);
			
		} else {													// 아니면 ? 출력
			System.out.println("?");
			
		}
	}
	


}
