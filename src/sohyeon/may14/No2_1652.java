package sohyeon.may14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제
일 년 동안 세계일주를 하던 영식이는 여행을 하다 너무 피곤해서 근처에 있는 코레스코 콘도에서 하룻밤 잠을 자기로 하고 방을 잡았다.

코레스코 콘도에 있는 방은 NxN의 정사각형모양으로 생겼다. 방 안에는 옮길 수 없는 짐들이 이것저것 많이 있어서 영식이의 누울 자리를 차지하고 있었다. 

영식이는 이 열악한 환경에서 누울 수 있는 자리를 찾아야 한다. 영식이가 누울 수 있는 자리에는 조건이 있다. 

똑바로 연속해서 2칸 이상의 빈 칸이 존재하면 그 곳에 몸을 양 옆으로 쭉 뻗으면서 누울 수 있다. 가로로 누울 수도 있고 세로로 누울 수도 있다. 

누울 때는 무조건 몸을 쭉 뻗기 때문에 반드시 벽이나 짐에 닿게 된다. (중간에 어정쩡하게 눕는 경우가 없다.)


만약 방의 구조가 위의 그림처럼 생겼다면, 가로로 누울 수 있는 자리는 5개이고, 세로로 누울 수 있는 자리는 4개 이다. 

방의 크기 N과 방의 구조가 주어졌을 때, 가로로 누울 수 있는 자리와 세로로 누울 수 있는 자리의 수를 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 방의 크기 N이 주어진다. N은 1이상 100이하의 정수이다. 그 다음 N줄에 걸쳐 N개의 문자가 들어오는데 '.'은 아무것도 없는 곳을 의미하고, 'X'는 짐이 있는 곳을 의미한다.
--
출력
첫째 줄에 가로로 누울 수 있는 자리와 세로로 누울 수 있는 자리의 개수를 출력한다.
--
예제 입력 1 
5
....X
..XX.
.....
.XX..
X....
--
예제 출력 1 
5 4
*/

public class No2_1652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());								 // 방 크기
		char[][] room = new char[100][100];										 // 방 구조 저장
		int rowCount = 0, colCount = 0;
		String[] s = new String[N];
		
		for (int i = 0; i < N; i++) {
			s = br.readLine().split("");								 // 한 줄로 들어온 입력을 하나씩 자름
			
			for (int j = 0; j < s.length; j++) {
				room[i][j] = s[j].charAt(0);
			}
			room[i][N] = 'X';													// 벽을 X 처리
			room[N][i] = 'X';
		}
		
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N - 1; j++) {
				// 행과 열이 2칸 이상 .이고 이후 X일 경우 각 카운트 증가
				if (room[i][j] == '.' && room[i][j+1] == '.' && room[i][j+2] == 'X') colCount++;		// 행 카운트 증가
				if (room[j][i] == '.' && room[j][i+1] == '.' && room[j][i+2] == 'X') rowCount++;		// 열 카운트 증가
				// room[N][N]으로 설정하면 index out of bound exception 나서 room[100][100]으로 설정했는데 위의 카운트 조건이 아니면 어떤 게 있을지?
			}
		}
		
		System.out.println(colCount + " " + rowCount);
		
	}

}
