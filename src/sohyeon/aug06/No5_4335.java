package sohyeon.aug06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 문제
스탠과 올리는 정수 맞추기 게임을 하고 있다. 스탠은 1과 10사이의 정수 하나를 생각하고, 올리는 스탠이 생각한 수를 맞춰야 한다. 

올리가 수를 말할 때마다 스탠은 올리가 말한 수가 큰지, 작은지, 일치하는지를 말해준다.

게임이 몇 번 진행된 후 올리는 스탠이 거짓말을 하고 있다는 생각을 하게 되었다. 

즉, 올리는 수를 말할때 마다 스탠이 자신이 생각한 수를 바꿀수도 있다는 생각을 했다. 

이런 일이 실제로 벌어지는지 알아내기 위해서, 올리는 게임이 진행되면서 자신이 외친 수와 스탠이 말한 답변을 모두 적어놓았다.

올리가 외친 수와 스탠의 답변이 주어졌을 때, 스탠이 거짓말을 했는지 아닌지 알아내는 프로그램을 작성하시오.
--
입력
입력은 여러 개의 게임으로 이루어져 있다. 각 게임은 올리가 외친 수와 스탠의 답변으로 이루어져 있으며, 계속해서 번갈아가면서 주어진다.

올리가 외친 수는 1보다 크거나 같고, 10보다 작거나 같은 자연수이고, 스탠의 답변은 "too high", "too low", "right on" 중 하나이다.

"too high"는 올리가 외친 수가 스탠이 생각한 수보다 클 때, "too low"는 작을 때, "right on"은 일치할 때이다.

스탠의 답변이 "right on"이면, 게임이 끝난 것이다.

입력의 마지막 줄에는 0이 주어진다.
--
출력
각각의 게임에 대해서, 스탠이 거짓말을 한 적이 있다면 "Stan is dishonest"를, 없다면 "Stan may be honest"를 출력한다.
--
예제 입력 1 
10
too high
3
too low
4
too high
2
right on
5
too low
7
too high
6
right on
0
예제 출력 1 
Stan is dishonest
Stan may be honest
*/

//https://umilove98.tistory.com/100
public class No5_4335 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			ArrayList<Integer> high = new ArrayList<Integer>();								// high 리스트
			ArrayList<Integer> low = new ArrayList<Integer>();								// low 리스트
			int result = 0;

			while (true) {
				int num = Integer.parseInt(br.readLine());
				
				if (num == 0) { 															// 0이 입력되면 종료
					return;
				}
				String answer = br.readLine();												// 답변 읽어와서

				if (answer.charAt(4) == 'h') { 												// 현재 숫자가 high인 경우 high 리스트에 저장
					high.add(num);
					
				} else if (answer.charAt(4) == 'l') { 										// 현재 숫자가 low인 경우 low 리스트에 저장
					low.add(num);
					
				} else { 																	// 현재 숫자가 right인 경우 숫자 저장 후 종료
					result = num;
					break;
				}
			}
			boolean flag = true;
			
			for (int i = 0; i < high.size(); i++) {
				if (result >= high.get(i)) {
					flag = false;															// high에 저장된 모든 값들이 정답보다 크면 거짓
					break;
				}
			}
			if (flag) {
				for (int i = 0; i < low.size(); i++) { 										
					if (result <= low.get(i)) {												// low에 저장된 모든 값들이 정답보다 작으면 거짓
						flag = false;
						break;
					}
				}
			}
			
			if (flag) {																		// 진실일 경우
				System.out.println("Stan may be honest");
			} else {																		// 거짓일 경우
				System.out.println("Stan is dishonest");
			}

		}
	}

}
