package sohyeon.apr30;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
// https://begin-dev-awos.tistory.com/89?category=967729
/*
 * 문제
두 개의 이진수를 입력받아 이를 더하는 프로그램을 작성하시오.
--
입력
첫째 줄에 두 개의 이진수가 빈 칸을 사이에 두고 주어진다. 각 이진수는 1 또는 0으로만 이루어져 있으며, 0으로 시작할 수도 있다. 또한 각 이진수의 길이는 80을 넘지 않는다.
--
출력
첫째 줄에 이진수 덧셈 결과를 출력한다. 결과가 0인 경우를 제외하고는 출력되는 이진수는 항상 1로 시작해야 한다.
--
예제 입력 1 
1001101 10010
예제 출력 1 
1011111
*/
public class No1_1252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        BigInteger b1 = sc.nextBigInteger();			
        BigInteger b2 = sc.nextBigInteger();

        String s1 = b1.toString();
        String s2 = b2.toString();

        // 2진수를 10진수로 변환
        BigInteger a = new BigInteger(s1, 2);
        BigInteger b = new BigInteger(s2, 2);

        // 10진수로 변환한 두 수를 더하고
        BigInteger sum = a.add(b);

        // 두 수를 더한 sum의 값을 2진수로 다시 변환
        String result = sum.toString(2);
        System.out.println(result);
        
        sc.close();
	}

}
