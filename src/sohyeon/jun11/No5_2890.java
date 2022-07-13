package sohyeon.jun11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://blog.naver.com/pano1215/222643733056
/*
 * 문제
상근이는 카약 대회를 개최했다. 대회는 전세계에 생중계되고, 위성이 경기장 전체를 촬영하고 있다. 상근이는 위성 사진을 바탕으로 실시간 순위를 계산하는 프로그램을 만들려고 한다.

위성 사진은 R행 C열이다. 모든 줄의 첫 번째 글자는 'S'이고 출발선을 의미한다. 또, 마지막 글자는 'F'이고 이것은 결승선을 의미한다. 

대회에 참가한 팀은 총 9팀이고, 각 팀은 1부터 9까지 번호가 매겨져 있다. 카약은 항상 열에 대해 연속하는 세 칸을 차지하며, 카약 번호로 표시한다. 마지막으로 물은 '.'로 나타나 있다.

팀의 순위는 결승선으로부터 떨어진 거리로 측정한다. 가까울수록 순위가 높다. 만약, 두 팀이 결승선과 떨어진 거리가 같다면, 같은 등수이다.
--
입력
첫째 줄에 R과 C가 주어진다. 다음 R개 줄에는 '.', 'S', 'F', '1'~'9'로 이루어진 위성 지도가 주어진다. 

한 줄에는 최대 한 개의 카약만 있고, 위성 사진에 있는 카약은 항상 9개이다. (10 ≤ R, C ≤ 50)
--
출력
출력은 총 9줄을 해야 한다. i번째 줄에는 i번 팀의 등수를 출력한다. (i=1~9)
--
예제 입력 1 
10 10
S.....111F
S....222.F
S...333..F
S..444...F
S.555....F
S666.....F
S.777....F
S..888...F
S...999..F
S........F
예제 출력 1 
1
2
3
4
5
6
5
4
3
--
예제 입력 2 
10 15
S..........222F
S.....111.....F
S...333.......F
S...555.......F
S.......444...F
S.............F
S......777....F
S..888........F
S........999..F
S...666.......F
예제 출력 2 
5
1
6
3
6
6
4
7
2
*/

public class No5_2890 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());									// R행
		int C = Integer.parseInt(st.nextToken());									// C열

		String[][] course = new String[R][C];
		
		for (int i = 0; i < R; i++) {												// 레인별 정보 입력
			String lane = br.readLine();
			course[i] = lane.split("");
		}

		int[] rank = new int[R];	
		for(int i=0;i<rank.length;i++)
		System.out.println(rank[i]);// 팀별 등수
		int num = 1;																// 턴을 돌 때마다 등수를 +1씩 해줌(레인 결과)
		
		for (int i = C - 2; i > 0; i--) {											// F -> S 방향으로 진행
			boolean flag = true;
			
			for (int j = 0; j < R; j++) {
				//System.out.println(rank[1]);
				if (!course[j][i].equals(".") && rank[Integer.parseInt(course[j][i]) - 1] == 0) {	//  .이 없을 시 F에 가장 가까운 것이므로 1등 && 카약인지 체크
					rank[Integer.parseInt(course[j][i]) - 1] = num;
					flag = false;
				}
			}
			
			if (flag) {
				continue;
			}
			num++;																					// 다음으로 등수 높여가며 진행
		}

		for (int rr : rank) {
			System.out.print(rr + " ");
		}

	}

}
