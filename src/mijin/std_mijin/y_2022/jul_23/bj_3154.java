package mijin.std_mijin.y_2022.jul_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*문제
우리가 핸드폰으로 알람시계를 설정할 때는 시간과 분을 나타내는 4개의 숫자를 입력하기 위해 키보드를 사용한다. 예를 들어, 우리가 12:30으로 알람을 설정하려고 한다면 1,2,3,0을 입력하면 되고 9시30분 같은 경우는 맨 앞에 0을 붙여 0,9,3,0을 누르면 된다.

그런데 얼마 전, 꿍은 알람시계를 맞추다가 시각을 잘못 입력했는데 화면에 나타나는 시간은 24로 나눈 나머지라는 것을 알게됐다. 마찬가지로 분 역시 60으로 나눈 나머지가 화면에 나타나는 사실을 알게됐다. 예를 들어 66:79로 시각을 잘못 입력했어도 실제로 화면에는 18:19로 나타난다는 것이다.

꿍은 매우 게을러서 원하는 알람시각을 맞추는데 최소한의 노력만 하고싶다. 그래서 여러분들은 꿍이 어떻게 하면 최소한의 노력을 들여서 원하는 시각으로 알람을 맞출 수 있을지 알아내는 프로그램을 만들어야 한다.



키보드는 위와 같이 생겼고 키 a에서 키 b로 이동할 때 필요한 노력은 다음과 같다.

effort(a,b) = |xa-xb|+|ya-yb|

여기서 (xa, ya) 와 (xb, yb)는 키a, b의 좌표를 나타낸다.

전체 노력의 합은 첫 번째 키에서 두 번째 키로 이동하는데 필요한 노력, 두 번째 키에서 세 번째 키로 이동하는데 필요한 노력, 세 번째 키에서 네 번째 키로 이동하는데 필요한 노력의 세 값의 합으로 정의된다.

예를 들어 22:45를 입력하는데 필요한 전체 노력의 값은 effort(2,2)+effort(2,4)+effort(4,5)=0+2+1=3. 이다.

만약 답이 여러 가지라면 가장 빠른 시각을 출력하라.

입력
입력의 첫 번째 줄에는 HH:MM 형식으로 설정하고 싶은 시각이 주어진다. 만약 시간이나 분이 한 자리수라면 선행하는 0이 붙어야 한다.

설정하고 싶은 시각은 00:00~23:59 중 하나이다.

출력
출력의 첫 번째 줄에는 HH:MM 형식으로 답을 출력한다. 한 자리의 수라면 선행하는 0을 붙여야 한다.

예제 입력 1 
14:19
예제 출력 1 
14:79
예제 입력 2 
00:11
예제 출력 2 
24:11
예제 입력 3 
12:34
예제 출력 3 
12:34*/

public class bj_3154 {
static int rh=0; //함수에서 쓸 거라 전역 선언
static int rm=0;
	public static void main(String[] args) throws IOException {
		//로직 추가 필 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] hm  = br.readLine().split(":");
		int h = Integer.parseInt(hm[0]);
		int m = Integer.parseInt(hm[1]);
		int min=999,sum=0; 
		
		//case1 본래수
		min =comp(h,m,min);
		
		//case2 시간 변경
		h+=24;
		min =comp(h,m,min);
		
		//case3 분도 변경
		m+=60;
		min =comp(h,m,min);
		
		//case4 분만변경
		h-=24;
		min =comp(h,m,min);
		
		System.out.println(rh/10+""+rh%10 +":"+rm/10+""+rm%10);
	}
	//노력값을 비교해서 결과값 세팅 & min값 변경 
	static int comp(int h,int m,int min) {
		int tmp ;
		tmp =sumef(h/10,h%10,m/10,m%10);
		if(min>=tmp) {      //최소 시간 비교 
			if(min==tmp && (rh+rm<=h+m)) 		// 노력이 같은데 시간이 더 늦거나 같은경우는 pass
				return min;
			rh =h; rm=m; 
			min=tmp;
		}
		return min;
	}
	//해당 시간의 노력을 총 합해서 보여줌
	static int sumef(int a,int b,int c,int d) {
		return effort(a,b)+effort(b,c)+effort(c,d);
	}
	//a와 b사이의 노력 구하는 함수
	static int effort(int a,int b) {
		if(a==b) 
			return 0;
		int tmp;
		int xa,xb,ya,yb;
		if(a>b) { //작은 수를 a로 
			tmp = a;
			b=a;
			b=tmp;
		}
		//행, 열로 나누어 좌표 설정 
		xa=(a-1)/3;ya=(a%3)==0?2:(a%3)-1;
		xb=(b-1)/3;yb=(b%3)==0?2:(b%3)-1;
		
		if(a==0) { //0인 경우만 처리 
			xa =3;ya=1;
		}
		
		return Math.abs(xa-xb)+Math.abs(ya-yb);
	}

}
