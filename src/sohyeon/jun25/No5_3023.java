package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제
유명한 마술사인 이민혁이 사용하는 카드의 뒷 면은 모두 자신이 디자인한 카드이다.

민혁이는 카드 뒷 면 전체를 디자인하지 않고, 왼쪽 위 1/4만 디자인한다. 그 다음 대칭시켜 오른쪽 위를 만들고, 다시 대칭시켜서 아래 부분을 모두 만든다.

이렇게 대칭시켜서 전체를 디자인 한 이후에는, 마술하는데 사용하기 위한 의도된 에러를 넣는다. 에러는 원래 '#'이어야 하는 칸을 '.'로 바꾸거나 '.'이어야 하는 칸을 '#'로 바꾸는 것이다.

왼쪽 위의 디자인과 에러의 위치가 주어졌을 때, 카드 뒷 면 전체 디자인을 구하는 프로그램을 작성하시오.

아래 그림은 민혁이의 카드의 예시이다. (회색 칸은 에러이다)

###.##.###
##########
.########.
..######..
####.#####
##########
..######..
.########.
##########
###.##.###	#.#..#.#
#.####.#
#.####.#
........
.#.##.#.
.#.##.#.
........
#.####.#
#.####.#
#.#.##.#	.#.##.##
#.#..#.#
........
..#..#..
..#..#..
........
#.#..#.#
##.##.##

--
입력
첫째 줄에 왼쪽 위 부분의 행의 개수 R과 열의 개수 C가 주어진다. (1 ≤ R, C ≤ 50)

다음 R개 줄에는 C개의 문자 '.' 또는 '#'가 주어진다.

마지막 줄에는 에러의 위치 A와 B가 주어진다. (1 ≤ A ≤ 2R, 1 ≤ B ≤ 2C)
--
출력
카드 뒷 면 전체 디자인을 총 2R개 줄에 걸쳐서 출력한다. 각 줄은 2C개의 문자로 이루어져 있어야 한다.
--
예제 입력 1 
2 2
#.
.#
3 3
예제 출력 1 
#..#
.##.
.#..
#..#
--
예제 입력 2 
3 3
###
###
###
1 4
예제 출력 2 
###.##
######
######
######
######
######
--
예제 입력 3 
5 4
#.#.
#.##
#.##
....
.#.#
10 5
예제 출력 3 
#.#..#.#
#.####.#
#.####.#
........
.#.##.#.
.#.##.#.
........
#.####.#
#.####.#
#.#.##.#
*/
public class No5_3023 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());											// 행
		int C = Integer.parseInt(st.nextToken());											// 열
		
		char[][] ch = new char[2*R][2*C];
		
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < C; j++) {
				ch[i][j] = str.charAt(j);													// 왼쪽 위 디자인 저장
			}
		}
		
		for(int i = 0; i < R; i++){															// 좌우반전해서 저장
            for(int j = 0; j < C; j++){
            	ch[i][2 * C - 1 - j] = ch[i][j];
            }
        }
		
        for(int i = 0; i < R; i++){															// 상하반전해서 저장
            for(int j = 0; j < 2 * C; j++){
            	ch[2 * R - 1 - i][j] = ch[i][j];
            }
        }
        
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());											// 에러 행 위치
        int c = Integer.parseInt(st.nextToken());											// 에러 열 위치
        
        // 배열의 좌표와 맞추기 위해 각각 -1
        r = r-1;
        c = c-1;
        
        if(ch[r][c] == '#') {																// 해당 좌표 값이 #인 경우 .으로
        	ch[r][c] = '.';
        } else {																			// 해당 좌표 값이 .인 경우 #으로
        	ch[r][c] = '#';
        }
        
        for(int i = 0 ; i < 2*R; i++) {
        	for(int j = 0; j < 2*C; j++) {
        		System.out.print(ch[i][j]);
        	}
        	System.out.println();
        }
	}

}
