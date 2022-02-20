package sohyeon.feb19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// https://umilove98.tistory.com/57
/*
 * 문제
N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.
--
총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.

주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.

--
총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다. S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.
--
예제 입력 1 
3
0
0
0

10
1
2
4
8
16
32
64
128
256
-512

6
9223372036854775807
9223372036854775806
9223372036854775805
-9223372036854775807
-9223372036854775806
-9223372036854775804
--
예제 출력 1 
0
-
+
 */
public class No1_1247 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        BigInteger zero = new BigInteger("0");
        
        for(int i = 0; i < 3; i++) {		// 데이터 셋 3개
        	
            int n = Integer.parseInt(br.readLine());		// 입력받을 수 개수
            BigInteger s = zero;
            
            for(int j = 0; j < n; j++) {
                BigInteger now = new BigInteger(br.readLine());		// n개 입력받아
                s = s.add(now);										// 더함
                
            }
            
            if(s.compareTo(zero) == 0) {    // 결과값이 0이면 
                System.out.println(0);
                
            }else if(s.compareTo(zero) == 1) {    // 결과값이 양수이면
                System.out.println("+");
                
            }else {                            // 결과값이 음수이면
                System.out.println("-");
                
            }
        }
	}

}
