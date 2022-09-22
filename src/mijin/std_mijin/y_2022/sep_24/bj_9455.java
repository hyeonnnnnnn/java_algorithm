package mijin.std_mijin.y_2022.sep_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/*박스 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	2730	1970	1665	75.203%
문제
m행 n열로 이루어진 그리드가 주어진다. 일부 칸에는 박스가 들어 있다. 모든 박스가 더 이상 움직일 수 없을 때 까지 아래로 움직인다면, 박스는 쌓여진 상태가 된다.

그림 (a)의 그리드의 크기는 5행 4열이고, 7칸에는 박스가 들어있다. 모든 박스가 계속해서 아래로 움직이면, 그림 (b)와 같이 변하게 된다.



박스가 움직인 거리는 바닥에 쌓이기 전 까지 이동한 칸의 개수이다. 예를 들어, 맨 왼쪽 열에서 가장 위에 있는 박스가 움직인 거리는 2이다. 모든 박스가 이동한 거리 (각 박스가 이동한 거리의 합) 을 구하는 프로그램을 작성하시오. 위의 예제에서 박스 7개가 움직인 거리는 8이다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 m과 n이 주어진다. (1 ≤ m, n ≤ 100) 다음 m개 줄에는 그리드의 각 행의 정보를 나타내는 n개의 정수가 주어진다. 그리드 첫 행부터 마지막 행까지 순서대로 주어진다. 박스가 들어있는 칸은 1로, 다른 칸은 0으로 주어진다. 각 정수 사이에는 공백이 하나 주어진다.

출력
각 테스트 케이스마다 입력으로 주어진 그리드에서 모든 박스가 이동한 거리를 출력한다.

예제 입력 1 
3
5 4
1 0 0 0
0 0 1 0
1 0 0 1
0 1 0 0
1 0 1 0
3 3
1 1 1
1 1 1
0 0 0
5 6
1 0 1 1 0 1
0 0 0 0 0 0
1 1 1 0 0 0
0 0 0 1 1 1
0 1 0 1 0 1*/
public class bj_9455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase =0;
		int cnt=0,rs=0;
		int r,c; 
		StringTokenizer st = null;
		
		tcase = Integer.parseInt(br.readLine());
		
		

		for(int cs =0;cs<tcase;cs++) {
			rs=0;//결과값 초기화 
			st = new StringTokenizer(br.readLine()," ");
			r=Integer.parseInt(st.nextToken()); c= Integer.parseInt(st.nextToken()); //컬럼 로우 받기 
			int arr [][] = new int[r][c]; //임시 배열 선언
			//입력받기
			for(int a=0;a<r;a++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int b=0;b<c;b++)
					arr[a][b] =Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<c;i++) { //컬럼
				for(int j=0;j<r;j++) { //로우
					cnt =0;
					if(arr[j][i] ==1) {
						for(int t=j+1;t<r;t++) {
							cnt+=arr[t][i];
						}
						rs+=(r-1)-(cnt+j);
					}
					
					//System.out.println(j+" "+rs);
				}
			   // System.out.println(i+" "+rs);
			}
			System.out.println(rs);
			
		}
		
		
	}

}
