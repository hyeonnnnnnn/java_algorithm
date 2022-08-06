package mijin.std_mijin.y_2022.aug_6;

import java.util.Scanner;

/*MO 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	56	29	26	54.167%
문제
Mirko and Slavko are playing MO (mini-go). MO is similar to ancient chinese game GO, but is simpler and it plays on (one-dimensional) table which consists of certain number of squares in the sequence.

Mirko is playing with white coins, and he plays first. Slavko is playing with black coins, and he plays second.

In the beginning of the game, all the squares on the table are empty. The players are playing one by one and in each move they put one of their coins on any empty square on the table.

If there are consequent sequence of opponent's coins between just putted coin and previously putted coin with same color, then that sequence of opponent's coins are removed from the table.

Squares on the table are denoted with numbers from 1 till P, from left to right.

Write a program which will calculate number of white and number of black coins on the table on the end of the game. 

입력
In the first line there are two integers P and N, separated with one space character, number of squares on the table and total number of moves of both players, 1 ≤ P ≤ 100, 1 ≤ N ≤ 1000.

In each of the next N lines, there are moves of Mirko and Slavko, from the beggining to the end of the game. 

출력
In the only line of the output file you have to write number of white and number of black coins in the end of the game. That numbers must be separated with one space character. 

예제 입력 1 
4 4
2
3
4
3
예제 출력 1 
2 1
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
2 2*/
public class bj_3227 {

	public static void main(String[] args) {
		int P,N;
		Scanner s = new Scanner(System.in);
		P= s.nextInt();
		N= s.nextInt();
		int [] arr = new int[P+1]; //게임판 1차원배열
		
		//말판 초기화 
		for(int i=0;i<arr.length;i++) {
			arr[i] =-1;
		}
		
		int color =0;   // 0흰돌 1 검돌
		int [] cnt = {0,0} ; // 각 돌 개수
		int pos =0;     // 입력받은 위치
		
		for(int i=0;i<N;i++) {
			color=0; //흰돌로 초기화
			pos = s.nextInt();
			//  홀수차례면 검돌로 바꾸기
			if (i%2 ==1)
				color =1;
			arr[pos]=color;
			cnt[color]++;  //해당 색돌 개수 카운트
				
			if( cnt[color] >=2  && cnt[1-color] >=1) { //내 구슬이 두개이상이고 상대 구슬도 한개 이상일 때
				
				int ex =exist(pos,color,arr);  //상대 구슬을 둘러싸고있으면 (제거 조건)  0 없음 1 왼쪽 2 오른쪽
				if(ex!=0){ 
					if(ex ==1) { //왼쪽에 상대구슬이 있으면
						for(int j=1;j<pos;j++) {
							if(arr[j]==1-color) {//상대 색이면
								arr[j] =-1;
								cnt[1-color]--; //상대 구슬 제거
							}
						}
								
					}else { //오른쪽
						for(int j=pos+1;j<arr.length;j++) {
							if(arr[j]==1-color) {//상대 색이면
								arr[j] =-1;
								cnt[1-color]--; //상대 구슬 제거
							}
						}
					}
					
				}
			}
			
			
		}
		System.out.println(cnt[0]+" "+cnt[1]);
		
	}//(color+1)%2
	//현재 위치 , 내 돌색, 현재 말판 // 0 없음 1 왼쪽 2 오른쪽
	public static int exist(int pos, int cr,int []arr ) {
		int me ,you ; //위치 값 저장 
		
		me=0;you =0; //초기화 
		//왼쪽부터 검사
		for(int i=1;i<pos;i++) {
			if(arr[i]==cr && me ==0) 
				me =i;
			
			if(arr[i] == (cr+1)%2 && you ==0)
				you =i;
		}
		if(me!=0 && you!= 0 && you-me>0) { //둘다 존재하고 내 돌이 먼저 있으면(상대를 감싸고 있으면) 
			return 1;
		}
		
		me=0;you =0; //초기화
		//오른쪽 검사
		for(int i=arr.length-1;i>pos;i--) {
			if(arr[i]==cr && me ==0) 
				me =i;
			if(arr[i] == (cr+1)%2 && you ==0)
				you =i;
		}
		if(me!=0 && you!= 0 && you-me<0) { //둘다 존재하고 내 돌이 나중에 있으면(상대를 감싸고 있으면) 
			return 2;
		}
		return 0;
	}

}
