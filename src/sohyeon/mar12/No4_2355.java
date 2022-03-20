package sohyeon.mar12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제
두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램을 작성하시오. 사이에 있는 수들은 A와 B도 포함한다.
--
입력
첫째 줄에 두 정수 A, B가 주어진다. (-2,147,483,648 ≤ A, B ≤ 2,147,483,647)
--
출력
첫째 줄에 답을 출력한다. (-2,147,483,648 ≤ 답 ≤ 2,147,483,647)
--
예제 입력 1 
1 2
예제 출력 1 
3
*/

public class No4_2355 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		method1();
		method2();
	}
	
	public static void method1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());			// 한줄로 읽어오기
		
		int A = Integer.parseInt(st.nextToken());							// 정수 A 
		int B = Integer.parseInt(st.nextToken());							// 정수 B
		
		int result = 0;														// 결과 담을 변수
		
		for(int i = A; i <= B; i++) {										// A부터 B까지 수 증가시켜 가면서
			result += i;													// 누적
		}
		
		System.out.println(result);
	}
	
	// https://umilove98.tistory.com/95
	public static void method2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Integer.parseInt(st.nextToken());						// 정수 A
        long B = Integer.parseInt(st.nextToken());						// 정수 B
        
        if(B > A) {														// A보다 B가 클 경우 자리 바꾸기? 근데 왜 하는지 모르겠음
            long temp = B;
            B = A;
            A = temp;
        }
        
        long result = (A + B) * (A - B + 1) / 2;
        
        System.out.println(result);
 
	}
}
