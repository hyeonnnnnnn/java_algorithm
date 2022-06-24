package mijin.std_mijin.y_2022.jun_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
문제
상근이는 카약 대회를 개최했다. 대회는 전세계에 생중계되고, 위성이 경기장 전체를 촬영하고 있다. 상근이는 위성 사진을 바탕으로 실시간 순위를 계산하는 프로그램을 만들려고 한다.

위성 사진은 R행 C열이다. 모든 줄의 첫 번째 글자는 'S'이고 출발선을 의미한다. 또, 마지막 글자는 'F'이고 이것은 결승선을 의미한다. 대회에 참가한 팀은 총 9팀이고, 각 팀은 1부터 9까지 번호가 매겨져 있다. 카약은 항상 열에 대해 연속하는 세 칸을 차지하며, 카약 번호로 표시한다. 마지막으로 물은 '.'로 나타나 있다.

팀의 순위는 결승선으로부터 떨어진 거리로 측정한다. 가까울수록 순위가 높다. 만약, 두 팀이 결승선과 떨어진 거리가 같다면, 같은 등수이다.

입력
첫째 줄에 R과 C가 주어진다. 다음 R개 줄에는 '.', 'S', 'F', '1'~'9'로 이루어진 위성 지도가 주어진다. 한 줄에는 최대 한 개의 카약만 있고, 위성 사진에 있는 카약은 항상 9개이다. (10 ≤ R, C ≤ 50)

출력
출력은 총 9줄을 해야 한다. i번째 줄에는 i번 팀의 등수를 출력한다. (i=1~9)
*/
//https://velog.io/@ehdcks3421/%EB%B0%B1%EC%A4%80-%EC%B9%B4%EC%95%BD%EA%B3%BC-%EA%B0%95%ED%92%8D-2891
public class bj_2890 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()); //팀의 수
		int s=Integer.parseInt(st.nextToken()); //카약 손상 팀 수
		int r=Integer.parseInt(st.nextToken()); //카약을 한나 더 가져온 팀의 수
		int count=0;
		int arr[]=new int[n+1];
		
		StringTokenizer st1=new StringTokenizer(br.readLine());
		Arrays.fill(arr, 1);
		
		for(int i=1; i<=s; i++)
		{
			int num=Integer.parseInt(st1.nextToken());
			arr[num]-=1;
		}
		
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=1; i<=r; i++)
		{
			int num=Integer.parseInt(st2.nextToken());
			arr[num]+=1;
		}
		
		for(int i=1; i<=n; i++)
		{
			if(arr[i]==2)
			{
				if(i==1)
				{
					if(arr[i+1]==0)
					{
						arr[i+1]=1;
						arr[i]=1;
					}
				}
						
				else if(i==n)
				{
					if(arr[i-1]==0)
					{
						arr[i-1]=1;
						arr[i]=1;	
					}
				}
				
				else
				{
					if((arr[i-1]==0 && arr[i+1]==0) ||
							(arr[i-1]==0 && arr[i+1]>=1))
					{
						arr[i-1]=1;
						arr[i]=1;	
					}
					else if(arr[i-1]>=1 && arr[i+1]==0)
					{
						arr[i+1]=1;
						arr[i]=1;	
					}
					
				}
				
			}
		}
		
		for(int i=1; i<=n; i++)
		{
			if(arr[i]==0)
				count++;
		}
		
		System.out.println(count);
		
	
	}

}
