package mijin.std_mijin.y_2022.mar_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.*/
/* https://umilove98.tistory.com/57 */
public class bj_1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		BigInteger zero = new BigInteger("0"); //0으로 초기화 
		
		for (int i=0;i<3;i++) {
			n=Integer.parseInt(br.readLine());
			BigInteger s= zero;
			for (int j=0;j<n;j++) {
				BigInteger now = new BigInteger(br.readLine());
				s=s.add(now);//더하기
			}
			if(s.compareTo(zero)==0) { //결과가 0이면
				System.out.println(0);
			}else if(s.compareTo(zero)==1) { //결과가 양수면
				System.out.println("+");
			}else { //결과가 음수면
				System.out.println("-");
			}
			//compareto 숫자의 경우 1:크다 , 0:같다, -1:작다 
			// 문자열의 경우 0:같다 그외 는 문자열 길이의 차이값
		}

	}

}
