package sohyeon.aug06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 문제
2018년에 대한민국 평창에서 동계올림픽이 개최된다. 그 중에서도 스키는 동계올림픽의 꽃이지만 유독 우리나라에선 인기가 좀 없는 것 같다. 

그래서 이번 평창올림픽에선 새로운 스키 경기 규칙이 적용 되었다. 새로 적용된 규칙은 다음과 같다.

스키 경기는 두 번의 경주로 이루어져 있다. 총 N명의 선수가 첫 번째 경주에 참가하고 각각 번호를 부여받는다. 

1번 선수부터 N번 선수까지 순서대로 한 명씩 산을 타고 내려간다. 산을 다 내려오면 내려온 선수의 현재 순위가 정해질 것이다. 

첫 번째 경주가 끝나고 난 뒤 최종적으로 정해진 순위에 따라서 1등부터 M등까지의 선수들에게만 두 번째 경주에 나갈 수 있는 자격이 주어진다. 

두 번째 경주에서는 첫 번째 경주에서 늦게 들어온 순서대로(M등부터 시작해서 1등까지) 한 명씩 산을 타고 내려간다. 

산을 다 내려오면 내려온 선수의 현재 순위가 정해질 것이다. 두 번째 경주가 끝나고 난 뒤 최종적으로 정해진 순위에 따라서 1등, 2등 그리고 3등에게 각각 금메달, 은메달, 동메달이 수여 될 것이다.

이때 메달을 얻은 선수들의 번호를 구하는 프로그램을 작성해야 한다.(경주에 참가한 모든 선수들은 한 명도 빠짐없이 경주를 완주한다. 두 명 이상의 선수가 동시에 들어오는 경우는 없다.)
--
입력
첫 번째 줄에는 정수 N과 M이 주어진다. (3 ≤ M ≤ N ≤ 100)

이 후 N개의 줄에는 첫 번째 경주에서 각각의 선수들이 내려왔을 때 정해진 현재 순위가 주어진다.

이 후 M개의 줄에는 두 번째 경주에서 각각의 선수들이 내려왔을 때 정해진 현재 순위가 주어진다.
--
출력
첫 번째 줄에는 금메달을 딴 선수의 번호를, 두 번째 줄에는 은메달을 딴 선수의 번호를, 세 번째 줄에는 동메달을 딴 선수의 번호를 출력한다.
--
예제 입력 1 
3 3
1
2
3
1
1
1
예제 출력 1 
1
2
3
--
예제 입력 2 
4 3
1
1
2
2
1
2
1
예제 출력 2 
2
3
4
--
예제 입력 3 
5 4
1
2
1
4
3
1
1
3
2
예제 출력 3 
5
3
2
*/
public class No1_3230 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> first_race = new ArrayList<Integer>();					// 첫 번째 경주
		ArrayList<Integer> second_race = new ArrayList<Integer>();					// 두 번째 경주
		
		for(int i = 0; i < N; i++) {
			int first_score = Integer.parseInt(br.readLine());						// 첫 번째 레이스 순위
			first_race.add(first_score-1, i); 										// 인덱스: 순위, 값: 선수번호
			
		}
		
		/*	
		for(int i = 0; i < first_race.size(); i++) {
			System.out.println(first_race.get(i)+1 + "번선수_" + (i+1) + "등");
		}
		*/
		
		for(int j = M-1; j >= 0; j--) {
			int second_score = Integer.parseInt(br.readLine());						// 두 번째 레이스 순위
			second_race.add(second_score-1, first_race.get(j));						// 인덱스: 순위, 값: 선수번호
			
		}
		
		System.out.println(second_race.get(0)+1);										// 금
		System.out.println(second_race.get(1)+1);										// 은
		System.out.println(second_race.get(2)+1);										// 동
	}

}
