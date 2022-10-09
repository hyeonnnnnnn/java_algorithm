package sohyeon.sep24;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 문제
다음과 같은 규칙에 따라 수들을 만들려고 한다.

첫 번째 수로 양의 정수가 주어진다.
두 번째 수는 양의 정수 중에서 하나를 선택한다.
세 번째부터 이후에 나오는 모든 수는 앞의 앞의 수에서 앞의 수를 빼서 만든다.
예를 들어, 세 번째 수는 첫 번째 수에서 두 번째 수를 뺀 것이고, 네 번째 수는 두 번째 수에서 세 번째 수를 뺀 것이다.
음의 정수가 만들어지면, 이 음의 정수를 버리고 더 이상 수를 만들지 않는다.
첫 번째 수로 100이 주어질 때, 두 번째 수로 60을 선택하여 위의 규칙으로 수들을 만들면 7개의 수들 100, 60, 40, 20, 20 , 0, 20이 만들어진다. 
그리고 두 번째 수로 62를 선택하여 위의 규칙으로 수들을 만들면 8개의 수들 100, 62, 38, 24, 14, 10, 4, 6이 만들어진다. 
위의 예에서 알 수 있듯이, 첫 번째 수가 같더라도 두 번째 수에 따라서 만들어지는 수들의 개수가 다를 수 있다.

입력으로 첫 번째 수가 주어질 때, 이 수에서 시작하여 위의 규칙으로 만들어지는 최대 개수의 수들을 구하는 프로그램을 작성하시오. 

최대 개수의 수들이 여러 개일 때, 그중 하나의 수들만 출력하면 된다.
--
입력
첫 번째 수가 주어진다. 이 수는 30,000 보다 같거나 작은 양의 정수이다.
--
출력
첫 번째 줄에는 입력된 첫 번째 수로 시작하여 위의 규칙에 따라 만들 수 있는 수들의 최대 개수를 출력한다.

둘째 줄에 그 최대 개수의 수들을 차례대로 출력한다. 이들 수 사이에는 빈칸을 하나씩 둔다.
--
예제 입력 1 
100
예제 출력 1 
8
100 62 38 24 14 10 4 6
*/
public class No3_2635 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>(); 					// 임시 리스트
			
			tmp.add(n); 														// n을 리스트의 1번 
			tmp.add(i);															// i를 리스트의 2번에 저장
			
			int prev1 = n;
			int prev2 = i;

			while (true) { 														// 결과가 0보다 큰 동안 앞앞 숫자에서 앞 숫자를 빼준값을 리스트에 저장
				int temp = prev1 - prev2;
				
				if (temp >= 0) {												// temp가 0보다 클 경우 계속 진행, 아니면 끝
					tmp.add(temp);
					
				} else {
					break;
				}
				
				prev1 = prev2; 													// 앞앞 숫자와 앞 숫자를 새로 지정
				prev2 = temp;
			}
			
			if (max < tmp.size()) { 											// 최대 개수의 숫자라면 해당 개수를 max에 저장하고 리스트의 숫자 조합을 arr에 저장
				max = tmp.size();
				arr = tmp;
			}
		}
		
		sc.close();
		
		System.out.println(max); 												// 최대 값
		
		for (int i = 0; i < arr.size(); i++) {									// 최대 값 조합
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
