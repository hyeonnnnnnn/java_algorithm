package sohyeon.may14;

import java.util.Scanner;

/*
 * 문제
유진수는 어떤 수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때, 앞부분 자리수의 곱과 뒷부분 자리수의 곱이 같을 때를 말한다.

예를 들어, 1221은 유진수이다. 12와 21로 나눴을 때, 앞부분 자리수의 곱 1*2는 뒷부분 자리수의 곱 2*1과 같기 때문이다.

1236도 마찬가지로 유진수이다. 하지만, 1234는 아니다. 수를 나눌 때 항상 연속된 자리수를 나눠야하고, 각 부분에 적어도 한자리는 있어야 한다.

예를 들어, 12345는 총 4가지 방법으로 나눌 수 있다. 1-2345, 12-345, 123-45, 1234-5 어떤 수 N이 주어질 때, 이 수가 유진수인지 아닌지 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 수 N이 주어진다. 이 수는 2,147,483,647보다 작거나 같은 자연수이다.
--
출력
첫째 줄에 N이 유진수이면 YES, 아니면 NO를 출력한다.
--
예제 입력 1 
1236
예제 출력 1 
YES
--
예제 입력 2 
1
예제 출력 2 
NO
--
예제 입력 3 
1221
예제 출력 3 
YES
--
예제 입력 4 
4729382
예제 출력 4 
NO
--
예제 입력 5 
42393338
예제 출력 5 
YES
*/

public class No1_1356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		char[] ch = num.toCharArray();										// 숫자 한 줄로 입력받아 하나씩 자름
		
		boolean flag = false;												// 같은지 다른지 확인 결과
		
		for(int i = 0; i < ch.length - 1; i++) {							// 뒷자리 한 자리는 있어야 하므로 length-1 까지 수행
			int sum1 = 1, sum2 = 1;											// 앞자리 곱한 결과, 뒷자리 곱한 결과 변수 선언
			
			for(int j = 0; j <= i; j++) {									// i 수행(앞자리)
				sum1 = sum1 * Character.getNumericValue(ch[j]);				// 앞자리 곱 결과
//				System.out.println("sum1:"+sum1);
			}
			
			for(int j = i+1; j < ch.length; j++) {							// i 수행 시 그 뒤부터 문자열 끝까지 계산해야 함(뒷자리)
				sum2 = sum2 * Character.getNumericValue(ch[j]);				// 뒷자리 곱 결과
//				System.out.println("sum2:"+sum2);
			}
			
			if(sum1 == sum2) {												// 결과 동일할 때 flag true로 바꾸고 수행 종료
				flag = true;
				break;
			}
		}
		
		System.out.println(flag?"YES":"NO");
		sc.close();
	}

}
