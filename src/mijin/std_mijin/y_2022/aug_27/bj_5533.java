package mijin.std_mijin.y_2022.aug_27;

import java.util.Scanner;

/*문제
상근이와 친구들은 MT에 가서 아래 설명과 같이 재미있는 게임을 할 것이다.

각 플레이어는 1이상 100 이하의 정수를 카드에 적어 제출한다. 각 플레이어는 자신과 같은 수를 쓴 사람이 없다면, 자신이 쓴 수와 같은 점수를 얻는다. 만약, 같은 수를 쓴 다른 사람이 있는 경우에는 점수를 얻을 수 없다.

상근이와 친구들은 이 게임을 3번 했다. 각 플레이어가 각각 쓴 수가 주어졌을 때, 3번 게임에서 얻은 총 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 참가자의 수 N이 주어진다. (2 ≤ N ≤ 200) 둘째 줄부터 N개 줄에는 각 플레이어가 1번째, 2번째, 3번째 게임에서 쓴 수가 공백으로 구분되어 주어진다.

출력
각 플레이어가 3번의 게임에서 얻은 총 점수를 입력으로 주어진 순서대로 출력한다.

예제 입력 1 
5
100 99 98
100 97 92
63 89 63
99 99 99
89 97 98
예제 출력 1 
0
92
215
198
89
예제 입력 2 
3
89 92 77
89 92 63
89 63 77
예제 출력 2 
0
63
63*/
public class bj_5533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] arr = new int[N][3]; //입력 받기 ( n명의 3개 게임 점수
		int[] score = new int[N]; //점수 
		
		for(int i=0; i<N; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			arr[i][2] = scan.nextInt();
		}
		
		for(int i=0; i<N; i++) {	// 모든 플레이어들 비교
			for(int j=0; j<3; j++) {	 // → 방향으로 비교
				boolean flag = true;
				
				for(int k=0; k<N; k++) { // ↓ 방향으로 비교
					if(i == k)	continue;	// 자기 자신은 비교 X
					
					if(arr[i][j] == arr[k][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag)
					score[i] += arr[i][j];
			}
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		scan.close();
	}

}
