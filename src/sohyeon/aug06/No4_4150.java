package sohyeon.aug06;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * 문제
피보나치 수열은 다음과 같이 그 전 두 항의 합으로 계산되는 수열이다. 첫 두 항은 1로 정의된다.

f(1) = 1, f(2) = 1, f(n > 2) = f(n − 1) + f(n − 2)

정수를 입력받아, 그에 해당하는 피보나치 수를 출력하는 프로그램을 작성하여라.
--
예제 입력 1 
100
예제 출력 1 
354224848179261915075
*/
public class No4_4150 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();													// 입력
		BigInteger result = cal(num);											// 결과
		
        System.out.println(result);
        
        sc.close();
    }
 
    public static BigInteger cal(int n) {
        BigInteger a = BigInteger.valueOf(1);								// f(1) = 1
        BigInteger b = BigInteger.valueOf(1);								// f(2) = 1
        BigInteger c;
        
        for (int j = 2; j <= n ; j++) {										// 2부터 100까지
            c = a.add(b);													// f(3) = f(2) + f(1), f(4) = f(3) + f(2), ...
            a = b;															// a = f(2), f(3), ...
            b = c;															// b = f(3), f(4), ...
        }
 
        return (a);
	}

}
