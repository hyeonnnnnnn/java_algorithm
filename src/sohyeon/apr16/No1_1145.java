package sohyeon.apr16;

import java.util.Scanner;

/*
 * 문제
다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.

서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
--
입력
첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
--
출력
첫째 줄에 적어도 대부분의 배수를 출력한다.
--
예제 입력 1 
30 42 70 35 90
예제 출력 1 
210
--
예제 입력 2 
1 2 3 4 5
예제 출력 2 
4
--
예제 입력 3 
30 45 23 26 56
예제 출력 3 
1170
--
예제 입력 4 
3 14 15 92 65
예제 출력 4 
195
*/

public class No1_1145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int cnt = 0;									// 몇 개의 수로 나누어지는지 저장할 변수
		int num = 1;									// 나누어질 대상. 1부터 증가시킴
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();						// 배열에 수 다섯 개 입력 받음
		}
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				if(num % arr[i] == 0) cnt++;			// 배열에 있는 수로 나눠지면 cnt 증가
			}
			
			if(cnt >= 3) break;							// 3개 이상으로 나누어질 경우 반복 종료
			num++;										// 배열에 있는 수로 나눠지지 않을 경우 num 계속 증가시켜서 나눔 
		}
		sc.close();
		
		System.out.println(num);
		
	}

}
