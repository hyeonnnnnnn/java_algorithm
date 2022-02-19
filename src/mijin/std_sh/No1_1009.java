package mijin.std_sh;

import java.util.Scanner;

/*
재용이는 최신 컴퓨터 10대를 가지고 있다.
 
어느 날 재용이는 많은 데이터를 처리해야 될 일이 생겨서 각 컴퓨터에 1번부터 10번까지의 번호를 부여하고, 10대의 컴퓨터가 다음과 같은 방법으로 데이터들을 처리하기로 하였다.

1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,

10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...

총 데이터의 개수는 항상 a^b개의 형태로 주어진다. 재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 이를 수행해주는 프로그램을 작성하라.
--
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
--
각 테스트 케이스에 대해 마지막 데이터가 처리되는 컴퓨터의 번호를 출력한다.
--
예제 입력 1 
5
1 6
3 7
6 2
7 100
9 635
예제 출력 1 
1
7
6
1
9
*/
public class No1_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		// 입력받을 수 개수
		
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 1;		// a의 1 제곱을 먼저 구하기 위해 result 1로 초기화
			
			for(int j = 0; j < b; j++) {
				
				result =  (result * a) % 10;
				
				if(result == 0) {		// 마지막 자리수가 0일 때 10번째 컴퓨터
					result = 10;
				}
			}
			
			System.out.println(result);
			
		}
		
		sc.close();
	}

}
