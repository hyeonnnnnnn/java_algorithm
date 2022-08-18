package sohyeon.july23;

import java.util.Scanner;

/*
 * 문제
Mirko and Slavko are playing MO (mini-go). 

MO is similar to ancient chinese game GO, 

but is simpler and it plays on (one-dimensional) table which consists of certain number of squares in the sequence.

Mirko is playing with white coins, and he plays first. Slavko is playing with black coins, and he plays second.

In the beginning of the game, all the squares on the table are empty. 

The players are playing one by one and in each move they put one of their coins on any empty square on the table.

If there are consequent sequence of opponent's coins between just putted coin and previously putted coin with same color, 

then that sequence of opponent's coins are removed from the table.

Squares on the table are denoted with numbers from 1 till P, from left to right.

Write a program which will calculate number of white and number of black coins on the table on the end of the game. 
--
입력
In the first line there are two integers P and N, separated with one space character, 

number of squares on the table and total number of moves of both players, 1 ≤ P ≤ 100, 1 ≤ N ≤ 1000.

In each of the next N lines, there are moves of Mirko and Slavko, from the beggining to the end of the game. 
--
출력
In the only line of the output file you have to write number of white and number of black coins in the end of the game. 

That numbers must be separated with one space character. 
--
예제 입력 1 
4 4
2
3
4
3
예제 출력 1 
2 1
--
예제 입력 2 
5 6
1
4
5
2
3
2
예제 출력 2 
3 1
--
예제 입력 3 
6 8
1
2
5
3
4
6
2
3
예제 출력 3 
2 2
*/
public class No3_3227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();														// 정사각형 수
		int N = sc.nextInt();														// 플레이어 이동 수
		int[] arr = new int[P];														// 말판
		
		boolean flag = false;														// 플레이어 차례 정의. false: A차례, true: B차례 
		
		int A = 0, B = 0;															// 각 플레이어 돌의 수
		
		for(int i = 0; i < arr.length ; i++) {										// 말판 0으로 초기화
			arr[i] = 0;
			
		}
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			arr[num] = num;
			
			if(flag == false) A++; flag = true;										//  
			
			
		}
		
		
		System.out.println(A + " " + B);
		
		sc.close();
	}

}
