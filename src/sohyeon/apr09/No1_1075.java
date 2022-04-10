package sohyeon.apr09;

import java.util.Scanner;

/*
 * 문제
두 정수 N과 F가 주어진다. 지민이는 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다. 만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.

예를 들어, N=275이고, F=5이면, 답은 00이다. 200이 5로 나누어 떨어지기 때문이다. N=1021이고, F=11이면, 정답은 01인데, 1001이 11로 나누어 떨어지기 때문이다.
--
입력
첫째 줄에 N, 둘째 줄에 F가 주어진다. N은 100보다 크거나 같고, 2,000,000,000보다 작거나 같은 자연수이다. F는 100보다 작거나 같은 자연수이다.
--
출력
첫째 줄에 마지막 두 자리를 모두 출력한다. 한자리이면 앞에 0을 추가해서 두 자리로 만들어야 한다.
--
예제 입력 1 
1000
3
예제 출력 1 
02
--
예제 입력 2 
2000000000
100
예제 출력 2 
00
--
예제 입력 3 
23442
75
예제 출력 3 
00
--
예제 입력 4 
428392
17
예제 출력 4 
15
--
예제 입력 5 
32442
99
예제 출력 5 
72
*/

public class No1_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();											// 정수 N
		int F = sc.nextInt();											// 정수 F
		
		int temp = (N/100) * 100;										// N의 뒤 두자리를 00으로 만들어줌

        while(true) {
            if(temp % F == 0) {											// temp를 F로 나눴을 때 0이면
                int num = temp % 100;									// 뒤 두자리 출력하기 위해 % 100
                
                if(num < 10) {											// %100 한 수가 10보다 작으면
            	System.out.println("0" + num);							// 수 앞에 0 추가해줌
                	
                } else {
                	System.out.println(num);
                }
                break;
            } else {
            	temp++;													// temp를 F로 나눴을 때 0이 아니면 temp++ 하여 다시 % F 하도록
            	
            }
        }
        
        sc.close();
	}

}
