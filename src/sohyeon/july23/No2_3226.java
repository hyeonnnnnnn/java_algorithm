package sohyeon.july23;

import java.util.Scanner;

/*
 * 문제
7:00부터 19:00까지 전화 요금은 1분에 10원이다.

19:00부터 7:00까지 전화 요금은 1분에 5원이다.

상근이가 전화를 건 시간과 통화 시간이 모두 주어졌을 때, 전화 요금을 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 상근이가 건 전화의 수 N이 주어진다. (1 ≤ N ≤ 100)

다음 N개 줄에는 상근이가 건 전화에 대한 정보가 HH:MM DD와 같은 형식으로 주어진다.

HH:MM은 전화를 건 시간이며, DD는 통화 시간이다. DD는 최대 60이며, MM과 DD사이에는 공백이 하나 주어진다.

만약 시나 분이 한자리 숫자라면, 앞에 0이 하나 주어진다.

시간은 00:00부터 23:59까지이다.
--
출력
총 전화 요금을 출력한다.
--
예제 입력 1 
2
11:02 11
15:30 01
예제 출력 1 
120
--
예제 입력 2 
3
20:05 12
06:45 30
13:08 15
예제 출력 2 
435
--
예제 입력 3 
5
00:00 05
06:47 35
11:30 18
18:33 60
23:59 22
예제 출력 3 
1035
*/
public class No2_3226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();												// 전화 수
		sc.nextLine();
		
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			String[] str = sc.nextLine().split(":| ");						// 전화 정보 받아와서 구분자 기준으로 잘라줌
			
			int HH = Integer.parseInt(str[0]);								// 전화 정보 시
			int MM = Integer.parseInt(str[1]);								// 전화 정보 분
			int DD = Integer.parseInt(str[2]);								// 전화 정보 통화시간
			
			int end_hour = HH;												// 전화종료시간
			int end_minute = MM + DD;										// 전화종료분
//			System.out.println(HH);
//			System.out.println(MM);
//			System.out.println(DD);
			
			if(end_minute >= 60) end_hour += 1; end_minute -= 60;			// 전화종료분 60 이상 시 전화종료시간+1, 전화종료분-60
			if(end_hour >= 24) end_hour -= 24;								// 전화종료시간 24 이상 시 전화종료시간-24
			
//			System.out.println(end_hour);
//			System.out.println(end_minute);
			
			if(7 <= HH && HH <= 18 && 7 <= end_hour && end_hour <= 18) {
				// 전화시작시간과 전화종료시간이 7시 ~ 18시라면: 분당 10원
				result += DD * 10;
				
			} else if (0 <= HH && HH <= 6 && 0 <= end_hour && end_hour <= 6){
				// 전화시작시간과 전화종료시간이 0시 ~ 6시라면: 분당 5원
				result += DD * 5;
				
			} else if (19 <= HH && HH <= 23 && 19 <= end_hour && end_hour <= 23){
				// 전화시작시간과 전화종료시간이 19시 ~ 23시라면: 분당 5원
				result += DD * 5;
				
			} else if (HH == 18 && end_hour == 19) {
				// 전화시작시간 18시, 전화종료시간 19시라면: 분당 10분 구간과 분당 5분 구간 계산하여 누적
				result += 10 * (60 - MM) + 5 * end_minute;
				
			} else if (HH == 6 && end_hour == 7) {
				// 전화시작시간 6시, 전화종료시간 7시라면: 분당 10분 구간과 분당 5분 구간 계산하여 누적
				result += 5 * (60 - MM) + 10 * end_minute;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
