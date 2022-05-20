package baekjoon_std.bronze1;

/*시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	1236	721	651	63.389%
문제
준표와 세준이는 서로 솔루션을 토론 하면서 다른 사람이 자신들의 솔루션을 듣지 못하게 하도록 서로 메시지를 주고받을 때 메시지를 암호화 하여서 주고받았다. 암호를 만드는 방법은 다음과 같다. 먼저 암호화 할 문자열을 1,1부터 위에서 아래 순서대로 채운다. 그리고 가장 밑의 행을 채운 후에는 오른쪽 열에서 다시 같은 과정을 반복한다.

만약에 "abcdefghijkl" 이라는 문자열을 3개의 열로 암호화 한다고 하자. 그러면 다음과 같이 표를 채울 수 있을 것이다.

a	e	i
b	f	j
c	g	k
d	h	l
그런 후에는 이제 왼쪽 → 오른쪽, 오른쪽 → 왼쪽, 왼쪽 → 오른쪽 ... 으로 읽으면서 다시 문자열을 만든다. 위의 경우에는 "aeijfbcgklhd" 가 될 것이다.

우리가 할 일은 다음과 같다. 암호화 된 문자열과 몇 개의 열로 암호화를 하였는지 주어져 있을 때 원래의 문자열을 구하는 프로그램을 작성하여라.

입력
열의 개수 K(1 ≤ K ≤ 20)가 주어지고 두 번째 줄에는 암호화 된 문자열(모두 영소문자)이 주어진다. (문자열의 길이는 200 이하이며 K의 배수이다.)

출력
첫 줄에 원래의 문자열을 출력한다..

예제 입력 1 
3
aeijfbcgklhd
예제 출력 1 
abcdefghijkl
*/
// f11 실행 f6한단계씩 f8 멈춤까지 실행 

import java.util.Scanner;

public class bj_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int col=s.nextInt();
		String str=s.next();
		int c=0; //개수세기
		int flag=0; //탈출 플래그
		char ca [][] =new char[200][col];
		int rowcnt;
		if(str.length()%col==0)
			rowcnt = str.length()/col;
		else
			rowcnt = str.length()/col+1;
		
		//읽는 순서 반영해서 배열 채우기
		for(int i=0;i<rowcnt;i++) {
			if(i%2 ==0) {
				for(int j=0;j<col;j++) {
					ca[i][j] = str.charAt(c);
					c++;
					if(c>str.length()-1) {
						flag =1;
						break;
					}
				}
			}
			else {
				for(int j=col-1;j>=0;j--) {
					ca[i][j] =str.charAt(c);
					c++;
				}
				if(c>str.length()-1) {
					flag=1;
					break;
				}
			}
			if(flag ==1) { //문자열 다 넣었으면 탈출 
				break;	
			}
		}
		flag=0;
		c=0;
		//출력
		
		for(int i=0;i<col;i++) {
			for(int k=0;k<rowcnt;k++) {
				c++;
				if(c>str.length()) {
					flag=1;
					break;
				}
				System.out.print(ca[k][i]);
			}
			if(flag==1)
				break;
		}
		
		
	}

}
