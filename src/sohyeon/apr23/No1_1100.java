package sohyeon.apr23;

import java.io.IOException;
import java.util.Scanner;

/*
* 문제
체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다.

가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
--
입력
첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
--
출력
첫째 줄에 문제의 정답을 출력한다.
--
예제 입력 1 
.F.F...F
F...F.F.
...F.F.F
F.F...F.
.F...F..
F...F.F.
.F.F.F.F
..FF..F.
예제 출력 1 
1
--
예제 입력 2 
........
........
........
........
........
........
........
........
예제 출력 2 
0
--
예제 입력 3 
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
FFFFFFFF
예제 출력 3 
32
--
예제 입력 4 
........
..F.....
.....F..
.....F..
........
........
.......F
.F......
예제 출력 4 
2
*/

public class No1_1100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char[][] ch = new char[8][8]; 										// 8*8 크기의 배열 선언
		int cnt = 0;														// 총 F 개수

		String str = "";

		for (int i = 0; i < 8; i++) {
			str = sc.nextLine();											// 한 줄씩 읽어와서
			
			for (int j = 0; j < 8; j++) {
				ch[i][j] = str.charAt(j);									// 한 칸에 하나씩 넣어줌

				if ((i + j) % 2 == 0 && ch[i][j] == 'F') {					// i+j한 값이 짝수인 경우 흰색. 여기에 F 있을 경우 cnt 증가
					cnt++;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
