package sohyeon.jun11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://kjs-dev.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%9E%90%EB%B0%94-2810-%EC%BB%B5%ED%99%80%EB%8D%94

/*
 * 문제
십년이면 강산이 변한다.

강산이네 동네에 드디어 극장이 생겼고, 강산이는 극장에 놀러갔다. 매점에서 콜라를 산 뒤, 자리에 앉은 강산이는 큰 혼란에 빠졌다.

양쪽 컵홀더를 이미 옆 사람들이 차지했기 때문에 콜라를 꽂을 컵 홀더가 없었기 때문이다.

영화를 보는 내내 콜라를 손에 들고 있던 강산이는 극장에 다시 왔을 때는 꼭 콜라를 컵 홀더에 놓겠다는 다짐을 한 후 집에 돌아갔다.

극장의 한 줄에는 자리가 N개가 있다. 서로 인접한 좌석 사이에는 컵홀더가 하나씩 있고, 양 끝 좌석에는 컵홀더가 하나씩 더 있다.

또, 이 극장에는 커플석이 있다. 커플석 사이에는 컵홀더가 없다.

극장의 한 줄의 정보가 주어진다. 이때, 이 줄에 사람들이 모두 앉았을 때, 컵홀더에 컵을 꽂을 수 있는 최대 사람의 수를 구하는 프로그램을 작성하시오.

모든 사람은 컵을 한 개만 들고 있고, 자신의 좌석의 양 옆에 있는 컵홀더에만 컵을 꽂을 수 있다.

S는 일반 좌석, L은 커플석을 의미하며, L은 항상 두개씩 쌍으로 주어진다.

어떤 좌석의 배치가 SLLLLSSLL일때, 컵홀더를 *로 표시하면 아래와 같다.

*S*LL*LL*S*S*LL*
위의 예에서 적어도 두 명은 컵홀더를 사용할 수 없다.
--
입력
첫째 줄에 좌석의 수 N이 주어진다. (1 ≤ N ≤ 50) 둘째 줄에는 좌석의 정보가 주어진다.
--
출력
컵을 컵홀더에 놓을 수 있는 최대 사람의 수를 출력한다.
--
예제 입력 1 
3
SSS
예제 출력 1 
3
--
예제 입력 2 
4
SLLS
예제 출력 2 
4
--
예제 입력 3 
9
SLLLLSSLL
예제 출력 3 
7
*/

public class No3_2810 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());										// 좌석 개수
		
		String str = br.readLine();
		
		int count = 1;																	// 컵홀더 쓸 수 있는 사람 수
		
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) == 'S')
				count++;
			else if (str.charAt(i) == 'L') {
				count += 1;
				i++;
			}
		}
		/*
		num == 좌석수
		count == 컵을 컵홀더에 놓을 수 있는 최대 사람의 수
		사람수가 좌석수보다는 많을 수 없기 때문에 사람 수가 많을 때, 좌석수를 출력해줘야 합니다.
		*/
		if (N > count) {
			System.out.println(count);
			
		} else {
			System.out.println(N);
			
		}
		
		bw.flush();
		bw.close();
	}

}
