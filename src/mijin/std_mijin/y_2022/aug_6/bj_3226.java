package mijin.std_mijin.y_2022.aug_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*전화 요금 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	1268	507	464	44.359%
문제
7:00부터 19:00까지 전화 요금은 1분에 10원이다.

19:00부터 7:00까지 전화 요금은 1분에 5원이다.

상근이가 전화를 건 시간과 통화 시간이 모두 주어졌을 때, 전화 요금을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 건 전화의 수 N이 주어진다. (1 ≤ N ≤ 100)

다음 N개 줄에는 상근이가 건 전화에 대한 정보가 HH:MM DD와 같은 형식으로 주어진다.

HH:MM은 전화를 건 시간이며, DD는 통화 시간이다. DD는 최대 60이며, MM과 DD사이에는 공백이 하나 주어진다.

만약 시나 분이 한자리 숫자라면, 앞에 0이 하나 주어진다.

시간은 00:00부터 23:59까지이다.

출력
총 전화 요금을 출력한다.

예제 입력 1 
2
11:02 11
15:30 01
예제 출력 1 
120
예제 입력 2 
3
20:05 12
06:45 30
13:08 15
예제 출력 2 
435
예제 입력 3 
5
00:00 05
06:47 35
11:30 18
18:33 60
23:59 22
예제 출력 3 
1035*/
public class bj_3226 {

	public static void main(String[] args) throws IOException {
		int N ; //전화 건수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = null;
		int stt =7; //7시
		int edt =19; //19시
		int h,m,d; //입력받는 수
		int c10m=0 ,c5m=0; //10원 분 , 5원 분 
		int rs= 0; //결과 총합
		
		N =br.read()-48; //총 건수 받기 , 개행값 제거
		br.readLine(); //공백처리 
		//System.out.println(N);
		for (int i=0;i<N;i++) {
			
			st= new StringTokenizer(br.readLine(),": "); //시 분 통화시간 자르기 
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			int tmph=h;
			int tmpm =d;
			c10m=0;c5m=0;
			
			//case1 더하면  시간 캐리가 생기는 경우
			if(m+d>60 && ( (h+1)%24 ==stt || (h+1)%24 == edt )) {
				tmph = (h+1)%24;
				tmpm =m+d;
			}   
		
			//case2 더해도 시간 캐리가 안 생기는 경우, 일반
			if(tmph>= stt && tmph<edt) { //더해서 7시가 넘어가면
				c10m = tmpm%60;
				c5m  = d-c10m;
			}
			else if(tmph >=edt || tmph<stt) {//더해서 19시가 넘어가면
				c5m  = tmpm%60;
				c10m = d-c5m;
			}
			rs+=c10m*10 +c5m*5;
		}
		
		//결과 출력
		System.out.println(rs); 

	}

}
