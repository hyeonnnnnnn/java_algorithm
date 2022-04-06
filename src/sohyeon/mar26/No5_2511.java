package sohyeon.mar26;

import java.util.Scanner;

/*
 * 문제
0부터 9까지의 숫자가 표시된 카드를 가지고 두 사람 A와 B가 게임을 한다. A와 B에게는 각각 0에서 9까지의 숫자가 하나씩 표시된 10장의 카드뭉치가 주어진다.

두 사람은 카드를 임의의 순서로 섞은 후 숫자가 보이지 않게 일렬로 늘어  놓고 게임을 시작한다. 단, 게임 도중 카드의 순서를 바꿀 수는 없다.

A와 B 각각이 늘어놓은 카드를 뒤집어서 표시된 숫자를 확인하는 것을 한 라운드라고 한다. 게임은 첫 번째 놓인 카드부터 시작하여 순서대로 10번의 라운드로 진행된다.

각 라운드에서는 공개된 숫자가 더 큰 사람이 승자가 된다. 승자에게는 승점 3점이 주어지고 패자에게는 승점이 주어지지 않는다.

만약 공개된 두 숫자가 같아서 비기게 되면, A, B 모두에게 승점 1점이 주어진다. 

10번의 라운드가 모두 진행된 후, 총 승점이 큰 사람이 게임의 승자가 된다. 만약, A와 B의 총 승점이 같은 경우에는, 제일 마지막에 이긴 사람을 게임의 승자로 정한다.

그래도 승부가 나지 않는 경우는 모든 라운드에서 비기는 경우뿐이고 이 경우에 두 사람은 비겼다고 한다.

예를 들어, 다음 표에서 3번째 줄은 각 라운드의 승자를 표시하고 있다. 표에서 D는 무승부를 나타낸다. 이 경우에 A의 총 승점은 16점이고, B는 13점이어서, A가 게임의 승자가 된다. 

라운드	1	2	3	4	5	6	7	8	9	10
A	    4	5	6	7	0	1	2	3	9	8
B	    1	2	3	4	5	6	7	8	9	0
승	    A	A	A	A	B	B	B	B	D	A

아래 표의 경우에는 A와 B의 총 승점은 13점으로 같다. 마지막으로 승부가 난 라운드는 7번째 라운드이고, 이 라운드의 승자인 B가 게임의 승자가 된다. 

라운드	1	2	3	4	5	6	7	8	9	10
A	    9	1	7	2	6	3	0	4	8	5
B	    6	3	9	2	1	0	7	4	8	5
승	    A	B	B	D	A	A	B	D	D	D

A와 B가 늘어놓은 카드의 숫자가 순서대로 주어질 때, 게임의 승자가 A인지 B인지, 또는 비겼는지 결정하는 프로그램을 작성하시오.
--
입력
입력 파일은 두 개의 줄로 이루어진다. 첫 번째 줄에는 A가 늘어놓은 카드의 숫자들이 빈칸을 사이에 두고 순서대로 주어진다.

두 번째 줄에는 B가 늘어놓은 카드의 숫자들이 빈칸을 사이에 두고 순서대로 주어진다. 
--
출력
첫 번째 줄에는 게임이 끝난 후, A와 B가 받은 총 승점을 순서대로 빈칸을 사이에 두고 출력한다. 두 번째 줄에는 이긴 사람이 A인지 B인지 결정해서, 이긴 사람을 문자 A 또는 B로 출력한다.

만약 비기는 경우에는 문자 D를 출력한다. 
--
예제 입력 1 
4 5 6 7 0 1 2 3 9 8
1 2 3 4 5 6 7 8 9 0
예제 출력 1 
16 13
A
--
예제 입력 2 
9 1 7 2 6 3 0 4 8 5
6 3 9 2 1 0 7 4 8 5
예제 출력 2 
13 13
B
--
예제 입력 3 
7 1 6 2 3 0 5 9 4 8
7 1 6 2 3 0 5 9 4 8
예제 출력 3 
10 10
D
*/

public class No5_2511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A[] = new int[10];								// A 카드 값
		int B[] = new int[10];								// B 카드 값
		char result[] = new char[10];						// 승패여부 값
		
		int Ascore = 0;										// A 점수
		int Bscore = 0;										// B 점수
		
		for(int i = 0; i < 10; i++) {						// A 입력받은 값 10개 저장
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {						// B 입력받은 값 10개 저장
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(A[i] > B[i]) {								// A의 공개된 값이 B보다 클 때 A의 점수 +3 누적
				Ascore += 3;
				result[i] = 'A';
				
			} else if(A[i] < B[i]) {						// B의 공개된 값이 A보다 클 때 B의 점수 +3 누적
				Bscore += 3;
				result[i] = 'B';
				
			} else {										// A와 B의 공개된 값이 동일할 때 각각 점수 +1 누적
				Ascore += 1;
				Bscore += 1;
				result[i] = 'D';
			}
		}
		
//		System.out.println(result);
		System.out.println(Ascore + " " + Bscore);			// A와 B 누적 점수
		
		
		if(Ascore > Bscore) {								// A 누적 점수가 B 누적 점수보다 클 경우 A 최종 승 
			System.out.println("A");
			
		} else if(Ascore < Bscore) {						// B 누적 점수가 A 누적 점수보다 클 경우 B 최종 승
			System.out.println("B");
			
		} else if(Ascore == Bscore) {						// A 누적 점수와 B 누적 점수 동일할 경우
			boolean flag = true;							// 최종 승패: 비김 출력할 플래그 선언
			
			for(int m = 9; m >= 0; m--) {					// 결과 저장한 배열 마지막부터 검사해서
//				System.out.println(result[m]);
				
				if(result[m] == 'A') {						// 가장 최근 결과 A: A가 최종 승, 비김 플래그 false
					System.out.println("A");
					flag = false;
					break;
					
				} else if(result[m] == 'B') {				// 가장 최근 결과 B: B가 최종 승, 비김 플래그 false
					System.out.println("B");
					flag = false;
					break;
					
				}
			}
			if(flag) System.out.println("D");				// 비김 플래그 true이기 때문에 (result[9]부터 result[0]까지 모두 D) 최종 결과 D(비김)
		}
		
		sc.close();
	}

}
