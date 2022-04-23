package sohyeon.apr23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 문제
A×B를 계산하다 지겨워진 형택이는 A×B를 새로운 방법으로 정의하려고 한다.

A에서 한 자리를 뽑고 × B에서 임의로 한 자리를 뽑아 곱한다.

의 가능한 모든 조합 (A가 n자리, B가 m자리 수라면 총 가능한 조합은 n×m개)을 더한 수로 정의하려고 한다.

예를 들어 121×34는

1×3 + 1×4 + 2×3 + 2×4 + 1×3 + 1×4 = 28

이 된다. 이러한 형택이의 곱셈 결과를 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 A와 B가 주어진다. 주어지는 두 수는 모두 10,000자리를 넘지 않는 음이 아닌 정수이다. 수가 0인 경우에는 0만 주어지며, 그 외의 경우 수는 0으로 시작하지 않는다.
--
출력
첫째 줄에 형택이의 곱셈 결과를 출력한다.
--
예제 입력 1 
123 45
예제 출력 1 
54
*/

public class No3_1225 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());		// input 한 줄로 읽어옴
		
		String A = st.nextToken();										// 공백을 기준으로 A 가져옴
		String B = st.nextToken();										// 공백을 기준으로 B 가져옴
		
		int sum = 0;													// 곱셈 결과
		int[] n =  new int[A.length()];
		int[] m =  new int[B.length()];
		
		for(int i = 0; i < A.length(); i++) {
			n[i] = Character.getNumericValue(A.charAt(i));				// A 각 자리 분리해서 char->int 변환
			
			for(int j = 0; j < B.length(); j++) {
				m[j] = Character.getNumericValue(B.charAt(j));			// B 각 자리 분리해서 char->int 변환
				
				sum += n[i] * m[j] ;
			}
		}
		
		System.out.println(sum);
	}

}
